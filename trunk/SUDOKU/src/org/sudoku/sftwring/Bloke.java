package org.sudoku.sftwring;

public class Bloke {
	

Bloke() {
	Kasila [][] bloke= new Kasila [3][3];//nola hasieratzen da hau?
  }
 
  Bloke(Kasila[][] bloke) {
 for (int i=0;i<3;i++){
	 for (int j=0;j<3;j++) {
	bloke[i][j]=new Kasila();	 
	 }
 }
  }
	public static void main(String[] args) {
Bloke b=new Bloke();
Bloke.inprimatuBloke();
//b.bloke[0][0]=new Kasila();
//b.bloke[0][1]=new Kasila();
//b.bloke[0][2]=new Kasila();
//b.bloke[1][0]=new Kasila();
//b.bloke[1][1]=new Kasila();
//b.bloke[1][2]=new Kasila();
//b.bloke[2][0]=new Kasila();
//b.bloke[2][1]=new Kasila();
//b.bloke[2][2]=new Kasila();
//inprimatuBloke(b);
b.aldatuKasila_(b,0,0, 1);
b.aldatuKasila_(b,1,2, 1);
b.aldatuKasila_(b,2,2, 1);
b.inprimatuBloke();
	}
private static void inprimatuBloke() {
		// TODO Auto-generated method stub
		
	}

public Bloke inprimatuBloke(){
	System.out.println(bloke[0][0].balioa+"   "+bloke[0][1].balioa+"   "+bloke[0][2].balioa+"   "+"\n");	
	System.out.println(bloke[1][0].balioa+"   "+bloke[1][1].balioa+"   "+bloke[1][2].balioa+"   "+"\n");
	System.out.println(bloke[2][0].balioa+"   "+bloke[2][1].balioa+"   "+bloke[2][2].balioa+"   "+"\n");
	return this;
	}
public void aldatuKasila_(Bloke b,int pIndX,int pIndY,int pBalioBerria){
	b[pIndX][pIndX].balioa=pBalioBerria;
}

}

