import java.util.*;

public class Sunflower{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the num of days:");
        int num = input.nextInt();

        //Max height required after "num" days
        System.out.println("Enter the height required:");
        int Hn = input.nextInt();

        //iteratively narrow down the search range by evaluating the result of a mathematical function for each midpoint.
        int low = 1;
        int high = 1000000000;
        int tot = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(Hn >= func(mid,num)){
                tot = mid ;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(tot);
    }

  //function that calculates the final height of sunflower after "n" days
    public static double func(int height, int n){
        int result = 0;
        double[] arr = new double[n];
        for(int i=0; i<n; i++){
            arr[i] = height + Math.floor(Math.sqrt(height));
            height = (int)arr[i];
            result = (int)arr[n-1];
        }
        return result;
    }
}
