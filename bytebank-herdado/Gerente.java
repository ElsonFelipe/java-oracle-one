//Gerente é um Funcionario. Gerente herda da classe FuncionarioAutenticavel.
public class Gerente extends FuncionarioAutenticavel {


    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do GERENTE");
       return super.getSalario();
    }
    
}
