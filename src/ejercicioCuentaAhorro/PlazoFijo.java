package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta{
	
	//1.- atributos
	
	int plazo;


	double interes;
	
	//Metodo constructor
	
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}//cierre constructor
	
	//2.- Metodo calcular importe del interes
	
	public double obtenerImporteInteres() {
		return (cantidad*interes)/100;
	
	
		}// cierre metodo
	
	// Metodo para mostarInformacion
		public void mostarInformacionPlazoFijo() {
			System.out.println("Plazo : "+plazo);
			System.out.println("interes: "+interes);
			System.out.println("Total Interes: "+ obtenerImporteInteres());
			
			
		}
		

	}//cierre clase

