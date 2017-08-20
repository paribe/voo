package br.com.voo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")

@WebServlet(
		  name = "ChamaServico",
		  urlPatterns = {"/chamaservico"}
		  )
public class ChamaServico extends  HttpServlet {
	// código omitido
	private String parametro1 = "";
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	  super.init(config);
	}
	
	public void service(HttpServletRequest request, 
		    HttpServletResponse response) throws ServletException, IOException {

		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		    
		  out.println("<h2>Serviço</h2>");
		  
		   parametro1= "Carregando Dados do Tripulante";
		  
		  out.println("<br> " + parametro1);
		    
		  try {
			HttpTripulante.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		 parametro1= "Carregando Dados do Planeta";
		  
		 out.println("<br> " + parametro1);
		    
		  try {
			HttpPlaneta.init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  parametro1= "Carregando Dados da Nave";
		  
			 out.println("<br> " + parametro1);
			    
			  try {
				HttpNave.init();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  // redireciona a pagina xhtml inicial
		  
		  RequestDispatcher dispatcher = request.getRequestDispatcher("/voo.xhtml");
		  dispatcher.forward(request, response);

		  out.close();
		}
}
