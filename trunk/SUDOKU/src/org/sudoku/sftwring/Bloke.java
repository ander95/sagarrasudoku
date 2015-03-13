package org.sudoku.sftwring;

public class Bloke {
	
	private Kasila [][] bloke;

	public Bloke() {
		bloke = new Kasila[3][3];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++) {
				bloke[i][j]=new Kasila(0);	 
			}
		}
	}
	
	
	public void inprimatuBloke(){
		for (int i = 0; i < bloke.length; i++) {
			for (int j = 0; j < bloke[i].length; j++) {
				System.out.println(bloke[i][j].getErabiltzaileBal());
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
	
	public String pasatuString(){
		String emaitza="";
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					emaitza=emaitza+Kasila.getZuzena();
					emaitza=emaitza+"-";
					emaitza=emaitza+bloke[j][k].getErabiltzaileBal();
					emaitza=emaitza+"-";
					emaitza=emaitza+bloke[j][k].getFinkoa();
					emaitza=emaitza+"-";
				}
			}
			return emaitza;
	}
	public void idatziBloke(String pBloke){
		String[] arrayKasila=pBloke.split("-");
		int cont=0;
		for(int j=0;j<3;j++){
			for(int k=0;k<3;k++){
				Kasila.setZuzena(new Integer(arrayKasila[cont]));
				cont++;
				bloke[j][k].setErabiltzaileBal(new Integer(arrayKasila[cont]));
				cont++;
				bloke[j][k].setFinkoa(arrayKasila[cont]);
			}
		}
	}


}

