public class bubble {
    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < __________; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap the elements

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubble obj = new bubble();
        obj.bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
