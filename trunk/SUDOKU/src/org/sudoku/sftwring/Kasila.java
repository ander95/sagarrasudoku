package org.sudoku.sftwring;
public class Kasila{
	int balioa=0;	
	public static void main(String[] args){	
		Kasila k= new Kasila();
		k.balioa=0;
		k.inprimatuKasila();
		k.aldatuBalioa(9);
		k.inprimatuKasila();
	}
	private void inprimatuKasila(){
		System.out.println(balioa);	
	}

	private void aldatuBalioa(int pBalioa){
		this.balioa=pBalioa;	
	}
	private void erreseteatuKasila (Kasila pKasila){
		pKasila.balioa=0;
	}
}


