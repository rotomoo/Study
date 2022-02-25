package sort;


import java.util.Arrays;

public class MergeSort {

    /**
     * 1개의 배열 머지소트
     */
    static int[] tmp;

    public static void mergeSort(int[] arr, int lt, int rt) {
        if (lt == rt) return;
        int mid = (lt + rt) / 2;
        mergeSort(arr, lt , mid);
        mergeSort(arr, mid+1 , rt);
        merge(arr, lt ,mid ,rt);
    }

    public static void merge(int[] arr, int lt, int mid, int rt) {
        int ltIdx = lt;
        int rtIdx = mid + 1;
        int idx = lt;

        while (ltIdx <= mid && rtIdx <= rt) {
            if (arr[ltIdx] > arr[rtIdx]) {
                tmp[idx++] = arr[rtIdx++];
            }
            else {
                tmp[idx++] = arr[ltIdx++];
            }
        }
        if (ltIdx > mid) {
            while (rtIdx <= rt) tmp[idx++] = arr[rtIdx++];
        }
        else {
            while (ltIdx <= mid) tmp[idx++] = arr[ltIdx++];
        }

        for (int i = lt; i <= rt; i++) {
            arr[i] = tmp[i];
        }
    }


    /**
     *  2개의 배열 머지소트
     */
    public static int[] twoMergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] ltArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rtArr = Arrays.copyOfRange(arr, mid, arr.length);

        return twoMerge(twoMergeSort(ltArr), twoMergeSort(rtArr));
    }

    public static int[] twoMerge(int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int idx = 0;
        int[] tmp = new int[arr1.length + arr2.length];
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] > arr2[p2]) {
                tmp[idx++] = arr2[p2++];
            }
            else tmp[idx++] = arr1[p1++];
        }
        while (p1 < arr1.length) tmp[idx++] = arr1[p1++];
        while (p2 < arr2.length) tmp[idx++] = arr2[p2++];
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 5, 2, 1, 7, 5, 2, 6};
        tmp = new int[arr1.length];
        mergeSort(arr1,0 , arr1.length - 1);
        for (int x: arr1) System.out.print(x+" ");
        System.out.println();
        arr1 = new int[]{9, 5, 2, 1, 7, 5, 2, 6};
        for (int x: twoMergeSort(arr1)) System.out.print(x+" ");
    }
}
