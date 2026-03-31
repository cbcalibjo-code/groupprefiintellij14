import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataEntry extends JFrame {
    private JPanel DataEntryPanel;
    private JTextField STUDENTIDFIELD;
    private JButton enterButton;
    private JLabel TOTAL;
    private JTextField AMOUNTFIELD;
    private JLabel CHANGE;


    public DataEntry() {
        setContentPane(DataEntryPanel);
        setTitle(" Data Entry ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
                String studentname = STUDENTIDFIELD.getText();
                String amount= AMOUNTFIELD.getText();

                JOptionPane.showMessageDialog(DataEntry.this,
                        "-------RECEIPT-------"+"\n" + "\n" +
                                " Student: "+ studentname + "\n" +
                                " Balance: " + "19,000 " + "\n" +
                                " Amount to Pay: " + amount + "\n" +
                                " Overdue Balance: " + CHANGE.getText() );
            }
        });
    }
    public void calculate(){
        try{
            double amount2 = Double.parseDouble(AMOUNTFIELD.getText());
            double balancefee = 19000;
            double change = amount2 - balancefee;

            CHANGE.setText(String.valueOf(change));
        }catch(NumberFormatException e ){
            CHANGE.setText(" Invalid ");

        }
    }

    static void main() {
        new DataEntry().setVisible(true);
    }
}
