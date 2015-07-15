package penetrator;
import javax.swing.*;

import org.omg.CORBA.portable.OutputStream;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frame extends JFrame implements ActionListener {

	private JButton ok;
	private JButton back;
	
	private JTextField seiteA;
	private JTextField seiteB;
	private JTextField seiteC;
	private static JLabel L_seiteA;
	private static JLabel L_seiteB;
	private static JLabel L_seiteC;
	
	private JTextField winkelAlpha;
	private JTextField winkelBeta;
	private JTextField winkelGamma;
	private static JLabel L_winkelAlpha;
	private static JLabel L_winkelBeta;
	private static JLabel L_winkelGamma;
	
	private JTextField flaeche;
	private static JLabel L_flaeche;
	
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	
	private JButton buttonK;
	
	//private ImageIcon eck;
	
	
	public static void main(String[] args) {
		
		frame frame = new frame ("Penetrator-2015-V.0.0.1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(950, 320);
		frame.setLocation(450, 200);

		//frame.getContentPane().setBackground(Color.darkGray);
		
		frame.L_seiteA = new JLabel("a: ");
		frame.L_seiteA.setLocation(5, 70);
		frame.L_seiteA.setSize(20, 20);
		frame.L_seiteA.setBackground(Color.orange);
		frame.getContentPane().add(L_seiteA);
		
		frame.L_seiteB = new JLabel("b: ");
		frame.L_seiteB.setLocation(5, 125);
		frame.L_seiteB.setSize(20, 20);
		frame.L_seiteB.setBackground(Color.orange);
		frame.getContentPane().add(L_seiteB);

		frame.L_seiteC = new JLabel("c: ");
		frame.L_seiteC.setLocation(5, 180);
		frame.L_seiteC.setSize(20, 20);
		frame.L_seiteC.setBackground(Color.orange);
		frame.getContentPane().add(L_seiteC);

		frame.L_winkelAlpha = new JLabel("Alpha: ");
		frame.L_winkelAlpha.setLocation(130, 70);
		frame.L_winkelAlpha.setSize(50, 20);
		frame.L_winkelAlpha.setBackground(Color.orange);
		frame.getContentPane().add(L_winkelAlpha);

		frame.L_winkelBeta = new JLabel("Beta: ");
		frame.L_winkelBeta.setLocation(130, 125);
		frame.L_winkelBeta.setSize(50, 20);
		frame.L_winkelBeta.setBackground(Color.orange);
		frame.getContentPane().add(L_winkelBeta);

		frame.L_winkelGamma = new JLabel("Gamma: ");
		frame.L_winkelGamma.setLocation(130, 180);
		frame.L_winkelGamma.setSize(50, 20);
		frame.L_winkelGamma.setBackground(Color.orange);
		frame.getContentPane().add(L_winkelGamma);

		frame.L_flaeche = new JLabel("Fläche: ");
		frame.L_flaeche.setLocation(5, 235);
		frame.L_flaeche.setSize(50, 20);
		frame.L_flaeche.setBackground(Color.orange);
		frame.getContentPane().add(L_flaeche);
						
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public frame(String title){
		
		super(title);

		ok = new JButton("OK");
		ok.setBounds(5, 5, 130, 50);
		ok.addActionListener(this);
		//ok.setBackground(Color.orange);
		add(ok);
		
		back = new JButton("zurücksetzen");
		back.setBounds(140, 5, 140, 50);
		back.addActionListener(this);
		//back.setBackground(Color.orange);
		add(back);
		
		button0 = new JButton("0");
		button0.setBounds(345, 225, 50, 50);
		button0.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button0);
		
		button1 = new JButton("1");
		button1.setBounds(290, 5, 50, 50);
		button1.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button1);
		
		button2 = new JButton("2");
		button2.setBounds(290, 60, 50, 50);
		button2.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button2);
		
		button3 = new JButton("3");
		button3.setBounds(290, 115, 50, 50);
		button3.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button3);
		
		button4 = new JButton("4");
		button4.setBounds(290, 170, 50, 50);
		button4.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button4);
		
		button5 = new JButton("5");
		button5.setBounds(290, 225, 50, 50);
		button5.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button5);
		
		button6 = new JButton("6");
		button6.setBounds(345, 5, 50, 50);
		button6.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button6);
		
		button7 = new JButton("7");
		button7.setBounds(345, 60, 50, 50);
		button7.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button7);
		
		button8 = new JButton("8");
		button8.setBounds(345, 115, 50, 50);
		button8.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button8);
		
		button9 = new JButton("9");
		button9.setBounds(345, 170, 50, 50);
		button9.addActionListener(this);
		//back.setBackground(Color.orange);
		add(button9);
		
		buttonK = new JButton(",");
		buttonK.setBounds(235, 225, 50, 50);
		buttonK.addActionListener(this);
		//back.setBackground(Color.orange);
		add(buttonK);
		
	
		seiteA = new JTextField("100000.000");
		seiteA.setBounds(20, 60, 100, 50 );
		seiteA.addActionListener(this);
		add(seiteA);
		
		seiteB = new JTextField("200000.000");
		seiteB.setBounds(20, 115, 100, 50 );
		seiteB.addActionListener(this);
		add(seiteB);
		
		seiteC = new JTextField("300000.000");
		seiteC.setBounds(20, 170, 100, 50 );
		seiteC.addActionListener(this);
		add(seiteC);
		
		winkelAlpha = new JTextField("100000.000");
		winkelAlpha.setBounds(180, 60, 100, 50 );
		winkelAlpha.addActionListener(this);
		add(winkelAlpha);

		winkelBeta = new JTextField("100000.000");
		winkelBeta.setBounds(180, 115, 100, 50 );
		winkelBeta.addActionListener(this);
		add(winkelBeta);
		
		winkelGamma = new JTextField("100000.000");
		winkelGamma.setBounds(180, 170, 100, 50 );
		winkelGamma.addActionListener(this);
		add(winkelGamma);
		
		flaeche = new JTextField("100000.000");
		flaeche.setBounds(55, 225, 100, 50 );
		flaeche.addActionListener(this);
		add(flaeche);
		
		eck = new ImageIcon("C:\\dreieck.PNG");
		JLabel l1 = new JLabel (eck);
		l1.setLocation(345,5);
		add(l1);
	}
	
	public static void auswahl(){
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok){
			System.out.println("ok gedrückt");
			
			
		}
		
		if (e.getSource() == back){
			System.out.println("zurücksetzen gedrückt");
		}
		
	}
	
	
}
