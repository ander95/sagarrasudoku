package org.sudoku.sftwring;

public class GeneradoreKasila {

	private Integer zuzena;
		private Integer erabiltzaileBal;
		private boolean finkoa;
		
		public GeneradoreKasila(int balioa){
			this.zuzena=balioa;
			this.erabiltzaileBal=0;
			this.finkoa=false;
		}
		
		public void setBalioZuzena(int zenb){
			zuzena=zenb;
		}
		
		public int getBalioZuzena (){
			return zuzena;
		}
		
		public void setErabiltzaileBal(int zenb){
			if(this.finkoa==false){
				this.erabiltzaileBal=zenb;
			}
		}
		
		public int getErabiltzaileBal(){
			return this.erabiltzaileBal;
		}
		
		public void setKasilaFinkoa(boolean e){
			this.finkoa=e;
		}
		
		public void inprimatuZuzena(){
			System.out.print(zuzena);
		}

}
