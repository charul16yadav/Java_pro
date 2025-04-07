import java.util.Scanner;

public class percalcu {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Gained Marks of subject 1:");
        int sub1 = scan.nextInt();
        System.out.println("Gained Marks of subject 2:");
        int sub2 = scan.nextInt();
        System.out.println("Gained Marks of subject 3:");
        int sub3 = scan.nextInt();
        System.out.println("Gained Marks of subject 4:");
        int sub4 = scan.nextInt();
        System.out.println("Gained Marks of subject 5:");
        int sub5 = scan.nextInt();

        float percentage = ((sub1+sub2+sub3+sub4+sub5)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
        //percentage calculator

    }
    
}
