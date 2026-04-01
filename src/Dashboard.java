import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame{
    private JPanel DashboardPanel;
    private JButton makePaymentButton;
    private JButton viewRecordsButton;
    private JButton logOutButton;

    public Dashboard() {
        setContentPane(DashboardPanel);
        setTitle(" Dashboard ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize( 500, 500);
        setLocationRelativeTo(null);

        makePaymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DataEntry().setVisible(true);
                dispose();

            }
        });
        viewRecordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog( Dashboard.this, " Status: \n" +
                        " Total Students: 150 " + "\n" +
                        " Fees Collected: Php 2,850,000"+ "\n" +
                        " Overdue Balances: Php 12,000 ");

            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login().setVisible(true);
                dispose();

            }
        });
    }

    static void main() {
        new Dashboard().setVisible(true);
    }
}
