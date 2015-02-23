package org.sudoku.sftwring;

public class Bloke {
Kasila [] kasilaZerrenda= new Kasila [9];

	public static void main(String[] args) {
Bloke b =new Bloke();

b.kasilaZerrenda[0]=new Kasila();
b.kasilaZerrenda[1]=new Kasila();
b.kasilaZerrenda[2]=new Kasila();
b.kasilaZerrenda[3]=new Kasila();
b.kasilaZerrenda[4]=new Kasila();
b.kasilaZerrenda[5]=new Kasila();
b.kasilaZerrenda[6]=new Kasila();
b.kasilaZerrenda[7]=new Kasila();
b.kasilaZerrenda[8]=new Kasila();
b.inprimatuBloke();
b.aldatuKasila_(0, 1);
b.aldatuKasila_(4, 1);
b.aldatuKasila_(8, 1);
b.inprimatuBloke();
	}
public Bloke inprimatuBloke(){
	System.out.println(this.kasilaZerrenda[0].balioa+"   "+this.kasilaZerrenda[1].balioa+"   "+this.kasilaZerrenda[2].balioa+"   "+"\n");	
	System.out.println(this.kasilaZerrenda[3].balioa+"   "+this.kasilaZerrenda[4].balioa+"   "+this.kasilaZerrenda[5].balioa+"   "+"\n");
	System.out.println(this.kasilaZerrenda[6].balioa+"   "+this.kasilaZerrenda[7].balioa+"   "+this.kasilaZerrenda[8].balioa+"   "+"\n");
	return this;
	}
public void aldatuKasila_(int pInd,int pBalioBerria){
	this.kasilaZerrenda[pInd].balioa=pBalioBerria;
}

}

