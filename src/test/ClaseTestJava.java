package test;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancia 1 cajaAhorro
		
		CajaAhorro instancia1= new CajaAhorro(" Felipe Maqueda", 1000.0f); // cuando no quiero polimorfear
	
		//instancia 2 (plazoFijo)
	
		PlazoFijo instancia2=new PlazoFijo("Jesus Gonzales",2500.0f, 12, 5.0);
		
		//mostar info de las cuentas
		
		instancia1.imprimirDatosCuenta(); //titular y cantidad
		System.out.println();// espacio entre info
		instancia2.mostarInformacionPlazoFijo(); //titular, cantidad, plazo, interes.
	

	}//cierre main

}//cierre clase
