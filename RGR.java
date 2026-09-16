import java.util.Scanner;
public class RGR{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the fucking N for Matrix");
    int n = nextInt();
    int Matrix1 [][] = new int [n][n];
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
        sum[i][j] = Matrix1[i][j]+Matrix2[i][j];
      }
    }
    System.out.println("The Sum of the Matrix Addition is :");
    for (int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.print(sum[i][j]+"\t");
      }
    }
    sc.close();
  }
}
