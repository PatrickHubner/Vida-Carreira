
package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println("Você possui um curriculo?");
            System.out.println("1 - SIM\n2 - NAO\n0 - SAIR\n");
            op = sc.nextInt();
            switch(op) {
                case 0:
                    System.out.println("Programa encerrado!!");
                    break;
                case 1:
                    System.out.println("Em breve novas melhorias!");
                    break;
                case 2:
                    Person p1 = new Person();
                    p1.Cadastro();
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
            }
        } while(op != 0);

    }
}