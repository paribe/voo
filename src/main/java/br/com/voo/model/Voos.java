package br.com.voo.model;

import java.util.ArrayList;
import java.util.List;

public class Voos {
	private long id;
	private List<Tripulantes> listaTripulante = new ArrayList<Tripulantes>();
	private long idPlaneta;
	private long idNave;
	public List<Tripulantes> getListaTripulante() {
		return listaTripulante;
	}
	public void setListaTripulante(List<Tripulantes> listaTripulante) {
		this.listaTripulante = listaTripulante;
	}
	public long getIdPlaneta() {
		return idPlaneta;
	}
	public void setIdPlaneta(long idPlaneta) {
		this.idPlaneta = idPlaneta;
	}
	public long getIdNave() {
		return idNave;
	}
	public void setIdNave(long idNave) {
		this.idNave = idNave;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

}
