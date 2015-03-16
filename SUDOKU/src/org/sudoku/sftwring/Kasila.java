package org.sudoku.sftwring;

public class Kasila{
	private static Integer zuzena;
	private Integer erabiltzaileBal;
	private boolean finkoa;
	public Kasila(Integer Balioa){
		Kasila.zuzena=new Integer(Balioa);
		this.erabiltzaileBal=0;
		this.finkoa=false;
	}

	public void aldatu(Integer balioBerri){
		if(!this.finkoa)
			this.erabiltzaileBal=balioBerri;
		else{
			System.out.println("Ezin izan da balioa aldatu, finkoa da");
		}
	}
	
	public String gorde(){
		String emaitza="";
		emaitza=emaitza+Kasila.zuzena;
		emaitza=emaitza+"-";
		emaitza=emaitza+this.erabiltzaileBal;
		emaitza=emaitza+"-";
		emaitza=emaitza+this.finkoa;
		emaitza=emaitza+"-";
		return emaitza;
	}
	public void kargatu(String pKasila){
		String[] pKas=pKasila.split("-");
		Kasila.zuzena=new Integer(pKas[0]);
		this.erabiltzaileBal=new Integer(pKas[1]);
		if(pKas[2].equals("true"))
			this.finkoa=true;
		else this.finkoa=false;

	}
	public void inprimatuKasila(){
		System.out.println("Erabiltzaile Balioa: "+this.erabiltzaileBal);
		System.out.println("Balio Zuzena: "+Kasila.zuzena);
		if(this.finkoa==false)System.out.println("Ez da finkoa.");
		else{System.out.println("Finkoa da.");}
	}

	public Kasila kasilaErreseteatu(){
		return new Kasila(0);
	}

	public int getErabiltzaileBal() {
		return erabiltzaileBal;
	}

	public void setFinkoa(boolean e) {
		this.finkoa = e;
		
	}
}

