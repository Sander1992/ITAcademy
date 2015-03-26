package Tasks.Oleksandr;

/**
 * Created by Sander on 26.03.2015.
 */
public class Test {
    public static void main(String[] args) {
        NumberOperations number = new NumberOperations();
        PerfectNumber perfectNum = new PerfectNumber();
        System.out.println(number.countNumber(665));
        System.out.println(number.sumOfNumbers(1));
        System.out.println(number.sumOfNumbers(556)+ " \n");
        perfectNum.findPerfect(50000);

    }
}
