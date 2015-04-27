package org.sudoku.sftwring;

public class Sudokua {
	private Bloke [][] sudoku;
	private int luzera = 3;
	private int zabalera = 3;
	private int zailtasuna;
	
	public Sudokua() {
		sudoku = new Bloke[luzera][zabalera];
		beteZeroz();
	}

	public void inprimatuSudoku(){

		for (int i = 0; i < luzera; i++) {
			for (int j = 0; j < zabalera; j++) {
				sudoku[i][j].inprimatuBloke();;
			}
		}
	}
	
	public void inprimatuSudokuZuzena(){

		for (int i = 0; i < luzera; i++) {
			for (int j = 0; j < zabalera; j++) {
				sudoku[i][j].inprimatuBlokeZuzen();
			}
		}
	}
	
	public Sudokua erreseteatuSudoku(){
		//Aurre:
		//Post:Sudokua hasieratuko du
		Sudokua sudokuBerria= new Sudokua();
		return  sudokuBerria;	
	}

	public Bloke getBloke(int i){
		Bloke pBloke=null;
		switch(i){
		case 0:pBloke=sudoku[0][0];break;
		case 1:pBloke=sudoku[0][1];break;
		case 2:pBloke=sudoku[0][2];break;
		case 3:pBloke=sudoku[1][0];break;
		case 4:pBloke=sudoku[1][1];break;
		case 5:pBloke=sudoku[1][2];break;
		case 6:pBloke=sudoku[2][0];break;
		case 7:pBloke=sudoku[2][1];break;
		case 8:pBloke=sudoku[2][2];break;
		}
//		if (i==0) pBloke=sudoku[0][0];
//		else if (i==1) pBloke=sudoku[0][1];
//		else if (i==2) pBloke=sudoku[0][2];
//		else if (i==3) pBloke=sudoku[1][0];
//		else if (i==4) pBloke=sudoku[1][1];
//		else if (i==5) pBloke=sudoku[1][2];
//		else if (i==6) pBloke=sudoku[2][0];
//		else if (i==7) pBloke=sudoku[2][1];
//		else if (i==8) pBloke=sudoku[2][2];
		
		
		return pBloke;
	}
	public Kasila getKasila(int i, int j) {
		int blokeI = i/3;
		int blokeJ = j/3;
		int kasilaI = i - (blokeI*3);
		int kasilaJ = j - (blokeJ*3);
		return sudoku[blokeI][blokeJ].getKasila(kasilaI,kasilaJ);
	}
	public void setKasila(int i, int j, Kasila pKasila) {
		int blokeI = i/3;
		int blokeJ = j/3;
		int kasilaI = i - (blokeI*3);
		int kasilaJ = j - (blokeJ*3);
		sudoku[blokeI][blokeJ].setKasila(kasilaI,kasilaJ,pKasila);
	}
	public String gorde(){
		//Aurre:
		//Post:Sudokua String batetara pasako da.
		String emaitza="";
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				emaitza=emaitza+sudoku[j][k].gorde();
				emaitza=emaitza+"/";
			}
		}
		return emaitza;
	}

	public void kargatu(String pSudoku){
		//Aurre: pSudoku String-a sudoku bat betetzeko behar beste zenbakiz egongo da beteta.
		//Post: Sudokua zenbakiz beteko da.
		if(!pSudoku.equals("")){
			String[] arrayString=pSudoku.split("/");
			int cont=0;
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					sudoku[j][k].kargatu(arrayString[cont]);
					cont++;
				}
			}
		}else beteZeroz();
	}

	public void beteZeroz(){
		//Aurre:
		//Post:Sudokua 0roz beteko du.
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				sudoku[i][j]=new Bloke();	 
			}
		}
	}
	

	public void setZailtasuna(int i){
		this.zailtasuna=i;
	}
	public int getZailtasuna(){
		return this.zailtasuna;
	}

	public void ausazBete() {/*Ausaz betetzeko metodoa bere semeetan definituko da Adib.: Adapterrean*/}
}




