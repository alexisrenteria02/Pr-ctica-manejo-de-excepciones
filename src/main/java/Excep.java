import java.util.Scanner;

public class Excep {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.print("Cadena: ");
            String lect_teclado = teclado.nextLine();


            System.out.print("Numero: ");
            int numero = teclado.nextInt();
            teclado.close();

            if (numero>=0){
                double resultado = Math.sqrt(numero);
                System.out.println("La raiz cuadrada de "+numero+ " es: "+resultado);
            }
            else{
                new NumeroNegativoExcepcion();
            }

            try {
                System.out.println("\nCarácter encontrado: " + caracterEn(lect_teclado, 7));
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }

        public static char caracterEn(String cadena, int pos) throws Exception {

            if (pos < 0 || pos >= cadena.length())
                throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
            else
                return cadena.charAt(pos);
        }


    }

