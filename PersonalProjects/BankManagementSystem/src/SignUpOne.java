import javax.swing.*;
import java.awt.*;
import java.util.Random;
//import com.toedter.calendar.JCalendar;
//import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {
    SignUpOne(){

        setLayout(null);

        //getting the heading of th application form number here by generating the random number
        Random random = new Random();
        Long ran = Math.abs(random.nextLong()%9000L)+1000L;
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

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        //Details for the Father's Name of the person
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField nameFTextField = new JTextField();
        nameFTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameFTextField.setBounds(300,190,400,30);
        add(nameFTextField);

        //Details for the Date of birth of the person
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

//        JDateChooser dateChooser = new JDateChooser();
//        dateChooser.setBounds(300,240,200,30);
//        add(dateChooser);

        //Details for the Gender of the person
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        //Details for the Email of the person
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        //Details for the Marital Status of the person
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        //Details for the Address of the person
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        //Details for the City of the person
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        //Details for the State of the person
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);


        //Details for the Pin Code of the person
        JLabel pincode = new JLabel("Pin code: ");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        JTextField pinTextField = new JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String[] args) {
        SignUpOne signUpOne = new SignUpOne();
    }
}
