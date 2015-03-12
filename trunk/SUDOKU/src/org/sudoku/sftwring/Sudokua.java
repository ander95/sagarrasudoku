package org.sudoku.sftwring;

public class Sudokua {
	private Bloke [][] sudoku;

	public Sudokua() {
		sudoku = new Bloke[3][3];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				sudoku[i][j]=new Bloke();	 
			}
		}
	}


	public void inprimatuSudoku(){
		
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				sudoku[i][j].inprimatuBloke();;
			}
		}
	}
	private Sudokua erreseteatuSudoku(){
		Sudokua sudokuBerria= new Sudokua();
		return  sudokuBerria;	
	}
	public String pasatuString(){
		String emaitza="";
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					emaitza=emaitza+(String)sudoku[j][k].pasatuString();
					emaitza=emaitza+"//";
				}
			}
		return emaitza;
	}
	
	public void pasatuSudoku(String pSudoku){
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
		Sudokua pSudoku=null;
		return pSudoku;
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

