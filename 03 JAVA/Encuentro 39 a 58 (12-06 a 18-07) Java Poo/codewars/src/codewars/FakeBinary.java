package codewars;

/*Given a string of digits, you should replace any digit below 5 with '0' and
any digit 5 and above with '1'. Return the resulting string.
Note: input will never be an empty string*/
public class FakeBinary {

    public static void main(String[] args) {

        String numberString = "366058562030849490134388085";

        char letra;
        int numAux;
        int[] numAuxiliar = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            letra = numberString.charAt(i);
            numAux = Character.getNumericValue(letra);

            if (numAux < 5) {
                numAuxiliar[i] = 0;
            } else {
                numAuxiliar[i] = 1;
            }
        }
        System.out.println("numAuxiliar:");
        for (int i = 0; i < numAuxiliar.length; i++) {
            System.out.print(numAuxiliar[i]);
        }
        System.out.println("");

        String stringAux = "";

        for (int i = 0; i < numberString.length(); i++) {
            String c = String.valueOf(numAuxiliar[i]);
            stringAux += c;
        }
        numberString = stringAux;
        System.out.println("string___Aux: " + stringAux);

        System.out.println("numberString: " + numberString);

    }
}
