package control;

import java.util.*;

public class admincodes {
	LinkedList<Reto> retos = new LinkedList<Reto>();
	
	public admincodes(){
		
	}
	
	public void addNewReto(Reto reto){
		retos.add(reto);
	}
	
	public boolean eliminarReto(Reto reto){
		return retos.remove(reto);
	}
	public boolean eliminarRetoXTitulo(String titulo){
		Reto reto = buscarRetoXTitulo(titulo);
		if(reto==null)
			return false;
		return eliminarReto(reto);
		
	}
	public Reto buscarRetoXTitulo(String titulo){
		Reto reto=null;
		for(Reto r: retos){
			if(r.getTitulo().equalsIgnoreCase(titulo)){
				reto = r;
				break;
			}
		}
		return reto;
	}
}
