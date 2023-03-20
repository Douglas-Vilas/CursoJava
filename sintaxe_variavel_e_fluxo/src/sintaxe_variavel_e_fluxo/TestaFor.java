package sintaxe_variavel_e_fluxo;

public class TestaFor {
    public static void main(String[] args) {

        int number = 0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(counter);
            number = counter;
        }
        System.out.println(number);
    }
}
