import java.util.Scanner;

public class media
{
public static void main(String args[])
{

Scanner ent = new Scanner(System.in);
float n1, n2, n3, n4, mf;
System.out.print("Nota do primeiro Bimestre: ");
n1 = ent.nextFloat();
System.out.print("Nota do segundo Bimestre: ");
n2 = ent.nextFloat();
System.out.print("Nota do terceiro Bimestre: ");
n3 = ent.nextFloat();
System.out.print("Nota do quarto Bimestre: ");
n4 = ent.nextFloat();
mf = (n1+n2+n3+n4)/4;
if(mf >= 6)
{
System.out.print("Voce foi APROVADO. ");
}
else
{
System.out.print("Voce foi REPROVADO. ");
}
System.out.print("A media final é de: " + mf + " pontos.");
ent.close();
//ola github
}
}