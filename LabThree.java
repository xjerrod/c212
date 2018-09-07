import java.math.BigDecimal;

public class LabThree
{
  public static void main(String[] args) {
    BigDecimal a, b, c, d, e;
    
    /** problem 1 
      * 3
      */
    a = new BigDecimal("1");
    b = new BigDecimal("2");
    System.out.println(a.add(b));
    
    /** problem 2 
      * 6
      */
    c = new BigDecimal(3);
    System.out.println(b.multiply(c));
    
    /** problem 3 
      * -2
      */
    d = new BigDecimal("4");
    System.out.println(a.subtract(b.subtract(c.subtract(d))));
    
    /** problem 4 
      * -8
      */
    System.out.println(a.subtract(b).subtract(c).subtract(d));
    
    /** problem 5 
      * 26
      */
    e = new BigDecimal("5");
    System.out.println(b.multiply(c).add(d.multiply(e)));
    
    /** problem 6
      * 4
      */
    System.out.println("\n\t\\\"".length());
    
    /** problem 7
      * -1
      */
    System.out.println("tomato".charAt(2) - 'n');
    
    /** problem 8
      * d
      */
    System.out.println((char)('a' + 3));
    
    /** problem 9
      * 6
      */
    System.out.println(13 % 7);
    
    /** problem 10
      * 5
      */
    System.out.println(5 % 7);
    
    /** problem 11
      * 1
      */
    System.out.println(13 / 7);
    
    /** problem 12
      * 0
      */
    System.out.println(5 / 7);
    
    /** problem 13
      * true
      */
    System.out.println(false && false || true);
    
    /** problem 14
      * false
      */
    System.out.println(false && (false || true));
    
    /** problem 15
      * 0
      */
    System.out.println(2 / 3 * 3);
    
    /** problem 16
      * 2
      */
    System.out.println(3 * 2 / 3);
    
    /** problem 17
      * b 
      */
    
    /** problem 18 
      * true
      */
    
    /** problem 19
     * (n != 0)
     */
    
    /** problem 20 
     * (n < 3) || (n > 5)
     */
    
    /** problem 21
      * (n != 0)
      */
    
    /** problem 22
      * !b
      */
    
    /** problem 23
      * (n == 4)
      */
    
    /** problem 24
      * (n > 5)
      */
    
    /** problem 25
      * false
      */
    
    /** problem 26
       * (n > 3)
       */
    
    /** problem 27
      * compilation error
      */
    
    /** problem 28
      * 2
      */
    
    /** problem 29
      * 10
      */
    
    /** problem 30
      * 10
      */
    
    /** problem 31
      * 6
      */
    
    /** problem 32
      * 12
      */
    
    /** problem 33
      * 38
      */
    
    /** problem 34
      * 115
      */
    
    /** problem 35
      * 0
      */
    
    /** problem 36
      * yes, infinite loop
      */
    
    /** problem 37
      * no, not infinite
      */
    
    /** problem 38
      * no, not infinite
      */
    
    /** problem 38
      * no, not infinite
      */
    
    /** problem 39
      * yes, infinite loop
      */
    
    /** problem 40 */
    /** int centerDistance = Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2));
    int totalRadius = c1.r + c2.r; */
    // answer: (centerdistance > totalRadius)
    
    /** problem 41 */
    // answer: (((r2.y < (r1.y + r1.h)) || (r1.y < (r2.y + r2.h))) || ((r2.x < r1.x + r1.w) || (r1.x < r2.x + r2.w)))
  }
}