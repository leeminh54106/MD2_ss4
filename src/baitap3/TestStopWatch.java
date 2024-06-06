package baitap3;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < arr.length; i++) {
            int tempIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[tempIndex] == arr[j]) {
                    tempIndex = j;
                }
            }
            if (tempIndex != i) {
                int temp = arr[tempIndex];
                arr[tempIndex] = arr[i];
                arr[i] = temp;
            }
        }
        sw.stop();
        sw.getElapsedTime();
        System.out.println("thời gian trôi:" +sw.getElapsedTime());
    }
}
