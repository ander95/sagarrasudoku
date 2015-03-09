package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Color;

import java.awt.Font;

import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SarrerakoLehioa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SarrerakoLehioa frame = new SarrerakoLehioa();
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
	public SarrerakoLehioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblOngietorria = new JLabel("Ongi etorri Sagarra taldearen Sudokura");
		lblOngietorria.setFont(new Font("EHUSerif", Font.BOLD, 19));
		lblOngietorria.setForeground(new Color(0, 128, 0));

		ButtonGroup zailtasunak = new ButtonGroup();

		final JLabel lblErrorea = new JLabel();
		lblErrorea.setForeground(Color.RED);
		lblErrorea.setFont(new Font("EHUSerif", Font.PLAIN, 12));

		JButton btnJokatu = new JButton("Jokatu");

		btnJokatu.setFont(new Font("EHUSerif", Font.BOLD, 14));

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(16)
										.addComponent(lblOngietorria, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(28)
												.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(22)
												.addComponent(panel, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGap(180)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblErrorea, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnJokatu))))
																.addContainerGap(19, Short.MAX_VALUE))
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(11)
						.addComponent(lblOngietorria, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(30)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(panel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
												.addGap(15)))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblErrorea, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(btnJokatu)
												.addGap(29))
				);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
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
		panel_1.add(lblErabIzena, "2, 2");
		lblErabIzena.setFont(new Font("EHUSerif", Font.BOLD, 14));

		textField = new JTextField();
		panel_1.add(textField, "4, 2");
		textField.setFont(new Font("EHUSerif", Font.PLAIN, 14));
		textField.setColumns(10);



		JLabel lblPasahitza = new JLabel("Pasahitza:");
		panel_1.add(lblPasahitza, "2, 4");
		lblPasahitza.setFont(new Font("EHUSerif", Font.BOLD, 14));

		passwordField = new JPasswordField();
		panel_1.add(passwordField, "4, 4");
		passwordField.setFont(new Font("EHUSerif", Font.PLAIN, 14));
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		final JRadioButton rdbtnErraza = new JRadioButton("Erraza");
		panel.add(rdbtnErraza, "2, 2");
		rdbtnErraza.setFont(new Font("EHUSerif", Font.BOLD, 14));
		rdbtnErraza.setForeground(new Color(0, 128, 0));
		zailtasunak.add(rdbtnErraza);

		final JRadioButton rdbtnErdikoa = new JRadioButton("Erdikoa");
		panel.add(rdbtnErdikoa, "2, 4");
		rdbtnErdikoa.setFont(new Font("EHUSerif", Font.BOLD, 14));
		rdbtnErdikoa.setForeground(new Color(255, 215, 0));
		zailtasunak.add(rdbtnErdikoa);

		final JRadioButton rdbtnZaila = new JRadioButton("Zaila");
		panel.add(rdbtnZaila, "2, 6");
		rdbtnZaila.setFont(new Font("EHUSerif", Font.BOLD, 14));
		rdbtnZaila.setForeground(new Color(255, 0, 0));
		zailtasunak.add(rdbtnZaila);
		contentPane.setLayout(gl_contentPane);

		btnJokatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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

					if (rdbtnErraza.isSelected()) { // RadiButtonak aukeratutako zailatsuna ikusiko da eta bakoitzak bere funtzioa izango du
						System.out.println(textField.getText()+" erabiltzaileak partida Errazean hasi du"); //Proba
					} else if (rdbtnErdikoa.isSelected()) {
						System.out.println(textField.getText()+" erabiltzaileak partida Ertainean hasi du"); //Proba
					} else if (rdbtnZaila.isSelected()) {
						System.out.println(textField.getText()+" erabiltzaileak partida Zailean hasi du"); //Proba
					} else {
						lblErrorea.setText("Zailtasuna aukeratu gabe");
					}
				}

			}
		});

	}
}
