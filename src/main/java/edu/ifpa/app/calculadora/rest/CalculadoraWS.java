package edu.ifpa.app.calculadora.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import edu.ifpa.app.calculadora.componentes.Calculadora;

/**
 * Um endpoint simples para "Hello World".
 * @author Claudio Martins
 */
@Path("calculadora")
public class CalculadoraWS {
    @Inject
	private Calculadora myCalc;
	
   
    @Path("soma/{n1}/{n2}")
    @GET    
    @Produces("text/plain;charset=utf-8")  
    public Response soma(@PathParam("n1") float n1, @PathParam("n2") float n2){
    	System.out.println("SOMANDO....");
    	myCalc.setN1(n1);
    	myCalc.setN2(n2);    	
        return Response.ok("Soma de "+n1 + " e " + n2 + " = " + myCalc.soma()   ).build();
    }
}
