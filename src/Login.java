import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel LoginPanel;
    private JTextField USERNAMEFIELD;
    private JTextField PASSWORDFIELD;
    private JButton LOGINButton;

    public Login() {
        setContentPane(LoginPanel);
        setTitle(" Log In ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Dashboard().setVisible(true);
                dispose();
            }
        });
    }

    static void main() {
        new Login().setVisible(true);
    }
}
