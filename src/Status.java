import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Status {

    JFrame frame;
    JLabel month,mealPerCost,name,meal,mealCost,homeCost,totalCost,totalPaid,balance;
    JTextField mealPerCostF;
    JTextField nameF1,nameF2,nameF3,nameF4,nameF5,nameF6;
    JTextField mealF1, mealF2, mealF3,mealF4, mealF5,mealF6;
    JTextField mealCostF1,mealCostF2,mealCostF3,mealCostF4,mealCostF5,mealCostF6;
    JTextField homeCostF1, homeCostF2, homeCostF3, homeCostF4, homeCostF5, homeCostF6;
    JTextField totalCostF1,totalCostF2,totalCostF3,totalCostF4,totalCostF5,totalCostF6;
    JTextField totalPaidF1,totalPaidF2,totalPaidF3,totalPaidF4,totalPaidF5,totalPaidF6;
    JTextField balanceF1,balanceF2,balanceF3,balanceF4,balanceF5,balanceF6;
    JComboBox monthCom;
    JButton back;

    private String statustxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\status.txt";
    private String hometxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\home.txt";
    private String deposit2txt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\deposit2.txt";

    String str,p,u;
    String [] str1,p1,u1;
    int count=1;
    double mealPerCostF1,mealC,homeC,totalC,blnc;

    public Status(int flag){

        ArrayList<String> s = new ArrayList<>();
        String [] list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(String sl:s) {
            s.add(sl);
        }monthCom = new JComboBox(list);

        frame=new JFrame();
        mealPerCost=new JLabel("PER  MEAL  COST      :    ");
        mealPerCostF=new JTextField(10);
        month=new JLabel("MONTH");

        name=new JLabel("NAME");
        meal=new JLabel("MEAL");
        mealCost=new JLabel("MEAL COST");
        homeCost=new JLabel("HOME COST");
        totalCost=new JLabel("TOTAL COST");
        totalPaid=new JLabel("TOTAL PAID");
        balance=new JLabel("BALANCE");

        back=new JButton("Back");

        nameF1=new JTextField(10);
        nameF2=new JTextField(10);
        nameF3=new JTextField(10);
        nameF4=new JTextField(10);
        nameF5=new JTextField(10);
        nameF6=new JTextField(10);

        mealF1=new JTextField(10);
        mealF2=new JTextField(10);
        mealF3=new JTextField(10);
        mealF4=new JTextField(10);
        mealF5=new JTextField(10);
        mealF6=new JTextField(10);

        mealCostF1=new JTextField(10);
        mealCostF2=new JTextField(10);
        mealCostF3=new JTextField(10);
        mealCostF4=new JTextField(10);
        mealCostF5=new JTextField(10);
        mealCostF6=new JTextField(10);

        homeCostF1=new JTextField(10);
        homeCostF2=new JTextField(10);
        homeCostF3=new JTextField(10);
        homeCostF4=new JTextField(10);
        homeCostF5=new JTextField(10);
        homeCostF6=new JTextField(10);

        totalCostF1=new JTextField(10);
        totalCostF2=new JTextField(10);
        totalCostF3=new JTextField(10);
        totalCostF4=new JTextField(10);
        totalCostF5=new JTextField(10);
        totalCostF6=new JTextField(10);

        totalPaidF1=new JTextField(10);
        totalPaidF2=new JTextField(10);
        totalPaidF3=new JTextField(10);
        totalPaidF4=new JTextField(10);
        totalPaidF5=new JTextField(10);
        totalPaidF6=new JTextField(10);

        balanceF1=new JTextField(10);
        balanceF2=new JTextField(10);
        balanceF3=new JTextField(10);
        balanceF4=new JTextField(10);
        balanceF5=new JTextField(10);
        balanceF6=new JTextField(10);


        frame.setTitle("STATUS");
        frame.setBounds(300, 120, 850, 430);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        mealPerCost.setBounds(80, 40, 150, 25);
        frame.getContentPane().add(mealPerCost);

        mealPerCostF.setBounds(230, 40, 200, 25);
        frame.getContentPane().add(mealPerCostF);

        month.setBounds(660, 20, 70, 25);
        frame.getContentPane().add(month);

        monthCom.setBounds(650, 40, 60, 25);
        frame.getContentPane().add(monthCom);


        name.setBounds(90, 100, 80, 25);
        frame.getContentPane().add(name);

        meal.setBounds(190, 100, 80, 25);
        frame.getContentPane().add(meal);

        mealCost.setBounds(280, 100, 90, 25);
        frame.getContentPane().add(mealCost);

        homeCost.setBounds(375, 100, 90, 25);
        frame.getContentPane().add(homeCost);

        totalCost.setBounds(470, 100, 90, 25);
        frame.getContentPane().add(totalCost);

        totalPaid.setBounds(570, 100, 90, 25);
        frame.getContentPane().add(totalPaid);

        balance.setBounds(680, 100, 90, 25);
        frame.getContentPane().add(balance);

        nameF1.setBounds(60, 125, 100, 25);
        frame.getContentPane().add(nameF1);

        mealF1.setBounds(160, 125, 100, 25);
        frame.getContentPane().add(mealF1);

        mealCostF1.setBounds(260, 125, 100, 25);
        frame.getContentPane().add(mealCostF1);

        homeCostF1.setBounds(360, 125, 100, 25);
        frame.getContentPane().add(homeCostF1);

        totalCostF1.setBounds(460, 125, 100, 25);
        frame.getContentPane().add(totalCostF1);

        totalPaidF1.setBounds(560, 125, 100, 25);
        frame.getContentPane().add(totalPaidF1);

        balanceF1.setBounds(660, 125, 100, 25);
        frame.getContentPane().add(balanceF1);

        nameF2.setBounds(60, 150, 100, 25);
        frame.getContentPane().add(nameF2);

        mealF2.setBounds(160, 150, 100, 25);
        frame.getContentPane().add(mealF2);

        mealCostF2.setBounds(260, 150, 100, 25);
        frame.getContentPane().add(mealCostF2);

        homeCostF2.setBounds(360, 150, 100, 25);
        frame.getContentPane().add(homeCostF2);

        totalCostF2.setBounds(460, 150, 100, 25);
        frame.getContentPane().add(totalCostF2);

        totalPaidF2.setBounds(560, 150, 100, 25);
        frame.getContentPane().add(totalPaidF2);

        balanceF2.setBounds(660, 150, 100, 25);
        frame.getContentPane().add(balanceF2);

        nameF3.setBounds(60, 175, 100, 25);
        frame.getContentPane().add(nameF3);

        mealF3.setBounds(160, 175, 100, 25);
        frame.getContentPane().add(mealF3);

        mealCostF3.setBounds(260, 175, 100, 25);
        frame.getContentPane().add(mealCostF3);

        homeCostF3.setBounds(360, 175, 100, 25);
        frame.getContentPane().add(homeCostF3);

        totalCostF3.setBounds(460, 175, 100, 25);
        frame.getContentPane().add(totalCostF3);

        totalPaidF3.setBounds(560, 175, 100, 25);
        frame.getContentPane().add(totalPaidF3);

        balanceF3.setBounds(660, 175, 100, 25);
        frame.getContentPane().add(balanceF3);

        nameF4.setBounds(60, 200, 100, 25);
        frame.getContentPane().add(nameF4);

        mealF4.setBounds(160, 200, 100, 25);
        frame.getContentPane().add(mealF4);

        mealCostF4.setBounds(260, 200, 100, 25);
        frame.getContentPane().add(mealCostF4);

        homeCostF4.setBounds(360, 200, 100, 25);
        frame.getContentPane().add(homeCostF4);

        totalCostF4.setBounds(460, 200, 100, 25);
        frame.getContentPane().add(totalCostF4);

        totalPaidF4.setBounds(560, 200, 100, 25);
        frame.getContentPane().add(totalPaidF4);

        balanceF4.setBounds(660, 200, 100, 25);
        frame.getContentPane().add(balanceF4);

        nameF5.setBounds(60, 225, 100, 25);
        frame.getContentPane().add(nameF5);

        mealF5.setBounds(160, 225, 100, 25);
        frame.getContentPane().add(mealF5);

        mealCostF5.setBounds(260, 225, 100, 25);
        frame.getContentPane().add(mealCostF5);

        homeCostF5.setBounds(360, 225, 100, 25);
        frame.getContentPane().add(homeCostF5);

        totalCostF5.setBounds(460, 225, 100, 25);
        frame.getContentPane().add(totalCostF5);

        totalPaidF5.setBounds(560, 225, 100, 25);
        frame.getContentPane().add(totalPaidF5);

        balanceF5.setBounds(660, 225, 100, 25);
        frame.getContentPane().add(balanceF5);

        nameF6.setBounds(60, 250, 100, 25);
        frame.getContentPane().add(nameF6);

        mealF6.setBounds(160, 250, 100, 25);
        frame.getContentPane().add(mealF6);

        mealCostF6.setBounds(260, 250, 100, 25);
        frame.getContentPane().add(mealCostF6);

        homeCostF6.setBounds(360, 250, 100, 25);
        frame.getContentPane().add(homeCostF6);

        totalCostF6.setBounds(460, 250, 100, 25);
        frame.getContentPane().add(totalCostF6);

        totalPaidF6.setBounds(560, 250, 100, 25);
        frame.getContentPane().add(totalPaidF6);

        balanceF6.setBounds(660, 250, 100, 25);
        frame.getContentPane().add(balanceF6);

        back.setBounds(600, 300, 80, 30);
        frame.getContentPane().add(back);

        frame.setVisible(true);

        FileReader fr=null,fr2=null,fr3=null;
        BufferedReader br=null,br2=null,br3=null;
        try{
            fr3=new FileReader(hometxt);
            br3=new BufferedReader(fr3);
            p=br3.readLine();
            p1=p.split(" ");
            homeC= Double.parseDouble(p1[5]);
        }catch (Exception e39){}

        try{
            fr=new FileReader(statustxt);
            br=new BufferedReader(fr);
            str=br.readLine();
            while (str!=null){
                str1=str.split(" ");
                if(count==1){
                    nameF1.setText(str1[0]);
                    mealF1.setText(str1[1]);
                    homeCostF1.setText(String.valueOf(homeC));
                }else if(count==2){
                    nameF2.setText(str1[0]);
                    mealF2.setText(str1[1]);
                    homeCostF2.setText(String.valueOf(homeC));
                }else if(count==3){
                    nameF3.setText(str1[0]);
                    mealF3.setText(str1[1]);
                    homeCostF3.setText(String.valueOf(homeC));
                }else if(count==4){
                    mealPerCostF.setText(str);
                    mealPerCostF1= Double.parseDouble(str);

                    mealC= Double.parseDouble(mealF1.getText())*mealPerCostF1;
                    mealCostF1.setText(String.valueOf(mealC));
                    System.out.println(mealCostF1);
                    totalC=mealC+homeC;
                    totalCostF1.setText(String.valueOf(totalC));
                    System.out.println(totalCostF1);

                    mealC= Double.parseDouble(mealF2.getText())*mealPerCostF1;
                    mealCostF2.setText(String.valueOf(mealC));
                    System.out.println(mealCostF2);
                    totalC=mealC+homeC;
                    totalCostF2.setText(String.valueOf(totalC));
                    System.out.println(totalCostF2);

                    mealC= Double.parseDouble(mealF3.getText())*mealPerCostF1;
                    mealCostF3.setText(String.valueOf(mealC));
                    System.out.println(mealCostF3);
                    totalC=mealC+homeC;
                    totalCostF3.setText(String.valueOf(totalC));
                    System.out.println(totalCostF3);

                }count++;
                str=br.readLine();
            }
        }catch (Exception e){}

        try{
            fr2=new FileReader(deposit2txt);
            br2=new BufferedReader(fr2);
            u=br2.readLine();
            while(u!=null) {
                u1 = u.split( "," );
                if (nameF1.getText().contains( u1[0] )) {
                    totalPaidF1.setText( u1[1] );
                    blnc= (float)(Double.parseDouble(totalCostF1.getText())-Double.parseDouble(totalPaidF1.getText()));
                    balanceF1.setText( String.valueOf(blnc));
                }else if (nameF2.getText().contains( u1[0] )) {
                    totalPaidF2.setText( u1[1] );
                    blnc= (float)(Double.parseDouble(totalCostF2.getText())-Double.parseDouble(totalPaidF2.getText()));
                    balanceF2.setText( String.valueOf(blnc));
                }else if (nameF3.getText().contains( u1[0] )) {
                    totalPaidF3.setText( u1[1] );
                    blnc= (float)(Double.parseDouble(totalCostF3.getText())-Double.parseDouble(totalPaidF3.getText()));
                    balanceF3.setText( String.valueOf(blnc));
                }u = br2.readLine();
            }
        }catch (Exception e25){}
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    Welcome obj = new Welcome(flag);
            }
        });
    }
    public static void main(String [] args){
        new Status( 1 );
    }
}
