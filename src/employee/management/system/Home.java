package employee.management.system;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
    JButton add,update,view,remove;
    Home(){
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(1130,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1130,700);
        add(image);

        JLabel heading =new JLabel("Employee Management System");
        heading.setBounds(620,20,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image.add(heading);

        add=new JButton("Add Employee");
        add.setBounds(650,80,160,40);
        add.addActionListener(this);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.GREEN);
        add.addActionListener(this);
        add.setOpaque(true);
        add.setBorder(new LineBorder(Color.BLACK));
        add.setFont( new Font("AkayaTelivigala", Font.BOLD, 20));
        image.add(add);

        view=new JButton("View Employees");
        view.setBounds(820,80,160,40);
        view.addActionListener(this);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.LIGHT_GRAY);
        view.addActionListener(this);
        view.setOpaque(true);
        view.setBorder(new LineBorder(Color.BLACK));
        view.setFont( new Font("AkayaTelivigala", Font.BOLD, 20));
        image.add(view);

        update=new JButton("Update Employee");
        update.setBounds(650,140,160,40);
        update.addActionListener(this);
        update.setForeground(Color.WHITE);
        update.setBackground(Color.ORANGE);
        update.addActionListener(this);
        update.setOpaque(true);
        update.setBorder(new LineBorder(Color.BLACK));
        update.setFont( new Font("AkayaTelivigala", Font.BOLD, 20));
        image.add(update);

        remove=new JButton("Remove Employee");
        remove.setBounds(820,140,160,40);
        remove.addActionListener(this);
        remove.setForeground(Color.WHITE);
        remove.setBackground(Color.RED);
        remove.addActionListener(this);
        remove.setOpaque(true);
        remove.setBorder(new LineBorder(Color.BLACK));
        remove.setFont( new Font("AkayaTelivigala", Font.BOLD, 20));
        image.add(remove);


        setSize(1130,700);
        setLocation(200,100);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();

        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        }else{
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
