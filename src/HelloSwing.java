import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSwing extends  JFrame{
    private JButton buttonMensagem;
    public  JPanel panel1;
    private JTextField textMensagemTextField;

    public HelloSwing() {
    buttonMensagem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(buttonMensagem,textMensagemTextField.getText());
        }
    });
}
}
