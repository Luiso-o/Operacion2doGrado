package Ecuacion2doGrado;

import javax.swing.JOptionPane;

public class ejecutaOperacion {

	public static void main(String[] args) {
	
		String texto1=JOptionPane.showInputDialog("Dame el primer valor");
		int valor1=Integer.parseInt(texto1);
		
		String texto2=JOptionPane.showInputDialog("Dame el segundo valor");
		int valor2=Integer.parseInt(texto2);
		
		String texto3=JOptionPane.showInputDialog("Dame el tercer valor");
		int valor3=Integer.parseInt(texto3);
		
	Raices ecuacion=new Raices(valor1,valor2,valor3); //creamos el objeto
	ecuacion.calcular(); //Calculamos
		        	    

	}

}
