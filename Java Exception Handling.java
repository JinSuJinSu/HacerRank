//We can click the practice url in README.md whatever we want.


    import java.util.Scanner;
    class MyCalculator {
        /*
        * Create the method long power(int, int) here.
        */ long power(int num1, int num2) throws Exception{
            if(num1<0 || num2<0){
                throw new Exception("n or p should not be negative.");
            }
            else if(num1==0 && num2==0){
                throw new Exception("n and p should not be zero.");
            }
            else{
                return (int)Math.pow(num1,num2);
            }
        }

    }

    public class Solution {
        public static final MyCalculator my_calculator = new MyCalculator();
        public static final Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            while (in .hasNextInt()) {
                int n = in .nextInt();
                int p = in .nextInt();

                try {
                    System.out.println(my_calculator.power(n, p));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
