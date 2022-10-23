package project3;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Mark implements ActionListener{
	
	JTextField textfield;
	JTextField textfield1;
	JTextField textfield2;
	JButton enterbutton;
	JLabel displayLabel3;
	
	public Mark(){
		JFrame jf=new JFrame("AVERAGE FINDER");
		jf.setLayout(null);
		jf.setBounds(600,100,500,400);
		jf.getContentPane().setBackground(Color.white);
		jf.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.red));
		jf.setVisible(true);
		
		JLabel displayLabel=new JLabel("MATHS");
		displayLabel.setBounds(40,50,540,20);
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setForeground(Color.RED);
		displayLabel.setFont(new Font("Calibiri", Font.BOLD,16));
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		JLabel displayLabel1=new JLabel("PHYSICS");
		displayLabel1.setBounds(40,110,540,20);
		displayLabel1.setBackground(Color.WHITE);
		displayLabel1.setForeground(Color.RED);
		displayLabel1.setFont(new Font("Calibiri", Font.BOLD,16));
		displayLabel1.setOpaque(true);
		jf.add(displayLabel1);
		
		JLabel displayLabel2=new JLabel("CHEMISTRY");
		displayLabel2.setBounds(40,170,540,20);
		displayLabel2.setBackground(Color.WHITE);
		displayLabel2.setForeground(Color.RED);
		displayLabel2.setFont(new Font("Calibiri", Font.BOLD,16));
		displayLabel2.setOpaque(true);
		jf.add(displayLabel2);
		
		displayLabel3=new JLabel();
		displayLabel3.setBounds(120,290,540,20);
		displayLabel3.setBackground(Color.WHITE);
		displayLabel3.setForeground(Color.green);
		displayLabel3.setFont(new Font("Calibiri", Font.BOLD,13));
		displayLabel3.setOpaque(true);
		jf.add(displayLabel3);
		
		textfield=new JTextField();
		textfield.setBounds(40,70,380,30);
		textfield.setBackground(Color.white);
		textfield.setBorder(new LineBorder(Color.red,2));
		textfield.setFont(new Font("Calibiri", Font.PLAIN,16));
		textfield.addActionListener(this);
		textfield.setOpaque(true);
		textfield.setVisible(true);
		jf.add(textfield);
		
		textfield1=new JTextField();
		textfield1.setBounds(40,130,380,30);
		textfield1.setBackground(Color.white);
		textfield1.setBorder(new LineBorder(Color.red,2));
		textfield1.setFont(new Font("Calibiri", Font.PLAIN,16));
		textfield1.addActionListener(this);
		textfield1.setOpaque(true);
		jf.add(textfield1);
		
		textfield2=new JTextField();
		textfield2.setBounds(40,190,380,30);
		textfield2.setBackground(Color.white);
		textfield2.setBorder(new LineBorder(Color.red,2));
		textfield2.setFont(new Font("Calibiri", Font.PLAIN,16));
		textfield2.addActionListener(this);
		textfield2.setOpaque(true);
		jf.add(textfield2);
		
		enterbutton=new JButton("ENTER");
		enterbutton.setBounds(170,230,100,50);
		enterbutton.setBorder(new LineBorder(Color.red,2));
		enterbutton.setBackground(Color.white);
		enterbutton.setForeground(Color.red);
		enterbutton.setFont(new Font("Calibiri", Font.BOLD,16));
		enterbutton.addActionListener(this);
		jf.add(enterbutton);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}public static void main(String[] args) {
		new Mark(); 
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==enterbutton) {
			String value1=textfield.getText();
			String value2=textfield1.getText();
			String value3=textfield2.getText();
			float convert1=Float.parseFloat(value1);
			float convert2=Float.parseFloat(value2);
			float convert3=Float.parseFloat(value3);
			
			
			float SUM=convert1+convert2+convert3;
			float AVERAGE=(convert1+convert2+convert3)/3;
			
			displayLabel3.setText("SUM="+SUM+"              AVERAGE="+AVERAGE);
			displayLabel3.setForeground(Color.green);
		}
	}
}
