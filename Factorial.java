import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Factorial{
	public static void main(String[] args) {
	   JFrame jf = new JFrame("Factorial Calculator");
       JTextField jt = new JTextField();
       JButton jb = new JButton("ENTER");
		jf.setSize(400,400);
		jf.setLocation(400,200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.add(new JLabel("Enter No:")).setBounds(20,50,150,40);
        jf.add(jt).setBounds(150,50,200,40);;
        jf.add(jb).setBounds(250,100,100,35);;
        jb.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		  int no =Integer.parseInt(jt.getText());
        		  long Fact=1;
        		  if(no>0){
        		  for(int i=1;i<=no;i++){
        		  	Fact=Fact*i;
        		  }
        		}
                jf.add(new JLabel("Factorial of "+Integer.toString(no)+" is "+Long.toString(Fact))).setBounds(20,200,500,40);
        }
        });
	}
}