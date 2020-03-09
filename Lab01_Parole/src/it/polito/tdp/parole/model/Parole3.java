package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Parole3 {
	private ArrayList <String>parole=new ArrayList <String>();
	
	public Parole3() {
	}
	
	public void addParola(String p) {
		this.parole.add(p);
		//TODO
	}
	
	public void deleteParola(String p) {
		this.parole.remove(p);
		//TODO
	}
	
	public List<String> getElenco() {
		parole.sort(new ComparatoreNomi());
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}

	public ArrayList<String> getParole() {
		return parole;
	}

	public void setParole(ArrayList<String> parole) {
		this.parole = parole;
	}




	
	

}
