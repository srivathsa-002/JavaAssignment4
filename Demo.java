package Assignment4;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        RangeFinder rangeFinder = new RangeFinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        String[] signUpDate = new String[n];
        String[] curDate = new String[n];
        int count1 = 0,count2 = 0;
        for(int i=0;i<2*n;i++) {
            if(i%2 == 0){
                signUpDate[count1] = sc.next();
                count1++;
            }
            else {
                curDate[count2] = sc.next();
                count2++;
            }
        }
        String[] range = new String[n];
        for(int i=0;i<n;i++)
            range[i] = rangeFinder.findRange(signUpDate[i],curDate[i]);
        for(int i=0;i<n;i++)
            System.out.println(range[i]);
    }
}