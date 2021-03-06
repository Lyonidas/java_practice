public class Main {

  public static void main(String[] args) {

    int myValue = 10000;
    //Int:
    int myMinIntValue  = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);
    //Byte:
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);
    //Short:
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);
    //Long:
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Maximum Value = " + myMaxLongValue);

    int myTotal = (myMinIntValue / 2);

    //Casting:
    byte myNewByteValue = (byte) (myMinByteValue / 2);
    short myNewShortValue = (short) (myMinShortValue / 2);

    //Challenge:
    byte myByteChallenge = 1;
    short myShortChallenge = 1;
    int myIntChallenge = 1;
    long myTotalChallenge = (50000 + (myByteChallenge + myShortChallenge + myIntChallenge) * (10));
    System.out.println(myTotalChallenge);
  }
}
