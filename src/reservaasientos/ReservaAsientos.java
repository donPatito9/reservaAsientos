package reservaasientos;

import java.util.Scanner;

/**
 *
 * @author RobinsonConcha
 */
public class ReservaAsientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char asientos [][] = new char[10][10];
        boolean bandera = false;
        Scanner entrada = new Scanner(System.in);
        int fila=0, asiento=0;
        String respuesta;
        String mostrarAsientos;
        
        for (int f=0;f<10;f++){
            for (int c=0;c<10;c++){
            asientos[f][c] ='L';
            }
        }
    
    System.out.println("********Welcome to Reservation System*********");
    
    while(bandera !=true){ 
    System.out.println("\nDesea ver los asientos disponibles? S:si. N:no.");
    mostrarAsientos = entrada.next();
    
    //Call method salaMaps
    if (mostrarAsientos.equalsIgnoreCase("S")){
    mostrarMapa(asientos);
    }
    
    boolean Ok = false;
    while(Ok!=true){
    System.out.println("\nIngrese Fila y asiento a reservar");
    
    System.out.print("Fila(entre 0 y 9): ");
    fila = entrada.nextInt();
    
    System.out.print("Asiento(entre 0 y 9): ");
    asiento = entrada.nextInt();
    
    if (fila<=9 && fila>=0){
        
        if (asiento<=9 && asiento >=0 ){
            Ok = true;
        }
        else {
            System.out.println("\nEl numero de asiento no es valido");
        }
    }
    else {
        System.out.println("\nEl numero de fila no es valido");
    }
    }
    
    if(asientos[fila][asiento]=='L'){
        asientos[fila][asiento] = 'X';
        System.out.println("\nEl asiento fue reservado correctamente");
    }
    else{
        System.out.println("\nEl asiento esta ocupado por favor seleccione otro");
    }
    System.out.println("\nDesea Finalizar reservas? S:si. N:no");
    respuesta = entrada.next();
    
    if (respuesta.equalsIgnoreCase("S")){
        bandera = true;
    }

    }
}
 static void mostrarMapa(char asientos[][]){
     
     for (int f=0;f<10;f++){
         System.out.print(f +  "");
         
            for (int c=0;c<10;c++){
                //System.out.print(c + "");
                
                System.out.print(" [" +asientos[f][c]+ "]");
            }
            
            System.out.println("");
        }
    }  
}