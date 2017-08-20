


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import br.com.voo.HttpTripulante;
import br.com.voo.dao.PlanetaDAO;
import br.com.voo.model.Planetas;

public class PlanetaTest {
	Planetas planeta = null;  
    PlanetaDAO planetaDAO = new PlanetaDAO();

    @Before
    public void before() throws Exception {
    	Gson g = new Gson();
    	HttpTripulante http = new HttpTripulante();
    	String url =" http://www.mocky.io/v2/599796c9130000b2038b7956"; 
        String json = http.sendGet(url, "GET");
        //System.out.println("JSON : " + json);
		planeta = g.fromJson(json,  Planetas.class);  
        // carrega em memoria
        PlanetaDAO.adiciona(planeta);
    }
    
    
	@Test
	public void testaTripulantecomNome() {
		System.out.println("Id : " + planeta.getId());
		Assert.assertEquals("Yavin IV", planeta.getName());
	}
	

}
