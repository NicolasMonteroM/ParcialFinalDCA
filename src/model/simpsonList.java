package model;

import java.util.LinkedList;

public class simpsonList {
	
	private LinkedList<simpson> listaOriginal;
	
	public simpsonList() {
		listaOriginal = new LinkedList<simpson>();
	}
	
	public void adicionar(simpson simpson) {
		listaOriginal.add(simpson);
	}

	public LinkedList<simpson> getListaOriginal() {
		return listaOriginal;
	}

	public void setListaOriginal(LinkedList<simpson> listaOriginal) {
		this.listaOriginal = listaOriginal;
	}

}