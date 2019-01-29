public class Main {

    public static void main(String[] args) {
        int n = 7;
        int a = fib(n);
    }
    public static int fib(int n)
    {
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
