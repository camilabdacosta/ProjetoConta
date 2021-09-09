package Application;
import Entities.Cliente;
import Entities.ContaCliente;
import Interface.IMetodos;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Application implements IMetodos {


    public static void main(String[] args) {
        Application gp = new Application();
        System.out.println("Digite uma opção");
        Scanner scanner = new Scanner(System.in);


        int opc;
        do {
            System.out.print("\n");
            System.out.println("1- Abra sua conta");
            System.out.println("2- Faça um saque ");
            System.out.println("3- Faça um deposito");
            System.out.println("4- Saldo da Conta");
            System.out.println("5-Digite 9 para sair");
            opc = parseInt(scanner.nextLine());

            switch (opc) {
                case 1:
                    gp.Abrirconta();
                    break;
                case 2:
                    gp.Sacar();
                    break;
                case 3:
                    gp.Depositar();
                    break;
                case 4:
                    gp.Mostrarsaldo();
                    break;
                case 5:
                    System.out.println("Saindo da conta ");
                    break;
                default:
                    System.out.println(" Opção Invalida ");
            }
        } while (opc != 9);
    }

    ContaCliente conta1 = new ContaCliente();
    Scanner sc = new Scanner(System.in);
    @Override
    public void Mostrarsaldo() {
        System.out.println("Mostrando o saldo");
        conta1.imprimir();
    }

    @Override
    public void Depositar() {
        System.out.println(" Depositando na conta");
        conta1.depositar(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void Sacar() {
        System.out.println(" Sacando na conta");
        boolean sacou = conta1.sacar(Double.parseDouble(sc.nextLine()));
        conta1.imprimir();
        if(sacou){
            System.out.println("Saque Realizado com sucesso");
        }else{
            System.out.println("Não há saldo para o saque");
        }
    }

   Cliente cliente1 = new Cliente();

    @Override
    public void Abrirconta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        cliente1.setNomecliente(sc.nextLine());
        System.out.println("Seu cartão é " );
        MostrarConta();


    }

    @Override
    public void MostrarConta() {

        Random random = new Random();
        String card = "BE";
        {

            for (int i = 0; i < 14; i++)
            {
                int n = random.nextInt(10) + 0;
                card += Integer.toString(n);
            }
        for (int i = 0; i < 16; i++)
        {
            if(i % 4 == 0)
                System.out.print(" ");
            System.out.print(card.charAt(i));


        }

        }


    }
}



