public class ContaSalario extends Conta {
    private int quantidadeSaques;

    public ContaSalario(String nome, String cpf ,int numero, int agencia, String banco, double saldo, int quantidadeSaques) {
        super(nome, cpf, numero, agencia, banco, saldo);
        this.quantidadeSaques = quantidadeSaques;
    }

    @Override
    public String toString() {
        return super.toString() + "ContaSalario{" +
                "quantidadeSaques=" + quantidadeSaques +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

//    public void transferencia(double valorDaTranferencia){
//        if (valorDaTranferencia > this.getSaldo()){
//            System.out.println("Valor para trasferencia acima do saldo disponivel!!! ");
//        }else if (valorDaTranferencia < this.getSaldo()){
//            this.saldo
//        }
//    }
    @Override
    public boolean sacar(double quantia) {

        if (quantia > saldo) {
            return false;
        }else {
            if (this.quantidadeSaques > 0 ) {
                this.quantidadeSaques--;
                this.saldo -= quantia;
                return  true;
            }else {
                System.out.println("Limite de saques excedido");
                return  false;
            }
        }
    }
}
