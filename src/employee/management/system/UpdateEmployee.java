package employee.management.system;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.event.ActionListener;
import java.util.*;
public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField tfeducation,tffname,tfsalary,tfaddress,tfphone,tfaadhar,tfemail,tfdesignation;
    JLabel lblempId;
    JButton update,back;
    String empId;
    UpdateEmployee(String empId){
        this.empId=empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading=new JLabel("Update Employee Detail");
        heading.setBounds(320,40,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(heading);

        JLabel labelname=new JLabel("Name");
        labelname.setBounds(50,150,150,40);
        labelname.setFont(new Font("serif",Font.PLAIN,25));
        add(labelname);

        JLabel lblname=new JLabel();
        lblname.setBounds(200,150,150,40);
        add(lblname);

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

        JLabel lbldob=new JLabel();
        lbldob.setBounds(200,200,150,30);
        add(lbldob);

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

        tfeducation =new JTextField();
        tfeducation.setBounds(600,300,150,40);
        add(tfeducation);

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

        JLabel lblaadhar=new JLabel();
        lblaadhar.setBounds(600,350,150,40);
        add(lblaadhar);

        JLabel labelempId=new JLabel("Employee id");
        labelempId.setBounds(50,400,150,40);
        labelempId.setFont(new Font("serif",Font.PLAIN,25));
        add(labelempId);

        lblempId=new JLabel();
        lblempId.setBounds(200,400,150,40);
        lblempId.setFont(new Font("serif",Font.PLAIN,25));
        add(lblempId);

        try{
            Conn conn = new Conn();
            String query="Select * from employee where empId='"+empId+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()){
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempId.setText(rs.getString("empId"));
                tfdesignation.setText(rs.getString("designation"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }

        update=new JButton("Update Details");
        update.setBounds(250,550,150,40);
        update.addActionListener(this);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setOpaque(true);
        update.setFont(new Font("AkayaTelivigala", Font.BOLD, 20));
        update.setBorder(new LineBorder(Color.BLACK));
        add(update);


        back=new JButton("Back");
        back.setBounds(450,550,150,40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
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
        if(ae.getSource()==update){
            String fname=tffname.getText();
            String salary=tfsalary.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String education=tfeducation.getText();
            String designation=tfdesignation.getText();

            try{
                Conn conn=new Conn();
                String query="update employee set fname='"+fname+"',salary='"+salary+"',address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+education+"',designation='"+designation+"' where empId='"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details updated successfully");
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
        new UpdateEmployee("");
    }
}
