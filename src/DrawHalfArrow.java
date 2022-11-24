import java.util.Scanner;


public class DrawHalfArrow {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int arrowBaseHeight;
    int arrowBaseWidth;
    int arrowHeadWidth;


    System.out.print("Enter arrow base height:");
    arrowBaseHeight = scnr.nextInt();
    
    System.out.print("Enter arrow base width:");
    arrowBaseWidth = scnr.nextInt();
    
    System.out.print("Enter arrow head width:");
    arrowHeadWidth = scnr.nextInt();
    if (arrowHeadWidth > arrowBaseWidth) {
      System.out.println("");
    }
  
    while (arrowHeadWidth <= arrowBaseWidth) {
      System.out.print("Arrow head width must be greater than arrow width.!!\nTry entering headwidth again :");
      arrowHeadWidth = scnr.nextInt();
      if (arrowHeadWidth > arrowBaseWidth) {
        System.out.println("");
        break;}
      }
  
    for (int i = 0; i < arrowBaseHeight; i++)
    {
      for (int j = 0; j < arrowBaseWidth; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int k = arrowHeadWidth; k <= arrowHeadWidth; k--)
    {
      for (int l = 0; l < k; l++)
      {
        System.out.print("*");
      }
      if (k == 0)
      {
        break;
      }
      System.out.println();
    }
  }
 }