class Fibonachi {
    public static void main(String[] args) {
        int fib_input=10;
      
    
    for (int i = 0; i < fib_input; i++) {
            System.out.print(fib(i) + " ");
        }
        }
        static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
        
    }
    }