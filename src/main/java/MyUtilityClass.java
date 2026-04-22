public final class MyUtilityClass {
  
  //Constants
  final static int MAXIMUM = 3000;

  //Private constructor so an object can't be created
  private MyUtilityClass() {
  }
  
  
  //FUNCTION - does not require an object to use.
  public static int returnZero() {
    return 0;
  }

  //overloading functions
  public static int returnZero(int num) {
    return 0;
  }

  public static double returnZero(double num) {
    return 0.0;
  }

  //overloading methods and constructors work the same way
  public static int min(int num1, int num2) {
    if (num1 < num2) {
      return num1;
    }
    return num2;
  }
  
  public static double min(double num1, double num2) {
    if (num1 < num2) {
      return num1;
    }
    return num2;
  }
}
