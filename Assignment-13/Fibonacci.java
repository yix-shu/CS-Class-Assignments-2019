import java.math.BigInteger;
/*
Name: Yixing Xu
Date: January 24, 2020
Student ID: 950706619
Course: CS211 Online
Objective of assignment: 
to create a bigFastFib method
*did not complete*
*/
public class Fibonacci {
	
	// fields, ONE is in any version of Java already
	// but BigInteger.TWO requires Java 9 or higher, so I make one here
	private static final BigInteger TWO = new BigInteger("2");
	private static final BigInteger ONE = new BigInteger("1");
	private int n; // the boring old 32-bit limited int
  private BigInteger[] fibList;
	
	// only one constructor needed
	public Fibonacci(int number) {
		n = number;
    fibList = new BigInteger[n+1];
	}
	
	// make this private as right now I cannot think of why we need to allow
	@SuppressWarnings("unused")
	private Fibonacci() {
		this(1);
	}
	
	// Chapter 12, Exercise 2, code from page 128-9.
	public int fibForLoop() {
		int n1 = 1;
		int n2 = 1;
		for (int i = 3; i <= n; i++) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n2;
	}	
	
	// Chapter 12, same exercise
	// public accessor into recursive helper
	public int fibonacci() {
		return fibonacci(n);
	}
	
	// private recursive helper given in text
	// Chapter 12, page 830 (5th ed.)
    private int fibonacci(int n) {
        if (n<=2) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Exactly the same concept as above, but using BigInteger
    // This allows us to go up to any size integer
	public BigInteger bigFib() {
		return bigFib(new BigInteger(Integer.toString(n)));
	}
	
	// recursive helper
    private BigInteger bigFib(BigInteger n) {
        if (n.compareTo(TWO)<=0) {
            return ONE;
        } else {
            return bigFib(n.subtract(ONE)).add(bigFib(n.subtract(TWO)));
        }
    }

	public BigInteger bigFastFib() {
    return bigFastFib(new BigInteger("0"), new BigInteger("1"), new BigInteger(Integer.toString(n)));
  }
	
  private BigInteger bigFastFib(BigInteger a, BigInteger b, BigInteger n) {
    if (n.compareTo(ONE)<=0) {
      return b;
    } else {
      return bigFastFib(b, (a.add(b)), n.subtract(ONE));
    }
  }
}
    
  

