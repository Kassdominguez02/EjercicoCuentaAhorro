package ejercicioCuentaAhorro;

public class Cuenta {
	
	// 1.-atributos cuenta
	
	String titular;
	float cantidad;
	
	//3.- Constructor para pasarlo a las sub clase
	
	public Cuenta(String titular, float cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}//cierre constructor
	
	// 2.Metodo para mostrar Info
	
	public void imprimirDatosCuenta() {
		
		System.out.println("Titular:"+titular);
		System.out.println("Cantidad:"+cantidad);
		
	}// cierre imprimirDatos

	
	
	

}//cierre clase
