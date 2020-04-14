import java.util.Scanner;

import Classes.Funcionario.Funcionario;
import Classes.Gerente.Gerente;

public class ArquivoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		imprimirCabecalho();
		
		Scanner scan = new Scanner(System.in);
		/*Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome do funcionario: ");
		funcionario.setNome(scan.nextLine());
		
		System.out.println("Informe o cpf do funcionario: ");
		funcionario.setCpf(scan.nextLine());
		
		System.out.println("Informe o salario do funcionario: ");
		funcionario.setSalario(Integer.parseInt(scan.nextLine()));
		
		funcionario.listar();
		
		Gerente gerente = new Gerente();
		System.out.println("Informe o nome do gerente: ");
		
		gerente.setNome(scan.nextLine());
		
		System.out.println("Informe o cpf do gerente: ");
		gerente.setCpf(scan.nextLine());
		
		System.out.println("Informe o salario do gerente: ");
		gerente.setSalario(Integer.parseInt(scan.nextLine()));

		System.out.println("Informe a quantidade de funcionarios: ");
		gerente.setNumeroDeFuncionariosGerenciados(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Informe a senha do gerente: ");
		gerente.autenticar(Integer.parseInt(scan.nextLine()));
		
		gerente.listar();*/
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Mateus");
		
		funcionario.setCpf("12345678910");
		
		funcionario.setSalario(1250.00);
		
		funcionario.listar();
		
		Gerente gerente = new Gerente();
		
		
		gerente.setNome("Lucas");
		
		
		gerente.setCpf("10987654321");
		
		
		gerente.setSalario(1250.00);

		
		gerente.setNumeroDeFuncionariosGerenciados(1);
		
		System.out.println("Informe a senha do gerente: ");
		gerente.autenticar(Integer.parseInt(scan.nextLine()));
		
		gerente.listar();
	}
	public static void imprimirCabecalho() {
		System.out.println("***********************************");
		System.out.println("NomeAluno: Mateus Torres Ferreira\nmatricula: 0050015524");
		System.out.println("***********************************");
		System.out.println("\n");
	}
}
