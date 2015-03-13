package org.sudoku.sftwring;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ErabiltzaileLista {
	
	private static ErabiltzaileLista nErabiltzaileLista=null;
	private ArrayList<Erabiltzaile> erabiltzaileLista;
	private Klasifikazioa egunekoKlasifikazioa;
	private Klasifikazioa klasifikazioa;
	private ErabiltzaileLista(){
		this.erabiltzaileLista=new ArrayList<Erabiltzaile>();
		this.egunekoKlasifikazioa = new Klasifikazioa();
		this.klasifikazioa = new Klasifikazioa();
	}
	
	public static ErabiltzaileLista getErabiltzaileLista(){
		if (nErabiltzaileLista==null)
			nErabiltzaileLista= new ErabiltzaileLista();
		return nErabiltzaileLista;
	}
	
	public void gehituErabiltzaile(String pIzena,String pPasahitza){
		if(!badago(pIzena))
			erabiltzaileLista.add(new Erabiltzaile(pIzena,this.erabiltzaileLista.size()+1,"",pPasahitza));
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
	public void kargatu() throws IOException{
		try{
		Scanner sarrera = new Scanner(new FileReader("C:\\archivo.txt"));
		while(sarrera.hasNext()){
			String lerroa=sarrera.nextLine();
			String[] lerroArray=lerroa.split(" \\ ");
			Erabiltzaile pErab=new Erabiltzaile(lerroArray[0],new Integer(lerroArray[1]),lerroArray[2],lerroArray[3]);
			ErabiltzaileLista.nErabiltzaileLista.erabiltzaileLista.add(pErab);
		}
		sarrera.close();
		}catch(IOException e) {e.printStackTrace();}
		
	}
	
	public Erabiltzaile getErabiltzaile(int pId) {
		return erabiltzaileLista.get(pId);
	}
	
	public void gorde(){
		try
	    {
	    	PrintWriter pw = new PrintWriter(new FileWriter("C:\\archivo.txt"));
	    	Iterator<Erabiltzaile> it=this.getIteradorea();
	    	while(it.hasNext()){
	    		String pErab=it.next().gorde();
	    		pw.println(pErab);
	    	}
	        pw.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	}
	}
	
	public Klasifikazioa getKlasifikazioa() {
		return klasifikazioa;
	}

	public Klasifikazioa getEgunekoKlasifikazioa() {
		return egunekoKlasifikazioa;
	}
}