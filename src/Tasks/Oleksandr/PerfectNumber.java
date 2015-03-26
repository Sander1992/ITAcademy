package Tasks.Oleksandr;

import java.util.ArrayList;

/**
 * Created by Sander on 26.03.2015.
 */
public class PerfectNumber {
    //Finds all the perfect numbers <= n
    protected  ArrayList<Integer> findPerfect(int n)
    {
        ArrayList<Integer> perfects = new ArrayList<Integer>();
        int buffer;
        int counter;
        ArrayList<Integer> perfect = new ArrayList<Integer>();
        int maxDivisor = 0;

        //All perfect numbers are even
        for(int i = 2; i <= n; i += 2)
        {
            maxDivisor = (int)Math.floor(i/2);
            //Find divisors
            counter = 1 + 2; // we know that 1 and 2 are divisors
            for(int j = 3; j <= maxDivisor; j++)
            {
                buffer = i % j;
                if(buffer == 0)
                {
                    //Divisor found
                    counter += j;
                    if(counter > i)
                    {
                        //Sum of divisors is greater than the number so not a perfect number
                        break;
                    }
                }
            }
            if(counter != i)
            {
                //Sum of divisors less than number so number not perfect
                continue;
            }
            if(counter == i)
            {
                System.out.println(i);
                perfect.add(i);

            }

        }

        return perfects;
    }
}
