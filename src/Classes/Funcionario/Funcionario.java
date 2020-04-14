package Classes.Funcionario;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacao() {
		return salario * 0.1;
	}
	public void listar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salario: " + this.salario);
		System.out.println("Bonificação: " + getBonificacao());
		System.out.println("\n");
	}
}
