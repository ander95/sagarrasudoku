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
		//System.out.println("Datuak ondo zifratzen dira?\n---------------------------");
							
	}

	private static void sudokuSolverFrogak() {
		//System.out.println("Beti soluzio berdina (bakarra) bueltatzen da?\n-----------------------------------------------"); 
							
	}

	private static void sudokuAdapterFrogak() {
		//System.out.println("Patroia era zuzenenan funtzionatzen du?\n---------------------------------------");   
							
	}

	private static void laguntzaFrogak() {
		//System.out.println("Laguntza behar bezala funtzionatzen du?\n---------------------------------------");
							
	}

	private static void klasifikazioaLeihoaFrogak() {
		//System.out.println("Klasifikazio leihoaren frogak:\n------------------------------");  	
	}

	private static void klasifikazioaFrogak() {
		
		klasifikazioBerriaSortuFrogak();
		addFrogak();
		eguneratuFrogak();
		emanErabHonenPosFrogak();
		erabiltzaileenListaKlasifikatorianFrogak();
		tamainaFrogak();
		
		                      
	}

	private static void tamainaFrogak() {
		// TODO Auto-generated method stub
		
	}

	private static void erabiltzaileenListaKlasifikatorianFrogak() {
		// TODO Auto-generated method stub
		
	}

	private static void emanErabHonenPosFrogak() {
		// TODO Auto-generated method stub
		
	}

	private static void eguneratuFrogak() {
		System.out.println("- Klasifikazioa eguneratzen da?");
		
	}

	private static void addFrogak() {
		System.out.println("- Erabiltzailea era zuzenean gehitzen da?");

		System.out.println("Klasifikazioa berria sortu da");

		ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("erabIzen3", "2", "12345");
		System.out.println("Hasieran...");
		Klasifikazioa klasif=new Klasifikazioa();
		if (klasif.erabiltzaileenListaKlasifikatorian().isEmpty()){
			System.out.println("Zerrenda hutsik");
		}
		klasif.inprimatuKlasifikazioa();
		klasif.erabiltzaileenListaKlasifikatorian().add(ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("erabIzen2", "12345"));
		klasif.eguneratu();
		System.out.println("Bukaeran...");
		klasif.inprimatuKlasifikazioa();

	}

	private static void klasifikazioBerriaSortuFrogak() {
		System.out.println("- Klasifikazioa sortzen da? -");
		Klasifikazioa klasif=new Klasifikazioa();
		if (klasif instanceof Klasifikazioa){
			System.out.println("Kaixo klasifikazio berria naiz!");
		}
	else System.out.println("Klasifikazioa ez dago");
		
	}

	private static void generadoreSudokuFrogak() {
		System.out.println("Sudoku berria ausaz eta zailtazunaren arabera sortzen da?\n---------------------------------------------------------");
	}

	private static void erregistroLehioaFrogak() {
		System.out.println("Erregistroa ondo dabil?\n-----------------------");
	}

	private static void aukeratuLeihoaFrogak() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-oOo-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("2.Aukeratu leihoaren metodoen frogak:\n------------------------------------");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");

		klasifikazioaFrogak();
		generadoreSudokuFrogak();
		zailtasunaFrogak();
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");
	}

	private static void zailtasunaFrogak() {

	System.out.println("- Zailtasun bat aukeratuta beharrezko kasilak kentzen dira?");
	int kontErraza=0;
	int kontErtaina=0;
	int kontZaila=0;
	Sudokua sErraza = new SudokuAdapter();
	Sudokua sErtaina = new SudokuAdapter();
	Sudokua sZaila = new SudokuAdapter();
	sErraza.ausazBete(0);
	sErtaina.ausazBete(1);
	sZaila.ausazBete(2);
	
	
	for (int f = 0; f < 9; f++) {
		for (int i = 0; i < 9; i++) {
			if(sErraza.getKasila(f, i).getErabiltzaileBal()==0){
				kontErraza++;
			}
		}
	}
	for (int f = 0; f < 9; f++) {
		for (int i = 0; i < 9; i++) {
			if(sErtaina.getKasila(f, i).getErabiltzaileBal()==0){
				kontErtaina++;
			}
		}
	}
	for (int f = 0; f < 9; f++) {
		for (int i = 0; i < 9; i++) {
			if(sZaila.getKasila(f, i).getErabiltzaileBal()==0){
				kontZaila++;
			}
		}
	}
	System.out.print("Sudoku errezari kendutako kasila kopurua: "+kontErraza+" ");
	if (kontErraza>=44&&kontErraza<48){
		System.out.println("Erraza...OK");
	}
	else
		System.out.println("Erraza...ERROR");
	System.out.print("Sudoku ertainari kendutako kasila kopurua: "+kontErtaina+" ");
	if (kontErtaina>=48&&kontErtaina<52){
		System.out.println("Ertaina...OK");
	}
	else
		System.out.println("Ertaina...ERROR");
	System.out.print("Sudoku zailari kendutako kasila kopurua: "+kontZaila+" ");


	if (kontZaila>=52&&kontZaila<56){
		System.out.println("Zaila...OK");
	}
	else
		System.out.println("Zaila...ERROR");
	}
	
	

	private static void adabegiFrogak() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-oOo-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("1.Adabegi klasearen metodoen frogak:\n------------------------------------");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");
		adabegiaSortuFrogak();
		semeaGehituFrogak();
		semeaEzabatuFrogak();
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");
	}

	private static void semeaEzabatuFrogak() {
		System.out.print("- Semea ezabatzen da? \n");
		Adabegia<String> ada=new Adabegia<String>("Adabegi berria naiz", 0);
		Adabegia<String> adaSeme=ada.gehituSemea("Ni semea naiz aldiz", 0);
		System.out.print(ada.content+",");
		System.out.println(adaSeme.content);
		System.out.println("Semerik gabe utziko dugu adabegia:");
		ada.ezabatuSemea("Ni semea naiz aldiz");
		if(ada.semea.isEmpty())System.out.println("Semea ezabatuta...OK");
		else System.out.println("Ezin izan da semea ezabatu...ERROR");
		
	}

	private static void semeaGehituFrogak() {
		System.out.print("- Semea sortzen da? ");
		Adabegia<String> ada=new Adabegia<String>("Adabegi berria naiz", 0);
		Adabegia<String> adaSeme=ada.gehituSemea("Ni semea naiz aldiz", 0);
		System.out.print(ada.content+",");
		System.out.println(adaSeme.content);
		
		if (ada.semea==null) {
			System.out.println("Ez da gehitu....ERROR");
		}
		else System.out.println("Gehitu da....OK");
	}

	private static void adabegiaSortuFrogak() {
		System.out.print("- Adabegi berria zara? ");
		Adabegia<String> ada=new Adabegia<String>("Adabegi berria naiz", 0);
		if (ada.content.equals("Adabegi berria naiz"))
		System.out.println(ada.content+"\nSortu...OK");
		else
			System.out.println("Sortu...ERROR");
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
