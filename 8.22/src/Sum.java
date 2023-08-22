import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        RangeSum rangeSum = new RangeSum();

        int totalSum = rangeSum.TotalSum(num1, num2);
        int oddSum = rangeSum.OddSum(num1, num2);
        int evenSum = rangeSum.EvenSum(num1, num2);

        System.out.println(num1 + "부터 " + num2 + "까지의 합계: " + totalSum);
        System.out.println(num1 + "부터 " + num2 + "까지의 홀수 합계: " + oddSum);
        System.out.println(num1 + "부터 " + num2 + "까지의 짝수 합계: " + evenSum);
    }
}

class RangeSum {
    public int TotalSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public int OddSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int EvenSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}