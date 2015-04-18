package org.sudoku.sftwring;

import java.util.ArrayList;

public class Adabegia<T> {
	
	protected T content;
	protected int sakonera;
	protected Adabegia<T> gurasoa;
	protected ArrayList<Adabegia<T>> semea;
	
	public Adabegia(T elem, int zenb){
		this.content = elem;
		this.sakonera = zenb;
		this.semea = null;
	}
	
	public Adabegia<T> gehituSemea(T elem,int zenb){
		Adabegia<T> semeAdabegi = new Adabegia<T>(elem,zenb);
		this.semea.add(semeAdabegi);
		return semeAdabegi;
	}
	
}
