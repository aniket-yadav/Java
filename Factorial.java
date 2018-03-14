import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Factorial{
	public static void main(String[] args) {
	   JFrame jf = new JFrame();
       JLabel jl = new JLabel();
       JLabel jl1 = new JLabel();
       JTextField jt = new JTextField();
       JButton jb = new JButton();

		//Frame

		jf.setTitle("Factorial Calculator");
		jf.setSize(400,400);
		jf.setLocation(400,200);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.add(jl);
        jf.add(jt);
        jf.add(jb);
        jf.add(jl1);
        
        //label

        jl.setBounds(20,50,150,40);
        jl.setText("Enter No:");
        jl.setFont(new Font("Courier New", Font.BOLD, 24));

        //textfield

        jt.setBounds(150,50,200,40);
        jt.setFont(new Font("Courier New", Font.BOLD, 24));

        //label2
        jl1.setBounds(20,200,500,40);
        jl1.setFont(new Font("Courier New", Font.BOLD, 24));




        //button

        jb.setBounds(250,100,100,35);
        jb.setText("ENTER");
        jb.setFont(new Font("Courier New", Font.BOLD, 24));

        jb.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		  int no =Integer.parseInt(jt.getText());
        		  long Fact=1;
        		  if(no>0){
        		  for(int i=1;i<=no;i++){
        		  	Fact=Fact*i;
        		  }
        		}
        		jl1.setText("Factorial of "+Integer.toString(no)+" is "+Long.toString(Fact));
        	}
        });
	}
}