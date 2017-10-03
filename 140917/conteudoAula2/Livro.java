public class Livro{
	String nome;
	String descricao;
	double valor;
	String isbn;
	Pessoa autor = new Pessoa();

	public String toString(){
		return "\nDetalhes\n\nNome: "+this.nome+"Descricao: "+this.descricao+"\nValor: "+this.valor+"\nISBN: "+this.isbn+this.autor;
	}

}
