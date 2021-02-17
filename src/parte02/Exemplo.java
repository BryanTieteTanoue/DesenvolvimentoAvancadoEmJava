package parte02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exemplo {

    public static void main(String[] args) {
        //Consumer - recebe e não retorna nada
        Consumer<String> imprimiFrase = System.out::println; //o java ja entende que tem que printar a frase passada
        imprimiFrase.accept("Hello world");

        //Functions - recebe um valor e obrigatoriamente retorna algo
        Function<String, Integer> conveteString = string -> Integer.parseInt(string) * 2;
        System.out.println(conveteString.apply("30"));

        //Predicate - como Functions, mas retornam true ou false
        //Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Gabriel"));

        //Supplier - não recebe nada mas retorna algo já definido
        Supplier<Pessoa> instaciaPessoa = Pessoa::new;
        System.out.println(instaciaPessoa.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "joão";
        idade = 23;
    }


    @Override
    public String toString() {
        return nome + " " + idade;
    }
}
