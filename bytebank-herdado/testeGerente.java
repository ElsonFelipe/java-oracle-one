public class testeGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setCpf("22222222-22");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);
    }
    
}
