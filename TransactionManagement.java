import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionManagement extends JFrame {
    private JPanel panel;
    private JLabel titleLabel;
    private JLabel quoteLabel;
    private JLabel footerLabel;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton transferFundsButton;
    private JButton balanceInquiryButton;

    public TransactionManagement() {
        // Set up the frame
        setTitle("Corength Bank - Transaction Management");
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
        quoteLabel = new JLabel("Efficiency and security in every transaction");
        quoteLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        gbc.gridy = 1;
        panel.add(quoteLabel, gbc);

        // Deposit button
        depositButton = new JButton("Deposit");
        depositButton.setBackground(Color.BLUE);
        depositButton.setForeground(Color.WHITE);
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(depositButton, gbc);
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DepositFrame();
            }
        });

        // Withdraw button
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBackground(Color.GREEN);
        withdrawButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        panel.add(withdrawButton, gbc);
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new WithdrawFrame();
            }
        });

        // Transfer Funds button
        transferFundsButton = new JButton("Transfer Funds");
        transferFundsButton.setBackground(Color.ORANGE);
        transferFundsButton.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(transferFundsButton, gbc);
        transferFundsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TransferFundsFrame();
            }
        });

        // Balance Inquiry button
        balanceInquiryButton = new JButton("Balance Inquiry");
        balanceInquiryButton.setBackground(Color.RED);
        balanceInquiryButton.setForeground(Color.WHITE);
        gbc.gridx = 1;
        panel.add(balanceInquiryButton, gbc);
        balanceInquiryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BalanceInquiryFrame();
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
                new TransactionManagement().setVisible(true);
            }
        });
    }
}

class DepositFrame extends JFrame {
    private JTextField accountIdField, amountField;
    private JButton depositButton;

    public DepositFrame() {
        setTitle("Deposit");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Account ID:"));
        accountIdField = new JTextField();
        add(accountIdField);

        add(new JLabel("Amount:"));
        amountField = new JTextField();
        add(amountField);

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual deposit functionality
                JOptionPane.showMessageDialog(null, "Deposit Successful!");
                dispose();
            }
        });
        add(depositButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class WithdrawFrame extends JFrame {
    private JTextField accountIdField, amountField;
    private JButton withdrawButton;

    public WithdrawFrame() {
        setTitle("Withdraw");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Account ID:"));
        accountIdField = new JTextField();
        add(accountIdField);

        add(new JLabel("Amount:"));
        amountField = new JTextField();
        add(amountField);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual withdraw functionality
                JOptionPane.showMessageDialog(null, "Withdraw Successful!");
                dispose();
            }
        });
        add(withdrawButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class TransferFundsFrame extends JFrame {
    private JTextField fromAccountField, toAccountField, amountField;
    private JButton transferButton;

    public TransferFundsFrame() {
        setTitle("Transfer Funds");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("From Account ID:"));
        fromAccountField = new JTextField();
        add(fromAccountField);

        add(new JLabel("To Account ID:"));
        toAccountField = new JTextField();
        add(toAccountField);

        add(new JLabel("Amount:"));
        amountField = new JTextField();
        add(amountField);

        transferButton = new JButton("Transfer");
        transferButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual transfer functionality
                JOptionPane.showMessageDialog(null, "Transfer Successful!");
                dispose();
            }
        });
        add(transferButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class BalanceInquiryFrame extends JFrame {
    private JTextField accountIdField;
    private JButton inquireButton;

    public BalanceInquiryFrame() {
        setTitle("Balance Inquiry");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        add(new JLabel("Account ID:"));
        accountIdField = new JTextField();
        add(accountIdField);

        inquireButton = new JButton("Inquire");
        inquireButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement actual balance inquiry functionality
                JOptionPane.showMessageDialog(null, "Displaying Account Balance...");
                dispose();
            }
        });
        add(inquireButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
