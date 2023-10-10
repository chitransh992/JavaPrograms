import javax.security.auth.callback.UnsupportedCallbackException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.net.*;

public class Server implements ActionListener {
    JTextField jTextField;
    JPanel j1;
    static Box vertical = Box.createVerticalBox();

    static JFrame jframe = new JFrame();
    static DataOutputStream dataOutputStream;
    Server(){
        jframe.setLayout(null);

        JPanel jpanel = new JPanel();
        jpanel.setBackground(new Color(7,94,84));
        jpanel.setBounds(0,0,450,50);
        jpanel.setLayout(null);
        jframe.add(jpanel);

        //Code for the back button here
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image imageIcon1 = imageIcon.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(imageIcon1);

        JLabel back = new JLabel(imageIcon2);
        back.setBounds(5,15,20,20);
        jpanel.add(back);
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        //Code for the Profile picture
        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image imageIcon5 = imageIcon4.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
        ImageIcon imageIcon6 = new ImageIcon(imageIcon5);

        JLabel profile = new JLabel(imageIcon6);
        profile.setBounds(30,1,50,50);
        jpanel.add(profile);


        //code for video icon
        ImageIcon imageIcon7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image imageIcon8 = imageIcon7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon imageIcon9 = new ImageIcon(imageIcon8);

        JLabel videoIcon = new JLabel(imageIcon9);
        videoIcon.setBounds(300,15,20,20);
        jpanel.add(videoIcon);


        //code for call image icon
        ImageIcon imageIcon10= new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image imageIcon11 = imageIcon10.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(imageIcon11);

        JLabel callIcon = new JLabel(imageIcon12);
        callIcon.setBounds(350,15,20,20);
        jpanel.add(callIcon);

        //code for 3icon icon
        ImageIcon imageIcon13= new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image imageIcon14 = imageIcon13.getImage().getScaledInstance(7,15,Image.SCALE_DEFAULT);
        ImageIcon imageIcon15 = new ImageIcon(imageIcon14);

        JLabel threeIcon = new JLabel(imageIcon15);
        threeIcon.setBounds(400,16,7,15);
        jpanel.add(threeIcon);


        // code for the name of the person
        JLabel name = new JLabel("Gaitonde");
        name.setBounds(86,10,100,18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
        jpanel.add(name);

        //Code for the activity icon
        JLabel status = new JLabel("Active Now");
        status.setBounds(86,25,90,23);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF",Font.ITALIC,10));
        jpanel.add(status);

        //code for the white panel
        j1 = new JPanel();
        j1.setBounds(0,50,460,510);
        jframe.add(j1);

        //code for the text field
        jTextField = new JTextField();
        jTextField.setBounds(15,565,310,30);
        jframe.add(jTextField);

        //code for the send button here
        JButton send = new JButton("Send");
        send.setBounds(350,565,80,30);
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        send.setFont(new Font("SAN_SERIF",Font.PLAIN,12));
        jframe.add(send);



        jframe.setSize(450,600);
        jframe.setLocation(180,30);
        jframe.setUndecorated(true);
        jframe.getContentPane().setBackground(Color.WHITE);
        jframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try {
            String output = jTextField.getText();

            JPanel jPanel = formatLabel(output);

            System.out.println(output);

            j1.setLayout(new BorderLayout());

            JPanel right = new JPanel(new BorderLayout());
            right.add(jPanel, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));

            j1.add(vertical, BorderLayout.PAGE_START);

            dataOutputStream.writeUTF(output);

            jTextField.setText("");

            jframe.repaint();
            jframe.invalidate();
            jframe.validate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static JPanel formatLabel(String output1){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JLabel output = new JLabel(output1);
        output.setFont(new Font("Tahoma",Font.PLAIN,16));
        output.setBackground(new Color(37,211,102));

        output.setOpaque(true);

        output.setBorder(new EmptyBorder(15,15,15,50));
        panel.add(output);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm");

        JLabel time = new JLabel("");
        time.setText(sdf.format(calendar.getTime()));

        panel.add(time);

        return panel;
    }
    public static void main(String[] args) {
        Server server = new Server();

        try{
            ServerSocket serverSocket = new ServerSocket(6001);
            while(true){
                Socket socket = serverSocket.accept();
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream = new DataOutputStream(socket.getOutputStream());

                while(true)
                {
                    String message = dataInputStream.readUTF();
                    JPanel panel = formatLabel(message);

                    JPanel left = new JPanel(new BorderLayout());
                    left.add(panel,BorderLayout.LINE_START);
                    vertical.add(left);
                    jframe.validate();
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
