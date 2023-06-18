public class testaBanco {
    public static void main(String[] args) {
        cliente paulo = new cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        conta contaDoPaulo = new conta();
        contaDoPaulo.deposita(100);

        // Associa o cliente paulo a contaDoPaulo
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
    }
}
