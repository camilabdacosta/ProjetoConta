package Entities;


public  class Cliente  {

    private String numeroconta;
    private String nomecliente;
    private double saldo;
    private double depositar;

    public Cliente(String numeroconta, String nomecliente, double saldo, double depositar) {
        this.numeroconta = numeroconta;
        this.nomecliente = nomecliente;
        this.saldo = saldo;
        this.depositar = depositar;
    }

    public Cliente() {

    }

    public void setNumeroconta(String numeroconta) { this.numeroconta = numeroconta; }

    public String getNumeroconta() {
        return numeroconta;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public String setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
        return nomecliente;
    }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getDepositar() { return depositar; }

    public void setDepositar(double depositar) { this.depositar = depositar; }



}

