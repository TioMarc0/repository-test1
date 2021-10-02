import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
          int a, b, c = 0;
          try (Scanner s = new Scanner( System.in )) {
			System.out.println("introduza dois números: ");
			  a = s.nextInt();
			  b = s.nextInt();
		      c = a + b;
          System.out.println(" a soma impressa dos dois números é: " + c );
      }

	}
}