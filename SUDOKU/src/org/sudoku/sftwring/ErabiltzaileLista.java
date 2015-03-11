package org.sudoku.sftwring;

import java.util.*;
public class ErabiltzaileLista {
	
	private static ErabiltzaileLista nErabiltzaileLista=null;
	private ArrayList<Erabiltzaile> erabiltzaileLista;
	private ErabiltzaileLista(){
		this.erabiltzaileLista=new ArrayList<Erabiltzaile>();
	}
	
	public static ErabiltzaileLista getErabiltzaileLista(){
		if (nErabiltzaileLista==null)
			nErabiltzaileLista= new ErabiltzaileLista();
		return nErabiltzaileLista;
	}
	
	public void gehituErabiltzaile(String pIzena,String pPasahitza){
		if(!badago(pIzena))
			erabiltzaileLista.add(new Erabiltzaile(pIzena,this.erabiltzaileLista.size()+1,new Sudokua(),pPasahitza));
		else {System.out.println("Erabiltzaile izen hori hartuta dago, mesedez aukeratu beste bat");}
	}

	public void ezabatuErabiltzaile(Erabiltzaile pErabiltzaile){
		erabiltzaileLista.remove(pErabiltzaile);
	}
	
	public Erabiltzaile bilatuErabiltzaile(String pIzen,String pPasaHitza){
		Iterator<Erabiltzaile> itr=this.getIteradorea();
		while(itr.hasNext()){
			Erabiltzaile unekoErabiltzaile=itr.next();
			if (unekoErabiltzaile.getIzen().equals(pIzen)&&unekoErabiltzaile.nirePasahitzaDa(pPasaHitza)){
				return unekoErabiltzaile;
			}
		}
		return null;
	}
	
	private Iterator<Erabiltzaile> getIteradorea(){
		return ErabiltzaileLista.nErabiltzaileLista.erabiltzaileLista.iterator();
	}
	
	public void inprimatu(){
		Iterator<Erabiltzaile> itr=this.getIteradorea();
		while(itr.hasNext()){
			itr.next().inprimatuDatuak();
		}
	}
	
	public boolean badago(String pIzen){

		Iterator<Erabiltzaile> itr=this.getIteradorea();
		while(itr.hasNext()){
			Erabiltzaile unekoErabiltzaile=itr.next();
			if (unekoErabiltzaile.getIzen().equals(pIzen)){
				return true;
			}
		}
		return false;
	}
}