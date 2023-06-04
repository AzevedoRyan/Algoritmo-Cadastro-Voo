package algoritmo_trabalho;

import java.util.Scanner;

public class Algoritmo_trabalho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numvoo[] = new int[10];
        int lugares[] = new int[10];
        String origem[] = new String[10];
        String destino[] = new String[10];

        String origemcons;
        int opcao;
        int opcao2;
        int num;
        int cons;
        int flag = 0;
        int ind = 0;
        int efetuar;
        do {
            System.out.println("\nMenu\n" + "1 - Cadastrar\n" + "2 - Consultar\n" + "3 - Efetuar reserva\n" + "4 - Sair\n");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    flag = 0;
                    System.out.println("\nDigite o número do voo:");
                    num = scan.nextInt();

                    for (int i = 0; i < 10; i++) {
                        if (numvoo[i] == num) {
                            flag = 1;
                        }

                    }
                    if (flag == 1) {
                        System.out.println("Número do voo já cadastrado");
                    } else {
                        numvoo[ind] = num;
                        System.out.println("\nDigite a origem do voo: ");
                        origem[ind] = scan.next();
                        System.out.println("\nDigite o destino do voo: ");
                        destino[ind] = scan.next();
                        System.out.println("\nDigite o número de lugares: ");
                        lugares[ind] = scan.nextInt();

                        ind = ind + 1;

                    }

                    break;
                case 2:
                    flag = 0;
                    System.out.println("\nMenu Consultas\n" + "1 - Numero do voo\n" + "2 - Origem do voo\n" + "3 - Destino do voo\n");
                    opcao2 = scan.nextInt();
                    switch (opcao2) {
                        case 1:
                            flag = 0;
                            System.out.println("\nDigite o número do voo:");
                            cons = scan.nextInt();

                            for (int i = 0; i < 10; i++) {
                                if (numvoo[i] == cons) {
                                    flag = 1;
                                }

                            }
                            if (flag == 1) {
                                System.out.println("Número do voo existe");
                            } else {
                                System.out.println("Voo não existe");
                            }

                            break;
                        case 2:
                            flag = 0;
                            System.out.println("Digite a origem do voo:");
                            origemcons = scan.next();
                            for (int i = 0; i < 10; i++) {
                                if (origem[i].equals(origemcons)) {
                                    flag = 1;
                                }

                            }
                            if (flag == 1) {
                                System.out.println("origem do voo existe");
                            } else {
                                System.out.println("origem do voo não existe");
                            }

                            break;
                        case 3:
                            break;
                    }
                    break;

                case 3:
                    flag = 0;

                    System.out.println("Digite o numero do voo que deseja viajar: ");
                    efetuar = scan.nextInt();
                    for (int i = 0; i < 10; i++) {
                        if (numvoo[i] == efetuar) {
                            flag = 1;
                        }

                    }
                    if (flag == 1) {
                        if (lugares[ind] > 0) {
                            System.out.println("Reserva confirmada");
                            lugares[ind]--;

                        } else {
                            System.out.println("Voo lotado");
                        }

                    } else {
                        System.out.println("Voo inexistente");

                    }

                    break;

                case 4:

                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (opcao != 4);
    }

}
