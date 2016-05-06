package MaxMin;

/**
 * Created by Олесь on 17.04.2016.
 */
public class MaxMin {
    public static void main(String args[]){
        int [] arrey = {1,2,3,4,5};
        int max = 0;
        int min = 0;
        for(int i = 0; i<arrey.length; i++){
            if(max<arrey[i])
                max = arrey[i];
            if(min>arrey[i])
                min = arrey[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
