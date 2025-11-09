package pacoteRafael;
import java.util.Scanner;

public class Tamagochi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal pet = null;

        System.out.println("=== TAMAGOTCHI ===");
        System.out.println("Escolha o tipo do seu animal:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Papagaio");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            pet = new Cachorro();
        } else if (opcao == 2) {
            pet = new Gato();
        } else if (opcao == 3) {
            pet = new Papagaio();
        } else {
            System.out.println("Opção inválida. Saindo...");
            System.exit(0);
        }

        int escolha;
        do {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Brincar");
            System.out.println("2 - Dormir");
            System.out.println("3 - Comer");
            System.out.println("4 - Cuidar da higiene");
            System.out.println("5 - Ir ao médico");
            System.out.println("6 - Ver status");
            System.out.println("0 - Encerrar o jogo");
            escolha = sc.nextInt();

            if (escolha == 1) {
                pet.brincar();
            } else if (escolha == 2) {
                pet.dormir();
            } else if (escolha == 3) {
                pet.comer();
            } else if (escolha == 4) {
                pet.cuidarHigiene();
            } else if (escolha == 5) {
                pet.cuidarSaude();
            } else if (escolha == 6) {
                pet.status();
            } else if (escolha == 0) {
                System.out.println("Encerrando o jogo...");
                pet.status(); 
            } else {
                System.out.println("Opção inválida!");
            }

            if (pet != null && !pet.estaVivo()) {
                System.out.println("\nSeu " + pet.getTipo() + " morreu 😢");
                pet.status(); 
                break;
            }

        } while (escolha != 0);

        sc.close();
    }
}
