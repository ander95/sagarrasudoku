package org.sudoku.sftwring;

public class ProbatzekoMain {

	public static void main(String[] args) {
	/*
	 * Klase honetan Sudokuaren klase eta metodoak frogatuko dira ahalik eta era zehatzenean
	 * Froga bakoitza bere azalpena du*/	
		kasilarenProba();
		blokearenProba();
		sudokuarenProba();
		//erabiltzaileListarenProba();
	}
	
	private static void blokearenProba() {
		/*Blokea sortzen da eta 0-z bete?*/
		Bloke b=new Bloke();
		b.inprimatuBloke();System.out.println("----------");
		/*Blokea gordetzen da?*/
		System.out.println(b.gorde());System.out.println("----------");
		/*Blokea kargatzen da?*/
		b.kargatu("0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%");
		b.inprimatuBloke();System.out.println("----------");
		/*Blokea String bihurtzen da?*/
		System.out.println(b.pasatuString());System.out.println("----------");
//		/*Blokea idazten da?*/
//		b.idatziBloke("0-1-0-2-0-3-0-4-0-5-0-6-0-7-0-8-0-9");
//		b.inprimatuBloke();

	}
	private static void sudokuarenProba() {
		/*Sudokua sortzen da eta 0-z bete?*/
		Sudokua s=new Sudokua();
		s.inprimatuSudoku();System.out.println("----------");
		/*Sudokua erreseteatzen da?*/
		s.erreseteatuSudoku().inprimatuSudoku();System.out.println("----------");
		/*Sudokua string bezala gordetzen da?*/
		System.out.println(s.gorde());System.out.println("----------");
		/*Sudokua string bezala kargatzen da?*/
		s.kargatu("0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%/");
		s.inprimatuSudoku();System.out.println("----------");
		/*String-era bihurtzen ditu Sudokuaren blokeak eta hauek itzultzen?*/
		System.out.println(s.pasatuString());System.out.println("----------");
		/*Sudokua bat pasata, haul null bezala itzultzen du?*/
		if(s.eraikiSudoku("0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%"
				+ "/0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5"
				+ "-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%/")==null);
		System.out.println("Sudokua eraikita!");System.out.println("----------");
		/*Sudokua 0-z betetzen da?*/
		s.beteZeroz();
		s.inprimatuSudoku();System.out.println("----------");
			
	}
	private static void kasilarenProba(){
		/*Kasila hasieratzen da?*/
		Kasila k=new Kasila(1);
		k.inprimatuKasila();System.out.println("----------");	
		/*Kasila ren balio aldatzen da erabiltzaileak aginduta, zuzena mantenduz?*/
		k.aldatu(9);
		k.inprimatuKasila();System.out.println("----------");
		/*Kasila finkoa bihurtu daiteke?*/
		k.setFinkoa("true");
		k.inprimatuKasila();System.out.println("----------");
		/*Eta finkoa bada balioa aldatu daiteke?*/
		k.aldatu(5);System.out.println("----------");
		/*Kasila erreseteatzen da?*/
		k=k.kasilaErreseteatu();
		k.inprimatuKasila();System.out.println("----------");
		/*kasila gordetzen da formatu egokian*/
		System.out.println(k.gorde());System.out.println("----------");
		/*kasila kargatzen da formatu egokian*/
		k.kargatu("1-1-false-");
		k.inprimatuKasila();System.out.println("----------");
	}
	private static void erabiltzaileListarenProba() {
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Mikel","kkkkk");
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","lllll");
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkkk").inprimatuDatuak();
		 ErabiltzaileLista.getErabiltzaileLista().ezabatuErabiltzaile(ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkk"));;
		 ErabiltzaileLista.getErabiltzaileLista().inprimatu();
		 ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","lllll");
	}
	private static void erabiltzailerenProba(){

	}

	private static void klasifikazioarenProba(){
		
	}

}