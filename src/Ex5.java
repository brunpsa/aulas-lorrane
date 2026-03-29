public class Ex5 {
    public static void main(String[] args) {

        int numero = 3;

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;

            if (resultado % 2 == 0) {
                System.out.println(numero + " x " + i + " = " + resultado + " --> Par");
            } else {
                System.out.println(numero + " x " + i + " = " + resultado + " --> Impar");
            }
        }
    }
}
