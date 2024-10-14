
import java.util.Scanner;

public class pattern {
    public static void main(String args[]){
        //-------------->Nested loops<----------
        //------------->Pattern for rectangle<-----------
        // for(int i = 1; i<=4; i++){
        //     for(int j=1; j<5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }
        //------>Pattern for hollow rect<------
        // int n=4;
        // int m=5;
        // for (int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || j==1 || i==n ||j==m) {
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //-------->Pattern(half pyramid)<-----
        // for(int i = 1; i<=4; i++){
        //     for(int j = 1; j <= i; j++ ){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //------------->inverted pyramid<------------
        // for(int i = 4; i>=0; i--){
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //---------->
        // for(int i=1; i<=4; i++){
        //     // inner loop -> Space print
        //     for (int j=1; j<=4-i; j++ ){
        //         System.out.print(" ");
                
        //     }
        //     // inner loop -> star print
        //     for(int j=1; j<=i; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //--->print number in form of pyramid
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
