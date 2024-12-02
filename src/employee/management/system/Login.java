package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JTextField tfUsername,tfPassword;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 110, 30);
        add(lblusername);

        tfUsername = new JTextField();
        tfUsername.setBounds(170, 20, 160, 30);
        tfUsername.setBorder(new LineBorder(Color.BLACK));
        add(tfUsername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 70, 110, 30);
        add(lblpassword);

        tfPassword = new JTextField();
        tfPassword.setBounds(170, 70, 160, 30);
        tfPassword.setBorder(new LineBorder(Color.BLACK));
        add(tfPassword);

        JButton login = new JButton("LOGIN");
        login.setBounds(170, 140, 160, 40);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.BLACK); // Set background color to black
        login.setOpaque(true); // Ensure the button is opaque
        login.setBorder(new LineBorder(Color.BLACK));
        login.addActionListener(this);
        Font buttonFont = new Font("AkayaTelivigala", Font.BOLD, 16); // You can change "Arial" and size (16) as needed
        login.setFont(buttonFont);

        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits on close
    }
    public void actionPerformed(ActionEvent ae){
        try{
            String username=tfUsername.getText();
            String password=tfPassword.getText();
            Conn c =new Conn();

            String query="SELECT * FROM login WHERE username = '"+username+"' and password ='"+password+"'";
            ResultSet rs =c.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Home();
            }else{
                JOptionPane.showMessageDialog(null,"Invalid username or password");
                setVisible(false);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}