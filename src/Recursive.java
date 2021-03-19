public class Recursive {
    public static void main(String[] args) {
        System.out.println(test(1));
        System.out.println(fibonnacci(10
        ));
    }
    public static int test(int a){
        if (a > 10) {
            return a;
        }
        return test(a+1);
    }

    public static int fibonnacci(int n) {
        if (n <=1 ){
            return 0;
        } else if (n ==2 ) {
            return 1;
        }
        return (fibonnacci(n-1) + fibonnacci(n-2));
    }
}
