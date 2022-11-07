import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        int  lastNumber=0, sum=1, x=0;

        Scanner inp= new Scanner(System.in);
        n=inp.nextInt();


        System.out.println(n+" elemanlı Fibonacci serisi: ");
        for(int i=0; i<n; i++){
            if (i==0){
                System.out.print(lastNumber+ " ");
            }else if(i==1){
                System.out.print(sum+ " ");
            }else {
                x=sum;
                sum= lastNumber+sum;
                lastNumber=x;
                System.out.print(sum+ " ");
            }
        }
    }
}
