package Rekursion;

public class Fakultaet {
    static int iter(int in){
        int res = 1;

        for(int i = 1; i <= in; i++){
            res *= i;
        }

        return res;
    }

    static int rek(int in){
        if(in == 1) return 1;
        return in * rek(in - 1);
    }

    static int endRekH(int in, int mem){
        if (in<=1) return mem;
        return endRekH(in - 1, mem * in);
    }

    static int endRek(int in){
        return endRekH(in, 1);
    }

    public static void main(String[] args) {
        System.out.println(iter(3));
        System.out.println(rek(3));
        System.out.println(endRek(3));
    }
}
