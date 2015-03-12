package org.sudoku.sftwring;
public class Kasila{
private static Integer zuzena;
private Integer erabiltzaileBal;
private boolean finkoa;
public Kasila(Integer Balioa){
	this.zuzena=new Integer(Balioa);
	this.erabiltzaileBal=0;
	this.finkoa=false;
}
public void aldatu(Integer balioBerri){
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
public static Integer getZuzena() {
	return zuzena;
}
public static void setZuzena(Integer zuzena) {
	Kasila.zuzena = zuzena;
}
public int getErabiltzaileBal() {
	return erabiltzaileBal;
}
public void setErabiltzaileBal(Integer erabiltzaileBal) {
	this.erabiltzaileBal = erabiltzaileBal;
}
public boolean getFinkoa() {
	return finkoa;
}
public void setFinkoa(String finkoa) {
	if(finkoa.equals("true"))
		this.finkoa = true;
	else this.finkoa=false;
}
}


