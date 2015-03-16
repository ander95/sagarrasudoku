package org.sudoku.sftwring;

public class Sudokua {
	private Bloke [][] sudoku;

	public Sudokua() {
		sudoku = new Bloke[3][3];
		beteZeroz();
	}

	public void inprimatuSudoku(){

		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				sudoku[i][j].inprimatuBloke();;
			}
		}
	}

	public Sudokua erreseteatuSudoku(){
		//Aurre:
		//Post:Sudokua hasieratuko du
		Sudokua sudokuBerria= new Sudokua();
		return  sudokuBerria;	
	}

	public String pasatuString(){
		//Aurre:
		//Post: sudoku bat emanda haren blokeak banan banan string bihurtzen ditu
		String emaitza="";
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				emaitza=emaitza+(String)sudoku[j][k].pasatuString();
				emaitza=emaitza+"//";
			}
		}
		return emaitza;
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

	public void pasatuSudoku(String pSudoku){
		//Aurre:
		/*Post:String eran sudoku bat hartuz gordetzeko moldatzen du eta bestela
		Berrabiarazi.*/
		if(!pSudoku.equals("")){
			String[] arrayString=pSudoku.split("//");
			int cont=0;
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					sudoku[j][k].idatziBloke(arrayString[cont]);
					cont++;
				}
			}
		}else eraikiSudoku(pSudoku);
	}

	public Sudokua eraikiSudoku(String sSUdo){
		//Aurre:
		//Post:Sudokua null bezala hasieratuko da.
		Sudokua pSudoku=null;
		return pSudoku;
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
	//	private S ausazBete(){
	//
	//		S s=new S();	

	//		s.blokeZerrenda[0]=new Bloke();
	//		s.blokeZerrenda[1]=new Bloke();
	//		s.blokeZerrenda[2]=new Bloke();
	//		s.blokeZerrenda[3]=new Bloke();
	//		s.blokeZerrenda[4]=new Bloke();
	//		s.blokeZerrenda[5]=new Bloke();
	//		s.blokeZerrenda[6]=new Bloke();
	//		s.blokeZerrenda[7]=new Bloke();
	//		s.blokeZerrenda[8]=new Bloke();
	//		for (int i=0;i<9;i++){
	//			s.blokeZerrenda[0].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[1].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[2].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[3].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[4].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[5].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[6].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[7].kasilaZerrenda[i]=new Kasila();
	//			s.blokeZerrenda[8].kasilaZerrenda[i]=new Kasila();}
	//
	//		int kont=0;
	//		int zenb=1;
	//		while (kont<10){
	//			int unekoX=s.sortuX();
	//			int unekoY=s.sortuY();
	//			if(posibleX(s, unekoX, zenb)&&posibleY(s,unekoY,zenb)){
	//				s.blokeZerrenda[unekoX].kasilaZerrenda[unekoY].balioa=zenb;
	//				kont++;}

	//		}












	//		return s;
	//	}
	//	private boolean posibleX(S pSudoku,int errenkada,int zenb){
	//		boolean posible=true;
	//		for (int i=0;i<9;i++)
	//			if(pSudoku.blokeZerrenda[errenkada].kasilaZerrenda[i].balioa==zenb)
	//				posible=false;
	//		return posible;
	//
	//
	//	}
	//	private boolean posibleY(S pSudoku,int zutabe,int zenb){
	//		boolean posible=true;
	//		for (int i=0;i<9;i++)
	//			if(pSudoku.blokeZerrenda[i].kasilaZerrenda[zutabe].balioa==zenb)
	//				posible=false;
	//		return posible;
	//
	//
	//	}
	//	private int sortuX(){
	//		Random ausazkoZenbaki = new Random();
	//		int hasX= ausazkoZenbaki.nextInt(9);
	//		return hasX;
	//	}
	//	private int sortuY(){
	//		Random ausazkoZenbaki = new Random();
	//		int hasY= ausazkoZenbaki.nextInt(9);
	//		return hasY;
	//	}
}


