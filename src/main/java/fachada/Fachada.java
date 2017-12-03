package fachada;

import controller.Controler;

public class Fachada {

	private static Fachada fachada;
	public Controler controler;
	
	private Fachada(){
		controler = new Controler();
		
	}
	public static synchronized Fachada getInstanceFachada(){
		if (fachada == null){
			fachada = new Fachada();
		
	}
		return fachada;
	}
	
	
}
