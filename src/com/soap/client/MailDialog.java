package com.soap.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MailDialog extends JDialog implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel p1, p2, p3;
	private JButton b1,b2,b3;
	private JTextField t1,t2,t3;
	private JPasswordField pf1;
	private JTextArea ta;
	
	public MailDialog(String result) {
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
		p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
		
		
		
		p1.add( new JLabel("From") );
		
		p3 = new JPanel();
		t1 = new JTextField(45);
		p3.add(t1);
		p3.add( new JLabel("@gmail.com"));
		
		p1.add(p3);
		
		p1.add( new JLabel("Password") );
		pf1 = new JPasswordField(50);
		p1.add(pf1);
		p1.add( new JLabel("To") );
		t2 = new JTextField(50);
		p1.add(t2);
		p1.add( new JLabel("Subject") );
		t3 = new JTextField(50);
		p1.add(t3);
		p1.add( new JLabel("Body") );
		ta = new JTextArea(10,50);
		ta.setText(result);
		
		JScrollPane scroll = new JScrollPane ( ta );
	    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

		p1.add(scroll);
		
		p2 = new JPanel();
		
		b1 = new JButton("Send");
		b2 = new JButton("Correct Errors");
		b3 = new JButton("Add keywords");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		p1.add(p2);

		add(p1);
		
		pack();
		setLocationRelativeTo(getParent());
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if( ae.getSource().equals(b1) ) {

			if( MailInterface.validateMail(t2.getText()) ) {
				
				String pass = String.valueOf(pf1.getPassword());
				List<String> l = new LinkedList<String>();
				l.add(t2.getText());
				boolean send = MailInterface.sendMail(t1.getText(), pass, l , t3.getText(), ta.getText());
				
				if(!send){
					JOptionPane.showMessageDialog(this, "Fail to delivery mail");
				} else {
					JOptionPane.showMessageDialog(this, "Mail sended");
				}
				
			} else {
				JOptionPane.showMessageDialog(this, "Address seems to be incorrect");
			} 

		}
		
		if( ae.getSource().equals(b2) ) {
			
			String lang = TextInterface.detectLanguage( ta.getText() ).get(0).getLang();
			
			if( "en".equals(lang) ) {

				String corrections = TextInterface.correctErrors(ta.getText());
				
				ta.setText( ta.getText() + "\n------\n" + corrections );
				
				
			} else {
				JOptionPane.showMessageDialog(this, "Not supported language");
			}
			

		}

		if( ae.getSource().equals(b3) ) {
			List<String> l = TextInterface.getMostUsedWords(ta.getText());
			for (String kw : l) {
				ta.setText( ta.getText() + "\n" + kw );
			}
			
		}
		
	}

}
