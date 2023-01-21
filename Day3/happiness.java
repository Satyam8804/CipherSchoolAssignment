// package Day3;
//Find your Happiness Score using your Name.
// Score: you need to
// sum of asci codes
// all characters your Narne.

public class happiness {
    public static void main(String[] args) {
        String name = "satyam";
        int score =0;
        for (int i = 0; i < name.length()-1; i++) {
            score = score + (int)name.charAt(i);
        }
        System.out.println(score);
    }
}
