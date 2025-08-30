import  java.util.Scanner;

public class matrixSum {

    static void add(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (r1 != r2 || c1 != c2){
            System.out.println("not possiable");
            return;

        }
        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];

            }

        }
        System.out.println("sum a ,b ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
               System.out.print( sum[i][j]);

            }
            System.out.println();
            
        }



    }



    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter row");
        int r1 =sc.nextInt();
        System.out.println("enter column");
        int c1 =sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("enter array 1 ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] =sc.nextInt();

            }

        }
        System.out.println("Matrix 1 ");


        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j]);

            }
         

        }

        System.out.println("enter row");
        int r2 =sc.nextInt();
        System.out.println("enter column");
        int c2 =sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("enter array 2 ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] =sc.nextInt();

            }

        }

        System.out.println("Matrix  2 ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(b[i][j]);


            }
            System.out.println();

        }


     add(a,r1,c1,b,r2,c2);



    }

}
