import java.util.*;


public class App {

    public static double[] debitos = new double[15];
    public static double[] creditos = new double[10];
    public static Scanner s = new Scanner(System.in);
    public static int contador = 0;
    public static String respuesta = "";

    public static void ingresoDebitos()
    {
        System.out.println("Ingrese 15 debitos");
        contador = 0;
        do
        {
            System.out.print("Debito numero " + (contador+1) + ": ");
            debitos[contador] = Double.valueOf(s.nextLine());
            contador ++;

        } while(contador < 15);

    }

    public static void ingresoCreditos()
    {
        System.out.println("\nIngrese 10 creditos");
        contador = 0;
        do{
            System.out.print("Debito numero " + (contador+1) + ": ");
            creditos[contador] = Double.valueOf(s.nextLine());
            contador ++;
        } while(contador < 10);
    }

    public static double totalDebitos()
    {
        int tDebitos = 0;
        for(int i=0; i< debitos.length; i++)
        {
            tDebitos += debitos[i];
        }
        return tDebitos;
    }

    public static double totalCreditos()
    {
        int tCreditos = 0;
        for(int i=0; i< creditos.length; i++)
        {
            tCreditos += creditos[i];
        }
        return tCreditos;
    }

    public static double saldo()
    {
        return (totalDebitos() - totalCreditos());
    }

    public static double promedioDebito()
    {
        contador = 0;
        for(int i = 0; i< debitos.length; i++)
        {
            if(debitos[i] != 0)
            {
                contador +=1;
            }
        }
        return (totalDebitos()/contador);
    }

    public static double debitoGrande()
    {
        double debito =0;
        debito = debitos[0];
        for(int i=1; i< debitos.length; i++)
        {
            if(debito< debitos[i])
            {
                debito = debitos[i];
            }
        }
        return debito;
    }

    public static String operacionesTotales()
    {
        int contadorDebitos = 0;
        int contadorCreditos = 0;
        for(int i = 0; i< debitos.length; i++)
        {
            if(debitos[i] != 0)
            {
                contadorDebitos +=1;
            }
        }
        for(int i = 0; i< creditos.length; i++)
        {
            if(creditos[i] != 0)
            {
                contadorCreditos +=1;
            }
        }
        return ("\nSe tienen " +contadorCreditos+ " operaciones de credito, " + contadorDebitos + " operaciones de debitos, en total son " +(contadorCreditos + contadorDebitos) + " operaciones");
    }

    public static void elemntos()
    {
        System.out.print("\nDebitos: ");
        for(int i=0; i< debitos.length; i++)
        {
            if(debitos[i] != 0)
            {
                System.out.print(debitos[i] + ", ");
            }
        }
        System.out.print("\n\nCreditos: ");
        for(int i=0; i< creditos.length; i++)
        {
            if(creditos[i] != 0)
            {
                System.out.print(creditos[i] + ", ");
            }
            
        }
        System.out.println("\n");
    }

    public static void eliminar(int i)
    {
        creditos[i] =0;
        for(int j=0; j< creditos.length - 1; j++)
        {
            if(creditos[j] == 0)
            {
                creditos[j] = creditos[j+1];
                creditos[j+1] = 0;
            }
        }

        System.out.println("\nEl total de debitos es: " + totalDebitos());

        System.out.println("\nEl total de creditos es: " + totalCreditos());
        
        System.out.println("\nEl saldo es: " + saldo());

        System.out.println("\nEl promedio de debitos es: " + promedioDebito());

        System.out.println("\nEl monto de debito mas grande es:" + debitoGrande());

        System.out.println(operacionesTotales());

    }
    
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa que lleva el control de los debitos y de los creditos\n");
        int menu = 0;
        ingresoDebitos();
        ingresoCreditos();

        while(menu != 9)
        {
            System.out.print("\n Que operacion desea realizar?\n\n 1 = Calcular y mostrar el total de debitos \n 2 = Calcular y mostrar el total de creditos \n 3 = Calcular y mostrar el saldo \n 4 = Calcular y mostrar el promedio de debitos \n 5 = Mostrar el monto de debitos mas grande \n 6 = Mostrar cuentas operaciones de creditos y debitos se tienen \n 7 = Imprimir los elementos de los arreglos \n 8 = Eliminar creditos \n 9 = Salir \n\n Ingrese una opcion: ");
            menu = s.nextInt();
    
            if(menu == 1)
            {
                System.out.println("\nEl total de debitos es: " + totalDebitos());
            }
            else if(menu == 2)
            {
                System.out.println("\nEl total de creditos es: " + totalCreditos());
            }
            else if(menu == 3)
            {
                System.out.println("\nEl saldo es: " + saldo());
            }
            else if(menu == 4)
            {
                System.out.println("\nEl promedio de debitos es: " + promedioDebito());
            }
            else if(menu == 5)
            {
                System.out.println("\nEl monto de debito mas grande es:" + debitoGrande());
            }
            else if(menu == 6)
            {
                System.out.println(operacionesTotales());
            }
            else if(menu == 7)
            {
                elemntos();
            }
            else if(menu == 8)
            {
                contador = 0;
                System.out.println("\nCreditos:");
                for(int i=0; i< creditos.length; i++)
                {
                    if(creditos[i] != 0)
                    {
                        System.out.println(i +": "+creditos[i]);
                    }
                }
                System.out.print("Ingrese el numero asociado al credito que quiere eliminar: ");
                contador = s.nextInt();
                eliminar(contador);
            }
            else if(menu == 9)
            {
                menu = 9;
            }
            else
            {
                System.out.print("Error, su respuesta no esta dentro del rango de opciones");
            }
        }
        
    }
}
