package sintaxe_variavel_e_fluxo;

public class TestaLacos {

    public static void main(String[] args) {

        System.out.println("---- Multiplication Table ----");
        // Count for 0 to 10.
        for (int counter = 1; counter <= 10; counter++) {
            // Creating a Table.
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.print(multiplier * counter);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

}
