import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        JFrame frame = new JFrame("Editor");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(720, 600);
        frame.getContentPane().setBackground(new Color(66,49,58));
        frame.setVisible(true);
    }
}
