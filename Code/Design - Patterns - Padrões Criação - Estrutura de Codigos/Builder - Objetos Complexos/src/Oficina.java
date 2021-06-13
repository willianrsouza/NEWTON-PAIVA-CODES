
public class Oficina {

	private VeiculoBuilder builder;

	public Oficina(VeiculoBuilder builder) {

		this.builder = builder;

	}

	public Veiculo montar(TipoVeiculo veiculo) {

		builder.init();

		if (veiculo.equals(TipoVeiculo.BASICO)) {

			builder.quantPortas(2);
			builder.quantJanelas(4);
			builder.rodasVeiculo(4);
			builder.marcaVeiculo("corolla");
			builder.modeloVeiculo("GT");
			builder.anoVeiculo(2010);
			builder.kmVeiculo(2345);
			builder.potenciaEmHp(43);
			builder.corVeiculo("Cinza");
		} else if (veiculo.equals(TipoVeiculo.BOM)) {

			builder.quantPortas(4);
			builder.quantJanelas(4);
			builder.rodasVeiculo(4);
			builder.marcaVeiculo("chevette");
			builder.modeloVeiculo("Tubarão");
			builder.anoVeiculo(2012);
			builder.kmVeiculo(200);
			builder.potenciaEmHp(63);
			builder.corVeiculo("marrom");
		}

		else if (veiculo.equals(TipoVeiculo.PATRAO)) {

			builder.quantPortas(4);
			builder.quantJanelas(8);
			builder.rodasVeiculo(4);
			builder.marcaVeiculo("Nissan");
			builder.modeloVeiculo("Skyline Bryan");
			builder.anoVeiculo(2020);
			builder.kmVeiculo(0);
			builder.potenciaEmHp(8000);
			builder.corVeiculo("verde");

		}

		return builder.build();

	}

}
