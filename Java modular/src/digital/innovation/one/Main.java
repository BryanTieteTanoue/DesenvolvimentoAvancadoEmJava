package digital.innovation.one;

import digital.innovation.one.operacoes.Calculadora;
import digital.innovation.one.operacoes.internal.SumHelp;

public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sum(5 ,3));
        SumHelp s = new SumHelp();
        //o problema é que podemos manipular as classes que deveriam ser acessadas apenas pela calc
    }
}


