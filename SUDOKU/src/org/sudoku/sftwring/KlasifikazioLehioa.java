package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.AbstractListModel;

public class KlasifikazioLehioa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private static KlasifikazioLehioa frame;
	private static Erabiltzaile erabiltzailea;
	
	public static void main(final Erabiltzaile erab) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new KlasifikazioLehioa();
					frame.setVisible(true);
					frame.setResizable(false);
					erabiltzailea = erab;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private JList<String> KlasifikazioaList;
	private JButton btnHasiera;
	private JList<String> egunekoKlasList;
	
	public KlasifikazioLehioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
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
			gl_KlasifikazioPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_KlasifikazioPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_KlasifikazioPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(Klasifikazioalabel)
						.addComponent(klasifikazioaScrollPane, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_KlasifikazioPanel.setVerticalGroup(
			gl_KlasifikazioPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_KlasifikazioPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(Klasifikazioalabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(klasifikazioaScrollPane, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		AbstractListModel<String> model = lortuKlasifikazioarenModeloa(ErabiltzaileLista.getErabiltzaileLista().getKlasifikazioa());
		KlasifikazioaList = new JList<String>(model);
		klasifikazioaScrollPane.setViewportView(KlasifikazioaList);
		KlasifikazioPanel.setLayout(gl_KlasifikazioPanel);
		
		btnHasiera = new JButton("Hasierako Menua");
		btnHasiera.addActionListener(new Kudeatzailea());
		
		JLabel lblErabInfo = new JLabel(erabiltzailea.getIzen()+" - "+erabiltzailea.getPuntuazioa()+" puntu");
		lblErabInfo.setForeground(new Color(128, 0, 128));
		lblErabInfo.setFont(new Font("EHUSerif", Font.BOLD, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblErabInfo, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
						.addComponent(EgunekoKasPanel, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(KlasifikazioPanel, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(333, Short.MAX_VALUE)
					.addComponent(btnHasiera)
					.addGap(299))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblErabInfo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(EgunekoKasPanel, 0, 0, Short.MAX_VALUE))
						.addComponent(KlasifikazioPanel, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addComponent(btnHasiera)
					.addGap(72))
		);
		
		JLabel lblEgunekoKlasifikazioa = new JLabel("Eguneko Klasifikazioa");
		lblEgunekoKlasifikazioa.setFont(new Font("EHUSerif", Font.BOLD, 18));
		lblEgunekoKlasifikazioa.setForeground(new Color(128, 128, 0));
		
		JScrollPane egunekoKlasScrollPane = new JScrollPane();
		GroupLayout gl_EgunekoKasPanel = new GroupLayout(EgunekoKasPanel);
		gl_EgunekoKasPanel.setHorizontalGroup(
			gl_EgunekoKasPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
					.addGroup(gl_EgunekoKasPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEgunekoKlasifikazioa)
						.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(egunekoKlasScrollPane, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		gl_EgunekoKasPanel.setVerticalGroup(
			gl_EgunekoKasPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_EgunekoKasPanel.createSequentialGroup()
					.addGap(6)
					.addComponent(lblEgunekoKlasifikazioa, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(egunekoKlasScrollPane, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		
		AbstractListModel<String> modelEgun = lortuKlasifikazioarenModeloa(ErabiltzaileLista.getErabiltzaileLista().getEgunekoKlasifikazioa());
		egunekoKlasList = new JList<String>(modelEgun);
		
		egunekoKlasScrollPane.setViewportView(egunekoKlasList);
		EgunekoKasPanel.setLayout(gl_EgunekoKasPanel);
		contentPane.setLayout(gl_contentPane);
	}
	
	private DefaultListModel<String> lortuKlasifikazioarenModeloa(Klasifikazioa klasf) {
		//Aurre: klasf!=null
		//Post: sarrerako klasifikazioak dituen erabiltzaile guztiak hartu eta pantailaratzeko eran jarriko ditu:
		//int(zenbatgarrena). erabiltzaile_izena - puntuazioa p.
		DefaultListModel<String> model = new DefaultListModel<String>();
		int index = 0;
		for (Erabiltzaile erab : klasf.erabiltzaileenListaKlasifikatorian()) {
			model.add(index, index+". "+erab.getIzen()+" - "+erab.getPuntuazioa()+" p.");
		}
		return model;
	}
	
	private class Kudeatzailea extends WindowAdapter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//Aurre: objetuari lotutako akzioa egitea
			//Post : AukeratuLehioa zabalduko du eta hau zarratu
			frame.setVisible(false);
			frame.remove(frame);
			AukeratuLehioa.ikustarazi();
		}
		
	}
}
