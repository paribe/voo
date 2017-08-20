package br.com.voo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import br.com.voo.model.Planetas;

public class PlanetaDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7917614782602292704L;
	private static Map<Long, Planetas> planeta = new HashMap<Long, Planetas>();
	private static AtomicLong contador1 = new AtomicLong(0);
	
	public static void adiciona(Planetas nav) {
		long id = contador1.incrementAndGet();
		nav.setId(id);
		planeta.put(id, nav);
	}
	
	public Planetas busca(Long id) {
		return planeta.get(id);
	}
	
	public Planetas remove(long id) {
		return planeta.remove(id);
	}
	public List<Planetas> listaTodos() {
		List<Planetas> listaTodos = new ArrayList<Planetas>();
		 for (long key : planeta.keySet()) {
             Planetas planetas = planeta.get(key);
             listaTodos.add(planetas);
      }
		return listaTodos;
	}

}
