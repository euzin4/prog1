public class Disciplina {
  int cod;
  int creditos;
  String nome;
  boolean concluido;

  public Disciplina(int cod, String nome, int creditos){
    this.cod = cod;
    this.nome = nome;
    this.creditos = creditos;
    this.concluido = false;
  }

  public void encerrar(){
    this.concluido = true;
  }

  public String toString(){
    String con = (this.concluido) ? "Concluido" : "Em Andamento";
    return "\nNome: "+this.nome+"\nCódigo: "+this.cod+"\nCreditos: "+this.creditos+"\nConcluido: "+con+"\n";
  }

}
