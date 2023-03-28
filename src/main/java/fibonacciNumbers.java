import java.util.ArrayList;
import java.util.List;

public  class fibonacciNumbers {

    public static int calculate(int n){
        if(n<0){
            throw new IllegalArgumentException("n should not be less than 0!!!");
        }
        else{
            List<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(1);

            for(int i=2; i <= n ; i++){
                list.add(list.get(i-1)+list.get(i-2));
            }
            return list.get(n);
        }
    }
}
