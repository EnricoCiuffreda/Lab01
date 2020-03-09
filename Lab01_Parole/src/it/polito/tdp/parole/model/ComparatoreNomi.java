package it.polito.tdp.parole.model;

import java.util.Comparator;

public class ComparatoreNomi implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}
	

}
