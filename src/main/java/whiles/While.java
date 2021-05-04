package whiles;

public class While {
    public static void main(String[] args) {

        var x = 0;

        //Testa a condicao antes
        while (x < 1) {
            System.out.println("Dentro do while...");
            x++;
        }

        var y = 0;

        //Testa a condicao depois, ele roda o codigo ao menos 1 vez antes de testar a condicao
        do{
            System.out.println("Dentro do  do/while...");
        } while (y++ < 1);
    }
}
