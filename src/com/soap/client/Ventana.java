package com.soap.client;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel panel1, p1,p2,p3,p4,p5,p6,p7;
	private JDialog dialog1;
	private JLabel lhash, ltimeOut, ltype,l1,l2;
	private JTextField thash, ttimeOut, ttype, t1,t2;
	private JButton b1,b2,b3;
	private JTabbedPane tabbedPane ;
	private JComboBox<String> jc;
	
	public Ventana() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabbedPane = new JTabbedPane();
		
		panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
		
		lhash = new JLabel("Hash: ");
		ltimeOut = new JLabel("Time Out (millis) :");
		ltype = new JLabel("Hash Type (MD5, SHA1) :");
		
		thash = new JTextField(50);
		ttimeOut = new JTextField(10);
		ttype = new JTextField(10);
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p1.add(lhash);
		p1.add(thash);
		p2.add(ltimeOut);
		p2.add(ttimeOut);
		p3.add(ltype);
		p3.add(ttype);
		b1 = new JButton("Crack it");
		b1.addActionListener(this);
		panel1.add(p1);
		panel1.add(p2);
		panel1.add(p3);
		panel1.add(b1);
		
		p4 = new JPanel();
		p4.setLayout(new BoxLayout(p4, BoxLayout.PAGE_AXIS));
		p5 = new JPanel();
		l1 = new JLabel("Input: ");
		t1 = new JTextField(50);
		jc = new JComboBox<String>();
		jc.addItem("MD5");
		jc.addItem("SHA-1");
		jc.addItem("SHA-256");
		jc.addItem("SHA-384");
		jc.addItem("SHA-512");
		jc.addItem("PBKDF2");
		p5.add( l1 );
		p5.add( t1 );
		p4.add(p5);
		p4.add( jc );
		b2 = new JButton("Calculate");
		b2.addActionListener(this);
		p4.add(b2);
		
		
		
		p7 = new JPanel();
		p7.setLayout(new BoxLayout(p7, BoxLayout.PAGE_AXIS));
		p6 = new JPanel();
		l2 = new JLabel("Hash: ");
		t2 = new JTextField(50);
		p6.add( l2 );
		p6.add( t2 );
		p7.add(p6);
		b3 = new JButton("Detect");
		b3.addActionListener(this);
		p7.add(b3);
		

		tabbedPane.addTab("Crack hash", panel1);
		tabbedPane.addTab("Calculate Hash", p4);
		tabbedPane.addTab("Detect Hash", p7);

		add(tabbedPane);
		pack();
		setLocationRelativeTo(getParent());
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if( ae.getSource().equals(b1) ) {
			String result = HashInterface.crackHash(thash.getText(), ttimeOut.getText(), ttype.getText());
			int confirmado = JOptionPane.showConfirmDialog(this, "Result: " + result + " \nyou wish to send it by mail?");
			if (JOptionPane.OK_OPTION == confirmado) {
				dialog1 = new MailDialog(result);
				dialog1.setVisible(true);
				
			}	
		}
		
		if( ae.getSource().equals(b2) ) {
			String hash = jc.getSelectedItem().toString();
			String result = null;
			if( "MD5".equals(hash) ) {
				result = HashInterface.getMD5( t1.getText() );
			} else if ( "SHA-1".equals(hash) ) {
				result = HashInterface.getSHA1( t1.getText() );
			} else if ( "SHA-256".equals(hash) ) {
				result = HashInterface.getSHA256( t1.getText() );
			} else if ( "SHA-384".equals(hash) ) {
				result = HashInterface.getSHA384( t1.getText() );
			} else if ( "SHA-512".equals(hash) ) {
				result = HashInterface.getSHA512( t1.getText() );
			} else if ( "PBKDF2".equals(hash) ) {
				result = HashInterface.getPBKDF2( t1.getText() );
			}
			
			int confirmado = JOptionPane.showConfirmDialog(this, "Result: " + result + " \nyou wish to send it by mail?");
			if (JOptionPane.OK_OPTION == confirmado) {
				dialog1 = new MailDialog(result);
				dialog1.setVisible(true);
				
			}	
			
			
		}
		
		if( ae.getSource().equals(b3) ) {

			List<String> result = HashInterface.detectHash(t2.getText());
			
			StringBuilder st = new StringBuilder();
			for (String string : result) {
				st.append(string);
				st.append("\n");
			}
			int confirmado = JOptionPane.showConfirmDialog(this, "Result: " + st + " \nyou wish to send it by mail?");
			if (JOptionPane.OK_OPTION == confirmado) {
				dialog1 = new MailDialog(st.toString());
				dialog1.setVisible(true);
				
			}	
			
			
		}
		
		
		
	}
	

}
