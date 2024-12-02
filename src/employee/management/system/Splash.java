package employee.management.system;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame  implements ActionListener {
    Splash(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("AkayaTelivigala",Font.BOLD,50));
        heading.setForeground(Color.GREEN);
        add(heading);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(60,75,1100,550);
        add(image);

        JButton click=new JButton("CLICK HERE TO CONTINUE");
        click.setBounds(400,450,300,70);
        click.setForeground(Color.WHITE);
        click.setBackground(Color.ORANGE);
        click.addActionListener(this);
        click.setOpaque(true);
        click.setBorder(new LineBorder(Color.BLACK));
        Font buttonFont = new Font("AkayaTelivigala", Font.BOLD, 20); // You can change "Arial" and size (16) as needed
        click.setFont(buttonFont);
        image.add(click);
        setSize(1230,700);
        setLocation(120,50);

        setVisible(true);

        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){

            }
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){

            }
        }
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String args[]){
        new Splash();

    }

}
