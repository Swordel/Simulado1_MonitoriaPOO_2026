package com.simulado;

import java.util.ArrayList;

//RADAR HAS-MANY CARROS -> Vamos usar ArrayList!
/*Quero: - inserir carro no radar
         - exibir todos os carros em movimento, a quantidade e a velocidade média
         - listar os carros desligados
*/
public class Radar {

    private ArrayList<Carro> radar;

    public Radar(){
        radar = new ArrayList<>();
    }

    public void inserirCarro(Carro c) {
        if (c == null) {
            System.out.println("Carro invalido");
            return;
        }

        radar.add(c);
    }

    public void mostrarMovimento(){
        int qtd = 0;
        double soma = 0;

        for(Carro c : radar){

            if(c.isMovimento()){  //se o carro estiver em movimento, eu executo esse IF. Fiz um método extra na Classe Carro: isMovimento(). Também pode ser -> if(c.getEstado() == EstadoDoCarro.MOVENDO)
                c.mostrarEstado();
                qtd++;
                soma += c.getVelocidade();
            }

        }

        double media = qtd > 0 ? soma / qtd : 0; //Caso a quantidade seja 0, não buga.

        System.out.println("Quantidade em movimento: " + qtd);
        System.out.println("Velocidade media: " + media);
    }

    public void mostrarDesligado(){
        for(Carro c : radar){
            if(c.isDesligado())
                c.mostrarEstado();
        }
    }

}
