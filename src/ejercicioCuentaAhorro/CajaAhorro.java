package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta{
	
	//metodo (heredar dato) usando constructor
	
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
		
	}//cierre constructor

	public void imprimirDatosCajaAhorro() {
		

		System.out.println("Titular:"+titular);
		System.out.println("Cantidad:"+cantidad);
		
		
	}//cierre imprimir

	
	//Otra forma toString de mostrar los datos
	
	
	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}// cierre toString
	

}//cierre clase
