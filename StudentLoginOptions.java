import javax.swing.*;
import java.awt.*;

public class StudentLoginOptions extends JFrame {

    JPanel rootPanel= new JPanel(null);

    public StudentLoginOptions(){
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\res\\logo.png"));

        setUp();
        add(rootPanel);
    }

    public void setUp(){
        JLabel heading= new JLabel("Choose A Option");
        heading.setOpaque(true);
        heading.setForeground(Color.darkGray);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 22));
        Dimension d= heading.getPreferredSize();
        heading.setBounds(200-(d.width/2), 30, d.width, d.height);
        rootPanel.add(heading);
        JButton createAccount= new JButton("Create Account");
        createAccount.setFocusable(false);
        createAccount.setOpaque(true);
        createAccount.setFont(new Font("Calibri", Font.PLAIN, 22));
        createAccount.setBackground(Color.darkGray);
        createAccount.setForeground(Color.white);
        createAccount.setBounds(200-100, 150, 200, 40);
        rootPanel.add(createAccount);
        JButton login= new JButton("LOGIN");
        login.setFocusable(false);
        login.setOpaque(true);
        login.setForeground(Color.white);
        login.setBackground(Color.darkGray);
        login.setBounds(200-100, 250, 200, 40);
        login.setFont(new Font("Calibri", Font.PLAIN, 22));
        rootPanel.add(login);
    }


}
