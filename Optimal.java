import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int firstCat = sc.nextInt();
        long[] firstCatArray = new long[firstCat];
        int secondCat = sc.nextInt();
        long[] secondCatArray = new long[secondCat];
        long targetvalue = sc.nextLong();


        for (int i = 0; i < firstCat; i++) {

            firstCatArray[i] = sc.nextLong();


        }
        Arrays.sort(firstCatArray);

        for (int j = 0; j < secondCat; j++) {

            secondCatArray[j] = sc.nextLong();

        }


        Arrays.sort(secondCatArray);



        int counter1 = 0;
        int count2 = secondCat -1;
        long lowestDiff = Integer.MAX_VALUE;
        long finalAnswer = 0;
        while(counter1 < firstCat && count2 >= 0 ){

            long sum = firstCatArray[counter1] + secondCatArray[count2];
            long difference = Math.abs(sum - targetvalue);

            if(difference < lowestDiff){

                lowestDiff = difference;
                finalAnswer = sum;
            }
            if(sum > targetvalue){


                count2--;
            }
            else if(sum < targetvalue) {

                counter1++;


            }


            if(sum == targetvalue)
            {

                break;
            }






        }


        System.out.println(finalAnswer);

    }





}


