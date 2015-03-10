package org.sudoku.sftwring;




public class Erabiltzaile implements Comparable<Erabiltzaile> {

	private String izena;
	private String abizena;
	private  String pasahitza;
	private int ID;
	private float puntuazioa;
	private Sudokua azkenengoSudokua;
public Erabiltzaile(String pIzena,String pAbizena, int pID,Sudokua pSudoku,String pPasahitza){
	this.izena=pIzena;
	this.abizena=pAbizena;
	this.ID=pID;
	this.azkenengoSudokua=pSudoku;
	this.pasahitza=pPasahitza;
}
	public String getIzen() {
		return this.izena;
	}
	public String getPasahitza() {
		return this.pasahitza;
	}

	public int compareTo(Erabiltzaile arg0) {
		return this.izena.compareTo(arg0.izena);
	}

	public void inprimatuDatuak() {
		System.out.println("Izena: "+this.izena);
		System.out.println("Abizena: "+this.abizena);
		System.out.println("ID: "+this.ID);
		System.out.println("Puntuazioa: "+this.puntuazioa);
		
	}

}
