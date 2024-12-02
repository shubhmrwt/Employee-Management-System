package employee.management.system;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame implements ActionListener {
    Choice cempId;
    JButton delete,back;
    RemoveEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel labelempId=new JLabel("Employee Id");
        labelempId.setBounds(50,50,100,30);
        add(labelempId);

        cempId=new Choice();
        cempId.setBounds(200,50,150,30);
        add(cempId);

        try{
            Conn conn = new Conn();
            String query="select * from employee";
            ResultSet resultSet = conn.s.executeQuery(query);
            while(resultSet.next()){
                cempId.add(resultSet.getString("empId"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel labelname =new JLabel("Name");
        labelname.setBounds(50,100,100,30);
        add(labelname);

        JLabel lblname =new JLabel();
        lblname.setBounds(200,100,100,30);
        add(lblname);

        JLabel labelphone =new JLabel("Phone");
        labelphone.setBounds(50,150,100,30);
        add(labelphone);

        JLabel lblphone =new JLabel();
        lblphone.setBounds(200,150,100,30);
        add(lblphone);

        JLabel labelemail =new JLabel("Email");
        labelemail.setBounds(50,200,100,30);
        add(labelemail);

        JLabel lblemail =new JLabel();
        lblemail.setBounds(200,200,100,30);
        add(lblemail);

        try{
            Conn conn = new Conn();
            String query="select * from employee where empId= '"+cempId.getSelectedItem()+"'";
            ResultSet resultSet = conn.s.executeQuery(query);
            while(resultSet.next()){
               lblname.setText(resultSet.getString("name"));
                lblphone.setText(resultSet.getString("phone"));
                lblemail.setText(resultSet.getString("email"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }

        cempId.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try{
                    Conn conn = new Conn();
                    String query="select * from employee where empId= '"+cempId.getSelectedItem()+"'";
                    ResultSet resultSet = conn.s.executeQuery(query);
                    while(resultSet.next()){
                        lblname.setText(resultSet.getString("name"));
                        lblphone.setText(resultSet.getString("phone"));
                        lblemail.setText(resultSet.getString("email"));

                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        delete =new JButton("Delete");
        delete.setBounds(80,300,100,40);
        delete.setBackground(Color.RED);
        delete.setForeground(Color.WHITE);
        delete.setOpaque(true);
        delete.setBorder(new LineBorder(Color.BLACK));
        delete.setFont(new Font("AkayaTelivigala", Font.BOLD, 20));
        delete.addActionListener(this);
        add(delete);

        back =new JButton("Back");
        back.setBounds(220,300,100,40);
        back.setBackground(Color.ORANGE);
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.addActionListener(this);
        back.setBorder(new LineBorder(Color.BLACK));
        back.setFont(new Font("AkayaTelivigala", Font.BOLD, 20));
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,0,600,400);
        add(image);

        setSize(1000,400);
        setLocation(300,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==delete){
            try{
                Conn conn = new Conn();
                String query="delete from employee where empId= '"+cempId.getSelectedItem()+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Employee Information Deleted Successfully");
                setVisible(false);
                new Home();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Home();
        }
    }


    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
