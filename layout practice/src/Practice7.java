
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class TestGridLayout extends JFrame implements ActionListener{

	
	public TestGridLayout() {
		GridLayout grid = new GridLayout(4,5);
		grid.setHgap(2);
		grid.setVgap(2);
		setLayout(grid);
		Color color;
		
			Random ran = new Random();
			int r = ran.nextInt(256);
			
			int g = ran.nextInt(256);
			
			int b = ran.nextInt(256);
			
			color = new Color(r,g,b);

			  JButton btn1 = new JButton("1");
			  JButton btn2 = new JButton("2");
			  JButton btn3 = new JButton("3");
			  JButton btn4 = new JButton("4");
			  JButton btn5 = new JButton("5");
			  JButton btn6 = new JButton("6");
			  JButton btn7 = new JButton("7");
			  JButton btn8 = new JButton("8");
			  JButton btn9 = new JButton("9");
			  JButton btn10 = new JButton("10");
			  JButton btn11 = new JButton("11");
			  JButton btn12 = new JButton("12");
			  JButton btn13 = new JButton("13");
			  JButton btn14 = new JButton("14");
			  JButton btn15 = new JButton("15");
			  JButton btn16 = new JButton("16");
			  JButton btn17 = new JButton("17");
			  JButton btn18 = new JButton("18");
			  JButton btn19 = new JButton("19");
			  JButton btn20 = new JButton("20");
			  
			  
			  add(btn1);
			  add(btn2);
			  add(btn3);
			  add(btn4);
			  add(btn5);
			  add(btn6);
			  add(btn7);
			  add(btn8);
			  add(btn9);
			  add(btn10);
			  add(btn11);
			  add(btn12);
			  add(btn13);
			  add(btn14);
			  add(btn15);
			  add(btn16);
			  add(btn17);
			  add(btn18);
			  add(btn19);
			  add(btn20);
			  
			  btn1.setBackground(new Color(r,g,b));
			  btn2.setBackground(new Color(r,g,r));
			  btn3.setBackground(new Color(r,g,g));
			  btn4.setBackground(new Color(r,r,r));
			  btn5.setBackground(new Color(r,r,b));
			  btn6.setBackground(new Color(r,r,g));
			  btn7.setBackground(new Color(r,b,r));
			  btn8.setBackground(new Color(r,b,g));
			  btn9.setBackground(new Color(r,b,b));
			  btn10.setBackground(new Color(g,r,r));
			  btn11.setBackground(new Color(b,r,g));
			  btn12.setBackground(new Color(g,r,b));
			  btn13.setBackground(new Color(g,g,r));
			  btn14.setBackground(new Color(b,g,g));
			  btn15.setBackground(new Color(g,g,b));
			  btn16.setBackground(new Color(g,b,r));
			  btn17.setBackground(new Color(g,b,b));
			  btn18.setBackground(new Color(b,b,g));
			  btn19.setBackground(new Color(b,b,r));
			  btn20.setBackground(new Color(b,b,b));
			
			  
			  btn1.addActionListener(this);
			  btn2.addActionListener(this);
			  btn3.addActionListener(this);
			  btn4.addActionListener(this);
			  btn5.addActionListener(this);
			  btn6.addActionListener(this);
			  btn7.addActionListener(this);
			  btn8.addActionListener(this);
			  btn9.addActionListener(this);
			  btn10.addActionListener(this);
			  btn11.addActionListener(this);
			  btn12.addActionListener(this);
			  btn13.addActionListener(this);
			  btn14.addActionListener(this);
			  btn15.addActionListener(this);
			  btn16.addActionListener(this);
			  btn17.addActionListener(this);
			  btn18.addActionListener(this);
			  btn19.addActionListener(this);
			  btn20.addActionListener(this);

			
		
		
		
		
		setSize(800,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public void showGUI() {
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		Color colorr;
		JButton buttonn = (JButton)e.getSource();
		  String str = buttonn.getText();


		Random rc = new Random();
		int R = rc.nextInt(256);
		
		int G = rc.nextInt(256);
		
		int B = rc.nextInt(256);
		
		colorr = new Color(R,G,B);
		
		 if(str.equals("1"))
			   buttonn.setBackground(colorr);
			  else if(str.equals("2"))
			   buttonn.setBackground(colorr);
			  else if(str.equals("3"))
			   buttonn.setBackground(colorr);
			  else if(str.equals("4"))
			   buttonn.setBackground(colorr);
			  else if(str.equals("5"))
				   buttonn.setBackground(colorr);
			  else if(str.equals("6"))
				   buttonn.setBackground(colorr);
			  else if(str.equals("7"))
				   buttonn.setBackground(colorr);
			  else if(str.equals("8"))
				   buttonn.setBackground(colorr);
			  else if(str.equals("9"))
				   buttonn.setBackground(colorr);
			  else if(str.equals("10"))
				   buttonn.setBackground(colorr);
			 else if(str.equals("11"))
				   buttonn.setBackground(colorr);
   			 else if(str.equals("12"))
				   buttonn.setBackground(colorr);
			 else if(str.equals("13"))
				   buttonn.setBackground(colorr);
			 else if(str.equals("14"))
				   buttonn.setBackground(colorr);
			 else if(str.equals("15"))
			       buttonn.setBackground(colorr);
		     else if(str.equals("16"))
			       buttonn.setBackground(colorr);
		     else if(str.equals("17"))
				   buttonn.setBackground(colorr);
		     else if(str.equals("18"))
				   buttonn.setBackground(colorr);
			 else if(str.equals("19"))
			       buttonn.setBackground(colorr);
			 else if(str.equals("20"))
				   buttonn.setBackground(colorr);
			 
			  
			 }
	


		
		
		
	}


public class Practice7 {
	public static void main(String[] args) {
		new TestGridLayout().showGUI();
	}
}
