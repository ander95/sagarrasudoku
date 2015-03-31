package org.sudoku.sftwring;

public class Kasila{
	private static Integer zuzena;
	private Integer erabiltzaileBal;
	private boolean finkoa;
	private boolean[] posibleak;
	public Kasila(Integer Balioa){
		Kasila.zuzena=new Integer(Balioa);
		this.erabiltzaileBal=0;
		this.finkoa=false;
		this.posibleak=new boolean[]{true,true,true,true,true,true,true,true,true};
	}

	public void aldatu(Integer balioBerri){
		if(!this.finkoa)
			this.erabiltzaileBal=balioBerri;
		else{
			System.out.println("Ezin izan da balioa aldatu, finkoa da");
		}
	}
	
	public boolean betetaDago(){
		return zuzena!=0;
	}
	
	public void zenbPosibleaEzgaitu(int pZenb) {
		this.posibleak[pZenb-1] = false;
	}
	
	public boolean zenbPosibleaDa(int pZenb) {
		if (betetaDago()) return false;
		else return this.posibleak[pZenb-1];
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
		Kasila.zuzena=Integer.parseInt(pKas[0]);
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
	
	public void inprimatuZuzena() {
		System.out.print(zuzena);
	}

	public void setFinkoa(boolean e) {
		this.finkoa = e;
		
	}
}

