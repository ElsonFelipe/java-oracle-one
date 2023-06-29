//Gerente é um Funcionario. Gerente herda da classe Funcionario, assina o contrato Autenticavel, é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{

    private AutenticaUtil autenticador;

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
       return super.getSalario();
    }

    public Gerente(){
        this.autenticador = new AutenticaUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
      return this.autenticador.autentica(senha);
    }

}