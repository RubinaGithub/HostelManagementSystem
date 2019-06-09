import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class MealCount extends JFrame {

    JLabel total,date,month;
    JComboBox monthCom;
    JTextField totalF,dF1,dF2,dF3,nF1,nF2,nF3,mF11,mF12,mF13,mF21,mF22,mF23,mF31,mF32,mF33;
    JButton finished,done,back;

    private String createtxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\create.txt";
    private String mealcounttxt1 = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\meal count1.txt";
    private String mealcounttxt2 = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\meal count2.txt";
    private String mealcounttxt3 = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\meal count3.txt";
    private String statustxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\status.txt";
    private String mealmarkettxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\meal market.txt";
    private String datetxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\date.txt";

    String monthF,n1,n2,n3,str, st1, st2, st3,d,sd;
    int count=0,count2,m11,m21,m31,sum1=0,sum2=0,sum3=0,c = 1,sum=0;
    String[] str2, st11, st21, st31;

    public MealCount(int flag) {

        ArrayList<String> s = new ArrayList<>();
        String [] list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(String sl:s) {
            s.add(sl);
        }monthCom = new JComboBox(list);
        month = new JLabel( "MONTH" );

        total = new JLabel( "TOTAL  MEAL :  " );
        totalF = new JTextField( 10 );

        date = new JLabel( "DATE/NAME" );
        dF1 = new JTextField( 10 );
        dF2 = new JTextField( 10 );
        dF3 = new JTextField( 10 );

        nF1 = new JTextField( 10 );
        nF2 = new JTextField( 10 );
        nF3 = new JTextField( 10 );

        mF11 = new JTextField( 10 );
        mF12 = new JTextField( 10 );
        mF13 = new JTextField( 10 );

        mF21 = new JTextField( 10 );
        mF22 = new JTextField( 10 );
        mF23 = new JTextField( 10 );

        mF31 = new JTextField( 10 );
        mF32 = new JTextField( 10 );
        mF33 = new JTextField( 10 );

        back = new JButton( "Back" );
        finished = new JButton( "Finished" );
        done = new JButton( "Done" );

        setTitle( "Meal Count" );
        setBounds( 380, 120, 560, 400 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        getContentPane().setLayout( null );

        month.setBounds( 410, 10, 70, 25 );
        getContentPane().add( month );

        monthCom.setBounds( 400, 30, 70, 25 );
        getContentPane().add( monthCom );

        total.setBounds( 70, 50, 100, 25 );
        getContentPane().add( total );

        totalF.setBounds( 170, 50, 150, 25 );
        getContentPane().add( totalF );

        date.setBounds( 80, 125, 120, 25 );
        getContentPane().add( date );

        dF1.setBounds( 60, 150, 120, 25 );
        getContentPane().add( dF1 );

        dF2.setBounds( 60, 175, 120, 25 );
        getContentPane().add( dF2 );

        dF3.setBounds( 60, 200, 120, 25 );
        getContentPane().add( dF3 );

        //person1
        nF1.setBounds( 180, 125, 100, 25 );
        getContentPane().add( nF1 );

        mF11.setBounds( 180, 150, 100, 25 );
        getContentPane().add( mF11 );

        mF12.setBounds( 180, 175, 100, 25 );
        getContentPane().add( mF12 );

        mF13.setBounds( 180, 200, 100, 25 );
        getContentPane().add( mF13 );

        //person2
        nF2.setBounds( 280, 125, 100, 25 );
        getContentPane().add( nF2 );

        mF21.setBounds( 280, 150, 100, 25 );
        getContentPane().add( mF21 );

        mF22.setBounds( 280, 175, 100, 25 );
        getContentPane().add( mF22 );

        mF23.setBounds( 280, 200, 100, 25 );
        getContentPane().add( mF23 );

        //perso3
        nF3.setBounds( 380, 125, 100, 25 );
        getContentPane().add( nF3 );

        mF31.setBounds( 380, 150, 100, 25 );
        getContentPane().add( mF31 );

        mF32.setBounds( 380, 175, 100, 25 );
        getContentPane().add( mF32 );

        mF33.setBounds( 380, 200, 100, 25 );
        getContentPane().add( mF33 );

        //button
        back.setBounds( 360, 260, 90, 30 );
        getContentPane().add( back );

        finished.setBounds( 220, 260, 90, 30 );
        getContentPane().add( finished );

        done.setBounds( 80, 260, 90, 30 );
        getContentPane().add( done );

        //for name read
        FileReader fr = null, fr1 = null, fr2 = null, fr3 = null, fr4 = null;
        BufferedReader br = null, br1 = null, br2 = null, br3 = null, br4 = null;
        try {
            fr = new FileReader( createtxt );
            br = new BufferedReader( fr );
            str = br.readLine();
            while (str!=null) {
                str2 = str.split( " " );
                if (c==1) {
                    n1 = str2[0];
                    nF1.setText( n1 );
                } else if (c==2) {
                    n2 = str2[0];
                    nF2.setText( n2 );
                } else if (c==3) {
                    n3 = str2[0];
                    nF3.setText( n3 );
                }
                c++;
                str = br.readLine();
            }
            br.close();
        } catch (Exception e62) {
        }

        try {
            fr1 = new FileReader( mealcounttxt1 );
            br1 = new BufferedReader( fr1 );
            fr2 = new FileReader( mealcounttxt2 );
            br2 = new BufferedReader( fr2 );
            fr3 = new FileReader( mealcounttxt3 );
            br3 = new BufferedReader( fr3 );

            st1 = br1.readLine();
            st2 = br2.readLine();
            st3 = br3.readLine();

            while (st1!=null && st2!=null && st3!=null) {
                st11 = st1.split( " " );
                st21 = st2.split( " " );
                st31 = st3.split( " " );

                try {
                    count2 = Integer.parseInt( st11[0] );
                } catch (Exception e13) {
                }
                if (count2==1) {
                    mF11.setText( st11[1] );
                    mF21.setText( st21[1] );
                    mF31.setText( st31[1] );
                } else if (count2==2) {
                    mF12.setText( st11[1] );
                    mF22.setText( st21[1] );
                    mF32.setText( st31[1] );
                } else if (count2==3) {
                    mF13.setText( st11[1] );
                    mF23.setText( st21[1] );
                    mF33.setText( st31[1] );
                }
                st1 = br1.readLine();
                st2 = br2.readLine();
                st3 = br3.readLine();
                count2++;
            }
            br1.close();
            br2.close();
            br3.close();
        } catch (Exception e33) {
        }

//        try {
//            fr4 = new FileReader( datetxt );
//            br4 = new BufferedReader( fr4 );
//            sd = br4.readLine();
//            while (sd!=null) {
//                if (count2==1) {
//                    dF1.setText( sd );
//                } else if (count2==2) {
//                    dF2.setText( sd );
//                } else if (count2==3) {
//                    dF3.setText( sd );
//                }sd = br4.readLine();
//            } br4.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        setVisible( true );

        done.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedWriter bw = null,bw2=null,bw3=null,bw4=null;
                FileWriter fw = null,fw2=null,fw3=null,fw4=null;

                monthF=monthCom.getSelectedItem().toString();
                if(count2!=0){
                    count=count2;
                }if (count==1) {
//                    d=dF1.getText();
                    m11=Integer.parseInt(mF11.getText());
                    m21=Integer.parseInt(mF21.getText());
                    m31=Integer.parseInt(mF31.getText());
                } else if (count==2) {
//                    d=dF2.getText();
                    m11=Integer.parseInt(mF12.getText());
                    m21=Integer.parseInt(mF22.getText());
                    m31=Integer.parseInt(mF32.getText());
                }else if(count==3){
//                    d=dF2.getText();
                    m11=Integer.parseInt(mF13.getText());
                    m21=Integer.parseInt(mF23.getText());
                    m31=Integer.parseInt(mF33.getText());
                }
                try {
                    fw = new FileWriter(mealcounttxt1, true);
                    bw = new BufferedWriter(fw);
                    fw2 = new FileWriter(mealcounttxt2, true);
                    bw2 = new BufferedWriter(fw2);
                    fw3 = new FileWriter(mealcounttxt3, true);
                    bw3 = new BufferedWriter(fw3);

                    try {
                        bw.write( count + ". " + m11);
                        System.out.println(count + ". " + m11);
                        bw.newLine();
                        bw.flush();
                        bw.close();

                        bw2.write( count + ". " + m21 );
                        System.out.println(count + ". " + m21);
                        bw2.newLine();
                        bw2.flush();
                        bw2.close();

                        bw3.write( count + ". " + m31 );
                        System.out.println(count + ". " + m31);
                        bw3.newLine();
                        bw3.flush();
                        bw3.close();

                    }catch (Exception e22){}
                } catch (IOException e2) { }
//                try{
//                    fw4 = new FileWriter(datetxt, true);
////                    bw4 = new BufferedWriter(fw4);
////                    bw4.write(d);
////                    bw4.newLine();
////                    bw4.flush();
////                    bw4.close();
//                    PrintWriter pw4= new PrintWriter( fw4 );
//                    pw4.println( d );
//                    pw4.flush();
//                    pw4.close();
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
            }
        } );

        finished.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileWriter fww1=null,fww2=null,fww3=null,fww=null,fww4=null;
                PrintWriter pww1=null,pww2=null,pww3=null,pww4=null;
                BufferedWriter bww=null;

                sum1= Integer.parseInt(mF11.getText())+Integer.parseInt(mF12.getText())+Integer.parseInt(mF13.getText());
                sum2= Integer.parseInt(mF21.getText())+Integer.parseInt(mF22.getText())+Integer.parseInt(mF23.getText());
                sum3= Integer.parseInt(mF31.getText())+Integer.parseInt(mF32.getText())+Integer.parseInt(mF33.getText());
                sum=sum1+sum2+sum3;
                totalF.setText( String.valueOf(sum));

                try{
                    fww1 = new FileWriter(mealcounttxt1, true);
                    pww1= new PrintWriter(fww1);
                    pww1.println(sum1);
                    pww1.close();

                    fww2= new FileWriter(mealcounttxt2, true);
                    pww2= new PrintWriter(fww2);
                    pww2.println(sum2);
                    pww2.close();

                    fww3 = new FileWriter(mealcounttxt3, true);
                    pww3= new PrintWriter(fww3);
                    pww3.println(sum3);
                    pww3.close();

                }catch(Exception e32){}
                try{
                    fww = new FileWriter(statustxt, true);
                    bww= new BufferedWriter(fww);
                    bww.write(n1+" "+sum1+"\n"+n2+" "+sum2+"\n"+n3+" "+sum3+"\n");
                    bww.close();
                }catch (Exception e1){}
                try{
                    fww4 = new FileWriter(mealmarkettxt, true);
                    pww4= new PrintWriter(fww4);
                    pww4.println(sum);
                    pww4.close();
                }catch (Exception e1){}
            }
        } );
        back.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Welcome(flag);
            }
        } );
    }
    public static void main(String [] args){
        new MealCount( 1 );
    }
}
