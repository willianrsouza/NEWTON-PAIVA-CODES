package br.newton.poo.teste;

import br.newton.poo.jpa.AbstractFunction;
import br.newton.poo.model.Funcionario;

public class Main extends AbstractFunction {

	public static void main(String[] args) {
		
	   var funcionario = new Funcionario(null, null, null, null, null);
	   
	   funcionario.setNome("Luisinho Do Crime");
	   funcionario.setCodigo("171");
	   funcionario.setCpf("45213546559");
	   
       persisirDadosDb(funcionario);
       delete(funcionario);
       
	}

}
