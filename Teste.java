public class Teste{
	public static void main(String[] args){
		Livro[] lista = new Livro[2];
		lista[0] = new Livro();
		lista[0].nome = "Livro 1";
		lista[0].descricao = "O livro de tudo";
		lista[0].valor = 234;

		lista[1] = new Livro();
		lista[1].nome = "Livro 2";
		lista[1].descricao = "O livro de nada";
		lista[1].valor = 34;

		for(Livro n : lista)
			n.mostraDetalhes();
	
		Pessoa[] autor = new Pessoa[1];
		autor[0] = new Pessoa();
		autor[0].nomeAutor="joao";
		autor[0].emailAutor="emailaqui";
		autor[0].cpfAutor="1873127213";
		for(Pessoa p: autor)
			p.mostraDetalhes1();
	}


}
