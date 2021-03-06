package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemove {
	public static void main(String[] args) {
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();

		contato.setId((long) 6);

		if (dao.remove(contato)) {
			System.out.println("Contato removido com sucesso!");
		}

		Funcionario funcionario = new Funcionario();
		FuncionarioDao fdao = new FuncionarioDao();

		funcionario.setId((long) 1);

		if (fdao.remove(funcionario)) {
			System.out.println("Funcionario removido com sucesso");
		}
	}

}
