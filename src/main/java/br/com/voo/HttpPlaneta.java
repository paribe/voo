package br.com.voo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.gson.Gson;
import br.com.voo.dao.PlanetaDAO;
import br.com.voo.model.Planetas;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 
 */
public class HttpPlaneta {

    private final String USER_AGENT = "Mozilla/5.0";
    private static Gson g = new Gson();
    public static void main(String[] args) throws Exception {
    	HttpPlaneta.init();
    }

    @SuppressWarnings("static-access")
	static void init () throws Exception {
    	HttpPlaneta http = new HttpPlaneta();
    	// vai chamar a url https://swapi.co/api/planets/3/  e carregar em memoria;
     	 Map<Long, String> url = new HashMap<Long, String>();
    	 url.put( 1l, "http://www.mocky.io/v2/599796c9130000b2038b7956");
    	 url.put( 2l, "http://www.mocky.io/v2/5998ceb20f0000680206f0c1");
         carregaURL(http , url);
    }
    
    @SuppressWarnings("static-access")
	private static void carregaURL(HttpPlaneta http, Map<Long,String> url) throws Exception {
		
		 for (long key : url.keySet()) {
			 String valorURL = url.get(key);
			 String json = http.sendGet(valorURL, "GET");
	         System.out.println("JSON : " + json);
	         @SuppressWarnings("unused")
	    	 Planetas planeta = g.fromJson(json,  Planetas.class);  
	         PlanetaDAO planetaDAO = new PlanetaDAO();
	         // carrega em memoria
	         planetaDAO.adiciona(planeta);
	         System.out.println("Planeta : " + planeta.getId()+"-"+planeta.getName());
	         System.out.println("-----------------------------------------------------------------------");
	            
        }
	}
    // HTTP GET request
    public String sendGet(String url, String method) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod(method);
        
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();

    }

    // HTTP POST request
    @SuppressWarnings("unused")
	private void sendPost(String url, String urlParameters, String method) throws Exception {

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //add reuqest header
        con.setRequestMethod(method);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		//String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }

}