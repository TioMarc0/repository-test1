import java.util.Scanner;
public class Conversor {
	
	 public static void main(String args[]){

	  Scanner ent = new Scanner(System.in);

	  System.out.print("Metros: ");
	  float metros = ent.nextFloat();

	  float centimetros = metros * 100;

	  System.out.printf("%.1f cm",centimetros);
      ent.close();
	 }
	}