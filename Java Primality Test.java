  import java.io.*;
  import java.math.*;
  import java.security.*;
  import java.text.*;
  import java.util.*;
  import java.util.concurrent.*;
  import java.util.regex.*;

  public class Solution {



      private static final Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
          String n = scanner.nextLine();
          BigInteger num = new BigInteger(n);
          scanner.close();

           System.out.println(num.isProbablePrime(5) ? "prime" : "not prime");

      }
  }
