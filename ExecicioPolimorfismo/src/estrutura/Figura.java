package estrutura;

public abstract class Figura {
	protected double lado;
	
	public Figura(double lado){
		super(); // Construtor da Classe e tornando Superclasse
		this.lado = lado;
	}
	
	// método que retorna o tamanho do lado
	public double getLado() {
		return lado;
	}
	
	// método que altera o tamanho do lado
	public void setLado(double lado) {
		this.lado = lado;
	}
	// Construção de métodos abstratos que serão obrigatórios
	// a subscrita nas Subclasses
	public abstract String getNome();
	public abstract double getArea();

}


