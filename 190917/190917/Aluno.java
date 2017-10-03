public class Aluno{
	Disciplina[] disciplinas = new Disciplina[5];
	String nome;
	int matricula;

	public Aluno(String n,int m){
		this.nome=n;
		this.matricula=m;
	}
	public String toString(){
		return "\nAluno: "+this.nome+"\nMatricula: "+this.matricula+"\n";
	}
	public void listarDisciplinas(){
		for(Disciplina dis:disciplinas)
			System.out.println(dis);
	}
	public void matricular(Disciplina d){
		this.disciplinas[qtdD]=d;
		qtdD++;
	}
}