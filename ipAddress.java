import java.awt.*;  
import java.awt.event.*;
import java.net.*;  
class ipAddress extends Frame implements ActionListener{  
    TextField t; Label l1,l2; Button b;  
    ipAddress(){ 
        super("IP Address");
        l1=new Label("Enter URL :");
        l1.setBounds(50,50,200,20);
        t=new TextField();  
        t.setBounds(50,80, 250,40);  
        l2=new Label();  
        l2.setBounds(50,150, 350,20);      
        b=new Button("Find IP");  
        b.setBounds(50,200,100,30);  
        b.addActionListener(this);    
        add(b);
        add(t);
        add(l1);
        add(l2);    
        setSize(400,400); 
        setLocation(500,100); 
        setLayout(null);  
        setVisible(true); 
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });   
    }  
    public void actionPerformed(ActionEvent e) {  
        try{  
        String host=t.getText();  
        String ip=InetAddress.getByName(host).getHostAddress();  
        l2.setText("IP of "+host+" is: "+ip);  
        }catch(Exception ex)
        {
            l2.setText("Enter correct URL ");
        }  
    }  
    public static void main(String[] args) {  
        new ipAddress();  
    }  
}  
