package org.sudoku.sftwring;

import java.util.ArrayList;
import java.util.Iterator;

public class Klasifikazioa {
	private ArrayList<Integer> ranking;

	public Klasifikazioa(){
		this.ranking = new ArrayList<Integer>();
	}

	public void add(Erabiltzaile erab){
		//	aurre:
		//	post: erabiltzailea zerrendan ez badago gehitu egingo du segituan ordenatzeko
		if (this.emanErabHonenPos(erab)==-1){
			ranking.add(erab.getID());
			this.eguneratu();
		}
	}

	public void eguneratu(){
		//	aurre:
		//	post: rankingeko erabiltzaileak beheranzko ordenean ordenatuko ditu puntuazioan oinarrituz
		for (int i = 0; i < ErabiltzaileLista.getErabiltzaileLista().erabiltzaileKop(); i++) {
			ranking.add(ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(i).getID());
		}

		quickSort(ranking, 0, ranking.size()-1);
		
		System.out.println(ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(ranking.get(0)).getPuntuazioa());

	}

	private Iterator<Integer> getIteradorea(){
		return ranking.iterator();
	}

	public int emanErabHonenPos(Erabiltzaile erab){
		//	aurre: erab!=null
		//	post: erabiltzailearen posizioa itzuliko du eta -1 erabiltzailea ez bada zerrendan aurkitzen
		int hasi = 0;
		int amai = ranking.size()-1;
		int erdi = 0;

		while (hasi<=amai) {

			erdi = (hasi+amai)/2;
			int konp =((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(ranking.get(erdi)).getPuntuazioa()).compareTo((Float)erab.getPuntuazioa());

			if (konp<0) {
				hasi=erdi+1;
			} else if (konp>0) {
				amai=erdi-1;
			} else return erdi;
		}
		return -1;
	}

	public void erreseteatu(){
		this.ranking = new ArrayList<Integer>();
	}

	public ArrayList<Erabiltzaile> erabiltzaileenListaKlasifikatorian() {
		//Aurre:
		//Post: Erabiltzaileen zerrenda bat bueltatuko du klasifikazioan ordenatuta dauden bezala.
		ArrayList<Erabiltzaile> erabKlasf = new ArrayList<Erabiltzaile>();
		for (Integer i : ranking) {
			erabKlasf.add(ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(ranking.get(i)));
		}
		return erabKlasf;
	}

	public void inprimatuKlasifikazioa(){
		//aurre: 
		//post: Erabiltzaileen izena eta puntuazioa itzuliko du, beherazko ordenean
		Iterator<Integer> itr = this.getIteradorea();
		int pos = 1;
		while(itr.hasNext()){
			int erabID=(int)itr.next();
			Erabiltzaile unekoa = ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(erabID);
			System.out.println(pos + unekoa.getIzen() + unekoa.getPuntuazioa());
			pos++;
		}
	}

	private void quickSort(ArrayList<Integer> taula, int hasiera,int bukaera) {

		if (bukaera-hasiera>0) {
			int indizeaZatiketa = zatiketa(taula,hasiera,bukaera);
			quickSort(taula, hasiera, indizeaZatiketa-1);
			quickSort(taula, indizeaZatiketa+1, bukaera);
		}

	}

	private int zatiketa(ArrayList<Integer> taula, int l, int r) {

		Integer lag = taula.get(l);
		int ezker=l;
		int eskuin=r;

		while (ezker<eskuin) {
			while(((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile((taula.get(ezker))).getPuntuazioa()).compareTo((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(lag).getPuntuazioa()) >= 0 && ezker<eskuin) {
				if (((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile((taula.get(ezker))).getPuntuazioa()).compareTo((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(lag).getPuntuazioa()) == 0) {
					 if (((Integer)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile((taula.get(ezker))).getID()).compareTo((Integer)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(lag).getID()) >= 0)
						ezker++;
					else
						eskuin--;
				} else
					ezker ++;

			}

			while(((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile((taula.get(eskuin))).getPuntuazioa()).compareTo((Float)ErabiltzaileLista.getErabiltzaileLista().getErabiltzaile(lag).getPuntuazioa()) < 0)
				eskuin--;
			if(ezker<eskuin)
				swap(taula,ezker,eskuin);
		}
		taula.set(l, taula.get(eskuin));
		taula.set(eskuin, lag);
		return eskuin;

	}

	private void swap(ArrayList<Integer> taula, int ezker, int eskuin) {

		Integer aux = taula.get(ezker);
		taula.set(ezker, taula.get(eskuin));
		taula.set(eskuin, aux);

	}

}