package org.sudoku.sftwring;

import java.util.Random;

public class Bloke {

	private Kasila [][] bloke;
	private int luzera = 3;
	private int zabalera = 3;

	public Bloke() {
		bloke = new Kasila[luzera][zabalera];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				bloke[i][j]=new Kasila(0);	 
			}
		}
	}

	public int blokekoKasilaAusazEditatu(int i,int j) {
		Random ausa = new Random();
		int balioa = ausa.nextInt(9)+1;
		while (!bloke[i][j].betetaDago()) {
			if (bloke[i][j].zenbPosibleaDa(balioa))
				bloke[i][j] = new Kasila(balioa);
		}

		return balioa;

	}

	public void kasilaZenbPosibleaEzgaitu(int i,int j,int pZenb) {
		bloke[i][j].zenbPosibleaEzgaitu(pZenb);
	}

	public int getLuzera() {
		return luzera;
	}

	public int getZabalera() {
		return zabalera;
	}

	public boolean kasilaZenbPosibleaDa(int i,int j,int pZenb) {
		return bloke[i][j].zenbPosibleaDa(pZenb);
	}

	public void inprimatuBloke(){
		for (int i = 0; i < luzera; i++) {
			for (int j = 0; j < zabalera; j++) {
				if ((i==2&&j==2)||(i==0&&j==2)||(i==1&&j==2))System.out.print(" "+bloke[i][j].getErabiltzaileBal()+"\n");else{
					System.out.print(" "+bloke[i][j].getErabiltzaileBal());}
			}
		}

	}

	public void inprimatuBlokeZuzen(){
		for (int i = 0; i < luzera; i++) {
			for (int j = 0; j < zabalera; j++) {
				if ((i==2&&j==2)||(i==0&&j==2)||(i==1&&j==2)){
					System.out.print(" ");
					bloke[i][j].inprimatuZuzena();
					System.out.println("\n");
				}
				else{
					System.out.print(" ");
					bloke[i][j].inprimatuZuzena();
				}
			}
		}

	}

	public String gorde(){
		//Aurre
		//Post:String bat bueltatiko du zeinek blokeko kasiletako datuak bananduta edokiko dituen.
		String emaitza="";
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				emaitza=emaitza+bloke[j][k].gorde();
				emaitza=emaitza+"%";
			}
		}
		return emaitza;
	}

	public void kargatu(String pBloke){
		//Aurre:Bloke bat betetzeko bezain beste zenbaki daramatzan string bat sartuko da "-" banandurik
		//Post:Blokeko kasilak dagokien zenbakiekin beteko ditu.
		String[] arrayKasila=pBloke.split("%");
		int cont=0;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				bloke[j][k].kargatu(arrayKasila[cont]);
				cont++;
			}

		}
	}

}
