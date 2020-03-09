package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Parole2 {
	private LinkedList <String>parole=new LinkedList <String>();
	
	public Parole2() {
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

	public LinkedList<String> getParole() {
		return parole;
	}

	public void setParole(LinkedList<String> parole) {
		this.parole = parole;
	}


	
	

}
