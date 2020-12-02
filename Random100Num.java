
//Evan White

import java.util.Scanner;
import java.util.Random;

public class Random100Num
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		  //when grading, I will change the seed

		//counters and accumulators
		double total = 0;
		double average = 0;
		int pos = 0;
		int neg = 0;
		int zero = 0;
		int even = 0;
		int odd = 0;
		int multipleOf5 = 0;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i<100; i++)
		{
			int randNum = rand.nextInt(101) - 50;
				//will generate numbers -50 to 50
          total += randNum;
          
          if(randNum < 0)
              neg++;
          
          else if(randNum > 0)
        	  pos++;
          
          else
        	  zero++;
			
          if(randNum % 2 == 0)
        	  even++;
          else
        	  odd++;
          
          if(randNum % 5 == 0)
        	  multipleOf5++;
         
          max = Math.max(max, randNum);
          min = Math.min(min, randNum);
		}
		  average = total / 100.0;
		
		System.out.println("Average       : " + average);
		System.out.println();
		System.out.println("positives     : " + pos);
		System.out.println("negatives     : " + neg);
		System.out.println("zeros         : " + zero);
		System.out.println();
		System.out.println("evens         : " + even);
		System.out.println("odds          : " + odd);
		System.out.println();
		System.out.println("multiples of 5: " + multipleOf5);
		System.out.println();
		System.out.println("maximum value : " + max);
		System.out.println("minimum value : " + min);

		System.out.println();
	}
}

/*
Average       : 2.61

positives     : 54
negatives     : 45
zeros         : 1

evens         : 45
odds          : 55

multiples of 5: 27

maximum value : 50
minimum value : -49
*/