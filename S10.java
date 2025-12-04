public class S10  {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 8, 7};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("First even at index " + i);
                break;
            }
        }
    }
}
