import java.util.Scanner;

public class RFC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el nombre completo");
        String nombreCompleto = entrada.nextLine();
        String nombreUtil = nombreCompleto;
        /*
        @ IMPLEMENTAR LOGICA PARA PARTIR EL NOMBRE EN NOMBRE Y APELLIDOS
        En cada "ciclo" que no es ciclo pero casi por que se repite lo mismo jaja
        lo que hacemos es cortar el nombre completo hasta el primer espacio que encuentre
        luego esa variable que estaba guardando el nombre completo la cortamos
        desde ese espacio que encontramos hasta el final, asi despues ya namas quedan los apellidos
        y luego solo el apellido materno
         */
        String nombre = nombreUtil.substring(0, nombreUtil.indexOf(" "));
        nombreUtil = nombreUtil.substring(nombreUtil.indexOf(" ") + 1);
        String apellidoPaterno = nombreUtil.substring(0, nombreUtil.indexOf(" "));
        nombreUtil = nombreUtil.substring(nombreUtil.indexOf(" ") + 1);
        String apellidoMaterno = nombreUtil;
        System.out.println("Ingresa la fecha de nacimiento en formato dd/mm/aa");
        /*
        IMPLEMENTAMOS LA LOGICA PARA PARTIR LA FECHA DE NACIMIENTO EN DIA, MES Y AÑO
        AQUI ES MAS FACIL POR QUE YA SABEMOS EN QUE POSICION ESTA CADA PARTE DE LA FECHA
         */
        String fechaNacimiento = entrada.nextLine();
        String dia = fechaNacimiento.substring(0, 2);
        String mes = fechaNacimiento.substring(3, 5);
        String year = fechaNacimiento.substring(6, 10);

        /*
        IMPLEMENTAMOS LA LOGICA PARA GENERAR EL RFC
        SIMPLEMENTTE CORTAMOS LAS LETRAS QUE NOS INTERESA DE LAS VARIABLES QUE YA TENEMOS Y LAS CONCATENAMOS
         */
        String RFC = apellidoPaterno.substring(0, 2) + apellidoMaterno.charAt(0) + nombre.charAt(0) + year.substring(2, 4) + mes + dia;
        System.out.println("El RFC de " + nombreCompleto + " es: " + RFC);



    }
}
