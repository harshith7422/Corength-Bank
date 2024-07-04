import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.accessibility.AccessibleContext;
import javax.swing.*;
import java.awt.*;

public class TransactionManagementTest {
    private TransactionManagement transactionManagement;

    @BeforeEach
    public void setUp() {
        transactionManagement = new TransactionManagement();
        transactionManagement.setVisible(false); // Hide the frame during testing
    }

    @Test
    public void testDepositButton() {
        JButton depositButton = (JButton) getComponentByName(transactionManagement, "Deposit");
        assertNotNull(depositButton);
        depositButton.doClick();
        assertTrue(isDialogVisible("Deposit Successful!"));
    }

    @Test
    public void testWithdrawButton() {
        JButton withdrawButton = (JButton) getComponentByName(transactionManagement, "Withdraw");
        assertNotNull(withdrawButton);
        withdrawButton.doClick();
        assertTrue(isDialogVisible("Withdraw Successful!"));
    }

    @Test
    public void testTransferFundsButton() {
        JButton transferFundsButton = (JButton) getComponentByName(transactionManagement, "Transfer Funds");
        assertNotNull(transferFundsButton);
        transferFundsButton.doClick();
        assertTrue(isDialogVisible("Transfer Successful!"));
    }

    @Test
    public void testBalanceInquiryButton() {
        JButton balanceInquiryButton = (JButton) getComponentByName(transactionManagement, "Balance Inquiry");
        assertNotNull(balanceInquiryButton);
        balanceInquiryButton.doClick();
        assertTrue(isDialogVisible("Displaying Account Balance..."));
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
