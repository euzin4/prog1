public class Sistema{
	public static void main(String[]args){
		Disciplina d = new Disciplina(23,"programação I",4);
		System.out.println(d);

		Aluno a = new Aluno("nome",35345235);
		System.out.println(a);
		a.matricular(d);
		a.listarDisciplinas();

		d.encerrar();
		System.out.println(d);
	}
}