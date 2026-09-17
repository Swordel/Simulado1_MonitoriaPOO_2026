package com.simulado;

public class Transferencia {

    public static void transferir(Conta de, Conta para, double valor){
       if (valor <=0){ //Coloquei essa verificação, pois, sem ela, o de.retirar(valor) diria que o saldo é insuficiente, o que não é verdade. O valor negativo que é inválido.
            System.out.println("Valor invalido.");
            return;
        } 
       
       if (valor <= de.getSaldo()){   //esse if é necessário -> Se o retirar falhar por saldo insuficiente, o dinheiro não sai da origem mas chega no destino. Dinheiro criado do nada!
            de.retirar(valor);
            para.depositar(valor); 
        }
        
        else 
            System.out.println("Saldo insuficiente para transferencia"); 

    }

}
