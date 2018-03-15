import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
class StringOperation{
	public static void main(String[] args) {
         JFrame jf = new JFrame();
         JFrame jf1 = new JFrame();
         JFrame jf2 = new JFrame();
         JFrame jf3 = new JFrame();
         JLabel jl = new JLabel();
         JLabel jl1 = new JLabel();
         JLabel jl2 = new JLabel();
         JLabel jl3 = new JLabel();
         JTextField jt = new JTextField();
         JTextField jt1 = new JTextField();
         JButton jb = new JButton("Reverse");
         JButton jb1 = new JButton("Concat");
  
         JButton back = new JButton("Back");
         JButton Enter = new JButton("ENTER");
         JButton Add = new JButton("ADD");
		//Frame

		jf.setTitle("String Operation");
		jf.setSize(400,400);
		jf.setLocation(400,200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.add(jb);
        jf.add(jb1);
      
        jf.add(jl);
        
        //frame2
        jf1.setTitle(" Reverse Of String ");
        jf1.setSize(400,400);
        jf1.setLocation(400,200);
        jf1.setLayout(null);
        jf1.setVisible(false);
        jf1.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
        //frame3
        jf2.setTitle(" Concatination Of String ");
        jf2.setSize(400,400);
        jf2.setLocation(400,200);
        jf2.setLayout(null);
        jf2.setVisible(false);
        jf2.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
       
        
        
        //TextField
        jt.setBounds(10,80,380,50);
        jt.setFont(new Font("Courier New", Font.BOLD, 24));
        
         //TextField2
        jt1.setBounds(10,180,380,50);
        jt1.setFont(new Font("Courier New", Font.BOLD, 24));
        


        //Label
        jl.setBounds(10,10,400,50);
        jl.setText("Select Operation For String ");
        jl.setFont(new Font("Courier New", Font.BOLD, 24));
        

        //Label2
        jl1.setBounds(10,30,400,50);
        jl1.setFont(new Font("Courier New", Font.BOLD, 24));

        //Label2
        jl2.setBounds(10,240,400,50);
        jl2.setFont(new Font("Courier New", Font.BOLD, 24));

          //Label2
        jl3.setBounds(10,200,400,50);
        jl3.setFont(new Font("Courier New", Font.BOLD, 24));
        

       //button
        jb.setBounds(20,50,100,35);
       

        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  jf.setVisible(false);
                  jf1.setVisible(true);
                  jl1.setText("Enter String :");
                  jf1.add(back);
                  jf1.add(jl1);
                  jf1.add(jt);
                  jf1.add(jl2);
                  jf1.add(Enter);
                  
                  
            }
        });

        //Enter
        Enter.setBounds(290,150,100,35);
        
        
        Enter.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                    jf1.add(jl3);
                    jl3.setText("Reverse of String : ");
                    
                   StringBuffer sb = new StringBuffer(jt.getText());
                  jl2.setText(sb.reverse().toString());

                  }
                  });

        jb1.setBounds(20,90,100,35);

        jb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 jf.setVisible(false);
                  jf2.setVisible(true);
                  jl2.setBounds(10,130,380,50);
                  jl2.setFont(new Font("Courier New", Font.BOLD, 24));
         
                  jl1.setText("Enter String 1:");
                  jl2.setText("Enter String 2:");
                   jf2.add(back);
                   jf2.add(jl1);
                   jf2.add(jt);
                   jf2.add(jl2);
                   jf2.add(jt1);
                   jf2.add(Add);
            }
        });
        //Enter
        Add.setBounds(290,230,100,35);
        
        
        Add.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent e){
                     jl3.setBounds(10,310,400,50);
                     jl3.setFont(new Font("Courier New", Font.BOLD, 24));
                     jl.setBounds(10,280,400,50);
                     jf2.add(jl);
                     jf2.add(jl3);
                     jl.setFont(new Font("Courier New", Font.BOLD, 24));
                     jl.setText("Concatination of Strings :");
                    jl3.setText(jt.getText()+jt1.getText());
 
                  }
                  });

        



        back.setBounds(300,10,100,35);

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 jf.setVisible(true);
                  jf1.setVisible(false);
                  jf2.setVisible(false);
                  jf3.setVisible(false);
                   jl.setBounds(10,10,400,50);
                  jl.setText("Select Operation For String ");
                   jl.setFont(new Font("Courier New", Font.BOLD, 24));
                  jf.add(jl);
            }
        });

      
	}
}