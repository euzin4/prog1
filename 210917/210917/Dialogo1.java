import javax.swing.JOptionPane;

public class Dialogo1{
	public static void main(String[]args){
		String nome=JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null,"Olá "+nome+"!");
		System.out.println(nome);
	}
} 
