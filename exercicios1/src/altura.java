import java.util.Scanner;
public class altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.print("coloque aqui sua altura: ");
		float Altura = ent.nextFloat();
		System.out.println("o seu peso ideal é de: " + ((Altura*72.7)-58));
		ent.close();
	}

}
