public class MultiplesThreeFive {
        public int solution(int number) {
            int sum = 0;
            if(number <= 0) {
                return 0;
            }
            number -= 1;
            while (number >=3) {
                if(number % 3 == 0) {
                    sum += number;
                } else if (number % 5 == 0) {
                    sum += number;
                }
                number--;
            }
            return sum;
        }
    }
