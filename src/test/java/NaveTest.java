


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

import br.com.voo.HttpTripulante;
import br.com.voo.dao.NaveDAO;
import br.com.voo.model.Naves;

public class NaveTest {
	Naves nave = null;  
    NaveDAO naveDAO = new NaveDAO();

    @Before
    public void before() throws Exception {
    	Gson g = new Gson();
    	HttpTripulante http = new HttpTripulante();
        String url = "http://www.mocky.io/v2/59979afb1300008d038b7960"; 
        String json = http.sendGet(url, "GET");
        nave = g.fromJson(json,  Naves.class);  
        // carrega em memoria
        NaveDAO.adiciona(nave);
    }
    
    
	@Test
	public void testaTripulantecomNome() {
		System.out.println("Id : " + nave.getId());
		Assert.assertEquals("Death Star", nave.getName());
	}
	

}
