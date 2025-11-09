package exercicio.excecao.contas;

public class ContaBancaria {
		private double saldo;
		private double limite;
		
	public ContaBancaria(double valorSaldo, double valorLimite) {
		this.saldo = valorSaldo;
		this.limite = valorLimite;
		}
	 
	// Retorna o saldo da conta.

	 public double getSaldo(){
		 return saldo;
	 }

	 // Retorna o limite da conta.

	 protected double getLimite(){
		 return limite;
	 }

	 // Retorna o saldo da conta somado ao limite.

   public double getSaldoComLimite(){
	   return saldo + limite;
	   
   }

   public boolean sacar(double valor) throws ContaException {
	   if (valor <= 0) {
	        throw new ContaException("O valor do saque deve ser positivo.");
	    }
	   if (valor >500) {
		   throw new ContaException("Saque não permitido. Valor máximo: R$ 500,00 reais");	 
   }
	   if ((saldo + limite - valor) < 0) {
		   throw new ContaException("Saque ultrapassa o limite disponível. Valor máximo permitido: R$" + (saldo + limite));
	   }
	   saldo -=valor;
	   System.out.println("Saque de R$" + valor + " reais realizado");
	   return true;
   }
   public void depositar(double valor) throws ContaException{
	  if (valor > 1000) {
		  throw new ContaException("Depósito não permitido. Valor máximo R$1.000,00 reais");
	  }
	  saldo += valor;
	  System.out.println("Depósito de R$" + valor + " reais realizado com sucesso");
   }
   
   
}


	
        

