public class testaMetodo {
    public static void main(String[] args) {
        conta contaDoPaulo = new conta();
        contaDoPaulo.saldo = (100);
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean consegiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(consegiuRetirar);

        conta contaDaMarcela = new conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(3000, contaDoPaulo)) {
            System.out.println("Transferencia com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "paulo Silveira";
        System.out.println(contaDoPaulo.titular);
    }
}
