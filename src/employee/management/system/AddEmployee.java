package employee.management.system;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

import java.awt.event.ActionListener;
import java.util.*;
public class AddEmployee extends JFrame implements ActionListener {
    Random random = new Random();
    int number=random.nextInt(999999);
    JTextField tfname,tffname,tfsalary,tfaddress,tfphone,tfaadhar,tfemail,tfdesignation;
    JDateChooser dcdob;
    JLabel lblempId;
    JComboBox cbeducation;
    JButton add,back;
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Add Employee Detail");
        heading.setBounds(320,40,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);

        JLabel labelname=new JLabel("Name");
        labelname.setBounds(50,150,150,40);
        labelname.setFont(new Font("serif",Font.PLAIN,25));
        add(labelname);

        tfname=new JTextField();
        tfname.setBounds(200,150,150,40);
        add(tfname);

        JLabel labelfname=new JLabel("Father's Name");
        labelfname.setBounds(400,150,150,40);
        labelfname.setFont(new Font("serif",Font.PLAIN,25));
        add(labelfname);

        tffname=new JTextField();
        tffname.setBounds(600,150,150,40);
        add(tffname);

        JLabel labeldob=new JLabel("Date of Birth");
        labeldob.setBounds(50,200,150,40);
        labeldob.setFont(new Font("serif",Font.PLAIN,25));
        add(labeldob);

        dcdob=new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);

        JLabel labelsalary=new JLabel("Salary");
        labelsalary.setBounds(400,200,150,40);
        labelsalary.setFont(new Font("serif",Font.PLAIN,25));
        add(labelsalary);

        tfsalary=new JTextField();
        tfsalary.setBounds(600,200,150,40);
        add(tfsalary);

        JLabel labeladdress=new JLabel("Address");
        labeladdress.setBounds(50,250,150,40);
        labeladdress.setFont(new Font("serif",Font.PLAIN,25));
        add(labeladdress);

        tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,40);
        add(tfaddress);

        JLabel labelphone=new JLabel("Phone");
        labelphone.setBounds(400,250,150,40);
        labelphone.setFont(new Font("serif",Font.PLAIN,25));
        add(labelphone);

        tfphone=new JTextField();
        tfphone.setBounds(600,250,150,40);
        add(tfphone);

        JLabel labelemail=new JLabel("Email");
        labelemail.setBounds(50,300,150,40);
        labelemail.setFont(new Font("serif",Font.PLAIN,25));
        add(labelemail);

        tfemail=new JTextField();
        tfemail.setBounds(200,300,150,40);
        add(tfemail);

        JLabel labeleducation=new JLabel("Highest Education");
        labeleducation.setBounds(400,300,200,40);
        labeleducation.setFont(new Font("serif",Font.PLAIN,25));
        add(labeleducation);

        String courses[]={"BBA","B.Tech.","B.Com.","BCA","MBA","MTech","MCom","MS"};
        cbeducation =new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600,300,150,40);
        add(cbeducation);

        JLabel labeldesignation=new JLabel("Designation");
        labeldesignation.setBounds(50,350,150,40);
        labeldesignation.setFont(new Font("serif",Font.PLAIN,25));
        add(labeldesignation);

        tfdesignation=new JTextField();
        tfdesignation.setBounds(200,350,150,40);
        add(tfdesignation);

        JLabel labelaadhar=new JLabel("Aadhar Number");
        labelaadhar.setBounds(400,350,150,40);
        labelaadhar.setFont(new Font("serif",Font.PLAIN,25));
        add(labelaadhar);

        tfaadhar=new JTextField();
        tfaadhar.setBounds(600,350,150,40);
        add(tfaadhar);

        JLabel labelempId=new JLabel("Employee id");
        labelempId.setBounds(50,400,150,40);
        labelempId.setFont(new Font("serif",Font.PLAIN,25));
        add(labelempId);

        lblempId=new JLabel(""+number);
        lblempId.setBounds(200,400,150,40);
        lblempId.setFont(new Font("serif",Font.PLAIN,25));
        add(lblempId);

        add=new JButton("Add Details");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
        add.setBackground(Color.GREEN);
        add.setForeground(Color.WHITE);
        add.setOpaque(true);
        add.setFont(new Font("AkayaTelivigala", Font.BOLD, 20));
        add.setBorder(new LineBorder(Color.BLACK));
        add(add);


        back=new JButton("Back");
        back.setBounds(450,550,150,40);
        back.addActionListener(this);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.setFont(new Font("AkayaTelivigala", Font.BOLD, 20));
        back.setBorder(new LineBorder(Color.BLACK));
        add(back);

        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String name=tfname.getText();
            String fname=tffname.getText();
            String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String salary=tfsalary.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String education=(String) cbeducation.getSelectedItem();
            String designation=tfdesignation.getText();
            String aadhar=tfaadhar.getText();
            String empId=lblempId.getText();

            try{
                Conn conn=new Conn();
                String query="insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added successfully");
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
        new AddEmployee();
    }
}
