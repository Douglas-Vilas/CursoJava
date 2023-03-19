package sintaxe_variavel_e_fluxo;

public class TestaWhile {
    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 10) {
            System.out.println("Printing numbers " + counter);
            counter++;
        }

        System.out.println("Number is " + counter);
    }

}
