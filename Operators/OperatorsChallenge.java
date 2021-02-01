public class OperatorsChallenge {

  public static void main(String[] args) {

    double myFirstValue = 20.00;
    double mySecondValue = 80.00;
    double myThirdValue = (myFirstValue + mySecondValue) * 100.00;
    System.out.println("The total is = " + myThirdValue);
    double theRemainder = myThirdValue % 40.00
    System.out.println("The remainder is = " + theRemainder);
    boolean isNoRemainder = (theRemainder == 0) ? true : false;
    System.out.println("Is no remainder" + isNoRemainder);
    if (!isNoRemainder) {
      System.out.println("Got some remainder");
    }
  }
}
