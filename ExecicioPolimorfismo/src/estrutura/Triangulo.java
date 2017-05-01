package estrutura;

public class Triangulo extends Figura {
	private double base;
	
	// método construtor já definindo os valores dos lados, altura e da base
	public Triangulo(double lado1, double base) {
		super(lado1);
		this.base = base;
	}
	
	// método que retorna o tamanho da base
	public double getBase() {
		return base;
	}
	// método que altera o tamanho da base
	public void setBase(double base) {
		this.base = base;
	}
	// método que retorna o tamanho da altura
	
	// método que sobrescreve o método da Superclasse e retorna o valor da area
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.base*this.getLado())/2;
	}
	
	// método que sobrescreve o método da Superclasse e retorna o nome da figura
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Triangulo";
	}
	
}
