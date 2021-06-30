	import javax.swing.JOptionPane;

	public class Aplicacao {

		public static void main(String[] args) {
			var contexto = new Contexto();

			while (true) {
				int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1o n�mero:"));
				int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2o n�mero:"));

				var acao = JOptionPane.showInputDialog(null, "Selecione a a��o (+, -, *, / -1)");

				// 1 define estrat�gia de execu��o
				switch (acao) {
				case "+":
					contexto.setEstrategia(new Soma());
					break;
				case "-":
					contexto.setEstrategia(new Subtracao());
					break;
				case "*":
					contexto.setEstrategia(new Multiplicacao());
					break;
				case "/": 
					contexto.setEstrategia(new Divisao());
					break;
				case "-1":
					System.exit(0); // saindo do sistema
					break;
					 
				}

				// executa estrat�gia definida
				var resultado = contexto.executar(a, b);

				System.out.println("Resultado: " + resultado);

				JOptionPane.showInternalMessageDialog(null, "Resultado: " + resultado);
			}
		}
	}

