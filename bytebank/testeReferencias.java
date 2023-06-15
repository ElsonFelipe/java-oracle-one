public class testeReferencias {
    public static void main(String[] args) {
        conta primeiraConta = new conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("São a mesmissima conta");
        }

         System.out.println(primeiraConta);
         System.out.println(segundaConta);
    }
}
