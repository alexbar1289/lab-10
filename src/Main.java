import java.security.KeyException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void firstMethod() {
        try {
            System.out.println("������� ������� �� ����\n");
            double a = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void secondMethod() {
        try {
            System.out.println("������� ����� �� ������ �������\n");
            int[] a = {1,2,3};
            a[5] = 6;

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("����������: ����� �� ������ �������\n");
        }
    }

    public static void thirdMethod(int numberOfException) {
        try {
            if(numberOfException == 1)
                throw new ArrayIndexOutOfBoundsException();
            if(numberOfException == 2)
                throw new IllegalAccessException();
            if(numberOfException == 3)
                throw new KeyException();

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("���������� ���� 1: " + e + "\n");
        }
        catch (IllegalAccessException e) {
            System.out.println("���������� ���� 2: " + e + "\n");
        }
        catch (KeyException e) {
            System.out.println("���������� ���� 3: " + e + "\n");
        }

    }

    public static void fourthMethod() {
        try {
            System.out.println("��������� ���������� ������������ ���������\n");
            throw new MyLogException("��������� �� MyException", "LOW");
        } catch (MyLogException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
//        TASK1
        firstMethod();
//        TASK2
        secondMethod();
//        TASK3


        int num;
        while (true) {

            System.out.print("������� 1-��� ������ ArrayIndexOutOfBoundsException\n" +
                    "2 - ��� ������ IllegalAccessException\n" +
                    "3 ��� ������ KeyException\n");
            try {
                Scanner in = new Scanner(System.in);
                num = in.nextInt();
                if( num == 1 || num == 2 || num == 3) {
                    break;
                }
                else
                    System.out.println("������ ��� ������ �� ��������������\n");
            }
            catch (InputMismatchException e) {
                System.out.println("������ ��� ������ �� ��������������\n");
            }


        }

        thirdMethod(num);
//        TASK4
        fourthMethod();
    }

}
