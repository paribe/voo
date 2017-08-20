package br.com.voo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


import br.com.voo.model.Tripulantes;

public class TripulanteDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4719530288076843043L;
	private static Map<Long, Tripulantes> tripulante = new HashMap<Long, Tripulantes>();
	private static AtomicLong contador = new AtomicLong(0);
	
	public void adiciona(Tripulantes trip) {
		long id = contador.incrementAndGet();
		trip.setId(id);
		tripulante.put(id, trip);
	}
	
	public Tripulantes busca(Long id) {
		return tripulante.get(id);
	}
	
	public Tripulantes remove(long id) {
		return tripulante.remove(id);
	}
	public List<Tripulantes> listaTodos() {
		List<Tripulantes> lista = new ArrayList<Tripulantes>();
		 for (long key : tripulante.keySet()) {
			 Tripulantes tripulantes = tripulante.get(key);
             lista.add(tripulantes);
      }
		return lista;
	}
	
}
