package org.sudoku.sftwring;

public class Adapter {
	
	private static Adapter nAdapter;
	
	
	public static Adapter getAdapter() {
		if (nAdapter==null) nAdapter = new Adapter();
		return nAdapter;
	}
	
	public Sudokua sudokuaGeneratu() {
		Sudokua sudo = new Sudokua();
		GeneradoreSudoku genSudo = new GeneradoreSudoku();
		genSudo.beteAusaz();
		Sudokua berria=this.pasatu(sudo,genSudo,0,0,0);
		return berria;
	}
	public Sudokua pasatu(Sudokua pSudo,GeneradoreSudoku pGenSudo, int i,int j,int count){
		int kont=0;
		for (int k = i; k < i+3; k++) {
			for (int g = j; g < j+3; g++) {
				pSudo.getBloke(count).setKasila(kont,pGenSudo.getSudokuKasila(k,g));
				kont++;
			}
		}
		if(i==6 && j==6){return pSudo;}
		else{
			if(i==0 ||i==3){
				i=i+3;
			}
			else{i=0;j=j+3;}
			return pasatu(pSudo,pGenSudo,i,j,++count);
		}
		
	}
}
