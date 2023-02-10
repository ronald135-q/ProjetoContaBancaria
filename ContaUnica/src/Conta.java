public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    static int qtdContas = 0;
    
    //Criação do constructor
    public Conta(String pTitular){
        this.titular = pTitular;
        qtdContas++;
        this.numero = qtdContas;
        this.saldo = 0;
    }

    public void DadosBancarios(){
        System.out.println("Dados Bancários");
        System.out.println("Número :"+this.numero);
        System.out.println("Titular"+this.titular);
        System.out.println("Saldo "+this.saldo);

    }

    public void Depositar(double pValor){
        System.out.println("");
        System.out.println("--Realizando Depósito--");
        this.saldo += pValor;
    }

    public void Sacar(double pValorSaldo){
        if(pValorSaldo > this.saldo){
            System.out.println("Infelizmente devido ao valor saldo, não pode sacar");
        }
        else{
            this.saldo -= pValorSaldo;
            System.out.println("Saque efetuado de"+pValorSaldo);
        }

    }
}
