package Tasks.Oleksandr;

/**
 * Created by Sander on 26.03.2015.
 */
public class NumberOperations {
//method for checking number
    protected int countNumber(int num){
     int  count = Integer.toString(num).length();
        return count;
    }


    protected int sumOfNumbers(int num){
        int sum=0;
        while (num!=0){
            sum=sum+(num%10);
            num/=10;
        }
        return sum;
    }
}
