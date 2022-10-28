public class BinaryAddition {
    /* Binary Addition
Instructions
Output
Implement a function that adds two numbers together and returns their sum in binary. The conversion can be done before, or after the addition.

The binary number returned should be a string.

Examples:(Input1, Input2 --> Output (explanation)))

1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
*/

        public static String binaryAddition(int a, int b){
            int sum = a + b;
            String binarySum = "";

            while (sum > 0) {
                binarySum = String.valueOf(sum % 2) + (binarySum);
                sum = sum / 2;
            }
            return binarySum;
    }


        public boolean solution(String str, String ending) {
            // if str ends with ending --> true ,  else  --> false
            if (str.endsWith(ending)) {
                return true;
            }
            return false;
    }
}

