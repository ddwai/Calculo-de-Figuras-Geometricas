package estrutura;

public class Main {

	public static void main(String[] args) {
		
		// Criação do objeto figuras, com os valores definidos.
		Figura t = new Triangulo(2,5);
		Figura q = new Quadrado(5);
		Figura c = new Circulo(5);
		// Criando tela de Inicio
		System.out.println("<<<<< Area das Figuras Geométricas >>>>>");
		System.out.println("Triangulo:\nBase: 2\nAltura: 5\n");
		System.out.println("Quadrado:\nLados: 5\n");
		System.out.println("Circulo:\nRaio: 5");
		
		// Chamando os métodos getNome e getArea dos objetos
		// t, q, c do triangulo, quadrado e circulo respectivamente.
		// e retornando para a variável area.
		System.out.println("<<<<< Resultados >>>>>");
		System.out.println(t.getNome());
		System.out.println("Area: " + t.getArea() + "\n");
		
		System.out.println(q.getNome());
		System.out.println("Area: " + q.getArea() + "\n");
		
		System.out.println(c.getNome());
		System.out.println("Area: " + c.getArea() + "\n");
	}

}
