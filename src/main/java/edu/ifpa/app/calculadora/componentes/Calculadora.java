package edu.ifpa.app.calculadora.componentes;

import javax.ejb.Stateless;
import javax.inject.Named;

@Stateless
public class Calculadora {
    private float n1;
    private float n2;
    // contrutor sem parâmetros
    public Calculadora() {}
    
	public float soma() { return n1 + n2; 	}
    // métodos Get´s e Set´s	
    public float getN1() { return n1; }
	public void setN1(float n1) { this.n1 = n1; }
	public float getN2() { return n2; }
	public void setN2(float n2) { this.n2 = n2; }
}
