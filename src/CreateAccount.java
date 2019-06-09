import javax.imageio.IIOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CreateAccount extends JFrame {

    JLabel acc, name, cont, email, user, pass, birth, gender,type;
    JTextField nameF, contF, emailF, userF;
    JPasswordField passF;
    JComboBox date, month, year;
    JButton done;
    JRadioButton male,female,manager,roomMate;
    ButtonGroup bg,bG;

    private String createtxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\create.txt";
    String nameF1, contF1, emailF1, userF1, passF1, date1, month1, year1, birth1,bg1,bG1;

    public CreateAccount() {
        ArrayList<String> s = new ArrayList<>();
        String [] list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(String sl:s) {
            s.add(sl);
        }month = new JComboBox(list);

        ArrayList<Integer> s2 = new ArrayList<>();
        Integer [] list2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        for(Integer sl2:s2) {
            s2.add(sl2);
        }date = new JComboBox(list2);

        ArrayList<Integer> s3 = new ArrayList<>();
        Integer [] list3={1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
        for(Integer sl3:s3) {
            s3.add(sl3);
        }year = new JComboBox(list3);

        acc = new JLabel( "NEW ACCOUNT" );
        name = new JLabel( "Name                :" );
        cont = new JLabel( "Contact no       :" );
        email = new JLabel( "Email Id             :" );
        user = new JLabel( "User name       :" );

        pass = new JLabel( "Password        :" );
        birth = new JLabel( "Birth of Date    :" );
        gender = new JLabel( "Gender              :" );
        type=new JLabel( "Category          :" );

        nameF = new JTextField( 20 );
        contF = new JTextField( 20 );
        emailF = new JTextField( 20 );
        userF = new JTextField( 20 );
        passF = new JPasswordField( 20 );

        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        bg=new ButtonGroup();

        manager=new JRadioButton("Manager");
        roomMate=new JRadioButton("Room mate");
        bG=new ButtonGroup();
        done = new JButton( "Done" );

        setTitle( "New Account" );
        setBounds( 380, 90, 480, 600 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        getContentPane().setLayout( null );

        acc.setBounds( 130, 30, 450, 25 );
        acc.setFont( new Font( "Calibri", Font.BOLD, 30 ) );
        getContentPane().add( acc );

        name.setBounds( 60, 85, 140, 25 );
        getContentPane().add( name );

        nameF.setBounds( 160, 85, 220, 25 );
        getContentPane().add( nameF );

        cont.setBounds( 60, 135, 140, 25 );
        getContentPane().add( cont );

        contF.setBounds( 160, 135, 220, 25 );
        getContentPane().add( contF );

        email.setBounds( 60, 185, 140, 25 );
        getContentPane().add( email );

        emailF.setBounds( 160, 185, 220, 25 );
        getContentPane().add( emailF );

        user.setBounds( 60, 235, 140, 25 );
        getContentPane().add( user );

        userF.setBounds( 160, 235, 220, 25 );
        getContentPane().add( userF );

        pass.setBounds( 60, 285, 140, 25 );
        getContentPane().add( pass );

        passF.setBounds( 160, 285, 220, 25 );
        getContentPane().add( passF );

        birth.setBounds( 60, 335, 140, 25 );
        getContentPane().add( birth );

        date.setBounds( 160, 335, 45, 25 );
        getContentPane().add( date );

        month.setBounds( 235, 335, 50, 25 );
        getContentPane().add( month );

        year.setBounds( 325, 335, 55, 25 );
        getContentPane().add( year );

        gender.setBounds( 60, 385, 140, 25 );
        getContentPane().add( gender );

        male.setBounds( 160,385,100,25 );
        bg.add( male );
        getContentPane().add(male);

        female.setBounds( 260, 385, 100, 25 );
        bg.add( female );
        getContentPane().add(female);

        type.setBounds( 60, 435, 140, 25 );
        getContentPane().add( type );

        manager.setBounds( 160,435,100,25 );
        bG.add(manager);
        getContentPane().add(manager);

        roomMate.setBounds( 260, 435, 100, 25 );
        bG.add( roomMate );
        getContentPane().add(roomMate);

        done.setBounds( 180, 490, 100, 30 );
        getContentPane().add( done );
        setVisible( true );

        done.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                BufferedWriter bw = null;
                FileWriter fw = null;

                nameF1 = nameF.getText();
                contF1 = contF.getText();
                emailF1 = emailF.getText();
                userF1 = userF.getText();
                passF1 = String.valueOf( passF.getPassword() );
                date1 = date.getSelectedItem().toString();
                month1 = month.getSelectedItem().toString();
                year1 = year.getSelectedItem().toString();
                birth1 = date1 + month1 + year1;

                if(male.isSelected()){
                    bg1=male.getText();
                } else if(female.isSelected()) {
                    bg1 = female.getText();
                }if(manager.isSelected()){
                    bG1=manager.getText();
                } else if(roomMate.isSelected()) {
                    bG1 = roomMate.getText();
                }
                try {
                    fw = new FileWriter( createtxt, true );
                    bw = new BufferedWriter( fw );

                    if(nameF1.isEmpty()  || contF1.isEmpty() || emailF1.isEmpty() || userF1.isEmpty() || passF1.isEmpty() || birth1.isEmpty()||bg1.isEmpty() ||bG1.isEmpty())
                    {
                        JOptionPane.showMessageDialog( null, "Fill up the Full Form", "Error", JOptionPane.ERROR_MESSAGE );
                    }
                    else {
                        bw.write( nameF1 + "," + contF1 + "," + emailF1 + "," + userF1 + "," + passF1 + ", " + birth1 +","+bg1 +","+bG1);
                        bw.newLine();
                        bw.close();
                        JOptionPane.showMessageDialog(null, "Creating Successful");
                        dispose();
                        LoginPage log = new LoginPage();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } );
    }
}


