import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // Declarando váriaveis
        int numero = 0;
        String agencia, nomeCliente;
        float saldo = 0;

        Scanner scan = new Scanner(System.in);

        // Introduzindo o banco e pedindo as informações XD
        System.out.println("Olá, seja muito bem vindo(a) ao banco LINAAZUL!");
        System.out.println("Para prosseguir por favor informe");
        System.out.println("O número da agência:");
        numero = scan.nextInt();
        System.out.println("A agência:");
        agencia = scan.next();
        System.out.println("Seu nome: ");
        nomeCliente = scan.next();
        System.out.println("Seu saldo atual: ");
        saldo = scan.nextFloat();
        System.out.println("Olá " +nomeCliente +", obrigado por criar uma conta em " +
                "nosso banco, sua agência é "+ agencia + ", conta " + numero +" e seu saldo " +
                saldo + " já está disponível para saque.");
    }
}
