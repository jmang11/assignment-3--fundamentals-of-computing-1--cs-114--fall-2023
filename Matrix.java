public class Matrix {

  public static int[][] matrix;
  public static int row;
  public static int column;

  static void matrix(int size) {

    System.out.println();
    matrix = new int[size][size];

    System.out.println("Your matrix is " + size + " x " + size);
    System.out.println();
    System.out.println("Printing matrix with default values:");
    }

  static void printMatrix(){

    final int Length = matrix.length;

    for (row = 0; row < Length ; row++){
      for (column = 0; column < Length ; column++){
        if(row + column == Length-1){
          System.out.print("\033[31m" + matrix[row][column] + "\033[37m" + "\t");
        }else if ( row + column > Length-1){
          System.out.print(matrix[row][column] + "\t");
        }else if(row + column < Length-1){
          System.out.print(matrix[row][column] + "\t");
        }
    }
    System.out.println();
  }
}

  static void populatedMatrix(){

    final int Length = matrix.length;

    System.out.println();
    System.out.println("Populating matrix ... matrix populated");
    System.out.println();
    System.out.println("Printing populated matrix:");

    for(row = 0; row < Length; row++){
      for(column = 0; column < Length; column++){
        matrix[row][column] = ((row * Length) + column +1);
      }
    }
      System.out.println();
    for(row = 0; row < Length; row++){
      for(column = 0; column < Length; column++){
      }
    }
}

  private static void swap(int input_1, int input_2, int input_3, int input_4){

    int x1 = input_1;
    int x2 = input_3;
    int y1 = input_2;
    int y2 = input_4;

    int temp = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  static void flipMatrix(){

    final int Length = matrix.length;

    System.out.println();
    System.out.println("Flipping matrix ... matrix flipped");
    System.out.println();
    System.out.println("Printing flipped matrix");

    for(row = 0; row < Length; row++){
      for(column = 0; column < Length; column++){
        if(row + column < Length - 1){
          swap(row, column, Length - 1 - row, Length - 1 - column);
        }else if(row + column == Length){
        }
      }
    }
}
}
