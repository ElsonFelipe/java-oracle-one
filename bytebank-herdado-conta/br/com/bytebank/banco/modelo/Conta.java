package br.com.bytebank.banco.modelo;

/**
 * Classe representa amoldura de uma conta
 * 
 * @author Elson
 * 
 */
public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto conta a partir da agencia e numero
     * 
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        
        this.saldo -= valor;        
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;            
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
      return "Número: " + this.numero + ", Agencia: " + this.agencia;
    }

}

    