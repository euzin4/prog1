import java.util.Scanner;

class exe7{
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int x,i;

		x=entrada.nextInt();
		for(i=0;x>0;i++){
			if(x==1){
				break;
			}
			else if(x%2==0){
				x=x/2;
			}else if(x%2==1){
				x=3*x+1;
			}
			System.out.println(x);
		}
	}
}