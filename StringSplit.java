public class StringSplit {
    public static String[] solution(String s) {
        if(s.length()%2==1) {
            s = s + "_";
        }
        int i = 0;
        int j = 0;
        String[] output = new String[(s.length()/2)];
        for(i = 0, j = 0; i < s.length()-1; i+=2, j++) {
            output[j] = s.substring(i, i+2);
        }
        return output;
    }
    public static String[] solutionByRegex(String s) {
        if (s.length()%2==1) {
            s = s + "_";
        }
        return s.split("(?<=\\G.{2})");
    }

}