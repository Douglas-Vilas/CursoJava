package sintaxe_variavel_e_fluxo;

public class TestaLacos2 {
    public static void main(String[] args) {

        for (int line = 0; line < 10; line++) {
            for (int column = 0; column < 10; column++) { // Or we can also use it this way: for(int column = 0; column
                                                          // <= line; column ++)"
                if (column > line) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
