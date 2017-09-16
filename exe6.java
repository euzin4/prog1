class exe6{
	public static void main(String[]args){
		int aux=0,b=0,c=1,i;

		System.out.println(b);
		System.out.println(c);
		for(i=0;aux<100;i++){
			aux=b+c;
			b=c;
			c=aux;
			System.out.println(aux);
		}
	}
}