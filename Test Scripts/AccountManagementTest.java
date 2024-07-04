import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import java.awt.*;

public class AccountManagementTest {
    private AccountManagement accountManagement;

    @BeforeEach
    public void setUp() {
        accountManagement = new AccountManagement();
        accountManagement.setVisible(false); // Hide the frame during testing
    }

    @Test
    public void testCreateAccountButton() {
        JButton createAccountButton = (JButton) getComponentByName(accountManagement, "Create Account");
        assertNotNull(createAccountButton);
        createAccountButton.doClick();
        assertTrue(isDialogVisible("Account Created Successfully!"));
    }

    @Test
    public void testViewAccountButton() {
        JButton viewAccountButton = (JButton) getComponentByName(accountManagement, "View Account");
        assertNotNull(viewAccountButton);
        viewAccountButton.doClick();
        assertTrue(isDialogVisible("Displaying Account Details..."));
    }

    @Test
    public void testDeleteAccountButton() {
        JButton deleteAccountButton = (JButton) getComponentByName(accountManagement, "Delete Account");
        assertNotNull(deleteAccountButton);
        deleteAccountButton.doClick();
        assertTrue(isDialogVisible("Account Deleted Successfully!"));
    }

    @Test
    public void testUpdateAccountButton() {
        JButton updateAccountButton = (JButton) getComponentByName(accountManagement, "Update Account");
        assertNotNull(updateAccountButton);
        updateAccountButton.doClick();
        assertTrue(isDialogVisible("Account Updated Successfully!"));
    }

    private JComponent getComponentByName(Container container, String name) {
        for (Component component : container.getComponents()) {
            if (component instanceof JComponent) {
                JComponent jComponent = (JComponent) component;
                AccessibleContext accContext = jComponent.getAccessibleContext();
                if (accContext != null && name.equals(accContext.getAccessibleName())) {
                    return jComponent;
                }
            }
        }
        return null;
    }

    private boolean isDialogVisible(String message) {
        JOptionPane pane = getOptionPaneByMessage(message);
        return pane != null && pane.isVisible();
    }

    private JOptionPane getOptionPaneByMessage(String message) {
        for (Window window : Window.getWindows()) {
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                if (dialog.getContentPane() instanceof JOptionPane) {
                    JOptionPane pane = (JOptionPane) dialog.getContentPane();
                    if (pane.getMessage() != null && pane.getMessage().equals(message)) {
                        return pane;
                    }
                }
            }
        }
        return null;
    }
}
