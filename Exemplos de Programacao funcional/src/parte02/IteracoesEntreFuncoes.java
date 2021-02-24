package parte02;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IteracoesEntreFuncoes {

    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "João","Santos", "Instrutor", "Java"};
        Integer[] numeros = {1,2,3,4,5};
        imprimiNomes(nomes);
        System.out.println("--------------------");
        imprimiTodos(nomes);
        System.out.println("--------------------");
        imprimiDobro(numeros);
    }

    public static void imprimiNomes(String... nomes){
        String nomesImprimi = Stream.of(nomes)    //transforma em uma stram
                .filter(nome -> nome.equalsIgnoreCase("João"))  //filtra
                .collect(Collectors.joining(" "));//    //transforma em uma stringg
        System.out.println(nomesImprimi);
    }

    public static void imprimiTodos(String... nomes){
        Stream.of(nomes)
                .forEach(System.out::println);
    }
    
    public static void imprimiDobro(Integer... numeros){
        Stream.of(numeros)
                .map(numero -> numero * 2)      //dobra cada número
                .forEach(System.out::println);  //imprimi cada número dobrado
    }

}
