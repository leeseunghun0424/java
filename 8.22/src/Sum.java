import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ù ��° ������ �Է��ϼ���: ");
        int num1 = scanner.nextInt();

        System.out.print("�� ��° ������ �Է��ϼ���: ");
        int num2 = scanner.nextInt();

        RangeSum rangeSum = new RangeSum();

        int totalSum = rangeSum.TotalSum(num1, num2);
        int oddSum = rangeSum.OddSum(num1, num2);
        int evenSum = rangeSum.EvenSum(num1, num2);

        System.out.println(num1 + "���� " + num2 + "������ �հ�: " + totalSum);
        System.out.println(num1 + "���� " + num2 + "������ Ȧ�� �հ�: " + oddSum);
        System.out.println(num1 + "���� " + num2 + "������ ¦�� �հ�: " + evenSum);
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