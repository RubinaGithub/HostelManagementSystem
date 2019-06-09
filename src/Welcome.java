import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame  {
    JLabel label1;
    JButton button1 ,button2,button3,button4 ,button5,button6 ;

    public Welcome(int flag) {

        label1 = new JLabel("W e l c o m e ");
        button1 = new JButton("STATUS");
        button2 = new JButton("DEPOSIT MONEY");
        button3 = new JButton("MEAL MARKET");
        button4 = new JButton("HOME SYSTEM");
        button5 = new JButton("MEAL COUNT");
        button6 = new JButton("Logout");

        setBounds(450,150,450,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label1.setBounds(130,30,250,40);
        label1.setFont(new Font("Calibri", Font.BOLD, 30));
        getContentPane().add(label1);

        button1.setBounds(130,95,150,30);
        getContentPane().add(button1);

        button2.setBounds(130,145,150,30);
        getContentPane().add(button2);

        button3.setBounds(130,195,150,30);
        getContentPane().add(button3);

        button4.setBounds(130,245,150,30);
        getContentPane().add(button4);

        if(flag==1) {
            button5.setBounds( 130, 295, 150, 30 );
            getContentPane().add( button5 );
        }

        button6.setBounds(310,350,80,25);
        getContentPane().add(button6);

        setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Status sta=new Status(flag);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                DepositMoney mealDep= new DepositMoney(flag);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                MealMarket mealMar= new MealMarket(flag);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                HomeSystem home = new HomeSystem(flag);
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                MealCount mealCou=new MealCount(flag);
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginPage log = new LoginPage();
            }
        });
    }
}
