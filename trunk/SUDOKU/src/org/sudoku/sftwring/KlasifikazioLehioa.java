package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class KlasifikazioLehioa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KlasifikazioLehioa frame = new KlasifikazioLehioa();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JList KlasifikazioaList;
	JButton btnHasiera;
	JList egunekoKlasList;
	
	public KlasifikazioLehioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel EgunekoKasPanel = new JPanel();
		
		JPanel KlasifikazioPanel = new JPanel();
		
		JLabel Klasifikazioalabel = new JLabel("Klasifikazioa");
		Klasifikazioalabel.setForeground(new Color(0, 100, 0));
		Klasifikazioalabel.setFont(new Font("EHUSerif", Font.BOLD, 18));
		
		JScrollPane klasifikazioaScrollPane = new JScrollPane();
		GroupLayout gl_KlasifikazioPanel = new GroupLayout(KlasifikazioPanel);
		gl_KlasifikazioPanel.setHorizontalGroup(
			gl_KlasifikazioPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_KlasifikazioPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_KlasifikazioPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(klasifikazioaScrollPane, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
						.addComponent(Klasifikazioalabel))
					.addContainerGap())
		);
		gl_KlasifikazioPanel.setVerticalGroup(
			gl_KlasifikazioPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_KlasifikazioPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(Klasifikazioalabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(klasifikazioaScrollPane, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		
		KlasifikazioaList = new JList();
		klasifikazioaScrollPane.setViewportView(KlasifikazioaList);
		KlasifikazioPanel.setLayout(gl_KlasifikazioPanel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(EgunekoKasPanel, GroupLayout.PREFERRED_SIZE, 223, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(KlasifikazioPanel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(EgunekoKasPanel, GroupLayout.PREFERRED_SIZE, 278, Short.MAX_VALUE)
						.addComponent(KlasifikazioPanel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JLabel lblEgunekoKlasifikazioa = new JLabel("Eguneko Klasifikazioa");
		lblEgunekoKlasifikazioa.setFont(new Font("EHUSerif", Font.BOLD, 18));
		lblEgunekoKlasifikazioa.setForeground(new Color(128, 128, 0));
		
		JScrollPane egunekoKlasScrollPane = new JScrollPane();
		
		btnHasiera = new JButton("Hasierako Menua");
		GroupLayout gl_EgunekoKasPanel = new GroupLayout(EgunekoKasPanel);
		gl_EgunekoKasPanel.setHorizontalGroup(
			gl_EgunekoKasPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
					.addGroup(gl_EgunekoKasPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEgunekoKlasifikazioa)
						.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(egunekoKlasScrollPane, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
					.addContainerGap(53, Short.MAX_VALUE)
					.addComponent(btnHasiera)
					.addContainerGap())
		);
		gl_EgunekoKasPanel.setVerticalGroup(
			gl_EgunekoKasPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(lblEgunekoKlasifikazioa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(egunekoKlasScrollPane, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnHasiera)
					.addGap(16))
		);
		
		egunekoKlasList = new JList();
		egunekoKlasScrollPane.setViewportView(egunekoKlasList);
		EgunekoKasPanel.setLayout(gl_EgunekoKasPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
