import java.util.Scanner;
public class MatrixAddition{      // class name should be the file name
  public static void main(String[]args){ //main
    Scanner sc = new Scanner(System.in); //pre Input declaration 
    System.out.println("Enter the fucking N for Matrix");
    int n = sc.nextInt();
    int Matrix1 [][] = new int [n][n]; //Declare the Variables for array
    int Matrix2 [][] = new int [n][n];
    int sum[][] = new int [n][n];
    System.out.println("Enter the Matrix 1 :");
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        Matrix1[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter the Second Matrix Bruh");
    for(int i = 0; i < n; i++){
      for (int j = 0;j < n; j++){
        Matrix2[i][j] = sc.nextInt();
        sum[i][j] = Matrix1[i][j]+Matrix2[i][j]; //Addition of two Matrix
      }
    }
    System.out.println("The Sum of the Matrix Addition is :");
    for (int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.print(sum[i][j]+"\t");
      }
      System.out.println();
    }
    sc.close(); // close the input declaration since it will not be used
  }
}
