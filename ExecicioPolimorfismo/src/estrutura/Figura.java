package estrutura;

public abstract class Figura {
	protected double lado;
	
	public Figura(double lado){
		super(); // Construtor da Classe e tornando Superclasse
		this.lado = lado;
	}
	
	// m�todo que retorna o tamanho do lado
	public double getLado() {
		return lado;
	}
	
	// m�todo que altera o tamanho do lado
	public void setLado(double lado) {
		this.lado = lado;
	}
	// Constru��o de m�todos abstratos que ser�o obrigat�rios
	// a subscrita nas Subclasses
	public abstract String getNome();
	public abstract double getArea();

}


