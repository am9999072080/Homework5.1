import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasks1_4();

    }

    public static void tasks1_4() {
        System.out.println("Задачы-1-3");

        int[] weights = new int[3];
        weights[0] = 75;
        weights[1] = 65;
        weights[2] = 55;
        for (int i = 0; i < 3; i++) {
            System.out.print(weights[i] + ", ");
        }
        System.out.println();

        double[] dubArray = {1.57, 7.654, 9.986};
        for (int j = 0; j < dubArray.length - 1; j++) {
            System.out.print(dubArray[j] + ", ");
        }

        System.out.println();

        String[] arbitrary = {"Профессия", "Java", "разработчик", "INT"};
        for (int i = 0; i < arbitrary.length - 1; i++) {
            System.out.print(arbitrary[i] + ", ");
        }

        System.out.println();

        for (int i = 2; i >= 0; i--) {
            System.out.print(weights[i] + ", ");
        }

        System.out.println();

        for (int j = dubArray.length - 1; j >= 0; j--) {
            System.out.print(dubArray[j] + ", ");
        }
        System.out.println();

        for (int i = arbitrary.length - 1; i >= 0; i--) {
            System.out.print(arbitrary[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] = weights[i] + 1;
                System.out.print(Arrays.toString(weights) + ", ");
            }
        }

    }
}