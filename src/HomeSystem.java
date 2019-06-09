import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class HomeSystem {

    JFrame frame;
    JLabel home, utility, service, total, month, perPay;
    JTextField homeF, utilityF, serviceF, totalF, perPayF;
    JButton back,done;
    JComboBox monthCom;

    private String hometxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\home.txt";
    private String logintxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\login.txt";

    double homeF1,utilityF1,serviceF1,totalF1,perPayF1;
    String st;
    String [] st2;

    public HomeSystem(int flag) {

        ArrayList<String> s = new ArrayList<>();
        String [] list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(String sl:s) {
            s.add(sl);
        }monthCom = new JComboBox(list);

        frame = new JFrame();
        home = new JLabel("HOME RENT               :");
        utility = new JLabel("UTILITY BILL           :");
        service = new JLabel("SERVICE CHARGE      :");
        total = new JLabel("TOTAL                          :");
        perPay = new JLabel("PER PAY                       : ");
        month = new JLabel("MONTH");

        homeF = new JTextField(20);
        utilityF = new JTextField(20);
        serviceF = new JTextField(20);
        totalF = new JTextField(20);
        perPayF = new JTextField(20);

        done = new JButton( "Done" );
        back = new JButton("Back");

        frame.setTitle("Home System");
        frame.setBounds(450, 150, 450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        month.setBounds(350, 10, 70, 25);
        frame.getContentPane().add(month);

        monthCom.setBounds(340, 30, 70, 25);
        frame.getContentPane().add(monthCom);

        home.setBounds(50, 70, 150, 25);
        frame.getContentPane().add(home);

        homeF.setBounds(200, 70, 160, 25);
        frame.getContentPane().add(homeF);

        utility.setBounds(50, 120, 150, 25);
        frame.getContentPane().add(utility);

        utilityF.setBounds(200, 120, 160, 25);
        frame.getContentPane().add(utilityF);

        service.setBounds(50, 170, 150, 25);
        frame.getContentPane().add(service);

        serviceF.setBounds(200, 170, 160, 25);
        frame.getContentPane().add(serviceF);

        total.setBounds(50, 220, 150, 25);
        frame.getContentPane().add(total);

        totalF.setBounds(200, 220, 160, 25);
        frame.getContentPane().add(totalF);

        perPay.setBounds(50, 270, 150, 25);
        frame.getContentPane().add(perPay);

        perPayF.setBounds(200, 270, 160, 25);
        frame.getContentPane().add(perPayF);

        back.setBounds(300, 345, 80, 30);
        frame.getContentPane().add(back);

        if(flag==1) {
            done.setBounds( 130, 345, 80, 30 );
            frame.getContentPane().add( done );
        }

        frame.setVisible(true);

        BufferedReader br=null;
        FileReader fr=null;
        try{
            fr=new FileReader(hometxt);
            br=new BufferedReader( fr );
            st=br.readLine();
            System.out.println(st);
            while (st!=null) {
                st2 = st.split( " " );
                monthCom.setSelectedItem(st2[0]);
                homeF.setText( st2[1]);
                utilityF.setText(st2[2] );
                serviceF.setText(st2[3]);
                totalF.setText(st2[4]);
                perPayF.setText(st2[5]);
                st=br.readLine();
            }br.close();
        }catch (Exception e11){}

        done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BufferedWriter bw = null;
                FileWriter fw = null;

                String monthF = monthCom.getSelectedItem().toString();
                homeF1 = Double.parseDouble(homeF.getText());
                utilityF1 = Double.parseDouble(utilityF.getText());
                serviceF1 = Double.parseDouble(serviceF.getText());

                totalF1 = homeF1 +utilityF1 + serviceF1;
                perPayF1 = totalF1 / 3;
                totalF.setText( String.valueOf( totalF1 ) );
                perPayF.setText( String.valueOf( perPayF1 ) );

                try {
                    fw = new FileWriter(hometxt, true);
                    bw = new BufferedWriter(fw);
                    bw.write(monthF+" "+homeF1 + " " + utilityF1 + " " + serviceF1 + " " + (float) totalF1 + " " + (float) perPayF1);
                    //bw.newLine();
                    bw.close();
                    fw.close();
                } catch (IOException e1) {
                    System.out.println("Error");
                    e1.printStackTrace();
                }
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Welcome obj = new Welcome(flag);
            }
        });
    }
}
