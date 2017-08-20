


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

import br.com.voo.HttpTripulante;
import br.com.voo.dao.TripulanteDAO;
import br.com.voo.model.Tripulantes;

public class TripulanteTest {
	

	Tripulantes tripulante = null;  
    TripulanteDAO tripulanteDAO = new TripulanteDAO();

    @Before
    public void before() throws Exception {
    	Gson g = new Gson();
    	HttpTripulante http = new HttpTripulante();
        String url = "http://www.mocky.io/v2/59978bc0130000a5038b794c"; 
        String json = http.sendGet(url, "GET");
        tripulante = g.fromJson(json,  Tripulantes.class);  
        // carrega em memoria
        tripulanteDAO.adiciona(tripulante);
    }
    
    
	@Test
	public void testaTripulantecomNome() {
		Assert.assertEquals("R2-D2", tripulante.getName());
	}
	

}
