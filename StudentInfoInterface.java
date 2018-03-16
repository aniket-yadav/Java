import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentInfoInterface{
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JTextField roll = new JTextField();
		JTextField name = new JTextField();
		JTextField mobile = new JTextField();
		JTextField email = new JTextField();
		JButton submit = new JButton("Submit");
		jf.setTitle("StudentInfoInterface");
		jf.setSize(400,500);
		jf.setLocation(300,100);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	    jf.setResizable(false);
		//Labels


		jf.add(new JLabel("Student Info Interface")).setBounds(150,10,200,30);
		jf.add(new JLabel("Roll No. : ")).setBounds(10,100,100,30);
		jf.add(new JLabel("Name : ")).setBounds(10,150,100,30);
		jf.add(new JLabel("Mobile No. : ")).setBounds(10,200,100,30);
		jf.add(new JLabel("Email : ")).setBounds(10,250,100,30);
         
         //textfield
		jf.add(roll).setBounds(110,100,200,30);
		jf.add(name).setBounds(110,150,200,30);
		jf.add(mobile).setBounds(110,200,200,30);
		jf.add(email).setBounds(110,250,200,30);
        
        //submit

        jf.add(submit).setBounds(250,300,80,30);

        submit.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		roll.setVisible(false);
        		name.setVisible(false);
        		mobile.setVisible(false);
        		email.setVisible(false);
        		submit.setVisible(false);
        		jf.add(new JLabel(roll.getText())).setBounds(110,100,100,30);
        	    jf.add(new JLabel(name.getText())).setBounds(110,150,100,30);
        	    jf.add(new JLabel(mobile.getText())).setBounds(110,200,100,30);
        	    jf.add(new JLabel(email.getText())).setBounds(110,250,100,30);
        	
        	}
        });
	}
}