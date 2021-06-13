
public class Main {

	public static void main(String[] args) {

          var circulo1 = new Circulo(3,4, 2);
          System.out.println("Original: " + circulo1);
          
          /* Forma:  - 1*/
          var copiaCirculo = new Circulo(circulo1.x,circulo1.y, circulo1.raio);
          System.out.println(copiaCirculo);
          
          /* Forma:  - 2*/
          var copia = circulo1.clonar();
          System.out.println(copia);
          System.out.println();
          
	}

}
