class exe5{
	public static void main(String[]args){
		int fatorial = 1;
		for(int n = 1; n <= 40; n++){ 
     		fatorial *= n;
			if(n==20){
     			System.out.println(fatorial);
     		}else if(n==30){
     			System.out.println(fatorial);
     		}else if(n==40){
     			System.out.println(fatorial);
     		}
		}
		System.out.println(fatorial);
	}
}
/*as respostas aparecem erradas pois a variável 
"fatorial" é do tipo int que não armazena a 
quantidade necessária de bytes para a resposta*/