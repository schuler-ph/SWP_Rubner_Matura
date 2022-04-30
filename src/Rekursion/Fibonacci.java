package Rekursion;

public class Fibonacci {
    static long fib(long in){
        if(in<=0) return 0;
        if(in==1) return 1;
        return fib(in-1) + fib(in-2);
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println(fib(i));
        }
    }
}
