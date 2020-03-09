package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Parole {
	private TreeMap <String,String> parole=new TreeMap <String,String>();
	
	public Parole() {
	}
	
	public void addParola(String p) {
		this.parole.put(p,p);
		//TODO
	}
	
	public void deleteParola(String p) {
		this.parole.remove(p);
		//TODO
	}
	
	public List<String> getElenco() {
		LinkedList <String> paroletmp=new LinkedList <String>(parole.values());
		return paroletmp;
	}
	
	public void reset() {
		parole.clear();
	}

	public TreeMap<String, String> getParole() {
		return parole;
	}

	public void setParole(TreeMap<String, String> parole) {
		this.parole = parole;
	}
	
	

}
