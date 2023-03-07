package Ex;

public class Aluno extends Pessoa {

	String course;
	String university;

	void Info() {

		System.err.println("Muito prazer, eu sou " + name + ", e sou um aluno");

	}

	void Studant() {
		System.out.println("Estou estudando " + course + ", atualmente, na faculdade " + university);
	}
}
