import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountManagement extends JFrame {
    private JPanel panel;
    private JLabel titleLabel;
    private JLabel quoteLabel;
    private JLabel footerLabel;
    private JButton createAccountButton;
    private JButton viewAccountButton;
    private JButton deleteAccountButton;
    private JButton updateAccountButton;

    public AccountManagement() {
        // Set up the frame
        setTitle("Corength Bank - Account Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the panel
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Title label
        titleLabel = new JLabel("Corength Bank");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        // Quote label
        quoteLabel = new JLabel("Empowering your financial future");
        quoteLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        gbc.gridy = 1;
        panel.add(quoteLabel, gbc);

        // Create Account button
        createAccountButton = new JButton("Create Account");
        createAccountButton.setBackground(Color.BLUE);
        createAccountButton.setForeground(Color.WHITE);
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(createAccountButton, gbc);
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CreateAccountFrame();
            }
        });

        // View Account button
        viewAccountButton = new JButton("View Account");
        viewAccountButton.setBackground(Color.GREEN);
        viewAccountButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        panel.add(viewAccountButton, gbc);
        viewAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ViewAccountFrame();
            }
        });

        // Delete Account button
        deleteAccountButton = new JButton("Delete Account");
        deleteAccountButton.setBackground(Color.RED);
        deleteAccountButton.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(deleteAccountButton, gbc);
        deleteAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DeleteAccountFrame();
            }
        });

        // Update Account button
        updateAccountButton = new JButton("Update Account");
        updateAccountButton.setBackground(Color.ORANGE);
        updateAccountButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        panel.add(updateAccountButton, gbc);
        updateAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new UpdateAccountFrame();
            }
        });

        // Footer label
        footerLabel = new JLabel("© Developed by Harshith");
        footerLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(footerLabel, gbc);

        add(panel);
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AccountManagement().setVisible(true);
            }
        });
    }
}

class CreateAccountFrame extends JFrame {
    private JTextField nameField, ageField, addressField;
    private JButton createButton;

    public CreateAccountFrame() {
        setTitle("Create Account");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        createButton = new JButton("Create");
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Account Created Successfully!");
                dispose();
            }
        });
        add(createButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class ViewAccountFrame extends JFrame {
    private JTextField accountIdField;
    private JButton viewButton;

    public ViewAccountFrame() {
        setTitle("View Account");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("Account ID:"));
        accountIdField = new JTextField();
        add(accountIdField);

        viewButton = new JButton("View");
        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual view functionality
                JOptionPane.showMessageDialog(null, "Displaying Account Details...");
                dispose();
            }
        });
        add(viewButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class DeleteAccountFrame extends JFrame {
    private JTextField accountIdField;
    private JButton deleteButton;

    public DeleteAccountFrame() {
        setTitle("Delete Account");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("Account ID:"));
        accountIdField = new JTextField();
        add(accountIdField);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual delete functionality
                JOptionPane.showMessageDialog(null, "Account Deleted Successfully!");
                dispose();
            }
        });
        add(deleteButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class UpdateAccountFrame extends JFrame {
    private JTextField accountIdField, nameField, ageField, addressField;
    private JButton updateButton;

    public UpdateAccountFrame() {
        setTitle("Update Account");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Account ID:"));
        accountIdField = new JTextField();
        add(accountIdField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual update functionality
                JOptionPane.showMessageDialog(null, "Account Updated Successfully!");
                dispose();
            }
        });
        add(updateButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
