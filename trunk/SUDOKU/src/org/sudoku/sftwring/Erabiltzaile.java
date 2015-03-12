package org.sudoku.sftwring;


public class Erabiltzaile implements Comparable<Erabiltzaile> {

	private String izena;
	private  String pasahitza;
	private int ID;
	private float puntuazioa;
	private Sudokua azkenengoSudokua;
	
	public Erabiltzaile(String pIzena, int pID,Sudokua pSudoku,String pPasahitza){
		this.izena=pIzena;
		this.ID=pID;
		this.azkenengoSudokua=pSudoku;
		this.pasahitza=pPasahitza;
	}
	
	public String getIzen() {
		//Aurre:
		//Post: erabiltzailearen izena bueltatuko du
		return this.izena;
	}
	
	public int getID(){
		return this.ID;
	}
	public String getPasahitza() {
		return this.pasahitza;
	}
	public Sudokua getSudoku(){
		return this.azkenengoSudokua;
	}
	public boolean nirePasahitzaDa(String pPasahitza) {
		//Aurre: pasahitzarekin konparatu nahi dugun stringa sartuko dugu
		//Post: erabiltzailearen izena bueltatuko du
		return pasahitza.equals(pPasahitza);
	}

	public int compareTo(Erabiltzaile arg0) {
		//Aurre: arg0!=null
		//Post: zenbaki bat bueltatuko du, negatiboa sartutako erabiltzailearen izena honena baino aurretik badago alfabetikoki
		//positiboa bueltatuko du sartutako erabiltzailearen izena honena baino atzerago badago alfabetikoki
		//eta zero bien izenak berdinak direnean
		return this.izena.compareTo(arg0.getIzen());
	}
	
	public void gehituPuntuak(float pPuntuak) {
		puntuazioa = puntuazioa + pPuntuak;
	}
	
	public float getPuntuazioa() {
		return puntuazioa;
	}

	public void inprimatuDatuak() {
		//Aurre:
		//Post: Erabiltzailearen datuak inprimatuko ditu
		System.out.println("Izena: "+this.izena);
		System.out.println("ID: "+this.ID);
		System.out.println("Puntuazioa: "+this.puntuazioa);

	}

}
