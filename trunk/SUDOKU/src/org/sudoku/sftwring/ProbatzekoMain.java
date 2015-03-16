package org.sudoku.sftwring;

import java.io.IOException;

public class ProbatzekoMain {

	public static void main(String[] args) throws IOException {
		/*
		 * Klase honetan Sudokuaren klase eta metodoak frogatuko dira ahalik eta era zehatzenean
		 * Froga bakoitza bere azalpena du*/	
		kasilarenProba();
		blokearenProba();
		sudokuarenProba();
		erabiltzaileListarenProba();
		erabiltzailerenProba();
		klasifikazioarenProba();
	}

	private static void blokearenProba() {
		/*Blokea sortzen da eta 0-z bete?*/
		System.out.println("*/Blokea sortzen da eta 0-z bete?");
		Bloke b=new Bloke();
		b.inprimatuBloke();System.out.println("----------");
		/*Blokea gordetzen da?*/
		System.out.println("*/Blokea gordetzen da?");
		System.out.println(b.gorde());System.out.println("----------");
		/*Blokea kargatzen da?*/
		System.out.println("*/Blokea kargatzen da?");
		b.kargatu("0-1-false-%0-2-false-%0-3-false-%0-4-false-%0-5-false-%0-6-false-%0-7-false-%0-8-false-%0-9-false-%");
		b.inprimatuBloke();System.out.println("----------");
		/*Blokea String bihurtzen da?*/
		System.out.println("*/Blokea String bihurtzen da?");
		System.out.println(b.gorde());System.out.println("----------");

	}
	private static void sudokuarenProba() {
		/*Sudokua sortzen da eta 0-z bete?*/
		System.out.println("*/Sudokua sortzen da eta 0-z bete?");
		Sudokua s=new Sudokua();
		s.inprimatuSudoku();System.out.println("----------");
		/*Sudokua erreseteatzen da?*/
		System.out.println("*/Sudokua erreseteatzen da?");
		s.erreseteatuSudoku().inprimatuSudoku();System.out.println("----------");
		/*Sudokua string bezala gordetzen da?*/
		System.out.println("*/Sudokua string bezala gordetzen da?");
		System.out.println(s.gorde());System.out.println("----------");
		/*Sudokua string bezala kargatzen da?*/
		System.out.println("*/Sudokua string bezala kargatzen da?");
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

		/*Sudokua 0-z betetzen da?*/
		System.out.println("*/Sudokua 0-z betetzen da?");
		s.beteZeroz();
		s.inprimatuSudoku();System.out.println("----------");

	}
	private static void kasilarenProba(){
		/*Kasila hasieratzen da?*/
		System.out.println("*/Kasila hasieratzen da?");
		Kasila k=new Kasila(1);
		k.inprimatuKasila();System.out.println("----------");	
		/*Kasila ren balio aldatzen da erabiltzaileak aginduta, zuzena mantenduz?*/
		System.out.println("*/Kasila ren balio aldatzen da erabiltzaileak aginduta, zuzena mantenduz?");
		k.aldatu(9);
		k.inprimatuKasila();System.out.println("----------");
		/*Kasila finkoa bihurtu daiteke?*/
		System.out.println("*/Kasila finkoa bihurtu daiteke?");
		k.setFinkoa(true);
		k.inprimatuKasila();System.out.println("----------");
		/*Eta finkoa bada balioa aldatu daiteke?*/
		System.out.println("*/Eta finkoa bada balioa aldatu daiteke?");
		k.aldatu(5);System.out.println("----------");
		/*Kasila erreseteatzen da?*/
		System.out.println("*/Kasila erreseteatzen da?");
		k=k.kasilaErreseteatu();
		k.inprimatuKasila();System.out.println("----------");
		/*kasila gordetzen da formatu egokian*/
		System.out.println("*/kasila gordetzen da formatu egokian?");
		System.out.println(k.gorde());System.out.println("----------");
		/*kasila kargatzen da formatu egokian*/
		System.out.println("*/kasila kargatzen da formatu egokian?");
		k.kargatu("1-1-false-");
		k.inprimatuKasila();System.out.println("----------");
	}
	private static void erabiltzaileListarenProba() throws IOException {
		System.out.println("*/Erabiltzaile gehitzen da formatu egokian sartuz");
		ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Mikel","kkkkk");
		ErabiltzaileLista.getErabiltzaileLista().inprimatu();System.out.println("----------");
		System.out.println("*/Bigarren erabiltzaile bat gehituko dugu frogetarako:");
		ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Martin","lllll");
		ErabiltzaileLista.getErabiltzaileLista().inprimatu();System.out.println("----------");
		System.out.println("*/Gehitutako erabiltzaile bat bilatu (Mikel) daiteke izena eta pasahitza emanda?");
		ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("Mikel","kkkkk").inprimatuDatuak();System.out.println("----------");
		System.out.println("*/Gehitutako erabiltzaile bat (Mikel) ezabatu daiteke izena eta pasahitza emanda?");
		ErabiltzaileLista.getErabiltzaileLista().ezabatuErabiltzaile("Mikel","kkkk");
		ErabiltzaileLista.getErabiltzaileLista().inprimatu();System.out.println("----------");
		System.out.println("*/Uneko erabiltzaile kopurua 1 izan beharko litzateke: "+ErabiltzaileLista.getErabiltzaileLista().erabiltzaileKop());
		System.out.println("----------");
		System.out.println("*/Erabiltzaile izena listan dago?");
		System.out.println("Martin jarrita true adieraziko du: "+ErabiltzaileLista.getErabiltzaileLista().badago("Martin"));
		System.out.println("Mikel jarrita false adieraziko du: "+ErabiltzaileLista.getErabiltzaileLista().badago("Mikel"));
		System.out.println("----------");
		System.out.println("*/Erabiltzaile lista archivo.txt-n gordetzen da?");
		ErabiltzaileLista.getErabiltzaileLista().gorde();
		System.out.println("*/Erabiltzaile lista erreseteatu daiteke?");
		ErabiltzaileLista.getErabiltzaileLista().erreseteatuErabiltzaileLista();
		System.out.println("----------");
		System.out.println("*/Erabiltzaile lista archivo.txt-tik kargatzen da?");
		ErabiltzaileLista.getErabiltzaileLista().kargatu();
		ErabiltzaileLista.getErabiltzaileLista().inprimatu();System.out.println("----------");
		/*BEGIRATU BEHARREKO METODOA !!!*/
		ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("Mikel","kkkkk");
		ErabiltzaileLista.getErabiltzaileLista().inprimatu();System.out.println("----------");
		ErabiltzaileLista.getErabiltzaileLista().getKlasifikazioa().inprimatuKlasifikazioa();


	}
	private static void erabiltzailerenProba(){
		System.out.println("Erabiltzailea sortzen da bere datu guztiekin?");
		Erabiltzaile e=new Erabiltzaile("Mikel", 0, "kkkkk");
		e.inprimatuDatuak();System.out.println("----------");
		System.out.println("Erabiltzailearen puntuazioa eguneratzen da?");
		System.out.println("Puntuazio zaharra: "+e.getPuntuazioa());
		e.gehituPuntuak(50);
		System.out.println("Puntuazio berria: "+e.getPuntuazioa());System.out.println("----------");
		System.out.println("Erabilzailea gordetzen da?");
		System.out.println(e.gorde());System.out.println("----------");
		System.out.println("Erabilzailea kargatzen da?");
		e.kargatu("Mikel,0,kkkkk,0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%0-0-false-%/,50.0,");
		e.inprimatuDatuak();System.out.println("----------");
		System.out.println("Pasahitza okerra da (0000) beraz false: "+e.nirePasahitzaDa("0000"));
		System.out.println("Pasahitza zuzena da (kkkkk) beraz true: "+e.nirePasahitzaDa("kkkkk"));

	}

	private static void klasifikazioarenProba() throws IOException{
		System.out.println("********************************************************");
		ErabiltzaileLista.getErabiltzaileLista().erreseteatuErabiltzaileLista();
		Klasifikazioa k= ErabiltzaileLista.getErabiltzaileLista().getKlasifikazioa();
		k.erreseteatu();
		for (int i = 0; i<5; i++) {
			ErabiltzaileLista.getErabiltzaileLista().gehituErabiltzaile("erab"+i, "qwerty");
			ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(i).gehituPuntuak(i*10);
		}
		k.inprimatuKlasifikazioa();

		System.out.println("erab1-en posizoa: "+k.emanErabHonenPos(ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("erab1", "qwerty")));
		
		System.out.println("erab1 erabiltaileari 16 puntu gehituz gero.");
		ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("erab1", "qwerty").gehituPuntuak(16);
		System.out.println("erab1-en posizoa: "+k.emanErabHonenPos(ErabiltzaileLista.getErabiltzaileLista().bilatuErabiltzaile("erab1", "qwerty")));

		System.out.println("********************************************************");
	}

}
