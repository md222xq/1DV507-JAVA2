package ak223wd_assign1;

import java.util.Scanner;

public class PascalMain {
    public static void main(String[] args) throws Exception {

        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a positive integer : ");
        int nbr = sc.nextInt();
        if(nbr<0) {
        	throw new Exception("Provide a positive integer.");
        	
        } else {
        	sc.close();
        	arr = pascalRow(nbr).clone();
        	
        }
        
        

        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }

    private static int[] pascalRow(int n){
        int [] val = new int[n+1];//increase the size of the array

        if(n==0){
            val[0]=1;
            return val;
        } else if(n==1){
            val[0]=1;
            val[1]=1;
            return val;
        } else {
            int[] a = pascalRow(n-1);
            val[0]=1;
            val[val.length-1]=1;
            for (int i=1;i<a.length;i++){
                val[i]+=a[i]+a[i-1];
            }
            return val;
        }
    }




}