package src;

public class Calc {

    int addTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }


    //może się powtarzać nazwa parametru bo parametr dostępny jest tylko wewnątrz ciała metody

    void addAndPrint(int x, int y) {
        int sum = addTwoNumbers(x, y);
        System.out.println(sum);
    }
}
