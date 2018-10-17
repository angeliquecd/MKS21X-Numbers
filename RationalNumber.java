public class RationalNumber extends RealNumber{
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
  this.reduce();
  }

  public double getValue(){
    return (double)numerator/denominator;//???
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
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    other.reduce();
    this.reduce();
    return (denominator==other.getDenominator() && numerator==other.getNumerator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator==1){
      return ""+numerator;
    }
    if (denominator<0){
      return "-"+numerator+"/"+-1*denominator;
    }
    else return ""+numerator+"/"+denominator;
  }



  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    int bigger;
    int smaller;
    if (a>b){
       bigger=Math.abs(a);
       smaller=Math.abs(b);
    }
    else {
      bigger=Math.abs(b);
      smaller=Math.abs(a);
    }
    while (smaller>0){
      int c = bigger%smaller;
      bigger=smaller;
      smaller=c;
    }
    return bigger;
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(numerator,denominator);
      if (gcd!=0){
        numerator=numerator/gcd;
        denominator=denominator/gcd;
      }
  }
  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber answer = new RationalNumber(numerator*other.getNumerator()
    ,denominator*other.getDenominator());
     answer.reduce();
     return answer;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber answer = this.multiply(other.reciprocal());
     answer.reduce();
     return answer;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int denom=denominator*other.getDenominator();
    int numethis=numerator*other.getDenominator();
    int numeother=denominator*other.getNumerator();
    RationalNumber answer = new RationalNumber(numethis+numeother
    ,denom);
     answer.reduce();
     return answer;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int denom=denominator*other.getDenominator();
    int numethis=numerator*other.getDenominator();
    int numeother=denominator*other.getNumerator();
    RationalNumber answer = new RationalNumber(numethis-numeother
    ,denom);
     answer.reduce();
    return answer;
  }
}
