
public interface VeiculoBuilder {

	void init();

	void quantPortas(int portas);

	void quantJanelas(int janelas);

	void rodasVeiculo(int rodasVeiculo);

	void marcaVeiculo(String marcaVeiculo);

	void modeloVeiculo(String modeloVeiculo);

	void anoVeiculo(int anoVeiculo);

	void kmVeiculo(int kmVeiculo);

	void potenciaEmHp(int potenciaEmHp);

	void corVeiculo(String veiculoCor);

	Veiculo build();

}
