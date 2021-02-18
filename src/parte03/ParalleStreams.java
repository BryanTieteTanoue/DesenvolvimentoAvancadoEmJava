package parte03;

import java.util.stream.IntStream;

public class ParalleStreams {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num));        //sem parallel
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio));


        long inicio2 = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num)); //com parallel
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim2 - inicio2));
    }

    public static long fatorial(long num){
        long fat = 1;

        for(int i = 2; i <= num; i++){
            fat *= i;
        }
        return fat;
    }

}
