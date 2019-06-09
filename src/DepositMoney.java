import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

//different from 02
public class DepositMoney extends JFrame {

    JLabel name,month,paid,total,balance,msg,date,tk,nm;
    JTextField nameF,paidF,totalF,balanceF;
    JTextField dateF1,dateF2,dateF3,dateF4,dateF5;
    JTextField nmF1,nmF2,nmF3,nmF4,nmF5;
    JTextField tkF1,tkF2,tkF3,tkF4,tkF5;
    JComboBox monthCom;
    JButton back,done, finished;

    private String deposittxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\deposit.txt";
    private String deposit2txt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\deposit2.txt";
    private String logintxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\login.txt";
    private String createtxt = "C:\\Users\\rubin\\Desktop\\Object Oriented Programing lab\\Mash Management System08\\src\\management\\create.txt";

    String dateF,monthF,nameF1,st,nmF,a,b;
    String [] st2,a1,b1;
    int tkF,paidF1=0,totalF1,balanceF1,count=1,count2,sum;

    public DepositMoney(int flag){

        ArrayList<String> s = new ArrayList<>();
        String [] list={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(String sl:s) {
            s.add(sl);
        }monthCom = new JComboBox(list);

        month=new JLabel("MONTH");
        name=new JLabel("NAME    :  ");
        total=new JLabel("TOTAL       :  ");
        paid=new JLabel("PAID    :  ");
        balance=new JLabel("BALANCE  :  ");
        msg=new JLabel("(-) balance means advance payment");

        nameF=new JTextField(10);
        totalF=new JTextField(10);
        paidF=new JTextField(10);
        balanceF=new JTextField(10);

        date=new JLabel("      DATE");
        nm=new JLabel("          NAME");
        tk=new JLabel("DEPOSIT(Tk)");

        dateF1=new JTextField(10);
        nmF1=new JTextField(10);
        tkF1=new JTextField(10);

        dateF2=new JTextField(10);
        nmF2=new JTextField(10);
        tkF2=new JTextField(10);

        dateF3=new JTextField(10);
        nmF3=new JTextField(10);
        tkF3=new JTextField(10);

        dateF4=new JTextField(10);
        nmF4=new JTextField(10);
        tkF4=new JTextField(10);

        dateF5=new JTextField(10);
        nmF5=new JTextField(10);
        tkF5=new JTextField(10);

        finished = new JButton( "Finished" );
        done=new JButton("Done");
        back=new JButton("Back");

        setTitle("DEPOSIT MONEY");
        setBounds(380, 120, 480, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        month.setBounds(370, 10, 70, 25);
        getContentPane().add(month);

        monthCom.setBounds(360, 30, 70, 25);
        getContentPane().add(monthCom);

        name.setBounds(60, 70, 70, 25);
        getContentPane().add(name);

        nameF.setBounds(120, 70, 200, 25);
        getContentPane().add(nameF);

        total.setBounds(60, 130, 90, 25);
        getContentPane().add(total);

        totalF.setBounds(140, 130, 70, 25);
        getContentPane().add(totalF);

        paid.setBounds(240, 130, 70, 25);
        getContentPane().add(paid);

        paidF.setBounds(300, 130, 70, 25);
        getContentPane().add(paidF);

        balance.setBounds(60, 170, 90, 25);
        getContentPane().add(balance);

        balanceF.setBounds(140, 170, 70, 25);
        getContentPane().add(balanceF);

        msg.setBounds(210, 170, 250, 25);
        getContentPane().add(msg);

        date.setBounds(60, 245, 100, 20);
        getContentPane().add(date);

        nm.setBounds(180, 245, 100, 20);
        getContentPane().add(nm);

        tk.setBounds(340, 245, 100, 20);
        getContentPane().add(tk);

        dateF1.setBounds(50, 275, 100, 20);
        getContentPane().add(dateF1);

        nmF1.setBounds(150, 275, 180, 20);
        getContentPane().add(nmF1);

        tkF1.setBounds(330, 275, 100, 20);
        getContentPane().add(tkF1);

        dateF2.setBounds(50, 295, 100, 20);
        getContentPane().add(dateF2);

        nmF2.setBounds(150, 295, 180, 20);
        getContentPane().add(nmF2);

        tkF2.setBounds(330, 295, 100, 20);
        getContentPane().add(tkF2);

        dateF3.setBounds(50, 315, 100, 20);
        getContentPane().add(dateF3);

        nmF3.setBounds(150, 315, 180, 20);
        getContentPane().add(nmF3);

        tkF3.setBounds(330, 315, 100, 20);
        getContentPane().add(tkF3);

        dateF4.setBounds(50, 335, 100, 20);
        getContentPane().add(dateF4);

        nmF4.setBounds(150, 335, 180, 20);
        getContentPane().add(nmF4);

        tkF4.setBounds(330, 335, 100, 20);
        getContentPane().add(tkF4);

        dateF5.setBounds(50, 355, 100, 20);
        getContentPane().add(dateF5);

        nmF5.setBounds(150, 355, 180, 20);
        getContentPane().add(nmF5);

        tkF5.setBounds(330, 355, 100, 20);
        getContentPane().add(tkF5);

        if(flag==1) {
            finished.setBounds( 70, 410, 90, 30 );
            getContentPane().add(finished);
            done.setBounds( 190, 410, 90, 30 );
            getContentPane().add(done);
        }

        back.setBounds(310, 410, 90, 30);
        getContentPane().add(back);
        setVisible(true);

        BufferedReader br=null,br2=null,br3=null;
        FileReader fr=null,fr2=null,fr3=null;
        String str,pd;
        String [] str2,pd1;
        try{
            fr = new FileReader(logintxt);
            br = new BufferedReader(fr);
            str=br.readLine();
            while (str!=null) {
                str2 = str.split( ":" );
                nameF1=str2[0];
                str=br.readLine();
            }
            nameF.setText(nameF1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            fr2=new FileReader(deposittxt);
            br2=new BufferedReader( fr2 );
            st=br2.readLine();
            while (st!=null) {
                st2 = st.split( "," );
                    try {
                        count2=Integer.parseInt(st2[0]);
                    } catch (Exception e13) { }
                if(count2==1) {
                    dateF1.setText( st2[2] );
                    nmF1.setText( st2[3] );
                    tkF1.setText( st2[4] );
                } else if(count2==2) {
                    dateF2.setText( st2[2] );
                    nmF2.setText( st2[3] );
                    tkF2.setText( st2[4] );
                } else if(count2==3) {
                    dateF3.setText( st2[2] );
                    nmF3.setText( st2[3] );
                    tkF3.setText( st2[4] );
                } else if(count2==4) {
                    dateF4.setText( st2[2] );
                    nmF4.setText( st2[3] );
                    tkF4.setText( st2[4] );
                } else if(count2==5) {
                    dateF5.setText( st2[2] );
                    nmF5.setText( st2[3] );
                    tkF5.setText( st2[4] );
                } st=br2.readLine();
                count2++;
            }
        }catch (Exception e11){}

        try{
            fr3=new FileReader(deposittxt);
            br3=new BufferedReader(fr3);
            pd=br3.readLine();
            while (pd!=null) {
                pd1=pd.split( "," );
                if(nameF1.contains(pd1[3])){
                    paidF1 += Integer.parseInt( pd1[4] );
            }pd=br3.readLine();
        }paidF.setText(String.valueOf(paidF1));
        }catch (Exception e11){}

        done.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BufferedWriter bw = null;
                FileWriter fw = null;

                monthF=monthCom.getSelectedItem().toString();
                if(count2!=0){
                    count=count2;
                }if (count==1) {
                    dateF=dateF1.getText();
                    nmF=nmF1.getText();
                    tkF=Integer.parseInt(tkF1.getText());
                } else if (count==2) {
                    dateF=dateF2.getText();
                    nmF=nmF2.getText();
                    tkF=Integer.parseInt(tkF2.getText());
                }else if(count==3){
                    dateF=dateF3.getText();
                    nmF=nmF3.getText();
                    tkF=Integer.parseInt(tkF3.getText());
                }else if(count==4){
                    dateF=dateF4.getText();
                    nmF=nmF4.getText();
                    tkF=Integer.parseInt(tkF4.getText());
                }else if(count==5){
                    dateF=dateF5.getText();
                    nmF=nmF5.getText();
                    tkF=Integer.parseInt(tkF5.getText());
                }
                try {
                    fw = new FileWriter(deposittxt, true);
                    bw = new BufferedWriter(fw);
                    bw.write(count+","+monthF +","+dateF + ","+ nmF+","+tkF );
                    bw.newLine();
                    bw.close();
                } catch (IOException e2) { }
            }
        });
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Welcome obj = new Welcome(flag);
            }
        });
        finished.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sp;
                BufferedWriter bw2 = null;
                FileWriter fw2 = null;
                BufferedReader br2=null,br3=null;
                FileReader fr2=null,fr3=null;
                try{
                    fr2=new FileReader(createtxt);
                    br2=new BufferedReader(fr2);
                    fw2=new FileWriter(deposit2txt);
                    bw2=new BufferedWriter(fw2);

                    a=br2.readLine();
                    while(a!=null){
                        a1=a.split(" ");
                        fr3=new FileReader(deposittxt);
                        br3=new BufferedReader(fr3);
                        sum=0;
                        b=br3.readLine();
                        while(b!=null) {
                            b1 = b.split( "," );
                            if(a1[0].contains(b1[3])) {
                                sp=b1[4];
                                sum+=Integer.parseInt(sp);
                            }b = br3.readLine();
                        }
                        bw2.write(a1[0]+","+sum);
                        bw2.newLine();
                        a=br2.readLine();
                    }bw2.close();
                    fw2.close();
                }catch (Exception e22){}

            }
        } );
    }
}
