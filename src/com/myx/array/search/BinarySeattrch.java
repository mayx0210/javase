package com.myx.array.search;

public class BinarySeattrch {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 34, 51, 56, 63, 75, 83, 99};
        int target = 83;
        int head = 0;
        int tail = arr.length - 1;

        boolean flag = true;
        while (head <= tail) {
            int mid = (tail + head) / 2;
            if (target == arr[mid]) {
                System.out.println("找到了，"+ target +"的下标为："+ mid);
                flag = false;
                break;
            }else if (target < arr[mid]){
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        if (flag) {
            System.out.println("未找到指定元素");
        }
    }
}
