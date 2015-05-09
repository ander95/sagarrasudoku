package org.sudoku.sftwring;

import java.util.ArrayList;
import java.util.Collections;

public class ProbatzekoMain2 {

	public static void main(String[] args) {
		sudokuaAusazBete();
				//proba();
		frogaBerriak();

	}

	private static void frogaBerriak() {
		adabegiFrogak();
		aukeratuLeihoaFrogak();
		erregistroLehioaFrogak();
		generadoreSudokuFrogak();
		klasifikazioaFrogak();
		klasifikazioaLeihoaFrogak();
		laguntzaFrogak();
		sudokuAdapterFrogak();
		sudokuSolverFrogak();
		zifraFrogak();
		
	}

	private static void zifraFrogak() {
		System.out.println("Datuak ondo zifratzen dira?\n---------------------------");
							
	}

	private static void sudokuSolverFrogak() {
		System.out.println("Beti soluzio berdina (bakarra) bueltatzen da?\n-----------------------------------------------"); 
							
	}

	private static void sudokuAdapterFrogak() {
		System.out.println("Patroia era zuzenenan funtzionatzen du?\n---------------------------------------");   
							
	}

	private static void laguntzaFrogak() {
		System.out.println("Laguntza behar bezala funtzionatzen du?\n---------------------------------------");
							
	}

	private static void klasifikazioaLeihoaFrogak() {
		System.out.println("Klasifikazio leihoaren frogak:\n------------------------------");  	
	}

	private static void klasifikazioaFrogak() {
		System.out.println("Klasifikazioa era egokian sortzen da?\n------------------------------------- ");
		                      
	}

	private static void generadoreSudokuFrogak() {
		System.out.println("Sudoku berria ausaz eta zailtazunaren arabera sortzen da?\n---------------------------------------------------------");
	}

	private static void erregistroLehioaFrogak() {
		System.out.println("Erregistroa ondo dabil?\n-----------------------");
	}

	private static void aukeratuLeihoaFrogak() {
		 System.out.println("Aukeratu leihoa ondo dabil?\n---------------------------");
		
	}

	private static void adabegiFrogak() {
		System.out.println("Adabegi klasearen metodoen frogak:\n----------------------------------");
		adabegiaSortuFrogak();
		semeaGehituFrogak();
		semeaEzabatuFrogak();
	}

	private static void semeaEzabatuFrogak() {
		// TODO Auto-generated method stub
		
	}

	private static void semeaGehituFrogak() {
		System.out.print("- Semea sortzen da? ");
		Adabegia<String> ada=new Adabegia<String>("Adabegi berria naiz", 0);
		Adabegia<String> adaSeme=ada.gehituSemea("Ni semea naiz aldiz", 0);
		System.out.print(ada.content+",");
		System.out.println(adaSeme.content);
		
	}

	private static void adabegiaSortuFrogak() {
		System.out.print("- Adabegia berria zara? ");
		Adabegia<String> ada=new Adabegia<String>("Adabegi berria naiz", 0);
		System.out.println(ada.content);
	}

	private static void proba(){

		GeneradoreSudoku s = new GeneradoreSudoku(0);
		ArrayList posizioak = new ArrayList(81);
		for (int i = 0; i < posizioak.size(); i++) {
			posizioak.add(i);
		}
		Collections.shuffle(posizioak);
		for (Object i : posizioak) {
			int unekoPosizioa=(int) posizioak.get((int) i);
			if(s.KalkulatuPosibleak(unekoPosizioa).length>1){

			}else{

			}
		}

		GeneradoreSudoku s1 = new GeneradoreSudoku(0);

		s1.beteAusaz();
		s1.setZailtasuna(0);
		s1.kasilakEzabatu(0);
		s1.inprimatuZuzena();
		s1.inprimatuErabiltzaile();
	}

	@SuppressWarnings("unused")
	private static void sudokuaAusazBete() {

		//GeneradoreSudoku s = new GeneradoreSudoku();
		Sudokua s = new SudokuAdapter();
		System.out.println("\nHasieran...\n");
		//s.beteAusaz();
		s.ausazBete(0);

		System.out.println("\nAusaz bete ondoren...\n");
		//		s.inprimatuSudokuZuzena();

		s.inprimatuSudoku();
		System.out.println("\n");
		//s.inprimatuZuzena();
	}
	
}
