package br.com.voo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.voo.model.Naves;


public class NaveDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5506144785100183942L;
	private static Map<Long, Naves> nave = new HashMap<Long, Naves>();
	private static AtomicLong contador2 = new AtomicLong(0);
	
	public static void adiciona(Naves nav) {
		long id = contador2.incrementAndGet();
		nav.setId(id);
		nave.put(id, nav);
	}
	
	public Naves busca(Long id) {
		return nave.get(id);
	}
	
	public Naves remove(long id) {
		return nave.remove(id);
	}
	
	public List<Naves> listaTodos() {
		List<Naves> listaTodos = new ArrayList<Naves>();
		 for (long key : nave.keySet()) {
             Naves naves = nave.get(key);
             listaTodos.add(naves);
      }
		return listaTodos;
	}
	
}
