package br.com.voo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import br.com.voo.model.Voos;

public class VooDAO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4719530288076843043L;
	private static Map<Long, Voos> voos = new HashMap<Long, Voos>();
	private static AtomicLong contador9 = new AtomicLong(0);
	
	public Voos adiciona(Voos voo) {
		long id = contador9.incrementAndGet();
		voo.setId(id);
		voos.put(id, voo);
		return this.busca(id);
	}
	
	public Voos busca(Long id) {
		return voos.get(id);
	}
	
	public Voos remove(long id) {
		return voos.remove(id);
	}
	public List<Voos> listaTodos() {
		List<Voos> lista = new ArrayList<Voos>();
		 for (long key : voos.keySet()) {
			 Voos vo = voos.get(key);
             lista.add(vo);
      }
		return lista;
	}
	
}
