public class RationalNumber extends RealNumber{

private int numberator, denominator;

=======
  private int numerator, denominator;
  /**Initialize the RationalNumber with the provided values
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    if (deno==0){
      numerator=0;
      denominator=1;
    }
    else{
    numerator=nume;
    denominator=deno;
  }
  }

  public double getValue(){
    return 1.0*numerator/denominator;//???
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return RationalNumber(denominator,numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return (denominator==other.getDenominator() && numerator==other.getNumerator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return ""+nume+"/"+deno;
  }



  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  public static int gcd(int a, int b){
    if (a>b){
      int bigger=a;
      int smaller=b;
    }
    else {
      int bigger=b;
      int smaller=a;
    }
    while (smaller>0){
      int b = bigger%smaller;
      bigger=smaller;
      smaller=b;
    }
    return bigger;
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

  }
  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
