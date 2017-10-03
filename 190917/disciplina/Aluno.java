public class Aluno {
  String nome;
  int matricula;
  int i;
  Disciplina[] listaDeDisciplinas =  new Disciplina[5];

  public Aluno(String nome, int matricula){
    this.nome = nome;
    this.matricula = matricula;
    this.i = 0;
  }

  public String toString(){
    return "\nNome: "+this.nome+"\nMatricula: "+this.matricula;
  }

  public void matricular(Disciplina d){
    if (i == 5) {
      return;
    } else {
      this.listaDeDisciplinas[i] = d;
      this.i++;
    }
  }

  public void listaDisciplinas(){
    for (Disciplina d : listaDeDisciplinas) {
      System.out.println(d);
    }
  }

}
