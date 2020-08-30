package exercises;

public class Exercise3 {
    public static void main(String[] args) {
        int numberX=1;
        int numberY=3;
         int result = 0;
         for (int i=numberX;i<=numberY;i++){
             int sum=result +i;
             result=sum;
         }
        System.out.println(result);


    }
}

