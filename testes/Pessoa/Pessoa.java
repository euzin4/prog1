public class Pessoa{
	private int idade;
	private String nome;
	private float peso;


	public Pessoa(int idade, String nome, float peso){
		this.idade = idade;
		this.nome = nome;
		this.peso = peso;
	}

	public String getInfos(){
		return "\nNome: "+this.nome+"\nPeso: "+this.peso+
		"\nIdade: "+this.idade; 
	}


}
