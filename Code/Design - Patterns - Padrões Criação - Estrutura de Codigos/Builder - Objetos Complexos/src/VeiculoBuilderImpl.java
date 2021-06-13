
public class VeiculoBuilderImpl implements VeiculoBuilder, ConjuntoFastFurious {

	private Veiculo veiculo;

	@Override
	public void motorVeiculoTurnado(Boolean com) {
		veiculo.setPossuiMotorVeiculoTurnado(com);

	}

	@Override
	public void corVeiculoPremium(Boolean com) {
		veiculo.setCorVeiculoPremium(com);

	}

	@Override
	public void assinaturaFalsificadaBryan(boolean com) {
		veiculo.setAssinaturaFalsificadaBryan(com);
	}

	@Override
	public void init() {
		this.veiculo = new Veiculo();

	}

	@Override
	public void quantPortas(int portas) {
		veiculo.setPortas(portas);

	}

	@Override
	public void quantJanelas(int janelas) {
		veiculo.setJanelas(janelas);

	}

	@Override
	public void rodasVeiculo(int rodasVeiculo) {
		veiculo.setRodas(rodasVeiculo);

	}

	@Override
	public void marcaVeiculo(String marcaVeiculo) {
		veiculo.setMarca(marcaVeiculo);

	}

	@Override
	public void modeloVeiculo(String modeloVeiculo) {
		veiculo.setModelo(modeloVeiculo);

	}

	@Override
	public void anoVeiculo(int anoVeiculo) {
		veiculo.setAno(anoVeiculo);

	}

	@Override
	public void kmVeiculo(int kmVeiculo) {
		veiculo.setKm(kmVeiculo);

	}

	@Override
	public void potenciaEmHp(int potenciaEmHp) {
		veiculo.setPotenciaEmHp(potenciaEmHp);

	}

	@Override
	public void corVeiculo(String veiculoCor) {
		veiculo.setCor(veiculoCor);

	}

	@Override
	public Veiculo build() {

		return veiculo;
	}

}
