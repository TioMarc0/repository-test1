import java.util.Scanner;

public class LerNumero {
	
 public static void main(String args[]){

  try (Scanner entrada = new Scanner(System.in)) {
	System.out.print("Numero ");
	  int numero = entrada.nextInt();
	
	  System.out.println("O numero lido foi [" + numero + "]");
}

 }
}