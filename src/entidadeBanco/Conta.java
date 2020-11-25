package entidadeBanco;

public class Conta {
	private String nome;
	private String cpf;
	private Integer agencia;
	private Double saldo;
	
	//CONSTRUTOR
	public Conta() {
	}
	public Conta(String nome, String cpf, Integer agencia, Double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	//GET SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	//METODOS
	public void sacar(double montante) {
		if(saldo <= 0 || montante > saldo) {
			System.out.println("Não é possível sacar. Saldo insuficiente!");
		}
		else {
			saldo = saldo - montante;
		}
	}
	public void depositar(double montante) {
		saldo = saldo + montante;
	}
	
	public String toString() {
		return "Nome titular: " + nome + 
				"\nCPF: " + cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11) +
				"\nAgência: " + agencia +
				"\nSeu saldo Atual: " + String.format("%.2f", saldo);
	}

}
