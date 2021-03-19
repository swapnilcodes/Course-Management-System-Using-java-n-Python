import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JLabel heading= new JLabel("LOGIN");
        heading.setOpaque(true);
        heading.setForeground(Color.darkGray);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        Dimension d= heading.getPreferredSize();
        heading.setBounds(300+(150-(d.width/2)), 30, d.width, d.height);
        rootPanel.add(heading);
        JButton loginAsStudent= new JButton("Login As Student");
        loginAsStudent.setFocusable(false);
        loginAsStudent.setOpaque(true);
        loginAsStudent.setBackground(Color.darkGray);
        loginAsStudent.setForeground(Color.white);
        loginAsStudent.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsStudent.setBounds(300+(150-100), 200, 200, 40);
        loginAsStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentLoginOptions loginOptions= new StudentLoginOptions();
                loginOptions.setVisible(true);
            }
        });
        rootPanel.add(loginAsStudent);
        JButton loginAsTeacher= new JButton("Login As Teacher");
        loginAsTeacher.setFocusable(false);
        loginAsTeacher.setOpaque(true);
        loginAsTeacher.setBackground(Color.darkGray);
        loginAsTeacher.setForeground(Color.white);
        loginAsTeacher.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsTeacher.setBounds(300+(150-100), 400, 200, 40);
        rootPanel.add(loginAsTeacher);
    }

}
