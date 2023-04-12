package Ecuacion2doGrado;

import javax.swing.JOptionPane;

public class Raices {
	//atributos(coeficientes)
	private double a;
	private double b;
	private double c;
	
	//constructor
	public Raices(double valorA, double valorB, double valorC) {
		a=valorA;
		b=valorB;
		c=valorC;
	}

	public double getA() {
		return a;
	}

	public void setA(double valorA) {
		a = valorA;
	}

	public double getB() {
		return b;
	}

	public void setB(double valorB) {
		b = valorB;
	}

	public double getC() {
		return c;
	}

	public void setC(double valorC) {
		c = valorC;
	}
	
	//Metodos
//	obtenerRaices(): imprime las 2 posibles soluciones
	 private void obtenerRaices(){
		 
	      double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
	      double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
	      
	      JOptionPane.showMessageDialog(null,"Solucion X1\n" + x1+"\n"
	    		  + "Solucion X2\n" + x2);
	    }
	 
//	obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
	  private void obtenerRaiz(){
	         
		  double x=(-b)/(2*a);
		  JOptionPane.showMessageDialog(null,"Unica solucion\n" + x);
	        
	    }
	     
 //	getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
	  private double getDiscriminante(){
	        return Math.pow(b, 2)-(4*a*c);
	    }
	  
//	tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
	  private boolean tieneRaices(){
	        return getDiscriminante()>0;
	    }
	    
//	tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
	  private boolean tieneRaiz(){
	        return getDiscriminante()==0;
	    }
	  
//	calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
	  public void calcular(){
      
	     if(tieneRaices()){
	        obtenerRaices();	    	
	     }else if(tieneRaiz()){
	         obtenerRaiz();
	     }else{
	        JOptionPane.showMessageDialog(null,"No tiene soluciones");
	     }
      
	  }
	  
}


