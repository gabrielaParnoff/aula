
package aula;

import java.util.List;
import java.util.ArrayList;

public class Aula {
   int numero = 0; 
    


    public static void main(String[] args) {
        int numero = 0;
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if(numero< 5 ) {
            System.out.println (" menos que 5");
        } else {
            System.out.println("maior que 5");
        }
    while(numero <5){
    numero++;
        }
        System.out.println(lista + " " + numero);
    }

public int calculaNumero(int param) {
    return param + 10;
}
    }









