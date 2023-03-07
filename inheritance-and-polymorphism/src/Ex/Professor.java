package Ex;

public class Professor extends Pessoa {

	String training;
	int tempo;

	void Info() {
		System.out.println("Muito prazer, eu sou " + name + " e trabalho como professor à " + tempo);
	}

	void ministrarMateria() {

		System.out.println("Eu ministro aulas de " + training);
	}

}
