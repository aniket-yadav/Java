import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
class StringOperation{
	public static void main(String[] args) {
         JFrame jf = new JFrame("String Operation");
         JFrame jf1 = new JFrame(" Reverse Of String ");
         JFrame jf2 = new JFrame(" Concatination Of String ");
         JTextField jt = new JTextField();
         JTextField jt1 = new JTextField();
         JButton Reverse = new JButton("Reverse");
         JButton Concat = new JButton("Concat");
         JButton back = new JButton("Back");
         JButton Enter = new JButton("ENTER");
         JButton Add = new JButton("ADD");
		     jf.setSize(400,400);
		     jf.setLocation(400,200);
         jf.setLayout(null);
         jf.setVisible(true);
         jf.setResizable(false);
         jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.add(Reverse).setBounds(20,50,100,35);
        jf.add(Concat).setBounds(20,90,100,35);
        jf.add(new JLabel("Select Operation For String ")).setBounds(10,10,400,50);;
        Reverse.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  jf.getContentPane().removeAll();
                  jf.getContentPane().repaint();
                  jf.add(back).setBounds(300,10,100,35);
                  jf.add(new JLabel("Enter String :")).setBounds(10,30,400,50);
                  jf.add(jt).setBounds(10,80,380,50);
                  jf.add(Enter).setBounds(290,150,100,35);
                  }
        });
                 Enter.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                    jf.add(new JLabel("Reverse of String : ")).setBounds(10,200,400,50);
                    StringBuffer sb = new StringBuffer(jt.getText());
                  jf.add(new JLabel(sb.reverse().toString())).setBounds(10,240,400,50);
                }
                  });
             Concat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 jf.getContentPane().removeAll();
                  jf.getContentPane().repaint();
                  jf.add(back).setBounds(300,10,100,35);
                   jf.add(new JLabel("Enter String 1:")).setBounds(10,30,400,50);
                   jf.add(jt).setBounds(10,80,380,50);
                   jf.add(new JLabel("Enter String 2:")).setBounds(10,130,380,50);
                   jf.add(jt1).setBounds(10,180,380,50);
                   jf.add(Add).setBounds(290,230,100,35);
            }
        });
       Add.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                     jf.add(new JLabel("Concatination of Strings :")).setBounds(10,280,400,50);
                     jf.add(new JLabel(jt.getText()+jt1.getText())).setBounds(10,310,400,50);
                     }
                  });
                back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 jf.getContentPane().removeAll();
                  jf.getContentPane().repaint();
                  jf.add(Reverse).setBounds(20,50,100,35);
        jf.add(Concat).setBounds(20,90,100,35);
                   jf.add(new JLabel("Select Operation For String ")).setBounds(10,10,400,50);
            }
        });
}
}