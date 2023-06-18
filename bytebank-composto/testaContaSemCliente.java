public class testaContaSemCliente {
    public static void main(String[] args) {
        conta contaDaMarcela = new conta();
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.titular = new cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}
