package org.sudoku.sftwring;

import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
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
	private JTextField textField_00;
	private JTextField textField_01;
	private JTextField textField_02;
	private JTextField textField_03;
	private JTextField textField_04;
	private JTextField textField_05;
	private JTextField textField_06;
	private JTextField textField_07;
	private JTextField textField_08;
	private JTextField textField_10f;
	private JTextField textField_20f;
	private JTextField textField_30f;
	private JTextField textField_40f;
	private JTextField textField_50f;
	private JTextField textField_60f;
	private JTextField textField_70f;
	private JTextField textField_80f;
	private JTextField textField_11f;
	private JTextField textField_12f;
	private JTextField textField_13f;
	private JTextField textField_14f;
	private JTextField textField_15f;
	private JTextField textField_21f;
	private JTextField textField_31f;
	private JTextField textField_41f;
	private JTextField textField_51f;
	private JTextField textField_61f;
	private JTextField textField_71f;
	private JTextField textField_81f;
	private JTextField textField_22f;
	private JTextField textField_32f;
	private JTextField textField_42f;
	private JTextField textField_52f;
	private JTextField textField_62f;
	private JTextField textField_72f;
	private JTextField textField_82f;
	private JTextField textField_23f;
	private JTextField textField_33f;
	private JTextField textField_43f;
	private JTextField textField_53f;
	private JTextField textField_63f;
	private JTextField textField_73f;
	private JTextField textField_83f;
	private JTextField textField_24f;
	private JTextField textField_34f;
	private JTextField textField_44f;
	private JTextField textField_54f;
	private JTextField textField_64f;
	private JTextField textField_74f;
	private JTextField textField_84f;
	private JTextField textField_25f;
	private JTextField textField_35f;
	private JTextField textField_45f;
	private JTextField textField_55f;
	private JTextField textField_65f;
	private JTextField textField_75f;
	private JTextField textField_85f;
	private JTextField textField_16f;
	private JTextField textField_26f;
	private JTextField textField_36f;
	private JTextField textField_46f;
	private JTextField textField_56f;
	private JTextField textField_66f;
	private JTextField textField_76f;
	private JTextField textField_86f;
	private JTextField textField_17f;
	private JTextField textField_27f;
	private JTextField textField_37f;
	private JTextField textField_47f;
	private JTextField textField_57f;
	private JTextField textField_67f;
	private JTextField textField_77f;
	private JTextField textField_87f;
	private JTextField textField_18f;
	private JTextField textField_28f;
	private JTextField textField_38f;
	private JTextField textField_48f;
	private JTextField textField_58f;
	private JTextField textField_68f;
	private JTextField textField_78f;
	private JTextField textField_88f;
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
					SudokuLehioa window = new SudokuLehioa();
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
	public SudokuLehioa() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmSudokua = new JFrame();
		frmSudokua.setTitle("SUDOKUA");
		frmSudokua.setBounds(100, 100, 700, 619);
		frmSudokua.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
			}
		});

		mntmZailtazunaAldatu = new JMenuItem("Zailtazuna aldatu");
		mnOpzioak.add(mntmZailtazunaAldatu);

		mntmZuzendu = new JMenuItem("Zuzendu");
		mnOpzioak.add(mntmZuzendu);

		mntmLaguntza = new JMenuItem("Laguntza");
		menuBar.add(mntmLaguntza);
		JPanel panel=new Panel("icon2.png");
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

		textField_00 = new JTextField();
		textField_00.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_00.setHorizontalAlignment(SwingConstants.CENTER);
		textField_00.addKeyListener(new Kudeatzailea(textField_00));
		frmSudokua.getContentPane().add(textField_00, "1, 1, fill, fill");
		textField_00.setColumns(1);

		textField_01 = new JTextField(1);
		textField_01.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_01.setHorizontalAlignment(SwingConstants.CENTER);
		textField_01.addKeyListener(new Kudeatzailea(textField_01));
		textField_01.setOpaque(false);
		frmSudokua.getContentPane().add(textField_01, "2, 1, fill, fill");
		textField_01.setColumns(10);

		textField_02 = new JTextField();
		textField_02.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_02.setHorizontalAlignment(SwingConstants.CENTER);
		textField_02.addKeyListener(new Kudeatzailea(textField_02));
		frmSudokua.getContentPane().add(textField_02, "3, 1, fill, fill");
		textField_02.setColumns(10);

		textField_03 = new JTextField();
		textField_03.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_03.setHorizontalAlignment(SwingConstants.CENTER);
		textField_03.addKeyListener(new Kudeatzailea(textField_03));
		frmSudokua.getContentPane().add(textField_03, "6, 1, fill, fill");
		textField_03.setColumns(10);

		textField_04 = new JTextField();
		textField_04.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_04.setHorizontalAlignment(SwingConstants.CENTER);
		textField_04.addKeyListener(new Kudeatzailea(textField_04));
		frmSudokua.getContentPane().add(textField_04, "7, 1, fill, fill");
		textField_04.setColumns(10);

		textField_05 = new JTextField();
		textField_05.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_05.setHorizontalAlignment(SwingConstants.CENTER);
		textField_05.addKeyListener(new Kudeatzailea(textField_05));
		frmSudokua.getContentPane().add(textField_05, "8, 1, fill, fill");
		textField_05.setColumns(10);

		textField_06 = new JTextField();
		textField_06.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_06.setHorizontalAlignment(SwingConstants.CENTER);
		textField_06.addKeyListener(new Kudeatzailea(textField_06));
		frmSudokua.getContentPane().add(textField_06, "11, 1, fill, fill");
		textField_06.setColumns(10);

		textField_07 = new JTextField();
		textField_07.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_07.setHorizontalAlignment(SwingConstants.CENTER);
		textField_07.addKeyListener(new Kudeatzailea(textField_07));
		frmSudokua.getContentPane().add(textField_07, "12, 1, fill, fill");
		textField_07.setColumns(10);

		textField_08 = new JTextField();
		textField_08.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_08.setHorizontalAlignment(SwingConstants.CENTER);
		textField_08.addKeyListener(new Kudeatzailea(textField_08));
		frmSudokua.getContentPane().add(textField_08, "13, 1, fill, fill");
		textField_08.setColumns(10);

		textField_10f = new JTextField();
		textField_10f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_10f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10f.addKeyListener(new Kudeatzailea(textField_10f));
		frmSudokua.getContentPane().add(textField_10f, "1, 2, fill, fill");
		textField_10f.setColumns(10);

		textField_11f = new JTextField();
		textField_11f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_11f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11f.addKeyListener(new Kudeatzailea(textField_11f));
		frmSudokua.getContentPane().add(textField_11f, "2, 2, fill, fill");
		textField_11f.setColumns(10);

		textField_12f = new JTextField();
		textField_12f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_12f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12f.addKeyListener(new Kudeatzailea(textField_12f));
		frmSudokua.getContentPane().add(textField_12f, "3, 2, fill, fill");
		textField_12f.setColumns(10);

		textField_13f = new JTextField();
		textField_13f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_13f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13f.addKeyListener(new Kudeatzailea(textField_13f));
		frmSudokua.getContentPane().add(textField_13f, "6, 2, fill, fill");
		textField_13f.setColumns(10);

		textField_14f = new JTextField();
		textField_14f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_14f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14f.addKeyListener(new Kudeatzailea(textField_14f));
		frmSudokua.getContentPane().add(textField_14f, "7, 2, fill, fill");
		textField_14f.setColumns(10);

		textField_15f = new JTextField();
		textField_15f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_15f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15f.addKeyListener(new Kudeatzailea(textField_15f));
		frmSudokua.getContentPane().add(textField_15f, "8, 2, fill, fill");
		textField_15f.setColumns(10);

		textField_16f = new JTextField();
		textField_16f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_16f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16f.addKeyListener(new Kudeatzailea(textField_16f));
		frmSudokua.getContentPane().add(textField_16f, "11, 2, fill, fill");
		textField_16f.setColumns(10);

		textField_17f = new JTextField();
		textField_17f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_17f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17f.addKeyListener(new Kudeatzailea(textField_17f));
		frmSudokua.getContentPane().add(textField_17f, "12, 2, fill, fill");
		textField_17f.setColumns(10);

		textField_18f = new JTextField();
		textField_18f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_18f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18f.setColumns(10);
		textField_18f.addKeyListener(new Kudeatzailea(textField_18f));
		frmSudokua.getContentPane().add(textField_18f, "13, 2, fill, fill");

		textField_20f = new JTextField();
		textField_20f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_20f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20f.addKeyListener(new Kudeatzailea(textField_20f));
		frmSudokua.getContentPane().add(textField_20f, "1, 3, fill, fill");
		textField_20f.setColumns(10);

		textField_21f = new JTextField();
		textField_21f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_21f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21f.addKeyListener(new Kudeatzailea(textField_21f));
		frmSudokua.getContentPane().add(textField_21f, "2, 3, fill, fill");
		textField_21f.setColumns(10);

		textField_22f = new JTextField();
		textField_22f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_22f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22f.addKeyListener(new Kudeatzailea(textField_22f));
		frmSudokua.getContentPane().add(textField_22f, "3, 3, fill, fill");
		textField_22f.setColumns(10);

		textField_23f = new JTextField();
		textField_23f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_23f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23f.addKeyListener(new Kudeatzailea(textField_23f));
		frmSudokua.getContentPane().add(textField_23f, "6, 3, fill, fill");
		textField_23f.setColumns(10);

		textField_24f = new JTextField();
		textField_24f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_24f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24f.addKeyListener(new Kudeatzailea(textField_24f));
		frmSudokua.getContentPane().add(textField_24f, "7, 3, fill, fill");
		textField_24f.setColumns(10);

		textField_25f = new JTextField();
		textField_25f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_25f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25f.addKeyListener(new Kudeatzailea(textField_25f));
		frmSudokua.getContentPane().add(textField_25f, "8, 3, fill, fill");
		textField_25f.setColumns(10);

		textField_26f = new JTextField();
		textField_26f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_26f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26f.addKeyListener(new Kudeatzailea(textField_26f));
		frmSudokua.getContentPane().add(textField_26f, "11, 3, fill, fill");
		textField_26f.setColumns(10);

		textField_27f = new JTextField();
		textField_27f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_27f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27f.addKeyListener(new Kudeatzailea(textField_27f));
		frmSudokua.getContentPane().add(textField_27f, "12, 3, fill, fill");
		textField_27f.setColumns(10);

		textField_28f = new JTextField();
		textField_28f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_28f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28f.setColumns(10);
		textField_28f.addKeyListener(new Kudeatzailea(textField_28f));
		frmSudokua.getContentPane().add(textField_28f, "13, 3, fill, fill");

		textField_30f = new JTextField();
		textField_30f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_30f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30f.addKeyListener(new Kudeatzailea(textField_30f));
		frmSudokua.getContentPane().add(textField_30f, "1, 6, fill, fill");
		textField_30f.setColumns(10);

		textField_31f = new JTextField();
		textField_31f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_31f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31f.addKeyListener(new Kudeatzailea(textField_31f));
		frmSudokua.getContentPane().add(textField_31f, "2, 6, fill, fill");
		textField_31f.setColumns(10);

		textField_32f = new JTextField();
		textField_32f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_32f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32f.addKeyListener(new Kudeatzailea(textField_32f));
		frmSudokua.getContentPane().add(textField_32f, "3, 6, fill, fill");
		textField_32f.setColumns(10);

		textField_33f = new JTextField();
		textField_33f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_33f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33f.addKeyListener(new Kudeatzailea(textField_33f));
		frmSudokua.getContentPane().add(textField_33f, "6, 6, fill, fill");
		textField_33f.setColumns(10);

		textField_34f = new JTextField();
		textField_34f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_34f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34f.addKeyListener(new Kudeatzailea(textField_34f));
		frmSudokua.getContentPane().add(textField_34f, "7, 6, fill, fill");
		textField_34f.setColumns(10);

		textField_35f = new JTextField();
		textField_35f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_35f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35f.addKeyListener(new Kudeatzailea(textField_35f));
		frmSudokua.getContentPane().add(textField_35f, "8, 6, fill, fill");
		textField_35f.setColumns(10);

		textField_36f = new JTextField();
		textField_36f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_36f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36f.addKeyListener(new Kudeatzailea(textField_36f));
		frmSudokua.getContentPane().add(textField_36f, "11, 6, fill, fill");
		textField_36f.setColumns(10);

		textField_37f = new JTextField();
		textField_37f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_37f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37f.addKeyListener(new Kudeatzailea(textField_37f));
		frmSudokua.getContentPane().add(textField_37f, "12, 6, fill, fill");
		textField_37f.setColumns(10);

		textField_38f = new JTextField();
		textField_38f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_38f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38f.setColumns(10);
		textField_38f.addKeyListener(new Kudeatzailea(textField_38f));
		frmSudokua.getContentPane().add(textField_38f, "13, 6, fill, fill");

		textField_40f = new JTextField();
		textField_40f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_40f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40f.addKeyListener(new Kudeatzailea(textField_40f));
		frmSudokua.getContentPane().add(textField_40f, "1, 7, fill, fill");
		textField_40f.setColumns(10);

		textField_41f = new JTextField();
		textField_41f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_41f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41f.addKeyListener(new Kudeatzailea(textField_41f));
		frmSudokua.getContentPane().add(textField_41f, "2, 7, fill, fill");
		textField_41f.setColumns(10);

		textField_42f = new JTextField();
		textField_42f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_42f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42f.addKeyListener(new Kudeatzailea(textField_42f));
		frmSudokua.getContentPane().add(textField_42f, "3, 7, fill, fill");
		textField_42f.setColumns(10);

		textField_43f = new JTextField();
		textField_43f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_43f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43f.addKeyListener(new Kudeatzailea(textField_43f));
		frmSudokua.getContentPane().add(textField_43f, "6, 7, fill, fill");
		textField_43f.setColumns(10);

		textField_44f = new JTextField();
		textField_44f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_44f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44f.addKeyListener(new Kudeatzailea(textField_44f));
		frmSudokua.getContentPane().add(textField_44f, "7, 7, fill, fill");
		textField_44f.setColumns(10);

		textField_45f = new JTextField();
		textField_45f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_45f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45f.addKeyListener(new Kudeatzailea(textField_45f));
		frmSudokua.getContentPane().add(textField_45f, "8, 7, fill, fill");
		textField_45f.setColumns(10);

		textField_46f = new JTextField();
		textField_46f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_46f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46f.addKeyListener(new Kudeatzailea(textField_46f));
		frmSudokua.getContentPane().add(textField_46f, "11, 7, fill, fill");
		textField_46f.setColumns(10);

		textField_47f = new JTextField();
		textField_47f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_47f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47f.setColumns(10);
		textField_47f.addKeyListener(new Kudeatzailea(textField_47f));
		frmSudokua.getContentPane().add(textField_47f, "12, 7, fill, fill");

		textField_48f = new JTextField();
		textField_48f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_48f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48f.setColumns(10);
		textField_48f.addKeyListener(new Kudeatzailea(textField_48f));
		frmSudokua.getContentPane().add(textField_48f, "13, 7, fill, fill");

		textField_50f = new JTextField();
		textField_50f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_50f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50f.addKeyListener(new Kudeatzailea(textField_50f));
		frmSudokua.getContentPane().add(textField_50f, "1, 8, fill, fill");
		textField_50f.setColumns(10);

		textField_51f = new JTextField();
		textField_51f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_51f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51f.addKeyListener(new Kudeatzailea(textField_51f));
		frmSudokua.getContentPane().add(textField_51f, "2, 8, fill, fill");
		textField_51f.setColumns(10);

		textField_52f = new JTextField();
		textField_52f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_52f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52f.addKeyListener(new Kudeatzailea(textField_52f));
		frmSudokua.getContentPane().add(textField_52f, "3, 8, fill, fill");
		textField_52f.setColumns(10);

		textField_53f = new JTextField();
		textField_53f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_53f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53f.addKeyListener(new Kudeatzailea(textField_53f));
		frmSudokua.getContentPane().add(textField_53f, "6, 8, fill, fill");
		textField_53f.setColumns(10);

		textField_54f = new JTextField();
		textField_54f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_54f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54f.addKeyListener(new Kudeatzailea(textField_54f));
		frmSudokua.getContentPane().add(textField_54f, "7, 8, fill, fill");
		textField_54f.setColumns(10);

		textField_55f = new JTextField();
		textField_55f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_55f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55f.addKeyListener(new Kudeatzailea(textField_55f));
		frmSudokua.getContentPane().add(textField_55f, "8, 8, fill, fill");
		textField_55f.setColumns(10);

		textField_56f = new JTextField();
		textField_56f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_56f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56f.addKeyListener(new Kudeatzailea(textField_56f));
		frmSudokua.getContentPane().add(textField_56f, "11, 8, fill, fill");
		textField_56f.setColumns(10);

		textField_57f = new JTextField();
		textField_57f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_57f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57f.setColumns(10);
		textField_57f.addKeyListener(new Kudeatzailea(textField_57f));
		frmSudokua.getContentPane().add(textField_57f, "12, 8, fill, fill");

		textField_58f = new JTextField();
		textField_58f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_58f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58f.setColumns(10);
		textField_58f.addKeyListener(new Kudeatzailea(textField_58f));
		frmSudokua.getContentPane().add(textField_58f, "13, 8, fill, fill");

		textField_60f = new JTextField();
		textField_60f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_60f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60f.addKeyListener(new Kudeatzailea(textField_60f));
		frmSudokua.getContentPane().add(textField_60f, "1, 11, fill, fill");
		textField_60f.setColumns(10);

		textField_61f = new JTextField();
		textField_61f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_61f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61f.addKeyListener(new Kudeatzailea(textField_61f));
		frmSudokua.getContentPane().add(textField_61f, "2, 11, fill, fill");
		textField_61f.setColumns(10);

		textField_62f = new JTextField();
		textField_62f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_62f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62f.addKeyListener(new Kudeatzailea(textField_62f));
		frmSudokua.getContentPane().add(textField_62f, "3, 11, fill, fill");
		textField_62f.setColumns(10);

		textField_63f = new JTextField();
		textField_63f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_63f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63f.addKeyListener(new Kudeatzailea(textField_63f));
		frmSudokua.getContentPane().add(textField_63f, "6, 11, fill, fill");
		textField_63f.setColumns(10);

		textField_64f = new JTextField();
		textField_64f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_64f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64f.addKeyListener(new Kudeatzailea(textField_64f));
		frmSudokua.getContentPane().add(textField_64f, "7, 11, fill, fill");
		textField_64f.setColumns(10);

		textField_65f = new JTextField();
		textField_65f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_65f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65f.addKeyListener(new Kudeatzailea(textField_65f));
		frmSudokua.getContentPane().add(textField_65f, "8, 11, fill, fill");
		textField_65f.setColumns(10);

		textField_66f = new JTextField();
		textField_66f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_66f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66f.addKeyListener(new Kudeatzailea(textField_66f));
		frmSudokua.getContentPane().add(textField_66f, "11, 11, fill, fill");
		textField_66f.setColumns(10);

		textField_67f = new JTextField();
		textField_67f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_67f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67f.setColumns(10);
		textField_67f.addKeyListener(new Kudeatzailea(textField_67f));
		frmSudokua.getContentPane().add(textField_67f, "12, 11, fill, fill");

		textField_68f = new JTextField();
		textField_68f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_68f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68f.setColumns(10);
		textField_68f.addKeyListener(new Kudeatzailea(textField_68f));
		frmSudokua.getContentPane().add(textField_68f, "13, 11, fill, fill");

		textField_70f = new JTextField();
		textField_70f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_70f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70f.addKeyListener(new Kudeatzailea(textField_70f));
		frmSudokua.getContentPane().add(textField_70f, "1, 12, fill, fill");
		textField_70f.setColumns(10);

		textField_71f = new JTextField();
		textField_71f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_71f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_71f.addKeyListener(new Kudeatzailea(textField_71f));
		frmSudokua.getContentPane().add(textField_71f, "2, 12, fill, fill");
		textField_71f.setColumns(10);

		textField_72f = new JTextField();
		textField_72f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_72f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72f.addKeyListener(new Kudeatzailea(textField_72f));
		frmSudokua.getContentPane().add(textField_72f, "3, 12, fill, fill");
		textField_72f.setColumns(10);

		textField_73f = new JTextField();
		textField_73f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_73f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_73f.addKeyListener(new Kudeatzailea(textField_73f));
		frmSudokua.getContentPane().add(textField_73f, "6, 12, fill, fill");
		textField_73f.setColumns(10);

		textField_74f = new JTextField();
		textField_74f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_74f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_74f.addKeyListener(new Kudeatzailea(textField_74f));
		frmSudokua.getContentPane().add(textField_74f, "7, 12, fill, fill");
		textField_74f.setColumns(10);

		textField_75f = new JTextField();
		textField_75f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_75f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75f.addKeyListener(new Kudeatzailea(textField_75f));
		frmSudokua.getContentPane().add(textField_75f, "8, 12, fill, fill");
		textField_75f.setColumns(10);

		textField_76f = new JTextField();
		textField_76f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_76f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76f.addKeyListener(new Kudeatzailea(textField_76f));
		frmSudokua.getContentPane().add(textField_76f, "11, 12, fill, fill");
		textField_76f.setColumns(10);

		textField_77f = new JTextField();
		textField_77f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_77f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77f.setColumns(10);
		textField_77f.addKeyListener(new Kudeatzailea(textField_77f));
		frmSudokua.getContentPane().add(textField_77f, "12, 12, fill, fill");

		textField_78f = new JTextField();
		textField_78f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_78f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78f.setColumns(10);
		textField_78f.addKeyListener(new Kudeatzailea(textField_78f));
		frmSudokua.getContentPane().add(textField_78f, "13, 12, fill, fill");

		textField_80f = new JTextField();
		textField_80f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_80f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80f.addKeyListener(new Kudeatzailea(textField_80f));
		frmSudokua.getContentPane().add(textField_80f, "1, 13, fill, fill");
		textField_80f.setColumns(10);

		textField_81f = new JTextField();
		textField_81f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_81f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_81f.addKeyListener(new Kudeatzailea(textField_81f));
		frmSudokua.getContentPane().add(textField_81f, "2, 13, fill, fill");
		textField_81f.setColumns(10);

		textField_82f = new JTextField();
		textField_82f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_82f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_82f.addKeyListener(new Kudeatzailea(textField_82f));
		frmSudokua.getContentPane().add(textField_82f, "3, 13, fill, fill");
		textField_82f.setColumns(10);

		textField_83f = new JTextField();
		textField_83f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_83f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_83f.addKeyListener(new Kudeatzailea(textField_83f));
		frmSudokua.getContentPane().add(textField_83f, "6, 13, fill, fill");
		textField_83f.setColumns(10);

		textField_84f = new JTextField();
		textField_84f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_84f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_84f.addKeyListener(new Kudeatzailea(textField_84f));
		frmSudokua.getContentPane().add(textField_84f, "7, 13, fill, fill");
		textField_84f.setColumns(10);

		textField_85f = new JTextField();
		textField_85f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_85f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_85f.addKeyListener(new Kudeatzailea(textField_85f));
		frmSudokua.getContentPane().add(textField_85f, "8, 13, fill, fill");
		textField_85f.setColumns(10);

		textField_86f = new JTextField();
		textField_86f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_86f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_86f.addKeyListener(new Kudeatzailea(textField_86f));
		frmSudokua.getContentPane().add(textField_86f, "11, 13, fill, fill");
		textField_86f.setColumns(10);

		textField_87f = new JTextField();
		textField_87f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_87f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_87f.setColumns(10);
		textField_87f.addKeyListener(new Kudeatzailea(textField_87f));
		frmSudokua.getContentPane().add(textField_87f, "12, 13, fill, fill");

		textField_88f = new JTextField();
		textField_88f.setFont(new Font("EHUSerif", Font.BOLD, 40));
		textField_88f.setHorizontalAlignment(SwingConstants.CENTER);
		textField_88f.setColumns(10);
		textField_88f.addKeyListener(new Kudeatzailea(textField_88f));
		frmSudokua.getContentPane().add(textField_88f, "13, 13, fill, fill");
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
			if(txt.getText().length()==1){txt.setText("");}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

	private void kargatu(Sudokua pSudo){
		for(int i=0;i<9;i++){
			Bloke pBloke=pSudo.getBloke(i);
			for(int k=0;k<9;k++){
				Kasila kasila= pBloke.getKasila(k);
				if(kasila.getFinkoa()){
					String ik=new String(i+""+k);
//					switch(ik){
//					case "00" : textField_00.setForeground(Color.BLUE);textField_00.setText(kasila.toString());
//					case "01" : textField_01.setForeground(Color.BLUE);textField_01.setText(kasila.toString());
//					case "02" : textField_02.setForeground(Color.BLUE);textField_02.setText(kasila.toString());
//					case "03" : textField_03.setForeground(Color.BLUE);textField_03.setText(kasila.toString());
//					case"04":textField_04.setForeground(Color.BLUE);textField_04.setText(kasila.toString());
//					case"05":textField_05.setForeground(Color.BLUE);textField_05.setText(kasila.toString());
//					case"06":textField_06.setForeground(Color.BLUE);textField_06.setText(kasila.toString());
//					case"07":textField_07.setForeground(Color.BLUE);textField_07.setText(kasila.toString());
//					case"08":textField_08.setForeground(Color.BLUE);textField_08.setText(kasila.toString());
//					case"10":textField_10f.setForeground(Color.BLUE);textField_10f.setText(kasila.toString());
//					case"11":textField_11f.setForeground(Color.BLUE);textField_11f.setText(kasila.toString());
//					case"12":textField_12f.setForeground(Color.BLUE);textField_12f.setText(kasila.toString());
//					case"13":textField_13f.setForeground(Color.BLUE);textField_13f.setText(kasila.toString());
//					case"14":textField_14f.setForeground(Color.BLUE);textField_14f.setText(kasila.toString());
//					case"15":textField_15f.setForeground(Color.BLUE);textField_15f.setText(kasila.toString());
//					case"16":textField_16f.setForeground(Color.BLUE);textField_16f.setText(kasila.toString());
//					case"17":textField_17f.setForeground(Color.BLUE);textField_17f.setText(kasila.toString());
//					case"18":textField_18f.setForeground(Color.BLUE);textField_18f.setText(kasila.toString());
//					case"20":textField_20f.setForeground(Color.BLUE);textField_20f.setText(kasila.toString());
//					case"21":textField_21f.setForeground(Color.BLUE);textField_21f.setText(kasila.toString());
//					case"22":textField_22f.setForeground(Color.BLUE);textField_22f.setText(kasila.toString());
//					case"23":textField_23f.setForeground(Color.BLUE);textField_23f.setText(kasila.toString());
//					case"24":textField_24f.setForeground(Color.BLUE);textField_24f.setText(kasila.toString());
//					case"25":textField_25f.setForeground(Color.BLUE);textField_25f.setText(kasila.toString());
//					case"26":textField_26f.setForeground(Color.BLUE);textField_26f.setText(kasila.toString());
//					case"27":textField_27f.setForeground(Color.BLUE);textField_27f.setText(kasila.toString());
//					case"28":textField_28f.setForeground(Color.BLUE);textField_28f.setText(kasila.toString());
//					case"30":textField_30f.setForeground(Color.BLUE);textField_30f.setText(kasila.toString());
//					case"31":textField_31f.setForeground(Color.BLUE);textField_31f.setText(kasila.toString());
//					case"32":textField_32f.setForeground(Color.BLUE);textField_32f.setText(kasila.toString());
//					case"33":textField_33f.setForeground(Color.BLUE);textField_33f.setText(kasila.toString());
//					case"34":textField_34f.setForeground(Color.BLUE);textField_34f.setText(kasila.toString());
//					case"35":textField_35f.setForeground(Color.BLUE);textField_35f.setText(kasila.toString());
//					case"36":textField_36f.setForeground(Color.BLUE);textField_36f.setText(kasila.toString());
//					case"37":textField_37f.setForeground(Color.BLUE);textField_37f.setText(kasila.toString());
//					case"38":textField_38f.setForeground(Color.BLUE);textField_38f.setText(kasila.toString());
//					case"40":textField_40f.setForeground(Color.BLUE);textField_40f.setText(kasila.toString());
//					case"41":textField_41f.setForeground(Color.BLUE);textField_41f.setText(kasila.toString());
//					case"42":textField_42f.setForeground(Color.BLUE);textField_42f.setText(kasila.toString());
//					case"43":textField_43f.setForeground(Color.BLUE);textField_43f.setText(kasila.toString());
//					case"44":textField_44f.setForeground(Color.BLUE);textField_44f.setText(kasila.toString());
//					case"45":textField_45f.setForeground(Color.BLUE);textField_45f.setText(kasila.toString());
//					case"46":textField_46f.setForeground(Color.BLUE);textField_46f.setText(kasila.toString());
//					case"47":textField_47f.setForeground(Color.BLUE);textField_47f.setText(kasila.toString());
//					case"48":textField_48f.setForeground(Color.BLUE);textField_48f.setText(kasila.toString());
//					case"50":textField_50f.setForeground(Color.BLUE);textField_50f.setText(kasila.toString());
//					case"51":textField_51f.setForeground(Color.BLUE);textField_51f.setText(kasila.toString());
//					case"52":textField_52f.setForeground(Color.BLUE);textField_52f.setText(kasila.toString());
//					case"53":textField_53f.setForeground(Color.BLUE);textField_53f.setText(kasila.toString());
//					case"54":textField_54f.setForeground(Color.BLUE);textField_54f.setText(kasila.toString());
//					case"55":textField_55f.setForeground(Color.BLUE);textField_55f.setText(kasila.toString());
//					case"56":textField_56f.setForeground(Color.BLUE);textField_56f.setText(kasila.toString());
//					case"57":textField_57f.setForeground(Color.BLUE);textField_57f.setText(kasila.toString());
//					case"58":textField_58f.setForeground(Color.BLUE);textField_58f.setText(kasila.toString());
//					case"60":textField_60f.setForeground(Color.BLUE);textField_60f.setText(kasila.toString());
//					case"61":textField_61f.setForeground(Color.BLUE);textField_61f.setText(kasila.toString());
//					case"62":textField_62f.setForeground(Color.BLUE);textField_62f.setText(kasila.toString());
//					case"63":textField_63f.setForeground(Color.BLUE);textField_63f.setText(kasila.toString());
//					case"64":textField_64f.setForeground(Color.BLUE);textField_64f.setText(kasila.toString());
//					case"65":textField_65f.setForeground(Color.BLUE);textField_65f.setText(kasila.toString());
//					case"66":textField_66f.setForeground(Color.BLUE);textField_66f.setText(kasila.toString());
//					case"67":textField_67f.setForeground(Color.BLUE);textField_67f.setText(kasila.toString());
//					case"68":textField_68f.setForeground(Color.BLUE);textField_68f.setText(kasila.toString());
//					case"70":textField_70f.setForeground(Color.BLUE);textField_70f.setText(kasila.toString());
//					case"71":textField_71f.setForeground(Color.BLUE);textField_71f.setText(kasila.toString());
//					case"72":textField_72f.setForeground(Color.BLUE);textField_72f.setText(kasila.toString());
//					case"73":textField_73f.setForeground(Color.BLUE);textField_73f.setText(kasila.toString());
//					case"74":textField_74f.setForeground(Color.BLUE);textField_74f.setText(kasila.toString());
//					case"75":textField_75f.setForeground(Color.BLUE);textField_75f.setText(kasila.toString());
//					case"76":textField_76f.setForeground(Color.BLUE);textField_76f.setText(kasila.toString());
//					case"77":textField_77f.setForeground(Color.BLUE);textField_77f.setText(kasila.toString());
//					case"78":textField_78f.setForeground(Color.BLUE);textField_78f.setText(kasila.toString());
//					case"80":textField_80f.setForeground(Color.BLUE);textField_80f.setText(kasila.toString());
//					case"81":textField_81f.setForeground(Color.BLUE);textField_81f.setText(kasila.toString());
//					case"82":textField_82f.setForeground(Color.BLUE);textField_82f.setText(kasila.toString());
//					case"83":textField_83f.setForeground(Color.BLUE);textField_83f.setText(kasila.toString());
//					case"84":textField_84f.setForeground(Color.BLUE);textField_84f.setText(kasila.toString());
//					case"85":textField_85f.setForeground(Color.BLUE);textField_85f.setText(kasila.toString());
//					case"86":textField_86f.setForeground(Color.BLUE);textField_86f.setText(kasila.toString());
//					case"87":textField_87f.setForeground(Color.BLUE);textField_87f.setText(kasila.toString());
//					case"88":textField_88f.setForeground(Color.BLUE);textField_88f.setText(kasila.toString());
					if ("00".equals(ik)) {
						textField_00.setForeground(Color.BLUE);
						textField_00.setText(kasila.toString());
					} else if ("01".equals(ik)) {
						textField_01.setForeground(Color.BLUE);
						textField_01.setText(kasila.toString());
					} else if ("02".equals(ik)) {
						textField_02.setForeground(Color.BLUE);
						textField_02.setText(kasila.toString());
					} else if ("03".equals(ik)) {
						textField_03.setForeground(Color.BLUE);
						textField_03.setText(kasila.toString());
					} else if ("04".equals(ik)) {
						textField_04.setForeground(Color.BLUE);
						textField_04.setText(kasila.toString());
					} else if ("05".equals(ik)) {
						textField_05.setForeground(Color.BLUE);
						textField_05.setText(kasila.toString());
					} else if ("06".equals(ik)) {
						textField_06.setForeground(Color.BLUE);
						textField_06.setText(kasila.toString());
					} else if ("07".equals(ik)) {
						textField_07.setForeground(Color.BLUE);
						textField_07.setText(kasila.toString());
					} else if ("08".equals(ik)) {
						textField_08.setForeground(Color.BLUE);
						textField_08.setText(kasila.toString());
					} else if ("10".equals(ik)) {
						textField_10f.setForeground(Color.BLUE);
						textField_10f.setText(kasila.toString());
					} else if ("11".equals(ik)) {
						textField_11f.setForeground(Color.BLUE);
						textField_11f.setText(kasila.toString());
					} else if ("12".equals(ik)) {
						textField_12f.setForeground(Color.BLUE);
						textField_12f.setText(kasila.toString());
					} else if ("13".equals(ik)) {
						textField_13f.setForeground(Color.BLUE);
						textField_13f.setText(kasila.toString());
					} else if ("14".equals(ik)) {
						textField_14f.setForeground(Color.BLUE);
						textField_14f.setText(kasila.toString());
					} else if ("15".equals(ik)) {
						textField_15f.setForeground(Color.BLUE);
						textField_15f.setText(kasila.toString());
					} else if ("16".equals(ik)) {
						textField_16f.setForeground(Color.BLUE);
						textField_16f.setText(kasila.toString());
					} else if ("17".equals(ik)) {
						textField_17f.setForeground(Color.BLUE);
						textField_17f.setText(kasila.toString());
					} else if ("18".equals(ik)) {
						textField_18f.setForeground(Color.BLUE);
						textField_18f.setText(kasila.toString());
					} else if ("20".equals(ik)) {
						textField_20f.setForeground(Color.BLUE);
						textField_20f.setText(kasila.toString());
					} else if ("21".equals(ik)) {
						textField_21f.setForeground(Color.BLUE);
						textField_21f.setText(kasila.toString());
					} else if ("22".equals(ik)) {
						textField_22f.setForeground(Color.BLUE);
						textField_22f.setText(kasila.toString());
					} else if ("23".equals(ik)) {
						textField_23f.setForeground(Color.BLUE);
						textField_23f.setText(kasila.toString());
					} else if ("24".equals(ik)) {
						textField_24f.setForeground(Color.BLUE);
						textField_24f.setText(kasila.toString());
					} else if ("25".equals(ik)) {
						textField_25f.setForeground(Color.BLUE);
						textField_25f.setText(kasila.toString());
					} else if ("26".equals(ik)) {
						textField_26f.setForeground(Color.BLUE);
						textField_26f.setText(kasila.toString());
					} else if ("27".equals(ik)) {
						textField_27f.setForeground(Color.BLUE);
						textField_27f.setText(kasila.toString());
					} else if ("28".equals(ik)) {
						textField_28f.setForeground(Color.BLUE);
						textField_28f.setText(kasila.toString());
					} else if ("30".equals(ik)) {
						textField_30f.setForeground(Color.BLUE);
						textField_30f.setText(kasila.toString());
					} else if ("31".equals(ik)) {
						textField_31f.setForeground(Color.BLUE);
						textField_31f.setText(kasila.toString());
					} else if ("32".equals(ik)) {
						textField_32f.setForeground(Color.BLUE);
						textField_32f.setText(kasila.toString());
					} else if ("33".equals(ik)) {
						textField_33f.setForeground(Color.BLUE);
						textField_33f.setText(kasila.toString());
					} else if ("34".equals(ik)) {
						textField_34f.setForeground(Color.BLUE);
						textField_34f.setText(kasila.toString());
					} else if ("35".equals(ik)) {
						textField_35f.setForeground(Color.BLUE);
						textField_35f.setText(kasila.toString());
					} else if ("36".equals(ik)) {
						textField_36f.setForeground(Color.BLUE);
						textField_36f.setText(kasila.toString());
					} else if ("37".equals(ik)) {
						textField_37f.setForeground(Color.BLUE);
						textField_37f.setText(kasila.toString());
					} else if ("38".equals(ik)) {
						textField_38f.setForeground(Color.BLUE);
						textField_38f.setText(kasila.toString());
					} else if ("40".equals(ik)) {
						textField_40f.setForeground(Color.BLUE);
						textField_40f.setText(kasila.toString());
					} else if ("41".equals(ik)) {
						textField_41f.setForeground(Color.BLUE);
						textField_41f.setText(kasila.toString());
					} else if ("42".equals(ik)) {
						textField_42f.setForeground(Color.BLUE);
						textField_42f.setText(kasila.toString());
					} else if ("43".equals(ik)) {
						textField_43f.setForeground(Color.BLUE);
						textField_43f.setText(kasila.toString());
					} else if ("44".equals(ik)) {
						textField_44f.setForeground(Color.BLUE);
						textField_44f.setText(kasila.toString());
					} else if ("45".equals(ik)) {
						textField_45f.setForeground(Color.BLUE);
						textField_45f.setText(kasila.toString());
					} else if ("46".equals(ik)) {
						textField_46f.setForeground(Color.BLUE);
						textField_46f.setText(kasila.toString());
					} else if ("47".equals(ik)) {
						textField_47f.setForeground(Color.BLUE);
						textField_47f.setText(kasila.toString());
					} else if ("48".equals(ik)) {
						textField_48f.setForeground(Color.BLUE);
						textField_48f.setText(kasila.toString());
					} else if ("50".equals(ik)) {
						textField_50f.setForeground(Color.BLUE);
						textField_50f.setText(kasila.toString());
					} else if ("51".equals(ik)) {
						textField_51f.setForeground(Color.BLUE);
						textField_51f.setText(kasila.toString());
					} else if ("52".equals(ik)) {
						textField_52f.setForeground(Color.BLUE);
						textField_52f.setText(kasila.toString());
					} else if ("53".equals(ik)) {
						textField_53f.setForeground(Color.BLUE);
						textField_53f.setText(kasila.toString());
					} else if ("54".equals(ik)) {
						textField_54f.setForeground(Color.BLUE);
						textField_54f.setText(kasila.toString());
					} else if ("55".equals(ik)) {
						textField_55f.setForeground(Color.BLUE);
						textField_55f.setText(kasila.toString());
					} else if ("56".equals(ik)) {
						textField_56f.setForeground(Color.BLUE);
						textField_56f.setText(kasila.toString());
					} else if ("57".equals(ik)) {
						textField_57f.setForeground(Color.BLUE);
						textField_57f.setText(kasila.toString());
					} else if ("58".equals(ik)) {
						textField_58f.setForeground(Color.BLUE);
						textField_58f.setText(kasila.toString());
					} else if ("60".equals(ik)) {
						textField_60f.setForeground(Color.BLUE);
						textField_60f.setText(kasila.toString());
					} else if ("61".equals(ik)) {
						textField_61f.setForeground(Color.BLUE);
						textField_61f.setText(kasila.toString());
					} else if ("62".equals(ik)) {
						textField_62f.setForeground(Color.BLUE);
						textField_62f.setText(kasila.toString());
					} else if ("63".equals(ik)) {
						textField_63f.setForeground(Color.BLUE);
						textField_63f.setText(kasila.toString());
					} else if ("64".equals(ik)) {
						textField_64f.setForeground(Color.BLUE);
						textField_64f.setText(kasila.toString());
					} else if ("65".equals(ik)) {
						textField_65f.setForeground(Color.BLUE);
						textField_65f.setText(kasila.toString());
					} else if ("66".equals(ik)) {
						textField_66f.setForeground(Color.BLUE);
						textField_66f.setText(kasila.toString());
					} else if ("67".equals(ik)) {
						textField_67f.setForeground(Color.BLUE);
						textField_67f.setText(kasila.toString());
					} else if ("68".equals(ik)) {
						textField_68f.setForeground(Color.BLUE);
						textField_68f.setText(kasila.toString());
					} else if ("70".equals(ik)) {
						textField_70f.setForeground(Color.BLUE);
						textField_70f.setText(kasila.toString());
					} else if ("71".equals(ik)) {
						textField_71f.setForeground(Color.BLUE);
						textField_71f.setText(kasila.toString());
					} else if ("72".equals(ik)) {
						textField_72f.setForeground(Color.BLUE);
						textField_72f.setText(kasila.toString());
					} else if ("73".equals(ik)) {
						textField_73f.setForeground(Color.BLUE);
						textField_73f.setText(kasila.toString());
					} else if ("74".equals(ik)) {
						textField_74f.setForeground(Color.BLUE);
						textField_74f.setText(kasila.toString());
					} else if ("75".equals(ik)) {
						textField_75f.setForeground(Color.BLUE);
						textField_75f.setText(kasila.toString());
					} else if ("76".equals(ik)) {
						textField_76f.setForeground(Color.BLUE);
						textField_76f.setText(kasila.toString());
					} else if ("77".equals(ik)) {
						textField_77f.setForeground(Color.BLUE);
						textField_77f.setText(kasila.toString());
					} else if ("78".equals(ik)) {
						textField_78f.setForeground(Color.BLUE);
						textField_78f.setText(kasila.toString());
					} else if ("80".equals(ik)) {
						textField_80f.setForeground(Color.BLUE);
						textField_80f.setText(kasila.toString());
					} else if ("81".equals(ik)) {
						textField_81f.setForeground(Color.BLUE);
						textField_81f.setText(kasila.toString());
					} else if ("82".equals(ik)) {
						textField_82f.setForeground(Color.BLUE);
						textField_82f.setText(kasila.toString());
					} else if ("83".equals(ik)) {
						textField_83f.setForeground(Color.BLUE);
						textField_83f.setText(kasila.toString());
					} else if ("84".equals(ik)) {
						textField_84f.setForeground(Color.BLUE);
						textField_84f.setText(kasila.toString());
					} else if ("85".equals(ik)) {
						textField_85f.setForeground(Color.BLUE);
						textField_85f.setText(kasila.toString());
					} else if ("86".equals(ik)) {
						textField_86f.setForeground(Color.BLUE);
						textField_86f.setText(kasila.toString());
					} else if ("87".equals(ik)) {
						textField_87f.setForeground(Color.BLUE);
						textField_87f.setText(kasila.toString());
					} else {
						textField_88f.setForeground(Color.BLUE);
						textField_88f.setText(kasila.toString());
					}
					
				}else if(kasila.getErabiltzaileBal()!=0){
					String ik=new String(i+""+k);
					switch(ik){
					case"00":textField_00.setText(""+kasila.getErabiltzaileBal());
					case"01":textField_01.setText(""+kasila.getErabiltzaileBal());
					case"02":textField_02.setText(""+kasila.getErabiltzaileBal());
					case"03":textField_03.setText(""+kasila.getErabiltzaileBal());
					case"04":textField_04.setText(""+kasila.getErabiltzaileBal());
					case"05":textField_05.setText(""+kasila.getErabiltzaileBal());
					case"06":textField_06.setText(""+kasila.getErabiltzaileBal());
					case"07":textField_07.setText(""+kasila.getErabiltzaileBal());
					case"08":textField_08.setText(""+kasila.getErabiltzaileBal());
					case"10":textField_10f.setText(""+kasila.getErabiltzaileBal());
					case"11":textField_11f.setText(""+kasila.getErabiltzaileBal());
					case"12":textField_12f.setText(""+kasila.getErabiltzaileBal());
					case"13":textField_13f.setText(""+kasila.getErabiltzaileBal());
					case"14":textField_14f.setText(""+kasila.getErabiltzaileBal());
					case"15":textField_15f.setText(""+kasila.getErabiltzaileBal());
					case"16":textField_16f.setText(""+kasila.getErabiltzaileBal());
					case"17":textField_17f.setText(""+kasila.getErabiltzaileBal());
					case"18":textField_18f.setText(""+kasila.getErabiltzaileBal());
					case"20":textField_20f.setText(""+kasila.getErabiltzaileBal());
					case"21":textField_21f.setText(""+kasila.getErabiltzaileBal());
					case"22":textField_22f.setText(""+kasila.getErabiltzaileBal());
					case"23":textField_23f.setText(""+kasila.getErabiltzaileBal());
					case"24":textField_24f.setText(""+kasila.getErabiltzaileBal());
					case"25":textField_25f.setText(""+kasila.getErabiltzaileBal());
					case"26":textField_26f.setText(""+kasila.getErabiltzaileBal());
					case"27":textField_27f.setText(""+kasila.getErabiltzaileBal());
					case"28":textField_28f.setText(""+kasila.getErabiltzaileBal());
					case"30":textField_30f.setText(""+kasila.getErabiltzaileBal());
					case"31":textField_31f.setText(""+kasila.getErabiltzaileBal());
					case"32":textField_32f.setText(""+kasila.getErabiltzaileBal());
					case"33":textField_33f.setText(""+kasila.getErabiltzaileBal());
					case"34":textField_34f.setText(""+kasila.getErabiltzaileBal());
					case"35":textField_35f.setText(""+kasila.getErabiltzaileBal());
					case"36":textField_36f.setText(""+kasila.getErabiltzaileBal());
					case"37":textField_37f.setText(""+kasila.getErabiltzaileBal());
					case"38":textField_38f.setText(""+kasila.getErabiltzaileBal());
					case"40":textField_40f.setText(""+kasila.getErabiltzaileBal());
					case"41":textField_41f.setText(""+kasila.getErabiltzaileBal());
					case"42":textField_42f.setText(""+kasila.getErabiltzaileBal());
					case"43":textField_43f.setText(""+kasila.getErabiltzaileBal());
					case"44":textField_44f.setText(""+kasila.getErabiltzaileBal());
					case"45":textField_45f.setText(""+kasila.getErabiltzaileBal());
					case"46":textField_46f.setText(""+kasila.getErabiltzaileBal());
					case"47":textField_47f.setText(""+kasila.getErabiltzaileBal());
					case"48":textField_48f.setText(""+kasila.getErabiltzaileBal());
					case"50":textField_50f.setText(""+kasila.getErabiltzaileBal());
					case"51":textField_51f.setText(""+kasila.getErabiltzaileBal());
					case"52":textField_52f.setText(""+kasila.getErabiltzaileBal());
					case"53":textField_53f.setText(""+kasila.getErabiltzaileBal());
					case"54":textField_54f.setText(""+kasila.getErabiltzaileBal());
					case"55":textField_55f.setText(""+kasila.getErabiltzaileBal());
					case"56":textField_56f.setText(""+kasila.getErabiltzaileBal());
					case"57":textField_57f.setText(""+kasila.getErabiltzaileBal());
					case"58":textField_58f.setText(""+kasila.getErabiltzaileBal());
					case"60":textField_60f.setText(""+kasila.getErabiltzaileBal());
					case"61":textField_61f.setText(""+kasila.getErabiltzaileBal());
					case"62":textField_62f.setText(""+kasila.getErabiltzaileBal());
					case"63":textField_63f.setText(""+kasila.getErabiltzaileBal());
					case"64":textField_64f.setText(""+kasila.getErabiltzaileBal());
					case"65":textField_65f.setText(""+kasila.getErabiltzaileBal());
					case"66":textField_66f.setText(""+kasila.getErabiltzaileBal());
					case"67":textField_67f.setText(""+kasila.getErabiltzaileBal());
					case"68":textField_68f.setText(""+kasila.getErabiltzaileBal());
					case"70":textField_70f.setText(""+kasila.getErabiltzaileBal());
					case"71":textField_71f.setText(""+kasila.getErabiltzaileBal());
					case"72":textField_72f.setText(""+kasila.getErabiltzaileBal());
					case"73":textField_73f.setText(""+kasila.getErabiltzaileBal());
					case"74":textField_74f.setText(""+kasila.getErabiltzaileBal());
					case"75":textField_75f.setText(""+kasila.getErabiltzaileBal());
					case"76":textField_76f.setText(""+kasila.getErabiltzaileBal());
					case"77":textField_77f.setText(""+kasila.getErabiltzaileBal());
					case"78":textField_78f.setText(""+kasila.getErabiltzaileBal());
					case"80":textField_80f.setText(""+kasila.getErabiltzaileBal());
					case"81":textField_81f.setText(""+kasila.getErabiltzaileBal());
					case"82":textField_82f.setText(""+kasila.getErabiltzaileBal());
					case"83":textField_83f.setForeground(Color.BLUE);
					case"84":textField_84f.setForeground(Color.BLUE);
					case"85":textField_85f.setForeground(Color.BLUE);
					case"86":textField_86f.setForeground(Color.BLUE);
					case"87":textField_87f.setForeground(Color.BLUE);
					case"88":textField_88f.setForeground(Color.BLUE);
					}
				}

			}
		}

	}
}
