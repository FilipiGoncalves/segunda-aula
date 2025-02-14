import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        aluno1.setNota1(teclado.nextDouble());

        System.out.println("Digite a segunda nota: ");
        aluno1.setNota2(teclado.nextDouble());
        
        aluno1.calculaMedia(aluno1.getNota1(), aluno1.getNota2());
    }
}