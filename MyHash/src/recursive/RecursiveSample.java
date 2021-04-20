package recursive;

public class RecursiveSample {
    public static void main(String[] args){
        RecursiveSample recursiveSample = new RecursiveSample();
        recursiveSample.recursive(3);
        System.out.println(recursiveSample.factorial(5));
    }

    public void recursive(int num){
        if (num <= 0) return;
        System.out.println("Recursive Call");
        recursive(num-1);
    }

    public int factorial (int n){
        if (n == 1) return 1;
        return n * factorial(n-1);
    }
}
