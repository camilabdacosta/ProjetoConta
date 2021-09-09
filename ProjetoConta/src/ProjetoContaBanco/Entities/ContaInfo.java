package Entities;


public class ContaInfo  {

    private double deposito;
    private double saque;


    public ContaInfo() {

    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    @Override
    public String toString() {
        return "ContaInfo{" +
                "deposito=" + deposito +
                ", saque=" + saque +
                '}';
    }
}

