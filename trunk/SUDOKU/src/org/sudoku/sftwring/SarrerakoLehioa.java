package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Font;

import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;

public class SarrerakoLehioa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private static SarrerakoLehioa frame = new SarrerakoLehioa();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel lblOngietorria;
	final JLabel lblErrorea;
	final JButton btnSartu;
	JPanel loginPanel;
	JLabel lblErregistratu;
	
	public SarrerakoLehioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		lblOngietorria = new JLabel("Ongi etorri Sagarra taldearen Sudokura");
		lblOngietorria.setFont(new Font("EHUSerif", Font.BOLD, 19));
		lblOngietorria.setForeground(new Color(0, 128, 0));

		

		lblErrorea = new JLabel();
		lblErrorea.setForeground(Color.RED);
		lblErrorea.setFont(new Font("EHUSerif", Font.PLAIN, 12));

		btnSartu = new JButton("Sartu");

		btnSartu.setFont(new Font("EHUSerif", Font.BOLD, 14));

		loginPanel = new JPanel();

		lblErregistratu = new JLabel("Erregistratu");
		lblErregistratu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { //Errejistroa egiteko linka
				frame.setVisible(false);
				String[] args = new String[1];
				ErregistroLehioa.main(args);
			}
		});
		lblErregistratu.setFont(new Font("EHUSerif", Font.ITALIC, 14));
		lblErregistratu.setForeground(Color.BLUE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(lblOngietorria, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(168)
									.addComponent(btnSartu))
								.addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblErregistratu))))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(176, Short.MAX_VALUE)
					.addComponent(lblErrorea, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
					.addGap(60))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(lblOngietorria, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(loginPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblErrorea, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSartu)
					.addGap(24)
					.addComponent(lblErregistratu)
					.addGap(28))
		);
		loginPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		JLabel lblErabIzena = new JLabel("Erabiltzaile izena:");
		loginPanel.add(lblErabIzena, "2, 2");
		lblErabIzena.setFont(new Font("EHUSerif", Font.BOLD, 14));

		textField = new JTextField();
		loginPanel.add(textField, "4, 2");
		textField.setFont(new Font("EHUSerif", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.addKeyListener(new Kudeatzailea());



		JLabel lblPasahitza = new JLabel("Pasahitza:");
		loginPanel.add(lblPasahitza, "2, 4");
		lblPasahitza.setFont(new Font("EHUSerif", Font.BOLD, 14));

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new Kudeatzailea());
		loginPanel.add(passwordField, "4, 4");
		passwordField.setFont(new Font("EHUSerif", Font.PLAIN, 14));
		contentPane.setLayout(gl_contentPane);

		btnSartu.addActionListener(new Kudeatzailea());

	}
	private class Kudeatzailea extends WindowAdapter implements ActionListener, KeyListener {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {
			if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				login();
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		private void login() {
			//Aurre: Botoia sakatuko zaio.
			//Post: Botoia sakatzean izena eta pasahitza ondo dauden begiratu, txarto egon ezkero
			//errore mezua emango du, ondo daudenean berriz zailtasuna begiratuko du eta hauetatik 
			//bat aukeratuta badago honen inguruan egingo du sudokua eta ez badago bat ere aukeratuta
			//errore mezua itzuliko du.
			boolean izenaKonprob = textField.getText().equals("erab"); //Proba egiteko erabiltzaile izen bat jartzen dot gero erabiltzaile zerrendan begiratuko da
			boolean pasahitzKonprob = false;//Proba egiteko gero erabiltzailearen
			char[] nirePasahitza="12345".toCharArray(); //pasahitzarekin konparatuko da
			if (passwordField.getPassword().length == nirePasahitza.length) {
				for (int i = 0; i < passwordField.getPassword().length; i++) {
					pasahitzKonprob = passwordField.getPassword()[i]==nirePasahitza[i]; 
				}
			}
			if (!izenaKonprob && pasahitzKonprob) {
				lblErrorea.setText("Erabiltzaile izena okerra");
			} else if (izenaKonprob && !pasahitzKonprob) {
				lblErrorea.setText("Pasahitza okerra");
			} else if (!izenaKonprob && !pasahitzKonprob) {
				lblErrorea.setText("Erabiltzaile izena eta pasahitza okerrak");
			} else {
				lblErrorea.setText("");
			}
		}
		
	}
	public static void ikustarazi() {
		frame.setVisible(true);
	}
}

