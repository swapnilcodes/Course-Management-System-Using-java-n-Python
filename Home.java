import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    JPanel rootPanel= new JPanel(null);
    public Home(){
        setResizable(false);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\res\\logo.png"));
        setLocationRelativeTo(null);
        createLeftBar();
        createRight();
        add(rootPanel);
    }
    public void createLeftBar(){
        JPanel panel= new JPanel(null);
        panel.setOpaque(true);
        panel.setBackground(Color.darkGray);
        panel.setBounds(0, 0, 300, 600);
        JLabel heading= new JLabel("Course Management System");
        heading.setOpaque(true);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        heading.setForeground(Color.white);
        heading.setBackground(Color.darkGray);
        Dimension d= heading.getPreferredSize();
        heading.setBounds(150-(d.width/2),30, d.width, d.height);
        panel.add(heading);
        JLabel icon= new JLabel(new ImageIcon("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\res\\logo.png"));
        icon.setOpaque(true);
        icon.setBackground(Color.darkGray);
        icon.setBounds(150-100, 250, 200, 200);
        panel.add(icon);
        rootPanel.add(panel);
    }

    public void createRight(){

    }

}
