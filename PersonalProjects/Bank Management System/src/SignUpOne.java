import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{
    long ran;
    JTextField nameTextField,nameFTextField, emailTextField,pinTextField,addressTextField,cityTextField,stateTextField;
    JButton next;
    JRadioButton male, female, other,married,unMarried;
    JDateChooser dateChooser;
    SignUpOne(){

        setLayout(null);

        //getting the heading of th application form number here by generating the random number
        Random random = new Random();
        ran = Math.abs(random.nextLong()%9000L)+1000L;
        JLabel formNo = new JLabel("APPLICATION FORM NO. "+ran);
        formNo.setFont(new Font("Railway",Font.BOLD,38));
        formNo.setBounds(140,20,600,40);
        add(formNo);

        // label for the personal details here
        JLabel personDetails = new JLabel("Personal Details");
        personDetails.setFont(new Font("Railway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,40);
        add(personDetails);

        //Details for the Name of the person
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        //Details for the Father's Name of the person
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        nameFTextField = new JTextField();
        nameFTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameFTextField.setBounds(300,190,400,30);
        add(nameFTextField);

        //Details for the Date of birth of the person
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        //It is used to get the calander jar file inside the dob text field
        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Railway",Font.BOLD,20));
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);

        //Details for the Gender of the person
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        //Details for the Email of the person
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        //Details for the Marital Status of the person
        JLabel marital = new JLabel("Marital Status: ");
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

        ButtonGroup marridGroup = new ButtonGroup();
        genderGroup.add(married);
        genderGroup.add(unMarried);
        genderGroup.add(other);

        //Details for the Address of the person
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        //Details for the City of the person
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        //Details for the State of the person
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);


        //Details for the Pin Code of the person
        JLabel pincode = new JLabel("Pin code: ");
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
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = ""+ran;
        String name = nameTextField.getText();
        String fatherName = nameFTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;

        if(married.isSelected()){
            marital = "Married";
        }
        else if(unMarried.isSelected()){
            marital = "UnMarried";
        }
        else if(other.isSelected()){
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try{
            if(name.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else if(fatherName.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Father's name is required");
            }
            else if(dob.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Date of Birth is required");
            }
            else if(address.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Address is required");
            }
            else if(city.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"City name is required");
            }
            else if(state.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"State name is required");
            }
            else if(pin.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"pin number is required");
            }
            else{
                Conn connection = new Conn();
                String query = "INSERT INTO SignUp Values('"+formno+"','"+name+"','"+fatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                connection.statement.executeUpdate(query);
                System.out.println("Values Inserted Successfully");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }


    }
    public static void main(String[] args)  {
        SignUpOne signUpOne = new SignUpOne();
    }
}
