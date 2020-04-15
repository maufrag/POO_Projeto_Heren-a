package Classes.Gerente;

import Classes.Funcionario.Funcionario;

public class Gerente extends Funcionario {

	public Gerente() {
		senhaEspecial = 12345;
	}
	
	private int senhaEspecial;
	private int numeroDeFuncionariosGerenciados;

	public int getSenhaEspecial() {
		return senhaEspecial;
	}

	public void setSenhaEspecial(int senhaEspecial) {
		this.senhaEspecial = senhaEspecial;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}

	public void autenticar(int senha) {
		System.out.println(senha == this.senhaEspecial? "Acesso liberado." : "Acesso negado.");
	}
	
	@Override
	public void listar() {
		super.listar();
		System.out.println("Senha Especial: " + this.senhaEspecial);
		System.out.println("Quantidade de Funcionarios gerenciados: " + this.numeroDeFuncionariosGerenciados);
	}
	
}
