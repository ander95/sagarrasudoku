package org.sudoku.sftwring;

import java.util.Random;

public class Sudokua {
	Bloke [] blokeZerrenda= new Bloke [9];

	public static void main(String[] args) {
		Sudokua s=new Sudokua();	

		s.blokeZerrenda[0]=new Bloke();
		s.blokeZerrenda[1]=new Bloke();
		s.blokeZerrenda[2]=new Bloke();
		s.blokeZerrenda[3]=new Bloke();
		s.blokeZerrenda[4]=new Bloke();
		s.blokeZerrenda[5]=new Bloke();
		s.blokeZerrenda[6]=new Bloke();
		s.blokeZerrenda[7]=new Bloke();
		s.blokeZerrenda[8]=new Bloke();
		for (int i=0;i<9;i++){
			s.blokeZerrenda[0].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[1].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[2].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[3].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[4].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[5].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[6].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[7].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[8].kasilaZerrenda[i]=new Kasila();
		}
		s.inprimatuSudoku();
		System.out.println("----------------------------------------------"+"\n");
		s.blokeZerrenda[0].aldatuKasila_(0, 1);
		s.blokeZerrenda[1].aldatuKasila_(1, 1);
		s.blokeZerrenda[2].aldatuKasila_(2, 1);
		s.blokeZerrenda[3].aldatuKasila_(3, 1);
		s.blokeZerrenda[4].aldatuKasila_(4, 1);
		s.blokeZerrenda[5].aldatuKasila_(5, 1);
		s.blokeZerrenda[6].aldatuKasila_(6, 1);
		s.blokeZerrenda[7].aldatuKasila_(7, 1);
		s.blokeZerrenda[8].aldatuKasila_(8, 1);
		s.inprimatuSudoku();
		s=s.erreseteatuSudoku();
		System.out.println("----------------------------------------------"+"\n");
		s.blokeZerrenda[0].aldatuKasila_(0, 1);
		s.blokeZerrenda[1].aldatuKasila_(0, 1);
		s.blokeZerrenda[2].aldatuKasila_(0, 1);
		s.blokeZerrenda[3].aldatuKasila_(0, 1);
		s.blokeZerrenda[4].aldatuKasila_(0, 1);
		s.blokeZerrenda[5].aldatuKasila_(0, 1);
		s.blokeZerrenda[6].aldatuKasila_(0, 1);
		s.blokeZerrenda[7].aldatuKasila_(0, 1);
		s.blokeZerrenda[8].aldatuKasila_(0, 1);
		s.inprimatuSudoku();
		System.out.println("----------------------------------------------"+"\n");
		s.ausazBete().inprimatuSudoku();

	}
	public void inprimatuSudoku(){


		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[0].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[1].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[2].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[3].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[4].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[5].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[6].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[7].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");
		for(int i = 0;i<9;i++)
			System.out.print(this.blokeZerrenda[8].kasilaZerrenda[i].balioa+"   ");
		System.out.println("\n");

	}
	private Sudokua erreseteatuSudoku(){
		Sudokua s=new Sudokua();	

		s.blokeZerrenda[0]=new Bloke();
		s.blokeZerrenda[1]=new Bloke();
		s.blokeZerrenda[2]=new Bloke();
		s.blokeZerrenda[3]=new Bloke();
		s.blokeZerrenda[4]=new Bloke();
		s.blokeZerrenda[5]=new Bloke();
		s.blokeZerrenda[6]=new Bloke();
		s.blokeZerrenda[7]=new Bloke();
		s.blokeZerrenda[8]=new Bloke();
		for (int i=0;i<9;i++){
			s.blokeZerrenda[0].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[1].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[2].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[3].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[4].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[5].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[6].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[7].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[8].kasilaZerrenda[i]=new Kasila();
		}
		return s;

	}
	private Sudokua ausazBete(){

		Sudokua s=new Sudokua();	

		s.blokeZerrenda[0]=new Bloke();
		s.blokeZerrenda[1]=new Bloke();
		s.blokeZerrenda[2]=new Bloke();
		s.blokeZerrenda[3]=new Bloke();
		s.blokeZerrenda[4]=new Bloke();
		s.blokeZerrenda[5]=new Bloke();
		s.blokeZerrenda[6]=new Bloke();
		s.blokeZerrenda[7]=new Bloke();
		s.blokeZerrenda[8]=new Bloke();
		for (int i=0;i<9;i++){
			s.blokeZerrenda[0].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[1].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[2].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[3].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[4].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[5].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[6].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[7].kasilaZerrenda[i]=new Kasila();
			s.blokeZerrenda[8].kasilaZerrenda[i]=new Kasila();}

		int kont=0;
		int zenb=1;
		while (kont<10){
			int unekoX=s.sortuX();
			int unekoY=s.sortuY();
			if(posibleX(s, unekoX, zenb)&&posibleY(s,unekoY,zenb)){
				s.blokeZerrenda[unekoX].kasilaZerrenda[unekoY].balioa=zenb;
				kont++;}

		}












		return s;
	}
	private boolean posibleX(Sudokua pSudoku,int errenkada,int zenb){
		boolean posible=true;
		for (int i=0;i<9;i++)
			if(pSudoku.blokeZerrenda[errenkada].kasilaZerrenda[i].balioa==zenb)
				posible=false;
		return posible;


	}
	private boolean posibleY(Sudokua pSudoku,int zutabe,int zenb){
		boolean posible=true;
		for (int i=0;i<9;i++)
			if(pSudoku.blokeZerrenda[i].kasilaZerrenda[zutabe].balioa==zenb)
				posible=false;
		return posible;


	}
	private int sortuX(){
		Random ausazkoZenbaki = new Random();
		int hasX= ausazkoZenbaki.nextInt(9);
		return hasX;
	}
	private int sortuY(){
		Random ausazkoZenbaki = new Random();
		int hasY= ausazkoZenbaki.nextInt(9);
		return hasY;
	}
}
