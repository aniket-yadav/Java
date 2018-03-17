import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MarkSheet implements ActionListener{
	JFrame jf;
	JTextField fname,mname,lname,java,es,se,cg,math,seatno;
	JButton submit;
	MarkSheet()
	{
       jf = new JFrame("Student MarkSheet");
       jf.setSize(400,500);
       jf.setLocation(400,100);
       jf.setVisible(true);
       jf.setLayout(null);
       jf.setResizable(false);
       jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
       jf.add(new JLabel("Fill MarkSheet")).setBounds(150,20,100,30);
       jf.add(new JLabel("Enter Student Details")).setBounds(20,50,200,30);
       jf.add(new JLabel("Seat No. ")).setBounds(20,80,100,30);
       jf.add(new JLabel("First Name")).setBounds(20,110,100,30);
       jf.add(new JLabel("Middle Name")).setBounds(20,140,100,30);
       jf.add(new JLabel("Last Name")).setBounds(20,170,100,30);
       jf.add(new JLabel("Enter Marks Obtain (out of 100)")).setBounds(20,230,200,30);
       jf.add(new JLabel("Java")).setBounds(20,260,100,30);
       jf.add(new JLabel("ES")).setBounds(20,290,100,30);
       jf.add(new JLabel("SE")).setBounds(20,320,100,30);
       jf.add(new JLabel("Math")).setBounds(20,350,100,30);
       jf.add(new JLabel("CG")).setBounds(20,380,100,30);
       jf.add(seatno = new JTextField()).setBounds(120,80,200,30);
       jf.add(fname = new JTextField()).setBounds(120,110,200,30);
       jf.add(mname = new JTextField()).setBounds(120,140,200,30);
       jf.add(lname = new JTextField()).setBounds(120,170,200,30);
       jf.add(java = new JTextField()).setBounds(120,260,200,30);
       jf.add(es = new JTextField()).setBounds(120,290,200,30);
       jf.add(se = new JTextField()).setBounds(120,320,200,30);
       jf.add(math = new JTextField()).setBounds(120,350,200,30);
       jf.add(cg = new JTextField()).setBounds(120,380,200,30);
       jf.add(submit = new JButton("submit")).setBounds(220,420,100,40);
       submit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		          jf.getContentPane().removeAll();
                      jf.getContentPane().repaint();
                      jf.add(new JLabel("Candidate's seat no.: ")).setBounds(10,20,160,30);
                      jf.add(new JLabel(seatno.getText())).setBounds(160,20,300,30);
                      jf.add(new JLabel("Candidate's full name : ")).setBounds(10,50,160,30);
                      jf.add(new JLabel(fname.getText()+" "+mname.getText()+" "+lname.getText())).setBounds(160,50,300,30);
                      jf.add(new JLabel("Subjects")).setBounds(10,80,160,30);
                      jf.add(new JLabel("Java : "+java.getText())).setBounds(10,110,160,30);
                      jf.add(new JLabel("ES : "+es.getText())).setBounds(10,140,160,30);
                      jf.add(new JLabel("SE : "+se.getText())).setBounds(10,170,160,30);
                      jf.add(new JLabel("CG : "+cg.getText())).setBounds(10,200,160,30);
                      jf.add(new JLabel("Math : "+math.getText())).setBounds(10,230,160,30);
                      float sum = Float.parseFloat(java.getText())+Float.parseFloat(se.getText())+Float.parseFloat(es.getText())+Float.parseFloat(cg.getText())+Float.parseFloat(math.getText());
                      jf.add(new JLabel("Total Obtain Marks : "+Float.toString(sum))).setBounds(10,260,250,30);
                      float Percentage = (sum*100)/500;
                      jf.add(new JLabel("Percentage: "+Float.toString(Percentage))).setBounds(10,290,250,30);
                      if(Percentage<40){
                          jf.add(new JLabel("Result : FAIL ")).setBounds(10,320,250,30);
                       }else{
                        jf.add(new JLabel("Result : PASS ")).setBounds(10,320,250,30);
                       }
                 }
	public static void main(String[] args) {
		new MarkSheet();
	}
}