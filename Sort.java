package Sort;

import java.util.Arrays;

/**
 * Created by Олесь on 18.04.2016.
 */
public class Sort {
    public static void main(String args[]){
        int[] intArray = {2, 4, 6, 8, 10};
        Arrays.sort(intArray);

        for (int part : intArray){
            System.out.println(part);
        }

    }

}
