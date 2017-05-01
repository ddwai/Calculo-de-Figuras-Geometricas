package estrutura;

public class Circulo extends Figura{
	
	public Circulo(double raio){
		super(raio);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Circulo";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * this.getLado() * this.getLado();
	}
	
}
