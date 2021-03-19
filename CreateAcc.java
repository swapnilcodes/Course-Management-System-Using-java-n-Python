import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

public class CreateAcc extends JFrame {
    JPanel rootPanel= new JPanel(null);
    public CreateAcc(){
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setUp();
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\res\\logo.png"));
        add(rootPanel);
    }

    public void setUp(){
        rootPanel.setBackground(Color.white);
        JLabel heading= new JLabel("Enter Your Details");
        heading.setOpaque(true);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 22));
        heading.setForeground(Color.darkGray);
        heading.setBackground(Color.white);
        Dimension d= heading.getPreferredSize();
        heading.setBounds(250-(d.width/2), 30, d.width, d.height);
        rootPanel.add(heading);
        JTextField nameField= new JTextField("Enter your name");
        nameField.setOpaque(true);
        nameField.setFont(new Font("Calibri", Font.PLAIN, 20));
        nameField.setBackground(Color.white);
        nameField.setForeground(Color.darkGray);
        nameField.setBounds(250-150, 200, 300, 40);
        rootPanel.add(nameField);
        JTextField emailField= new JTextField("Enter Your email id");
        emailField.setOpaque(true);
        emailField.setFont(new Font("Calibri", Font.PLAIN, 20));
        emailField.setBackground(Color.white);
        emailField.setForeground(Color.darkGray);
        emailField.setBounds(250-150, 300, 300, 40);
        rootPanel.add(emailField);
        JButton submit= new JButton("SUBMIT");
        submit.setOpaque(true);
        submit.setForeground(Color.white);
        submit.setBackground(Color.darkGray);
        submit.setFocusable(false);
        submit.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        submit.setBounds(250-150, 400, 300, 50);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    FileWriter writer= new FileWriter(new File("C:\\Users\\Swapnil\\IdeaProjects\\Course Management System Genxclub\\TXT's\\createNewTry.txt"));
                    String data= "{ \""+"name\": \""+nameField.getText()+"\", \"email\": \""+emailField.getText()+"\"}";
                    writer.write(data);
                    writer.close();
                }
                catch(Exception err){
                    err.printStackTrace();
                }
            }
        });
        rootPanel.add(submit);
    }

}
