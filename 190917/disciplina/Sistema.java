public class Sistema {
  public static void main(String[] args) {

    Disciplina d = new Disciplina(23, "Programação I", 4);
    Aluno a = new Aluno("Guilherme", 201502337);
    System.out.println(a);
    a.matricular(d);
    a.listaDisciplinas();
  }
}
