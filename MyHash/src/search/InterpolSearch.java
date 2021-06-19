package search;

public class InterpolSearch {

    static int ISearch(int[] arr, int first, int last, int target){
        int mid;
        if (arr[first] > target || arr[last] < target) return -1;
        mid = ((target-arr[first]) / (arr[last] - arr[first]) * (last - first)) + first;

        if (arr[mid] == target) return mid;
        else if (target < arr[mid]) return ISearch(arr, first, mid - 1, target);
        else return ISearch(arr, mid + 1, last, target);
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int idx;
        idx = ISearch(arr, 0, arr.length-1, 7);
        printIndex(idx);

        idx = ISearch(arr, 0, arr.length-1, 10);
        printIndex(idx);

        idx = ISearch(arr, 0, arr.length-1, 2);
        printIndex(idx);
    }

    private static void printIndex(int idx) {
        if (idx == -1) {
            System.out.println("탐색 실패");
        } else {
            System.out.println("타겟 인덱스 = " + idx);
        }
    }
}
