package frame;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Make extends Frame {
     JLabel k,v,s,a1,a2,g5,g6,g7,g8,y,x,o,q,b1,b2,b,b3,b4,b7,b8,b9,h,b5,g2,g3,g4,m;
	 JButton ji,Receipt,c,d,e,w;
	 JCheckBox jcb;
	 JTextField i,p,p1,p2,p3,p4,p5,p6,h1,h2,h3,h4,z,t;
	 JTextArea area,area2;
	 JComboBox jc;
	 JRadioButton r1,r2;
	 public Make()
	 {
		 
        setLayout(null);
        setSize(1000,900);
	    setVisible(true);
	    k=new JLabel("LogIn");
		k.setBounds(650, 200, 250, 20);
		add(k);
		
		v=new JLabel("User Name :");
		v.setBounds(550, 250, 250, 20);
		add(v);
		t=new JTextField();
		t.setBounds(660, 250, 200, 21);
		add(t);
		
		s=new JLabel("Password  :");
		s.setBounds(550, 300, 250, 20);
		add(s);
		z=new JTextField();
		z.setBounds(660, 300, 200, 21);
		add(z);
		e=new JButton("<Back>");
		e.setBounds(710, 350, 100, 25);
		e.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
		});
	    add(e);
		k.setFont(new Font("times",Font.BOLD,17));
		v.setFont(new Font("times",Font.BOLD,17));
		s.setFont(new Font("times",Font.BOLD,17));
		e.setFont(new Font("times",Font.BOLD,11));
		d=new JButton("Create Account");
		d.setBounds(550,350,130,25);
		d.setFont(new Font("times",Font.BOLD,11));
		d.addActionListener(new ActionListener()
				{

			public void actionPerformed(ActionEvent e)
			{
				JFrame d=new JFrame("Medical Management");
			     d.setLayout(null);
				d.setSize(800,800);
				d.setVisible(true);
				d.setContentPane(new JLabel(new ImageIcon("E:\\download\\tire.jfif")));
	    a1=new JLabel("JESUS HOSPITAL");
	    a1.setBounds(600,20,300,110);
	    d.add(a1);
	//a1.setBackground(Color.yellow);
	//a1.setOpaque(true);
	a2=new JLabel("Register Form");
	a2.setBounds(200,60,300,110);
    d.add(a2);
     g5=new JLabel("Suggestions");
	g5.setBounds(1140,100,150,100);
	d.add(g5);
	 g6=new JLabel("Drink water regularly");
	g6.setBounds(1140,150,150,100);
	d.add(g6);
	g7=new JLabel("Take fruits");
	g7.setBounds(1140,170,150,100);
	d.add(g7);
	 g8=new JLabel("Balanced Diet");
	g8.setBounds(1140,190,150,100);
	d.add(g8);
	 y=new JLabel("Good sleep");
	y.setBounds(1140,210,150,100);
	d.add(y);
	x=new JLabel("Preventive care");
	x.setBounds(1140,230,150,100);
	d.add(x);
	o=new JLabel("Regular Exercise");
	o.setBounds(1140,250,150,100);
	d.add(o);
     q=new JLabel("Hygiene");
	q.setBounds(1140,270,150,100);
	d.add(q);
	
	
	b=new JLabel("Name:");
	b.setBounds(200,140,150,100);
	b1=new JLabel("Birth Date:");
	b1.setBounds(200,180,150,100);
	d.add(b);
	d.add(b1);
	 b2=new JLabel("city:");
	b2.setBounds(200,225,150,100);
	d.add(b2);
	b3=new JLabel("State:");
	b3.setBounds(200,265,150,100);
	d.add(b3);
	 b4=new JLabel("Contact No:");
	b4.setBounds(200,305,150,100);
	d.add(b4);
	 b7=new JLabel("E-Mail:");
	b7.setBounds(200,345,150,100);
	d.add(b7);
	b8=new JLabel("LoginName:");
	b8.setBounds(200,387,150,100);
	d.add(b8);
	b9=new JLabel("Password:");
	b9.setBounds(200,427,150,100);
	d.add(b9);
    h=new JLabel("Address:");
	h.setBounds(200,468,150,100);
   d. add(h);

     Receipt= new JButton("Generate Receipt");
	Receipt.setBounds(800, 420, 150, 30);
	d.add(Receipt);
	 c = new JButton("Reset"); 
	c.setBounds(970, 420, 100, 30); 
	d.add(c);
	a1.setFont(new Font("times",Font.BOLD,30));
    g8.setFont(new Font("times",Font.BOLD,15));
	g6.setFont(new Font("times",Font.BOLD,15));
	g7.setFont(new Font("times",Font.BOLD,15));
	g5.setFont(new Font("times",Font.BOLD,18));
	h.setFont(new Font("times",Font.BOLD,14));
	b4.setFont(new Font("times",Font.BOLD,14));
	b7.setFont(new Font("times",Font.BOLD,14));
	b3.setFont(new Font("times",Font.BOLD,17));
	b2.setFont(new Font("times",Font.BOLD,17));
	a2.setFont(new Font("times",Font.BOLD,19));
	b.setFont(new Font("times",Font.BOLD,15));
	b1.setFont(new Font("times",Font.BOLD,15));
//	a.setFont(new Font("times",Font.BOLD,17));
	b9.setFont(new Font("times",Font.BOLD,15));
	b8.setFont(new Font("times",Font.BOLD,15));
	x.setFont(new Font("times",Font.BOLD,15));
	y.setFont(new Font("times",Font.BOLD,15));
	o.setFont(new Font("times",Font.BOLD,15));
	q.setFont(new Font("times",Font.BOLD,15));

      i=new JTextField();
      i.setBounds(285,180,210,25);
	d.add(i);
	 p=new JTextField();
	p.setBounds(285,220,210,25);
	d.add(p);
      p1=new JTextField();
	p1.setBounds(285,268,210,25);
	d.add(p1);
    p2=new JTextField();
	p2.setBounds(285,305,210,25);
	d.add(p2);
	 p3=new JTextField();
	p3.setBounds(285,343,210,25);
	d.add(p3);
	 p4=new JTextField();
	p4.setBounds(285,380,210,25);
	d.add(p4);
	 p5=new JTextField();
	p5.setBounds(285,425,210,25);
	d.add(p5);
	 p6=new JTextField();
	p6.setBounds(285,468,210,25);
	d.add(p6);
	 h1=new JTextField();
	h1.setBounds(720,180,210,25);
	d.add(h1);
	 h2=new JTextField();
	h2.setBounds(720,220,210,25);
	d.add(h2);
	 h3=new JTextField();
	h3.setBounds(720,260,210,25);
	d.add(h3);
   h4=new JTextField();
	h4.setBounds(720,300,210,25);
	d.add(h4);
	area=new JTextArea();
		area.setBounds(285,500,300,200);
		d.add(area);
		area2=new JTextArea();
		area2.setBounds(650,460,450,240);
		d.add(area2);
	
	
	 b5=new JLabel("Age:");
	b5.setBounds(670,140,150,100);
	d.add(b5);
	 g2=new JLabel("Height:");
	g2.setBounds(650,180,150,100);
	d.add(g2);
	 g3=new JLabel("Weight:");
	g3.setBounds(650,220,150,100);
	d.add(g3);
    g4=new JLabel("BP:");
	g4.setBounds(680,260,150,100);
	d.add(g4);
	

	b5.setFont(new Font("times",Font.BOLD,15));
	g3.setFont(new Font("times",Font.BOLD,15));
    g2.setFont(new Font("times",Font.BOLD,15));
    g4.setFont(new Font("times",Font.BOLD,15));
	 r1=new JRadioButton("male");
	d.add(r1);
	r1.setBounds(650,350,150,25);
	r1.setFont(new Font("times",Font.BOLD,15));
	 r2=new JRadioButton("Female");
	d.add(r2);
	r2.setBounds(650,385,150,25);
	r2.setFont(new Font("times",Font.BOLD,15));
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	ji=new JButton("Submit");
    ji.setBounds(1200,620,100,40);
    add(ji);


ji.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent e)
{
	System.out.println("Click button");
	System.out.println(getTitle());
	JOptionPane.showConfirmDialog(d,"completed","Done",JOptionPane.INFORMATION_MESSAGE);
	System.out.println("Click");
	System.out.println(getTitle());
	JOptionPane.showConfirmDialog(d,"OK","Thank you!",JOptionPane.INFORMATION_MESSAGE);
	d.dispose();
//	JFrame j=new JFrame("Medical Management System");
//	j.setLayout(null);
//	j.setSize(400,400);
//	j.setVisible(true);
//	JLabel a1=new JLabel("Thank you!");
//	a1.setBounds(50,20,600,200);
//	a1.setFont(new Font("times",Font.BOLD,40));
//	j.add(a1);
//}
}
});
d.add(ji);


String n[]= {"Fever","cold","headache","Stomach ache","vomit","Deputies","TB",
	"cough","leg pain","body pain","wound","back pain","ear pain","others"};
jc=new JComboBox(n);
 add(jc);
jc.setBounds(820,350,130,30);
d.add(jc);


c.addActionListener(new ActionListener() 
{
	public void actionPerformed( ActionEvent e)
	{
		i.setText(""); 
		p.setText(" "); 
		p1.setText(""); 
		p2.setText("");
		p3.setText(""); 
		p4.setText(""); 
		p5.setText(""); 
		p6.setText(" ");
		h1.setText("");
		h2.setText("");
		h3.setText("");
		h4.setText("");
		area.setText("");
		area2.setText("");
	
	}
});
d.add(c);
Receipt.addActionListener(new ActionListener() 
{
	public void actionPerformed(ActionEvent e)
	{
		area2.setText("--------------------------------"+ "-----------PAITENT RECEIPT----" + "--------------------------"+ "--------------------------" + "-------------------\n");
		area2.setText(area2.getText()+ "Name:"+ i.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Birth Date:"+ p.getText()+ "\n"); 
		area2.setText(area2.getText()+ "city:"+ p1.getText()+ "\n"); 
		area2.setText(area2.getText()+ "State:"+ p2.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Contact No:"+ p3.getText()+ "\n"); 
		area2.setText(area2.getText()+ "E-mail:"+ p4.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Login Name:"+ p5.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Password:"+ p6.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Age:"+ h1.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Height:"+ h2.getText()+ "\n"); 
		area2.setText(area2.getText()+ "Weight:"+ h3.getText()+ "\n"); 
		area2.setText(area2.getText()+ "BP:"+ h4.getText()+ "\n"); 
			area2.setText(area2.getText()+ "Address:"+ area.toString() + "\n");

    }

});
d.add(Receipt);
w=new JButton("Print");
w.setBounds(680,420,100,30);
w.addActionListener( new ActionListener() 
{
	public void actionPerformed( ActionEvent e)
	{
		try 
		{
			area2.print(); 
		}
		catch (java.awt.print.PrinterException a) 
		{
			System.err.format( "NoPrinter Found", a.getMessage());
		}
	}
});
d.add(w);

				
	 }
	 
		
	 });
		add(d);
}






public static void main(String[] args) {
new Make();

	}
}





