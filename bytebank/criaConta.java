public class criaConta {
    public static void main(String[] args) {
      conta primeiraConta = new conta();
      primeiraConta.saldo = 300;
      System.out.println(primeiraConta.saldo);

      conta segundaConta = new conta();
      segundaConta.saldo = 300;

      System.out.println("Primeira conta tem " + primeiraConta.saldo);
      System.out.println("Segunda conta tem " + segundaConta.saldo);

      primeiraConta.agencia = 146;
      System.out.println(primeiraConta.agencia);
      System.out.println(primeiraConta.numero);

      System.out.println(segundaConta.agencia);

      segundaConta.agencia = 146;
      System.out.println("Agora a segunda conta está na agência " + segundaConta.agencia);

      if(primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
    } else {
            System.out.println("São contas diferentes");
    }

    System.out.println(primeiraConta);
    System.out.println(segundaConta);

    }
}
