
public class Divisao implements Strategy {

	@Override
	public int execute(int a, int b) {

		try {
			if (a <= 0) {
				System.out.println("Não é permitido realizar a operação. Ensira um valor valido!");
			}

		} catch (Exception ex) {
			System.out.println("Valor invalido");
		}
		
		return a / b;
	}

}
