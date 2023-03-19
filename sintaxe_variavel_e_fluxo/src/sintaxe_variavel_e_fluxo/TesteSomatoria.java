package sintaxe_variavel_e_fluxo;

public class TesteSomatoria {
    public static void main(String[] args) {

        int counter = 0;
        int total = 0;

        while (counter <= 10) {
            total += counter;
            System.out.println("Contactor " + counter + " Total " + total);
            counter++;
        }

        System.out.println("Counter " + counter);
        System.out.println("Total " + total);

    }

}
