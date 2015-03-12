package org.sudoku.sftwring;
public class Kasila{
private static int zuzena;
private int erabiltzaileBal;
private boolean finkoa;
public Kasila(int Balioa){
	this.zuzena=new Integer(Balioa);
	this.erabiltzaileBal=0;
	this.finkoa=false;
}
public void aldatu(int balioBerri){
	this.erabiltzaileBal=balioBerri;
}
private void imprimatu (){
	System.out.println(this.erabiltzaileBal);
}
private void reset(){
	this.zuzena=0;
	this.erabiltzaileBal=0;
	this.finkoa=false;
}
private boolean zuzenaDa(){
	return this.zuzena==this.erabiltzaileBal;
}
public static int getZuzena() {
	return zuzena;
}
public static void setZuzena(int zuzena) {
	Kasila.zuzena = zuzena;
}
public int getErabiltzaileBal() {
	return erabiltzaileBal;
}
public void setErabiltzaileBal(int erabiltzaileBal) {
	this.erabiltzaileBal = erabiltzaileBal;
}
public boolean isFinkoa() {
	return finkoa;
}
public void setFinkoa(boolean finkoa) {
	this.finkoa = finkoa;
}
}


