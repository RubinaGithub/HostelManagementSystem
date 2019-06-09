//different from 02

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class MealMarket {

    JFrame frame;
    JLabel total,month,date,des,cost;
    JTextField totalF1;
    JTextField dateF1,dateF2,dateF3,dateF4,dateF5;
    JTextField desF1,desF2,desF3,desF4,desF5;
    JTextField costF1,costF2,costF3,costF4,costF5;
    JComboBox monthCom;
    JButton back,done,finished;

    private String mealmarkettxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\meal market.txt";
    private String statustxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\status.txt";

    String dateF,desF,st,monthF,r,q;
    String[] st2;
    int costF,totalF=0,count=1,count2,TotalMeal;
    double perMealCost;

    public MealMarket(int flag) {

        ArrayList<String> s = new ArrayList<>();
        String [] list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(String sl:s) {
            s.add(sl);
        }monthCom = new JComboBox(list);

        frame = new JFrame();
        total = new JLabel( "TOTAL  :" );
        totalF1 = new JTextField( 10 );
        month = new JLabel( "MONTH" );
        finished = new JButton( "Finished" );
        done = new JButton( "Done" );
        back = new JButton( "Back" );

        date = new JLabel( "DATE" );
        des = new JLabel( "DESCRIBESION" );
        cost = new JLabel( "              COST" );

        dateF1 = new JTextField( 10 );
        dateF2 = new JTextField( 10 );
        dateF3 = new JTextField( 10 );
        dateF4 = new JTextField( 10 );
        dateF5 = new JTextField( 10 );

        desF1 = new JTextField( 10 );
        desF2 = new JTextField( 10 );
        desF3 = new JTextField( 10 );
        desF4 = new JTextField( 10 );
        desF5 = new JTextField( 10 );

        costF1 = new JTextField( 10 );
        costF2 = new JTextField( 10 );
        costF3 = new JTextField( 10 );
        costF4 = new JTextField( 10 );
        costF5 = new JTextField( 10 );

        frame.setTitle( "Meal Market" );
        frame.setBounds( 400, 150, 450, 450 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setLayout( null );

        total.setBounds( 80, 65, 80, 25 );
        frame.getContentPane().add( total );

        totalF1.setBounds( 140, 65, 150, 25 );
        frame.getContentPane().add( totalF1 );

        month.setBounds( 320, 10, 70, 25 );
        frame.getContentPane().add( month );

        monthCom.setBounds( 310, 30, 70, 25 );
        frame.getContentPane().add( monthCom );

        date.setBounds( 90, 135, 100, 25 );
        frame.getContentPane().add( date );

        des.setBounds( 180, 135, 120, 25 );
        frame.getContentPane().add( des );

        cost.setBounds( 270, 135, 100, 25 );
        frame.getContentPane().add( cost );

        dateF1.setBounds( 60, 160, 100, 25 );
        frame.getContentPane().add( dateF1 );

        desF1.setBounds( 160, 160, 120, 25 );
        frame.getContentPane().add( desF1 );

        costF1.setBounds( 280, 160, 100, 25 );
        frame.getContentPane().add( costF1 );

        dateF2.setBounds( 60, 185, 100, 25 );
        frame.getContentPane().add( dateF2 );

        desF2.setBounds( 160, 185, 120, 25);
        frame.getContentPane().add( desF2 );

        costF2.setBounds( 280, 185, 100, 25 );
        frame.getContentPane().add( costF2 );

        dateF3.setBounds( 60, 210, 100, 25 );
        frame.getContentPane().add( dateF3 );

        desF3.setBounds( 160, 210, 120, 25 );
        frame.getContentPane().add( desF3 );

        costF3.setBounds( 280, 210, 100, 25 );
        frame.getContentPane().add( costF3 );

        dateF4.setBounds( 60, 235, 100, 25 );
        frame.getContentPane().add( dateF4 );

        desF4.setBounds( 160, 235, 120, 25 );
        frame.getContentPane().add( desF4 );

        costF4.setBounds( 280, 235, 100, 25 );
        frame.getContentPane().add( costF4 );

        dateF5.setBounds( 60, 260, 100, 25 );
        frame.getContentPane().add( dateF5 );

        desF5.setBounds( 160, 260, 120, 25 );
        frame.getContentPane().add( desF5 );

        costF5.setBounds( 280, 260, 100, 25 );
        frame.getContentPane().add( costF5 );


        if(flag==1) {
            finished.setBounds( 70, 320, 90, 30 );
            frame.getContentPane().add( finished );
            done.setBounds( 180, 320, 90, 30 );
            frame.getContentPane().add( done );
        }

        back.setBounds( 290, 320, 90, 30 );
        frame.getContentPane().add( back );

        frame.setVisible( true );

        BufferedReader br;
        FileReader fr;
        try{
            fr=new FileReader(mealmarkettxt);
            br=new BufferedReader(fr);
            st=br.readLine();
            while (st!=null) {
                st2 = st.split( "," );
                try{
                    count2 =Integer.parseInt(st2[0]);
                    totalF= Integer.parseInt( st2[5] );
                    totalF1.setText(String.valueOf(totalF));
                }catch (Exception e13){}
                if(count2==1) {
                    dateF1.setText(st2[2]);
                    desF1.setText(st2[3]);
                    costF1.setText(st2[4]);
                } else if(count2==2) {
                    dateF2.setText(st2[2] );
                    desF2.setText(st2[3] );
                    costF2.setText(st2[4] );
                } else if(count2==3) {
                    dateF3.setText( st2[2] );
                    desF3.setText( st2[3] );
                    costF3.setText( st2[4] );
                } else if(count2==4) {
                    dateF4.setText( st2[2] );
                    desF4.setText( st2[3] );
                    costF4.setText( st2[4] );
                } else if(count2==5) {
                    dateF5.setText( st2[2] );
                    desF5.setText( st2[3] );
                    costF5.setText( st2[4] );
                }st=br.readLine();
                count2++;
            }
        }catch (Exception e11){}

        done.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BufferedWriter bw = null;
                FileWriter fw = null;

                monthF = monthCom.getSelectedItem().toString();
                if(count2!=0){
                    count=count2;
                }if (count==1) {
                    dateF = dateF1.getText();
                    desF = desF1.getText();
                    costF = Integer.parseInt( costF1.getText() );
                } else if (count==2) {
                    dateF = dateF2.getText();
                    desF = desF2.getText();
                    costF = Integer.parseInt( costF2.getText() );
                } else if (count==3) {
                    dateF = dateF3.getText();
                    desF = desF3.getText();
                    costF = Integer.parseInt( costF3.getText() );
                }else if(count==4){
                    dateF = dateF4.getText();
                    desF = desF4.getText();
                    costF = Integer.parseInt( costF4.getText() );
                }else if(count==5){
                    dateF = dateF5.getText();
                    desF = desF5.getText();
                    costF = Integer.parseInt( costF5.getText() );
                }
                totalF+=costF;
                totalF1.setText( String.valueOf( totalF ) );

                try {
                    fw = new FileWriter( mealmarkettxt, true );
                    bw = new BufferedWriter( fw );
                    bw.write( count+","+monthF+","+dateF+","+desF+","+costF+","+totalF);
                    bw.newLine();
                    bw.close();
                } catch (IOException e3) {
                    System.out.println( "Error" );
                    e3.printStackTrace();
                }
            }
        } );

        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Welcome obj = new Welcome(flag);
            }
        } );

        finished.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileWriter fw2=null;
                PrintWriter pw2=null;
                FileReader fr2=null;
                BufferedReader br2=null;
                try{
                    fr2=new FileReader(mealmarkettxt);
                    br2=new BufferedReader(fr2);
                    r=br2.readLine();
                    while(r!=null){
                        q=r;
                        r=br2.readLine();
                    }TotalMeal= Integer.parseInt(q);
                    perMealCost=(double)totalF/TotalMeal;

                    fw2=new FileWriter(statustxt,true);
                    BufferedWriter bw2=new BufferedWriter(fw2);
//                    bw2.write( (int) perMealCost );
//                    bw2.flush();
//                    bw2.close();
                    pw2=new PrintWriter(fw2);
                    pw2.println(perMealCost);
                    pw2.close();

                }catch (Exception e1){}
            }
        } );
    }
}
