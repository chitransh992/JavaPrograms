import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpTwo extends JFrame {

    JTextField nameTextField,nameFTextField, emailTextField,pinTextField,addressTextField,cityTextField,stateTextField;
    JButton next;
    JRadioButton male, female, other,married,unMarried;
    JDateChooser dateChooser;
    SignUpTwo(){

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        // label for the Additional details here
        JLabel additionalDetails = new JLabel("Additional Details");
        additionalDetails.setFont(new Font("Railway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,40);
        add(additionalDetails);

        //Details for the Name of the person
        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valRelgion[] = {"Hindu","Muslim","Christian","Sikh","Other"};
        JComboBox religion = new JComboBox(valRelgion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);


        //Details for the Father's Name of the person
        JLabel fname = new JLabel("Category: ");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String[] valcategory = {"General","OBC","SC","ST","Other"};
        JComboBox jComboBox2 = new JComboBox(valcategory);
        jComboBox2.setBounds(300,190,400,30);
        jComboBox2.setBackground(Color.WHITE);
        add(jComboBox2);


        //Details for the Date of birth of the person
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String[] valIncome = {"Nil","< 1,50,000","<2,50,000","< 5,00,000","Upto 10 lakh"};
        JComboBox jComboBox3 = new JComboBox(valIncome);
        jComboBox3.setBounds(300,240,400,30);
        jComboBox3.setBackground(Color.WHITE);
        add(jComboBox3);


        //Details for the Gender of the person
        JLabel gender = new JLabel("Education ");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);


        //Details for the Email of the person
        JLabel email = new JLabel("Qualification : ");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String[] valEducationValues = {"Non Graduate","Graduate","Post Graduate","PhD","Others"};
        JComboBox education = new JComboBox(valEducationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        //Details for the Marital Status of the person
        JLabel marital = new JLabel("Occupation : ");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unMarried = new JRadioButton("Unmarried");
        unMarried.setBounds(450,390,100,30);
        unMarried.setBackground(Color.WHITE);
        add(unMarried);

        other = new JRadioButton("other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);


        //Details for the Address of the person
        JLabel address = new JLabel("PAN Number: ");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        //Details for the City of the person
        JLabel city = new JLabel("Aadhar Number: ");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        //Details for the State of the person
        JLabel state = new JLabel("Senior Citizen: ");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);


        //Details for the Pin Code of the person
        JLabel pincode = new JLabel("Existing Account : ");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);

        //code for the next button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
//        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setUndecorated(true);
        setVisible(true);
    }

//    public void actionPerformed(ActionEvent ae){
//        String name = nameTextField.getText();
//        String fatherName = nameFTextField.getText();
//        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
//
//        String gender = null;
//        if (male.isSelected()){
//            gender = "Male";
//        }
//        else if(female.isSelected()){
//            gender = "Female";
//        }
//
//        String email = emailTextField.getText();
//        String marital = null;
//
//        if(married.isSelected()){
//            marital = "Married";
//        }
//        else if(unMarried.isSelected()){
//            marital = "UnMarried";
//        }
//        else if(other.isSelected()){
//            marital = "Other";
//        }
//
//        String address = addressTextField.getText();
//        String city = cityTextField.getText();
//        String state = stateTextField.getText();
//        String pin = pinTextField.getText();
//
//        try{
//            if(name.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"Name is Required");
//            }
//            else if(fatherName.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"Father's name is required");
//            }
//            else if(dob.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"Date of Birth is required");
//            }
//            else if(address.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"Address is required");
//            }
//            else if(city.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"City name is required");
//            }
//            else if(state.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"State name is required");
//            }
//            else if(pin.equalsIgnoreCase("")){
//                JOptionPane.showMessageDialog(null,"pin number is required");
//            }
//            else{
//                Conn connection = new Conn();
//                String query = "INSERT INTO SignUp Values('"+formno+"','"+name+"','"+fatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
//                connection.statement.executeUpdate(query);
//                System.out.println("Values Inserted Successfully");
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

    public static void main(String[] args)  {
        SignUpTwo signUpTwo = new SignUpTwo();
    }
}
