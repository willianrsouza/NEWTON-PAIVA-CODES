
public class Main {

	public static void main(String[] args) {

		var builder = new VeiculoBuilderImpl();

		var oficina = new Oficina(builder);

		var veiculoSimples = oficina.montar(TipoVeiculo.PATRAO);
		System.out.println(veiculoSimples);

	}

}
