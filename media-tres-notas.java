import java.util.Scanner;

public class MediaTresNotas{
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = leitura.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitura.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = leitura.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média %.2f\n", media);

        if (media >= 6){
            System.out.println("Aprovado");
        }       else System.out.println("Reprovado");
    }
}
