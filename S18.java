public class S18 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 3, 9};
        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            }
        }

        if (duplicate) System.out.println("Duplicates found");
        else System.out.println("No duplicates");
    }
}
