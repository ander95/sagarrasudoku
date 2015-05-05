package org.sudoku.sftwring;

public class probaLaguntza {
	public static void main(String[] args) {

		//Sudokua sortu

		Sudokua s = new Sudokua();
		s.getBloke(0).setKasila(0,0, new Kasila(5));
		s.getBloke(0).getKasila(0,0).setFinkoa(true);
		s.getBloke(0).setKasila(0,1, new Kasila(3));
		s.getBloke(0).getKasila(0,1).setFinkoa(true);
		s.getBloke(0).setKasila(0,2, new Kasila(4));
		s.getBloke(0).setKasila(1,0, new Kasila(6));
		s.getBloke(0).getKasila(1,0).setFinkoa(true);
		s.getBloke(0).setKasila(1,1, new Kasila(7));
		s.getBloke(0).setKasila(1,2, new Kasila(2));
		s.getBloke(0).setKasila(2,0, new Kasila(1));
		s.getBloke(0).setKasila(2,1, new Kasila(9));
		s.getBloke(0).getKasila(2,1).setFinkoa(true);
		s.getBloke(0).setKasila(2,2, new Kasila(8));
		s.getBloke(0).getKasila(2,2).setFinkoa(true);
		
		s.getBloke(1).setKasila(0,0, new Kasila(6));
		s.getBloke(1).setKasila(0,1, new Kasila(7));
		s.getBloke(1).getKasila(0,1).setFinkoa(true);
		s.getBloke(1).setKasila(0,2, new Kasila(8));
		s.getBloke(1).setKasila(1,0, new Kasila(1));
		s.getBloke(1).getKasila(1,0).setFinkoa(true);
		s.getBloke(1).setKasila(1,1, new Kasila(9));
		s.getBloke(1).getKasila(1,1).setFinkoa(true);
		s.getBloke(1).setKasila(1,2, new Kasila(5));
		s.getBloke(1).getKasila(1,2).setFinkoa(true);
		s.getBloke(1).setKasila(2,0, new Kasila(3));
		s.getBloke(1).setKasila(2,1, new Kasila(4));
		s.getBloke(1).setKasila(2,2, new Kasila(2));
		
		s.getBloke(2).setKasila(0,0, new Kasila(9));
		s.getBloke(2).setKasila(0,1, new Kasila(1));
		s.getBloke(2).setKasila(0,2, new Kasila(2));
		s.getBloke(2).setKasila(1,0, new Kasila(3));
		s.getBloke(2).setKasila(1,1, new Kasila(4));
		s.getBloke(2).setKasila(1,2, new Kasila(8));
		s.getBloke(2).setKasila(2,0, new Kasila(5));
		s.getBloke(2).setKasila(2,1, new Kasila(6));
		s.getBloke(2).getKasila(2,1).setFinkoa(true);
		s.getBloke(2).setKasila(2,2, new Kasila(7));
		
		s.getBloke(3).setKasila(0,0, new Kasila(8));
		s.getBloke(3).getKasila(0,0).setFinkoa(true);
		s.getBloke(3).setKasila(0,1, new Kasila(5));
		s.getBloke(3).setKasila(0,2, new Kasila(9));
		s.getBloke(3).setKasila(1,0, new Kasila(4));
		s.getBloke(3).getKasila(1,0).setFinkoa(true);
		s.getBloke(3).setKasila(1,1, new Kasila(2));
		s.getBloke(3).setKasila(1,2, new Kasila(6));
		s.getBloke(3).setKasila(2,0, new Kasila(7));
		s.getBloke(3).getKasila(2,0).setFinkoa(true);
		s.getBloke(3).setKasila(2,1, new Kasila(1));
		s.getBloke(3).setKasila(2,2, new Kasila(3));
		
		s.getBloke(4).setKasila(0,0, new Kasila(7));
		s.getBloke(4).setKasila(0,1, new Kasila(6));
		s.getBloke(4).getKasila(0,1).setFinkoa(true);
		s.getBloke(4).setKasila(0,2, new Kasila(1));
		s.getBloke(4).setKasila(1,0, new Kasila(8));
		s.getBloke(4).getKasila(1,0).setFinkoa(true);
		s.getBloke(4).setKasila(1,1, new Kasila(5));
		s.getBloke(4).setKasila(1,2, new Kasila(3));
		s.getBloke(4).getKasila(1,2).setFinkoa(true);
		s.getBloke(4).setKasila(2,0, new Kasila(9));
		s.getBloke(4).setKasila(2,1, new Kasila(2));
		s.getBloke(4).getKasila(2,1).setFinkoa(true);
		s.getBloke(4).setKasila(2,2, new Kasila(4));

		s.getBloke(5).setKasila(0,0, new Kasila(4));
		s.getBloke(5).setKasila(0,1, new Kasila(2));
		s.getBloke(5).setKasila(0,2, new Kasila(3));
		s.getBloke(5).getKasila(0,2).setFinkoa(true);
		s.getBloke(5).setKasila(1,0, new Kasila(7));
		s.getBloke(5).setKasila(1,1, new Kasila(9));
		s.getBloke(5).setKasila(1,2, new Kasila(1));
		s.getBloke(5).getKasila(1,2).setFinkoa(true);
		s.getBloke(5).setKasila(2,0, new Kasila(8));
		s.getBloke(5).setKasila(2,1, new Kasila(5));
		s.getBloke(5).setKasila(2,2, new Kasila(6));
		s.getBloke(5).getKasila(2,2).setFinkoa(true);
		
		s.getBloke(6).setKasila(0,0, new Kasila(9));
		s.getBloke(6).setKasila(0,1, new Kasila(6));
		s.getBloke(6).getKasila(0,1).setFinkoa(true);
		s.getBloke(6).setKasila(0,2, new Kasila(1));
		s.getBloke(6).setKasila(1,0, new Kasila(2));
		s.getBloke(6).setKasila(1,1, new Kasila(8));
		s.getBloke(6).setKasila(1,2, new Kasila(7));
		s.getBloke(6).setKasila(2,0, new Kasila(3));
		s.getBloke(6).setKasila(2,1, new Kasila(4));
		s.getBloke(6).setKasila(2,2, new Kasila(5));
		
		s.getBloke(7).setKasila(0,0, new Kasila(5));
		s.getBloke(7).setKasila(0,1, new Kasila(3));
		s.getBloke(7).setKasila(0,2, new Kasila(7));
		s.getBloke(7).setKasila(1,0, new Kasila(4));
		s.getBloke(7).getKasila(1,0).setFinkoa(true);
		s.getBloke(7).setKasila(1,1, new Kasila(1));
		s.getBloke(7).getKasila(1,1).setFinkoa(true);
		s.getBloke(7).setKasila(1,2, new Kasila(9));
		s.getBloke(7).getKasila(1,2).setFinkoa(true);
		s.getBloke(7).setKasila(2,0, new Kasila(2));
		s.getBloke(7).setKasila(2,1, new Kasila(8));
		s.getBloke(7).getKasila(2,1).setFinkoa(true);
		s.getBloke(7).setKasila(2,2, new Kasila(6));
		
		s.getBloke(8).setKasila(0,0, new Kasila(2));
		s.getBloke(8).getKasila(0,0).setFinkoa(true);
		s.getBloke(8).setKasila(0,1, new Kasila(8));
		s.getBloke(8).getKasila(0,1).setFinkoa(true);
		s.getBloke(8).setKasila(0,2, new Kasila(4));
		s.getBloke(8).setKasila(1,0, new Kasila(6));
		s.getBloke(8).setKasila(1,1, new Kasila(3));
		s.getBloke(8).setKasila(1,2, new Kasila(5));
		s.getBloke(8).getKasila(1,2).setFinkoa(true);
		s.getBloke(8).setKasila(2,0, new Kasila(1));
		s.getBloke(8).setKasila(2,1, new Kasila(7));
		s.getBloke(8).getKasila(2,1).setFinkoa(true);
		s.getBloke(8).setKasila(2,2, new Kasila(9));
		s.getBloke(8).getKasila(2,2).setFinkoa(true);
	//Bloke proba:
		System.out.println("Bloke guztiak ondo daude eta bueltatzen duen emaitza -1 da? "+s.laguntzaBloke());
		s.getBloke(1).getKasila(0, 2).setFinkoa(true);
		s.getBloke(1).getKasila(0, 2).setBalioZuzena(1);
		System.out.println("2. blokean zenbaki errepikatu bat gehituko dugu(finko moduan)...1 ematen du? "+s.laguntzaBloke());
		s.getBloke(1).getKasila(0, 2).setFinkoa(false);
		s.getBloke(1).getKasila(0, 2).setBalioZuzena(8);
		s.getBloke(8).getKasila(2, 0).aldatu(5);
		
		System.out.println("9. blokean zenbaki errepikatu bat gehitu dugu...8 ematen du? "+s.laguntzaBloke());
		s.getBloke(1).getKasila(0, 2).setFinkoa(true);
		s.getBloke(1).getKasila(0, 2).setBalioZuzena(1);
		System.out.println("2 Bloke ezberdinetan zenbakiak errepikatuta daude...8 edo 1 ematen du? "+s.laguntzaBloke());
		s.getBloke(1).getKasila(0, 2).setFinkoa(false);
		s.getBloke(1).getKasila(0, 2).setBalioZuzena(8);
		s.getBloke(8).getKasila(2, 0).aldatu(0);
	//Zutabe proba:
		System.out.println();
		System.out.println("···························································");
		System.out.println();
		System.out.println("Zutabe guztiak ondo daude eta bueltatzen duen emaitza -1 da? "+s.laguntzaZutabe());
		s.getBloke(0).getKasila(0, 2).setFinkoa(true);
		s.getBloke(0).getKasila(0, 2).setBalioZuzena(1);
		s.getBloke(3).getKasila(0, 2).setFinkoa(true);
		s.getBloke(3).getKasila(0, 2).setBalioZuzena(1);
		
		System.out.println("3.zutabean zenbaki errepikatu bat gehituko dugu(finko moduan)...2 ematen du? "+s.laguntzaZutabe());
		s.getBloke(1).getKasila(0, 2).setFinkoa(false);
		s.getBloke(1).getKasila(0, 2).setBalioZuzena(8);
		s.getBloke(3).getKasila(0, 2).setFinkoa(false);
		s.getBloke(3).getKasila(0, 2).setBalioZuzena(2);

		s.getBloke(8).getKasila(0, 2).aldatu(9);
		System.out.println("9. zutabean zenbaki errepikatu gehitu da...8 ematen du? "+s.laguntzaZutabe());
		s.getBloke(6).getKasila(0, 0).aldatu(5);
		System.out.println("2 Zutabe ezberdinetan zenbakiak errepikatuta daude...8 edo 0 ematen du? "+s.laguntzaZutabe());
		s.getBloke(6).getKasila(0, 0).aldatu(0);
		s.getBloke(8).getKasila(0, 2).aldatu(0);

	//Ilara proba:
		System.out.println();
		System.out.println("···························································");
		System.out.println();
		System.out.println("Ilara guztiak ondo daude eta bueltatzen duen emaitza -1 da? "+s.laguntzaIlarak());
		
		s.getBloke(1).getKasila(0, 0).setFinkoa(true);
		s.getBloke(1).getKasila(0, 0).setBalioZuzena(5);
		
		System.out.println("1.ilaran zenbaki errepikatu bat gehituko dugu(finko moduan)...0 ematen du? "+s.laguntzaIlarak());
		s.getBloke(1).getKasila(0, 0).setFinkoa(false);
		s.getBloke(1).getKasila(0, 0).setBalioZuzena(6);

		s.getBloke(7).getKasila(2, 2).aldatu(8);
		System.out.println("9. ilaran zenbaki errepikatua gehitu da...8 ematen du? "+s.laguntzaIlarak());
		s.getBloke(1).getKasila(0, 0).setBalioZuzena(5);
		System.out.println("2 Ilara ezberdinetan zenbakiak errepikatuta daude...8 edo 0 ematen du? "+s.laguntzaIlarak());
		s.getBloke(1).getKasila(0, 0).aldatu(0);
		s.getBloke(7).getKasila(2, 2).aldatu(0);
	}

}
