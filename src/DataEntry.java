import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataEntry extends JFrame {
    private JPanel DataEntryPanel;
    private JTextField STUDENTIDFIELD;
    private JButton enterButton;
    private JTextField TuitionFIELD;
    private JLabel TOTAL;
    private JTextField LabField;
    private JTextField MisceFIELD;

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
                String tui = TuitionFIELD.getText();
                String lab = LabField.getText();
                String mis = MisceFIELD.getText();

                JOptionPane.showMessageDialog(DataEntry.this,
                        " Student: "+ studentname + "\n" +
                                " Tuition Fee: " + tui + "\n" +
                                " Laboratory Fee: " + lab + "\n" +
                                " Miscellaneous Fee: " + mis + "\n"+
                        " Total amount payment: " + TOTAL.getText() );
            }
        });
    }
    public void calculate(){
        try{
            double tuition = Double.parseDouble(TuitionFIELD.getText());
            double laboratory = Double.parseDouble(LabField.getText());
            double miscellaneous = Double.parseDouble(MisceFIELD.getText());
            double total = tuition + laboratory + miscellaneous;
            TOTAL.setText(String.valueOf(total));
        }catch(NumberFormatException e ){
            TOTAL.setText(" Invalid ");

        }
    }

    static void main() {
        new DataEntry().setVisible(true);
    }
}
