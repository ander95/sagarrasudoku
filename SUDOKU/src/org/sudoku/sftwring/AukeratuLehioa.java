package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSplitPane;

public class AukeratuLehioa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	ButtonGroup zailtasunak;
	JRadioButton rdbtnErraza;
	JRadioButton rdbtnErdikoa;
	JRadioButton rdbtnZaila;
	private JLabel lblZailtasuna;
	private JPanel panel;
	private JLabel lblSudokuGordeta;
	private JButton btnSudokuBerria;
	private JButton btnJokatu;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AukeratuLehioa frame = new AukeratuLehioa();
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
	public AukeratuLehioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel zailtasunakPanel = new JPanel();
		
		panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(15)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(zailtasunakPanel, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(43, Short.MAX_VALUE)
					.addComponent(zailtasunakPanel, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		
		lblSudokuGordeta = new JLabel("");
		lblSudokuGordeta.setForeground(new Color(139, 0, 139));
		lblSudokuGordeta.setFont(new Font("EHUSerif", Font.BOLD, 16));
		
		btnJokatu = new JButton("Jokatu");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(66)
					.addComponent(btnJokatu)
					.addContainerGap(24, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(lblSudokuGordeta, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSudokuGordeta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
					.addComponent(btnJokatu)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		zailtasunak = new ButtonGroup();
		
		lblZailtasuna = new JLabel("Zailtasuna:");
		lblZailtasuna.setFont(new Font("EHUSerif", Font.BOLD, 16));
		
		rdbtnErraza = new JRadioButton("Erraza");
		rdbtnErraza.setFont(new Font("EHUSerif", Font.BOLD, 14));
		rdbtnErraza.setForeground(new Color(0, 128, 0));
		zailtasunak.add(rdbtnErraza);
		
		rdbtnErdikoa = new JRadioButton("Erdikoa");
		rdbtnErdikoa.setForeground(new Color(255, 215, 0));
		rdbtnErdikoa.setFont(new Font("EHUSerif", Font.BOLD, 14));
		zailtasunak.add(rdbtnErdikoa);
		
		rdbtnZaila = new JRadioButton("Zaila");
		rdbtnZaila.setFont(new Font("EHUSerif", Font.BOLD, 14));
		rdbtnZaila.setForeground(new Color(255, 0, 0));
		zailtasunak.add(rdbtnZaila);
		
		btnSudokuBerria = new JButton("Sudoku Berria");
		GroupLayout gl_zailtasunakPanel = new GroupLayout(zailtasunakPanel);
		gl_zailtasunakPanel.setHorizontalGroup(
			gl_zailtasunakPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_zailtasunakPanel.createSequentialGroup()
					.addGroup(gl_zailtasunakPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_zailtasunakPanel.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_zailtasunakPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnErraza, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnErdikoa, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnZaila, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_zailtasunakPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblZailtasuna))
						.addGroup(gl_zailtasunakPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSudokuBerria)))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_zailtasunakPanel.setVerticalGroup(
			gl_zailtasunakPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_zailtasunakPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblZailtasuna)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnErraza)
					.addGap(7)
					.addComponent(rdbtnErdikoa)
					.addGap(7)
					.addComponent(rdbtnZaila)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(btnSudokuBerria)
					.addContainerGap())
		);
		zailtasunakPanel.setLayout(gl_zailtasunakPanel);
	}
}
