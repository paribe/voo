package br.com.voo.managedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.voo.dao.NaveDAO;
import br.com.voo.dao.PlanetaDAO;
import br.com.voo.dao.TripulanteDAO;
import br.com.voo.dao.VooDAO;
import br.com.voo.model.Naves;
import br.com.voo.model.Planetas;
import br.com.voo.model.Tripulantes;
import br.com.voo.model.Voos;
import br.com.voo.util.FacesUtil;

@ManagedBean(name="voo")
@SessionScoped
public class VooBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1264118286773103618L;
	
	private TripulanteDAO triDAO = new TripulanteDAO();
	private NaveDAO navDAO = new NaveDAO();
	private PlanetaDAO plaDAO = new PlanetaDAO();
	private VooDAO vooDAO = new VooDAO();
	
	// variaveis da tela JSF carrega list box
	private long varTripulante;
	private long varNave;
	private long varPlaneta;
		
	@SuppressWarnings("rawtypes")
	public Map<String,Object> getVarTripulanteValue() {
			Map<String,Object> tripulanteValue = new LinkedHashMap<String,Object>();
			List<Tripulantes> lista = triDAO.listaTodos();
			for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
				Tripulantes tripulantes = (Tripulantes) iterator.next();
				tripulanteValue.put(tripulantes.getName(), tripulantes.getId()); //label, value	
			}
			
			return tripulanteValue;
		}

	@SuppressWarnings("rawtypes")
	public Map<String,Object> getVarNaveValue() {
		Map<String,Object> naveValue = new LinkedHashMap<String,Object>();
		List<Naves> lista = navDAO.listaTodos();
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Naves naves = (Naves) iterator.next();
			naveValue.put(naves.getName(), naves.getId()); //label, value	
		}
		
		return naveValue;
	}

	public Map<String,Object> getVarPlanetaValue() {
		Map<String,Object> naveValue = new LinkedHashMap<String,Object>();
		List<Planetas> lista = plaDAO.listaTodos();
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = lista.iterator(); iterator.hasNext();) {
			Planetas planetas = (Planetas) iterator.next();
			naveValue.put(planetas.getName(), planetas.getId()); //label, value	
		}
		
		return naveValue;
	}
	
	public String adicionaVoo() {
		
		try {
			System.out.println("Tripulante="+this.getVarTripulante() );
			System.out.println("Nave="+this.getVarNave() );
			System.out.println("Planeta="+this.getVarPlaneta() );
			// valida o planeta atual com o anterior
			if (!isvalidaPlaneta()) {
				return "voo.xhtml"; 
			}
			//
			Tripulantes trip =  triDAO.busca(this.getVarTripulante());
			List<Tripulantes> todos = new ArrayList<Tripulantes>();
			todos.add(trip);
			Voos voo = new Voos();
			if (!todos.isEmpty()) {
				voo.setListaTripulante(todos);
				voo.setIdNave(this.getVarTripulante());
				voo.setIdPlaneta(this.getVarPlaneta());
				Voos retornoVoo = vooDAO.adiciona(voo);
		        FacesUtil.addInfoMessage("Voo Cadastrado com sucesso com número ="+ retornoVoo.getId());
			}else {
				FacesUtil.addInfoMessage("Tripulante não encontrado numero ="+ this.getVarTripulante());
			}
			
	        	
		}catch (Exception e) {
			FacesUtil.addInfoMessage("Erro ao Cadastrar o voo  = "+e.getMessage());
		}
		
        return "voo.xhtml";
	}

	private boolean isvalidaPlaneta() {
		List<Voos> todosVoos = vooDAO.listaTodos();
		for (@SuppressWarnings("rawtypes")
		Iterator iterator = todosVoos.iterator(); iterator.hasNext();) {
			Voos voos = (Voos) iterator.next();
			if (voos.getIdPlaneta()==this.getVarPlaneta()) {
				FacesUtil.addInfoMessage("Planeta informado já Cadastrado no Voo ="+ voos.getId());
				return false;
			}
			
		}
		return true;
	}
	
	public long getVarPlaneta() {
		return varPlaneta;
	}

	public void setVarPlaneta(long varPlaneta) {
		this.varPlaneta = varPlaneta;
	}

	public long getVarNave() {
		return varNave;
	}

	public void setVarNave(long varNave) {
		this.varNave = varNave;
	}
	
	public long getVarTripulante() {
		return varTripulante;
	}

	public void setVarTripulante(long varTripulante) {
		this.varTripulante = varTripulante;
	}
	
	
	
}
