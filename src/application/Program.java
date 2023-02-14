package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Champion champ1 = new Champion();
        Champion champ2 = new Champion();

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        champ1.name = sc.nextLine();
        System.out.print("Vida inicial: ");
        champ1.life = sc.nextInt();
        System.out.print("Ataque: ");
        champ1.attack = sc.nextInt();
        System.out.print("Armadura: ");
        champ1.armor = sc.nextInt();
        sc.nextLine();

        System.out.println();

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        champ2.name = sc.nextLine();
        System.out.print("Vida inicial: ");
        champ2.life = sc.nextInt();
        System.out.print("Ataque: ");
        champ2.attack = sc.nextInt();
        System.out.print("Armadura: ");
        champ2.armor = sc.nextInt();

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int round = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < round; i++) {

            champ1.takeDamage(champ2);
            champ2.takeDamage(champ1);

            System.out.printf("Resultado do turno %d:\n", i + 1);
            System.out.printf("%s: %s\n", champ1.getName(), champ1.status());
            System.out.printf("%s: %s\n", champ2.getName(), champ2.status());
            System.out.println();

            if (champ1.life <= 0 || champ2.life <= 0) {
                i = round;
            }
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}
