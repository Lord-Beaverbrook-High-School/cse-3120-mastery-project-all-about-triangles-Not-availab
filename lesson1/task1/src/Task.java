import java.lang.Math;
public class Task {
  double small;
  double med;
  double big;
  // Constructor
  private void Triangle (double a, double b, double c) {
    if (a > b && a > c) { // if a is biggest
      big = a;
      if (b > c) { // if next biggest is b
        med = b;
        small = c;
      } else {
        med = c;
        small = b;
      }
    } else if (b > a && b > c) { // if b is biggest
      big = b;
      if (a > c) { // if next biggest is a
        med = a;
        small = c;
      }
      else {
        med = c;
        small = a;
      }
    } else if (c > b && c > a) { // if c is biggest
      big = c;
      if (b > a) {  // if next biggest is b
        med = b;
        small = a;
      }
      else {
        med = a;
        small = b;
      }
    } else if (a == b || a == c || b == c) {
      System.out.println("some of those sides are equal and the code needs unequal sides");
      // the code only takes small, med, and big sides so this is here as a catch
    }
  }
  // constructor
  private void Triangle () {
    small = 3.0;
    med = 4.0;
    big = 5.0;
    // defaults
  }
  // getters and setters
  public void setBig (double big) {
    this.big = big;
    // sets a new big
  }
  public double getBig () {
    return big;
    // returns the value of the biggest side
  }
  public void setMed (double med) {
    this.med = med;
    // sets a new med
  }
  public double getMed () {
    return med;
    // returns value of medium side
  }
  public void setSmall (double small) {
    this.small = small;
    // sets a new small
  }
  public double getSmall () {
    return small;
    // returns value of smallest side
  }
  public boolean isTriangle () {
    return small + med > big;
    // returns if the values create a triangle
  }
  public boolean isRightTriangle () {
    double big2 = (big * big);
    double med2 = (med * med);
    double small2 = (small * small);
    // the square numbers
    big2 = big2 - (big2 % 0.1);
    med2 = med2 - (med2 % 0.1);
    small2 = small2 - (small2 % 0.1);
    // tolerance to the tenths place
    return big2 == small2 + med2;
    // returns if it is a right triangle
  }
  public double perimeter () {
    return big + med + small;
    // adds up the perimeter
  }
  public double area () {
    return Math.sqrt((big + small + med) * (big + med) * (small + big) * (med + small));
    // formula for area
  }
  public void displayTriangle () {
    System.out.println("Smallest Side: " + small);
    System.out.println("Medium Side: " + med);
    System.out.println("biggest Side: " + big);
    // just prints the
  }
}