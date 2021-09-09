package Entities;

public class ContaCliente {
    private int numero;
    private double saldo;
    private static double cpmf = 0.01;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getCpmf() {
        return cpmf;
    }

    public static void setCpmf(double cpmf) {
        ContaCliente.cpmf = cpmf;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            double imposto = valor * cpmf;
            saldo -= (valor + imposto);
            return true;
        }
        return false;
    }


    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Dados da Conta");
        System.out.println("numero = " + numero);
        System.out.println("saldo = " + saldo);
    }
}
