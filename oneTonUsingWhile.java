
//    Name:-RISHABH PANDEY-------Univ. Roll No:- 2215001445--------------

import java.util.Scanner;;
public class oneTonUsingWhile {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int i=1;
        while(i<=num)
        {
            System.out.print(i+" ");
            i++;
        }
    }
}
