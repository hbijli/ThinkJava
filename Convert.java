import java.util.Scanner;

public class Convert {

  public static void main(String[] args) {
    double cm;
    int feet, inches, remainder;
    final double CM_PER_INCH = 2.54;
    final int IN_PER_FOOT = 12;

    Scanner in = new Scanner(System.in);

    //Prompt the user to get the value
    System.out.print("Exactly how many cm? ");
    cm = in.nextDouble();

    //Convert and output the result
    inches    = (int) (cm/CM_PER_INCH);
    feet      = inches/IN_PER_FOOT;
    remainder = inches % IN_PER_FOOT;
    System.out.printf("%.2f cm = % ft, %d in", cm, feet, remainder);
  }
}
