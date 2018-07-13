package cl.clase.test1;

public class Afiliado extends Persona {
	// Atributos
	private int codigoPlan;
	private String plan;
	
	// Contructor
	public Afiliado() {
		// Permite acceder a los atributos y metodos de la super clase o clase padre de la actual
		//super(); 
		//super(10,"Alvaro");
		super.setIdentificacion(10);
		super.setNombre("Alvaro");
		
	}
	
	// Getter and Setter
	public int getCodigoPlan() {
		return codigoPlan;
	}
	public void setCodigoPlan(int codigoPlan) {
		this.codigoPlan = codigoPlan;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	
}
