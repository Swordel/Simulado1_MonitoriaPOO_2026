package com.simulado;

public class Carro {
    private EstadoDoCarro estado;
    private double velocidade;

     public Carro(){
        estado = EstadoDoCarro.DESLIGADO;
        velocidade = 0;  //nem precisava, por que tipo primitivo por padrão começa com 0, mas o exercício que pediu
    }

    public EstadoDoCarro getEstado() {
        return estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void alterarEstado(){
        switch(estado){
            case DESLIGADO -> estado = EstadoDoCarro.LIGADO;

            case LIGADO -> estado = EstadoDoCarro.MOVENDO;
            
            case MOVENDO -> {
                estado = EstadoDoCarro.PARADO;
                velocidade = 0;
            }

            case PARADO -> estado = EstadoDoCarro.DESLIGADO;
        }
    }

     public void acelerar(double incremento){
        if(estado == EstadoDoCarro.MOVENDO){
            velocidade += incremento;
        }
    }

    public void mostrarEstado(){
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Estado: " + estado);
    }

    //Método para utilizar no exercício 2
    public boolean isMovimento(){
        return estado == EstadoDoCarro.MOVENDO;
    }

    //Método para utilizar no exercício 2
    public boolean isDesligado(){
        return estado == EstadoDoCarro.DESLIGADO;
    }
}
