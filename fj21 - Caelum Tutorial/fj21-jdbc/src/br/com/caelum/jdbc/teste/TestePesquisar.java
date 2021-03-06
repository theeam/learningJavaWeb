package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestePesquisar {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato = new Contato();

		contato = dao.pesquisar(4);
		if (contato != null) {
			System.out.println("Id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("E-mail: " + contato.getEmail());
			System.out.println("Endere�o: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}

		// Funcionario
		FuncionarioDao fdao = new FuncionarioDao();
		Funcionario funcionario = new Funcionario();

		funcionario = fdao.pesquisar(1);
		if (funcionario != null) {
			System.out.println("Id: " + funcionario.getId());
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("usuario: " + funcionario.getUsuario());
			System.out.println("Senha: " + funcionario.getSenha());

		}

	}
}
