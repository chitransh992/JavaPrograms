import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login,signUp,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        // creating frame of login page
        setTitle("AUTOMATED TELLER MACHINE");      //used to get the title of the frame here

        setLayout(null);                          //it will delete all the layout if we pass null

        ImageIcon imageIcon = new ImageIcon (ClassLoader.getSystemResource("icons/logo.jpg"));      //used to get the image from the system

        Image image = imageIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);

        ImageIcon imageIcon1 = new ImageIcon(image);

        JLabel jlabel = new JLabel(imageIcon1);                   //we need to pass the imageIcon1 to the label
        jlabel.setBounds(70,10,100,100);        // the setBounds will place the image into the specific position and with specific width and height value
        add(jlabel);                                              //here we add the label to the panel


        // code for the welcome text field
        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);

        //Code for the cardNo of the bank Management System
        JLabel cardNo = new JLabel("Card No :");
        cardNo.setFont(new Font("Railway",Font.BOLD,20));
        cardNo.setBounds(120,155,400,30);
        add(cardNo);


        cardTextField = new JTextField();
        cardTextField.setBounds(300,155,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

        //Code for the PinNumber of the bank Management System
        JLabel pin = new JLabel("PIN :");
        pin.setBounds(120,225,400,40);
        pin.setFont(new Font("Railway",Font.BOLD,20));
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,230,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        // code for the signIn button
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        //code for the clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        //code for the signup button
        signUp = new JButton("SIGN IN");
        signUp.setBounds(300,350,230,30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);

        getContentPane().setBackground(Color.WHITE);                  //Used to get the background color of the panel here
        setSize(700,500);                                //setSize has length and breadth of the frame function
        setLocation(350,160);                                  //used to get origin location of the frame

        setVisible(true);                                            //It is used to get visibility of the frame here
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource() == login){

        }
        else if(ae.getSource() == signUp){

        }
    }
    public static void main(String[] args) {
        Login login  = new Login();
    }
}