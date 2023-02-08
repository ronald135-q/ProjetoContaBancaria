import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aux;
        int opcao;
        double sacar;
        double deposito;
        System.out.println("Digite o título");
        aux = in.nextLine();
        System.out.println("Hello world!");
        Conta c1 = new Conta(aux);

        do{
            System.out.println("MENU");
            System.out.println("1) Dados Bancários");
            System.out.println("2) Depósito");
            System.out.println("3) Saque");
            System.out.println("4) Sair");
            System.out.println("Opção: ");
            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    c1.DadosBancarios();
                break;
                case 2:
                    System.out.println("Digite o valor de depósito: ");
                    deposito =in.nextDouble();
                    c1.Depositar(deposito);
               break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    sacar = in.nextDouble();
                    c1.Sacar(sacar);
                    break;
                case 4:
                    System.out.println("SESSÃO ENCERRADA");
                    break;
                default:
                    System.out.println("Erro de número ! Tente novamente");



            }

        } while(opcao != 4);


    }
}