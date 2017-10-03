public class Livro{
	String nome;
	String descricao;
	double valor;
	String isbn;

	public void mostraDetalhes(){
		System.out.println("\nDetalhes");
		System.out.println("Nome: "+this.nome);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Valor: "+this.valor);
		System.out.println("ISBN: "+this.isbn);

	}

}
