package src;

import java.util.Scanner;

/**
 * Created by Jay Vaghani on 30/03/2019.
 */
public class ArrayPractice {



    public static void main(String[] args) {
//        int[] a = {10,20,100,200};
//         int size = a.length;
//        System.out.println(size);
//
//        String[] name = {"jay", "amit", "arvind", "jitubhai"};
//        System.out.println(name.length);
//        System.out.println(name[3]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter EId :");
        int eId = sc.nextInt();
        sc.nextLine();  // handle next line character (enter key)
        System.out.println("Enter EmpName :");
        String eName = sc.nextLine();

        System.out.println("Employee Id "+eId);
        System.out.println("Employee Name "+eName);


    }
}
