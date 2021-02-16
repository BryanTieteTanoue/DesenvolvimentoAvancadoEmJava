package parte01;

public class Exemplo2 {

    public static void main(String[] args) {
        System.out.println(fatorial(6));
    }

    public static int fatorial(int num){
        if(num == 1) {
            return num;
        } else{
            return num * fatorial(num - 1);
        }
    }

}
