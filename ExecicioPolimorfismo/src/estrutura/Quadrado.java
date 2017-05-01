package estrutura;

public class Quadrado extends Figura{
	
	public Quadrado(double valor){
		super(valor);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Quadrado";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getLado() * this.getLado();
	}

}
