import java.util.Arrays;
import java.util.Scanner;
public class Excersise3 {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入9个数字：");
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(numbers);
        System.out.println("排序后的数字： ");
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
