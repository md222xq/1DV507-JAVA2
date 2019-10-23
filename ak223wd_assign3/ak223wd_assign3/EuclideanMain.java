package ak223wd_assign3;

import java.util.Scanner;

public class EuclideanMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The Euclidean algorithm is an algorithm to decide the greatest common divisor of two positive integers.");
        System.out.println("The greatest common divisor of N and M, in short GCD(A,B), " +
                "is the largest integer X such as M and N are evenly dividable with X.\n");
        System.out.println("Give an integer A : ");
        int a = sc.nextInt();
        System.out.println("Give an integer B : ");
        int b = sc.nextInt();
        //int c = a%b;
        //System.out.println(c);
        System.out.printf("GCD(%d,%d) = ", a,b);

        if(a ==0){
            System.out.print(b);
        } else if(b==0){
            System.out.print(a);
        } else if(b==1){
            System.out.print(1);
        } else if(a!=0 && b!=0){
            // a= bq*r
            int q = a/b;
            //System.out.println(q);
            int r = a%b;
            //System.out.print(r);
            while (r!=0){
                a = b;
                b = r;
                r=a%b;
            }
            //System.out.print(a);
            //System.out.print(b);
        }

        System.out.print(Math.abs(b));



    }
}
