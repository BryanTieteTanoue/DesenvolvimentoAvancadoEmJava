package parte01;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Exemplo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificaSeEMAIOR =
                (paramento, valorComparacao) -> paramento > valorComparacao;
        UnaryOperator<Integer> retornaDobro =
                (v -> v * 2);

        //mesma entrada de valores, mesma saída
        System.out.println(verificaSeEMAIOR.test(13,2));
        System.out.println(verificaSeEMAIOR.test(13,2));

        System.out.println(retornaDobro.apply(25));

        Teste func = valor -> {             //uma lambda com mais du umalinha de comando, precisa de chaves
            System.out.println("Uma linha");
            System.out.println("Duas linha");
            System.out.println("Três linha");
            return "O valor passado foi " + valor;
        };
        System.out.println(func.mostrar("Laranja"));

        //Lambda com uma só linha de comando não precisa de chaves nem "return"
        func = valor -> valor + "lambda sem chaves";
        System.out.println(func.mostrar(""));
    }

    interface Teste {
        String mostrar(String valor);
    }

}
