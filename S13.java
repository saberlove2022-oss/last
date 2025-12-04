public class  S13 {
    public static void main(String[] args) {
        int[] grades = {80, 74, 90, 60, 77};
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }

        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
    }
}
