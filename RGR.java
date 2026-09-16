import java.util.Scanner;
public class RGR{
  public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How Old are You Bruh ");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.print("Btw Whats your name Bruh ");
    String Name = sc.nextLine();
    System.out.print("Your name is "+ Name + "\t" + "And your Age is "+ n +"\n");
    System.out.println("Interesting lets Verify the Age U MOD maybe");
    System.out.println("Enter the year");
    int again_age = sc.nextInt();
    int a = 2026 - again_age;
    if (a==n){
      System.out.println("Yeah lets goo u are the Arch user");
    }
    else {
      System.out.println("U are eithere a big liar or maybe a Mod");
    }
    sc.close();
  }
}
