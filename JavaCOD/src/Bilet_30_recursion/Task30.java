package Bilet_30_recursion;

public class Task30 {
    public static void chechPow2(int N,int powTwo){
        if(powTwo==N){
            System.out.println("YES");
        } else if (powTwo>N) {
            System.out.println("NO");
        }else {
            chechPow2(N,powTwo*2);
        }

    }

    public static void main(String[] args) {
        chechPow2(2048,1);
    }
}
