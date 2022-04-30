package Rekursion;

public class Baumfaellen {
    static void baumfaellen(int dicke){
        System.out.println("HACK!");
        dicke--;

        if(dicke == 0)
        {
            System.out.println("Baum durch!");
            return;
        }
        baumfaellen(dicke);
    }

    public static void main(String[] args) {
        baumfaellen(10);
    }
}
