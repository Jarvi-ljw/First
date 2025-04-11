package Day4.recursionDemo;

public class RecursionDemo2 {
    public static void main(String[] args) {

        System.out.println(f(21));
    }

    public static int f(int n){
        if (n==1){
            return 1;
        }
        return f(n-1)*n;
    }
}
