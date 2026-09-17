package com.simulado;

public class Conta {

    private String nome; //titular da conta
    private double saldo; //saldo atual da conta

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

     public void depositar(double valor){
        if(valor > 0)
            saldo += valor;
    }

    public void retirar(double valor){
        if(valor > 0 && valor <= saldo)
            saldo -= valor;
        
        else
            System.out.println("Saldo insuficiente.");
    }

    public boolean isMaiorQueZero(){
        return saldo > 0;
    }

}
