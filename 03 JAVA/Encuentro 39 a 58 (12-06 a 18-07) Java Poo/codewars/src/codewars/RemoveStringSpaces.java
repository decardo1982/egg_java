package codewars;

public class RemoveStringSpaces {

    public static void main(String[] args) {

        String x = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println("x: " + x);

        char letra;
        String solution = "";

        for (int i = 0; i < x.length(); i++) {
            letra = x.charAt(i);
            if (letra != ' ') {
                solution += letra;
            }
        }
        System.out.println("Solution: " + solution);
        
    }
}