import java.util.Scanner;
public class pagobuses {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        double PA, TOT;
        int NA;

        System.out.println("Introduce número de alumnos:");
        NA = sc.nextInt();

        if (NA >=100)
        System.out.println( "El coste de cada alumno es de 65 euros " + "y el coste total del viaje es de " + NA * 65 + " euros");
        else if ( NA >=50 && NA < 100)
            System.out.println("Coste de cada alumno 70,50 euros" + " y el coste total del viaje es de " + NA * 70.50 + " euros");

        else if (NA >=30 && NA < 50)
        System.out.println("Coste de cada alumno 95 euros" + " y el coste total del viaje es de " + NA * 95 + " euros");
        else if (NA < 30)
            System.out.println("El coste total del viaje es de 4000 euros y cada alumno "
                    + "debe pagar " + (4000/NA) + " euros.");


    }
}