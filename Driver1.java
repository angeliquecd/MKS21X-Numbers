public class Driver1{
public static void main (String[] args){
  RationalNumber one = new RationalNumber(16,4);
  RationalNumber two = new RationalNumber(5,6);
  RationalNumber three = new RationalNumber(15,7);
  RationalNumber four = new RationalNumber(30,14);
  RationalNumber five = new RationalNumber(30,0);
System.out.println(one);//tests toString
//one.reduce();
//System.out.println(one);//should print 4/1
System.out.println(one.multiply(two));//should print 10/3
System.out.println(one.divide(two));//should print 24/5
System.out.println(one.add(two));//should print 29/6
System.out.println(one.reciprocal());//should print 1/4
System.out.println(one.subtract(two));//should print 19/6
System.out.println(three.equals(four));//should print true
System.out.println(five);//should print 0,0 and tests zero rule
}
}
