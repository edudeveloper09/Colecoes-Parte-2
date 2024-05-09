import java.util.ArrayList;
import java.util.Scanner;

public class SeparaGrupoPorSexo {

    public static void main(String args[]) {
        System.out.println("***** Vamos separar os grupos por Sexo *****");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomesMasculino = new ArrayList<>();
        ArrayList<String> nomesFeminino = new ArrayList<>();

        System.out.println("Digite os nomes, depois o Sexo (M/F), e digite 'fim' para finalizar: ");

        while (true) {
            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            if(nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                nomesMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                nomesFeminino.add(nome);
            } else {
                System.out.println("Caracter inválido. Digite novamente, M ou F.");
            }
        }

        System.out.println("Nomes Masculinos: ");
        for (String nome : nomesMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nNomes Femininos");
        for (String nome : nomesFeminino) {
            System.out.println(nome);
        }
    }
}
