import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LoginPage  {
    JFrame frame;
    JLabel userName,password;
    JTextField userF;
    JPasswordField passF;
    JButton log,cre;
    JRadioButton manager,roomMate;
    ButtonGroup bG;

    private String createtxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\create.txt";
    private String logintxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\login.txt";
    String bG1;

    public LoginPage(){

        frame=new JFrame();
        userName=new JLabel("User name      :");
        password=new JLabel("Password       :");
        userF=new JTextField(15);
        passF=new JPasswordField(15);
        log=new JButton("Login");
        cre=new JButton("Create an account?");
        manager=new JRadioButton( "Manager" );
        roomMate=new JRadioButton( "Room mate" );
        bG=new ButtonGroup();

        frame.setTitle("Mash Mnagement System");
        frame.setBounds(450,150,450,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        userName.setBounds(60,65,140,25);
        frame.getContentPane().add(userName);

        userF.setBounds(160,65,200,25);
        frame.getContentPane().add(userF);

        password.setBounds(60,115,140,25);
        frame.getContentPane().add(password);

        passF.setBounds(160,115,200,25);
        frame.getContentPane().add(passF);

        manager.setBounds(60,180,80,25);
        bG.add(manager);
        frame.getContentPane().add(manager);


        roomMate.setBounds(150,180,100,25);
        bG.add(roomMate);
        frame.getContentPane().add(roomMate);

        log.setBounds(280,180,80,25);
        frame.getContentPane().add(log);

        cre.setBounds(120,260,200,25);
        frame.getContentPane().add(cre);

        frame.setVisible(true);

        log.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                FileReader fr=null;
                BufferedReader br =null;
                FileWriter fw=null;
                BufferedWriter bw=null;

                String username,password,str;
                String []str2=null ;
                int count=0,flag=0;

                username = userF.getText();
                password = passF.getText();
                if(manager.isSelected()){
                    bG1=manager.getText();
                } else if(roomMate.isSelected()) {
                    bG1 = roomMate.getText();
                }
                try {
                    fr=new FileReader(createtxt);
                    br=new BufferedReader(fr);
                    fw=new FileWriter(logintxt,true);
                    bw=new BufferedWriter(fw);
                    str=br.readLine();

                    while(str!=null){
                       str2=str.split(",");
                       if(username.equals(str2[3]) && password.equals(str2[4]) && bG1.equals(str2[7])){
                           bw.write(str2[0]+":"+str2[7]);
                           if(bG1.equals("Manager")){
                               flag=1;
                           }bw.newLine();
                           bw.flush();
                           bw.close();
                           frame.dispose();
                           Welcome obj = new Welcome(flag);
                           count++;
                        }
                       str=br.readLine();
                    }if(count==0){
                        JOptionPane.showMessageDialog(null,"Invalid username or password or category\nClick ok and try again","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    br.close();
                    fr.close();
                }
                catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });

        cre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                CreateAccount create = new CreateAccount();
            }
        });

    }
}
