package Ex;

public class Funcionario extends Pessoa {

	String role;
	String company;

	void Info() {

		System.out.println("Muito prazer, eu sou " + name + " e trabalho na companhia" + company);
	}

	void TrabalhoComo() {
		System.out.println("Eu trabalho nesta companhia como " + role);
	}
}
