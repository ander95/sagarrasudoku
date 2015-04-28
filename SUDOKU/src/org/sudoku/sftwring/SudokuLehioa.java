package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;




public class SudokuLehioa{
	private Sudokua unekoSudoku;
	private static Erabiltzaile erabiltzailea;
	private JFrame frmSudokua;
	private JTextField[][] txtFMatrix;
	private JMenuBar menuBar;
	private JMenu mnOpzioak;
	private JMenuItem mntmGorde;
	private JMenuItem mntmLaguntza;
	private JMenuItem mntmZailtazunaAldatu;
	private JMenuItem mntmZuzendu;

	private static boolean sudokuBerria;
	/**
	 * Launch the application.
	 */
	public static void main(final Erabiltzaile erab, final boolean berria) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					erabiltzailea = erab;
					sudokuBerria = berria;
					SudokuLehioa window = new SudokuLehioa(erab);
					window.frmSudokua.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SudokuLehioa(final Erabiltzaile erab) {

		initialize(erab);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final Erabiltzaile erab) {			
		frmSudokua = new JFrame();
		frmSudokua.setTitle("SUDOKUA");
		frmSudokua.setBounds(100, 100, 700, 619);
		//frmSudokua.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSudokua.addWindowListener(new WindowListener() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//baiEz.setVisible(true);
				Object[] opzioak={"Bai","Ez", "Ezeztatu"};
				int baiEz = JOptionPane.showOptionDialog(
						frmSudokua, "Irten aurretik sudokua gorde nahi duzu?","Abisua", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opzioak,null);

				if (JOptionPane.OK_OPTION == baiEz){
					//erabiltzaileak sudokua gorde
					erab.setSudoku(unekoSudoku);
					ErabiltzaileLista.getErabiltzaileLista().gorde();

				}else if(JOptionPane.CANCEL_OPTION==baiEz){
					erabiltzailea.setSudoku(new Sudokua());
					SudokuLehioa.main(erabiltzailea, false);
				}
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
			}
		});
		menuBar = new JMenuBar();
		frmSudokua.setJMenuBar(menuBar);

		mnOpzioak = new JMenu("Opzioak");
		menuBar.add(mnOpzioak);

		mntmGorde = new JMenuItem("Gorde");
		mnOpzioak.add(mntmGorde);
		mntmGorde.addActionListener(new AbstractAction() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//gorde
				Object[] opzioak={"Jolasten jarraitu","Sudokutik irten"};
				erab.setSudoku(unekoSudoku);
				int baiEz = JOptionPane.showOptionDialog(
						frmSudokua, "Sudokua ondo gorde da!","Abisua", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opzioak,null);

				if (JOptionPane.NO_OPTION == baiEz){
					//Sudokua itxi egingo da
					frmSudokua.dispose();
				} 
			}
		});

		mntmZailtazunaAldatu = new JMenuItem("Zailtazuna aldatu");
		mnOpzioak.add(mntmZailtazunaAldatu);
		mntmZailtazunaAldatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Zailtasuna aldatzeko aukera pantailaratu
				Object[] opzioak={"Bai","Ez"};
				int baiEz = JOptionPane.showOptionDialog(
						frmSudokua, "Zihur zailtasuna aldatu nahi duzula?\n(Zailtasuna aldatzen baduzu zailtasun handiagoko sudoku bat bakarrik aukeratu ahalko duzu)","Abisua", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,opzioak,null);

				if (JOptionPane.OK_OPTION == baiEz){
					//Zailtasuna aukeratzeko ahukera
					int zailtasuna=2;
					if(zailtasuna==2){
						Object[] opzioak2={"Zaila"};
						JOptionPane.showOptionDialog(
								frmSudokua, "Autatu aukera","Abisua", JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,opzioak2,null);	
					}
					else if(zailtasuna==1){
						Object[] opzioak2={"Zaila"};
						JOptionPane.showOptionDialog(
								frmSudokua, "Autatu aukera","Abisua", JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,opzioak2,null);
					}
					else if(zailtasuna==0){
						Object[] opzioak2={"Erdikoa","Zaila"};
						JOptionPane.showOptionDialog(
								frmSudokua, "Autatu aukera","Abisua", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,opzioak2,null);
					}

				} 
			}
		});


		mntmZuzendu = new JMenuItem("Zuzendu");
		mnOpzioak.add(mntmZuzendu);
		mntmZuzendu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Zihur zuzendu nahi duzula?Bai/Ez...
				Object[] opzioak={"Bai","Ez"};
				int baiEz = JOptionPane.showOptionDialog(
						frmSudokua, "Zihur zuzendu nahi duzula?\n(Zuzentzen baduzu ezingo duzu sudokua egiten jarraitu)","Abisua", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,opzioak,null);

				if (JOptionPane.OK_OPTION == baiEz){
					//erabiltzailearen sudokua zuzendu
				} 
			}
		});

		mntmLaguntza = new JMenuItem("Laguntza");
		menuBar.add(mntmLaguntza);
		JPanel panel=new Panel("icon2.png");
		mntmLaguntza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object[] opzioak={"Laguntza","Ez dut behar laguntzarik"};
				int baiEz = JOptionPane.showOptionDialog(
						frmSudokua,"Zihur Laguntza behar duzula?\n(Laguntza eskatzeak puntuak kentzen ditu)","Abisua", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE,null,opzioak,null);

				if (JOptionPane.OK_OPTION == baiEz){
					//Laguntza eskaini
				} 
			}
		});
		frmSudokua.setContentPane(panel);

		frmSudokua.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),
				ColumnSpec.decode("default:grow"),},
				new RowSpec[] {
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),
				RowSpec.decode("default:grow"),}));

		txtFMatrix = new JTextField[9][9];

		int zutabe = 1;
		int lerro = 1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				txtFMatrix[i][j] = new JTextField();
				txtFMatrix[i][j].setFont(new Font("EHUSerif", Font.BOLD, 40));
				txtFMatrix[i][j].setHorizontalAlignment(SwingConstants.CENTER);
				txtFMatrix[i][j].addKeyListener(new Kudeatzailea(txtFMatrix[i][j]));
				txtFMatrix[i][j].setColumns(1);
				frmSudokua.getContentPane().add(txtFMatrix[i][j], (""+zutabe+", "+lerro+", fill, fill"));
				txtFMatrix[i][j].setColumns(1);
				if (zutabe!=13) {
					if (zutabe==3||zutabe==8) zutabe = zutabe + 3;
					else zutabe++;
				} else zutabe = 1;
			}
			if (lerro!=13) {
				if (lerro==3||lerro==8) lerro = lerro + 3;
				else lerro++;
			} else lerro = 1;
		}

		if (sudokuBerria==true) {
			Sudokua pSudo=new Sudokua();
			pSudo.ausazBete();
			this.kargatu(pSudo);
		} else {
			this.kargatu(erabiltzailea.getSudoku());
		}

	}


	private class Kudeatzailea extends WindowAdapter implements ActionListener,KeyListener {

		JTextField txt;
		public Kudeatzailea(JTextField pTxt){
			txt=pTxt;
			txt.setOpaque(false);
		}
		@Override
		public void keyPressed(KeyEvent e) {
			if(!(e.getKeyChar()<'1' || e.getKeyChar()>'9')) e.consume();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			char caracter = e.getKeyChar();
			// Verificar si la tecla pulsada no es un digito
			if(((caracter < '1') ||(caracter > '9')) &&(caracter != '\b' /*corresponde a BACK_SPACE*/))
			{
				e.consume();  // ignorar el evento de teclado
			}
			if(txt.getText().length()==1 && txt.isEditable()){txt.setText("");}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	private void kargatu(Sudokua pSudo){
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				Kasila kas = pSudo.getKasila(i, j);
				if (kas.getBalioZuzena()!=0 && kas.getFinkoa()) {
					txtFMatrix[i][j].setText(""+kas.getBalioZuzena());
					txtFMatrix[i][j].setForeground(Color.BLUE);
					txtFMatrix[i][j].setEditable(false);
				}
				if (kas.getErabiltzaileBal()!=0) txtFMatrix[i][j].setText(""+kas.getBalioZuzena());
			}
		}
	}
	
//	private void gorde() {
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				Kasila kas;
//				if (!txtFMatrix[i][j].isEditable()) {
//					kas = new Kasila(Integer.getInteger(txtFMatrix[i][j].getText()));
//				}
//			}
//		}
//	}

}
