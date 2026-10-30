public class Patterns {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        pattern7(5);
    }

    /*
        *****
        *****
        *****
        *****
        *****
    */
    static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*
        *
        **
        ***
        ****
        *****
    */
   static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*
        *****
        ****
        ***
        **
        *
    */
   static void pattern3(int n){
        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= (n - row + 1); col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /*
        1
        12
        123
        1234
        12345
    */
   static void pattern4(int n){
        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }

    /*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
    */
   static void pattern5(int n){
        pattern2(5);
        pattern3(4);
    }

    /*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *
    */
   static void pattern6(int n){

        // print upper triangle
        for(int row = 1; row <= n; row++){

            // print space
            for(int col = 1; col <= (n - row); col++){
                System.out.print(" ");
            }

            // print stars
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }

            // print new line at the end of the row
            System.out.println();
        }

        // print lower triangle
        for(int row = 1; row <= n - 1; row++){

            // print space
            for(int col = 1; col <= row; col++){
                System.out.print(" ");
            }

            // print stars
            for(int col = 1; col <= n - row; col++){
                System.out.print("* ");
            }

            // print new line at the end of the row
            System.out.println();
        }
    }

    /*
            1
           212
          32123 
         4321234
        543212345
    */
    static void pattern7(int n){
        for(int row = 1; row <= n; row++){
            // print spaces
            for(int col = 1; col <= n - row; col++){
                System.out.print(" ");
            }

            // print numbers decresing order
            for(int col = 1; col <= row; col++){
                System.out.print(row - col + 1); 
            }

            // print numbers ascending order
            int num = 2;
            for(int col = 1; col <= row - 1; col++){
                System.out.print(num++); 
            }

            // print new line at the end of the row
            System.out.println();
        }
    }
}