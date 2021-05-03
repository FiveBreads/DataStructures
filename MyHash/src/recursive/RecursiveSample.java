package recursive;

public class RecursiveSample {
    public static void main(String[] args){
        RecursiveSample recursiveSample = new RecursiveSample();
        //recursiveSample.recursive(3);
        //System.out.println(recursiveSample.factorial(5));
        //recursiveSample.fibo(5);
        int[] arr = {1, 3, 5, 7, 9};
        int idx;
        idx = recursiveSample.binarySearchRecur(arr, 0, arr.length - 1, 4);
        recursiveSample.isSearchSuccess(idx);
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

    //피보나치 수열의 n번째 값을 반환
    public int fibo (int n){
        System.out.printf("func call param %d \n", n);
        if (n == 1 ) return 0;
        else if (n == 2) return 1;
        else return fibo(n-1) + fibo(n-2);
    }

    public int binarySearchRecur(int arr[], int first, int last, int target){
        int mid;
        if (first > last) return -1;
        mid = (first+last)/2;
        if (arr[mid] == target) return mid;
        else if (target < arr[mid]){
            return binarySearchRecur(arr, first, mid-1, target);
        }else {
            return binarySearchRecur(arr, mid+1, last, target);
        }
    }

    public void isSearchSuccess(int idx){
        if (idx >= 0){
            System.out.println("탐색 성공");
        }else {
            System.out.println("탐색 실패");
        }
    }
}
