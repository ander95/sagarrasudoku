package org.sudoku.sftwring;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class Klasifikazioa {
	private AbstractCollection<Integer> ranking;
	private Klasifikazioa(){
		this.ranking = new ArrayList<Integer>();
	}
	
	public void add(int id){
//	aurre:
//	post: erabiltzailea zerrendan ez badago gehitu egingo du segituan ordenatzeko
		if (this.bilatu(id)==-1){
			ranking.add(id);
			this.eguneratu();
		}
	}
	
	public void eguneratu(){
//	aurre:
//	post: rankingeko erabiltzaileak beheranzko ordenean ordenatuko ditu puntuazioan oinarrituz
		
	}
	
	private Iterator<Integer> getIteradorea(){
		return ranking.iterator();
	}
	
	public int bilatu(int id){
//	aurre:
//	post: erabiltzailearen posizioa itzuliko du eta -1 erabiltzailea ez bada zerrendan aurkitzen
		int pos = 1;
		boolean aurkitua = false;
		Iterator<Integer> itr = this.getIteradorea();
		while(itr.hasNext() || !aurkitua){
			if ((int)itr.next()==id){
				aurkitua=true;
				return pos;
			}
			else{
				pos++;
			}
		}
		return -1;
	}
	
	public void erreseteatu(){
		this.ranking = new ArrayList<Integer>();
	}
	
	public void inprimatuKlasifikazioa(){
//		aurre: 
//		post: Erabiltzaileen izena eta puntuazioa itzuliko du, beherazko ordenean
		Iterator<Integer> itr = this.getIteradorea();
		int pos = 1;
		while(itr.hasNext()){
			int erabID=(int)itr.next();
			Erabiltzaile unekoa = ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(erabID);
			System.out.println(pos + unekoa.getIzen() + unekoa.getPuntuazioa());
			pos++;
		}
	}

}