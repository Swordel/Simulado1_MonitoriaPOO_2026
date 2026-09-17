package com.simulado;

public class Simulado1 {

    public static void main(String[] args) {

    //=========================== EXERCÍCIO 1
        /*
        Carro carro = new Carro();
        carro.mostrarEstado(); // DESLIGADO | 0.0

        System.out.println(); //essa linha é só pra dar um enter no terminal

        carro.alterarEstado(); // LIGADO
        carro.mostrarEstado();

        System.out.println();

        carro.alterarEstado(); // MOVENDO
        carro.acelerar(50);
        carro.mostrarEstado(); // MOVENDO | 50.0

        System.out.println();

        carro.alterarEstado(); // PARADO, velocidade volta a 0
        carro.mostrarEstado();

        System.out.println();  

        carro.alterarEstado(); // DESLIGADO
        carro.mostrarEstado();
        */

    //=========================== EXERCÍCIO 2
    /*
        Carro c1 = new Carro();
        c1.alterarEstado(); // LIGADO
        c1.alterarEstado(); // MOVENDO
        c1.acelerar(80);

        Carro c2 = new Carro();
        c2.alterarEstado(); // LIGADO
        c2.alterarEstado(); // MOVENDO
        c2.acelerar(60);

        Carro c3 = new Carro(); 
        c3.alterarEstado(); // LIGADO
        c3.alterarEstado(); // MOVENDO
        c3.acelerar(90);

        Carro c4 = new Carro(); //DESLIGADO

        Radar radar = new Radar();
        radar.inserirCarro(c1);
        radar.inserirCarro(c2);
        radar.inserirCarro(c3);
        radar.inserirCarro(c4);

        System.out.println("--- Em movimento ---");
        radar.mostrarMovimento(); //qtd = 3 e velocidade = 76.66666667

        System.out.println("--- Desligados ---");
        radar.mostrarDesligado();  // só o c4
      */  

    //=========================== EXERCÍCIO 3
    /*
       Conta c1 = new Conta("Gaby",300);
       Conta c2 = new Conta("Belinha",800);

       System.out.println("Saldo de " + c1.getNome() + " = " + c1.getSaldo()); //Gaby = 300
       System.out.println("Saldo de " + c2.getNome() + " = " + c2.getSaldo()); //Belinha = 800

       c1.depositar(200);
       System.out.println("Saldo de " + c1.getNome() + " = " + c1.getSaldo()); // Gaby = 500
       c1.retirar(600); //esse não vai conseguir
       System.out.println("Saldo de " + c1.getNome() + " = " + c1.getSaldo()); // continua Gaby = 500
       
       c1.retirar(100);
       System.out.println("Saldo de " + c1.getNome() + " = " + c1.getSaldo()); // Gaby = 400

       Transferencia.transferir(c1, c2, 600); //não vai conseguir

       Transferencia.transferir(c1, c2, 400);
       System.out.println("Saldo de " + c1.getNome() + " = " + c1.getSaldo()); //Gaby = 0
       System.out.println("Saldo de " + c2.getNome() + " = " + c2.getSaldo()); //Belinha = 1200
    */

   //=========================== EXERCÍCIO 4

        /*

        Decida se as assertivas abaixo são verdadeiras ou falsas. Justifique brevemente as falsas.

        (a) Um atributo declarado como final pode ter seu valor alterado após a inicialização
        FALSA — final garante que o valor não pode ser alterado após a inicialização. É justamente esse o propósito do final.

        (b) Uma classe B possui dois atributos de tipo B. Esta classe cria uma estrutura de uma arvore binaria
        VERDADEIRA — cada nó de uma árvore binária aponta para no máximo dois filhos do mesmo tipo, exatamente como uma classe com dois atributos do próprio tipo.

        (c) O modificador static impede o acesso de um atributo de fora de uma classe.
        FALSA — static significa que o atributo pertence à classe e não a um objeto. Quem controla o acesso externo é o private/public/protected.

        (d) Um metodo setter dá acesso de escrita a um método
        FALSA — um setter dá acesso de escrita a um atributo, não a um método.

        (e) É uma má prática ter métodos públicos  
        FALSA — métodos públicos são necessários e esperados — são a interface que outras classes usam para interagir com um objeto. O que seria má prática é deixar ATRIBUTOS públicos.

        (f) O valor de uma enum  é sempre público
        VERDADEIRA — os valores de um enum são implicitamente public static final.

        (g) Um inteiro é um tipo primitivo
        VERDADEIRA — int é um dos tipos primitivos do Java.

        (h) Não é possível existir um método que possua um parâmetro de tipo String[].
        FALSA — é totalmente possível. A própria main é um exemplo clássico: public static void main(String[] args)

        (i) O atributo out da classe System é estático e público.
        VERDADEIRA — System.out é declarado como public static final PrintStream out, por isso você acessa direto pela classe sem criar um objeto.

        (j) Um atributo String sempre terá o valor padrão  ""(String vazia) na ausência de construtores.
        FALSA — o valor padrão de um atributo String sem inicialização é null, não "" (vazio)!

        */

    }
}
