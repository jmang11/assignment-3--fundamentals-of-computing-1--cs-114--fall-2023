import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the size of your matrix:");
    int userInput = scan.nextInt();
    System.out.println();

    try {
      if(userInput > 0){
        }
          else{
            System.out.println("Please re-run the code and enter a Positive Integer.");
          }
    }
      catch (Exception e) {
        System.out.println("Please re-run the code and enter a Positive Integer.");
      }

    Matrix.matrix(userInput);
    Matrix.printMatrix();
    Matrix.populatedMatrix();
    Matrix.printMatrix();
    Matrix.flipMatrix();
    Matrix.printMatrix();

    scan.close();

    }
  }
