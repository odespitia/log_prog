package logica;
import java.util.*;
import java.util.Scanner;

/*
 * short - numeros cortos
 * int - numeros enteros
 * long - numeros enteros largos
 * float - numeros flotantes
 * double - numeros dobles
 * byte - se maneja en bytes
 * char - caracteres
 * boolean - boleanos, verdaderos o falsos
 * string - cadenas de texto
 * (+   -   *   /   %)
*/

public class Logica {
	public static void main(String[] args) {
		 /*Primer Ejercicio
		  Scanner entrada = new Scanner (System.in);		   
		  int horas;
		  int sueldo;
		  int valor;
		  System.out.println("Cuantos horas has trabajado este mes? ");
		  horas= entrada.nextInt();
		  System.out.println("Cuanto es el valor de la hora? "); 
		  valor= entrada.nextInt();		  
		  sueldo = horas*valor;		  
		  System.out.println("Tu sueldo de este mes es de: " + sueldo + "€");
		  */
		
		  /*Segundo Ejercicio
		  Scanner sc = new Scanner(System.in);
	      double gradosC, gradosF;
	      System.out.println("Introduce grados Centígrados:");
	      gradosC = sc.nextDouble();
	      gradosF = 32 + (9 * gradosC / 5);
	      System.out.println(gradosC +" ºC = " + gradosF + " ºF");
	      */
		  
	      /*Tercer Ejercicio
	      Scanner sc = new Scanner(System.in);
	      double radio, longitud, area;
	      System.out.println("Introduce radio de la circunferencia:");
	      radio = sc.nextDouble();
	      longitud = 2 * Math.PI * radio; 
	      area = Math.PI * Math.pow(radio, 2);
	      System.out.println("Longitud de la circunferencia -> " + longitud);
	      System.out.println("Area de la circunferencia -> " + area);
	      */
		/*
		Scanner sc = new Scanner(System.in);
        //creamos los arrays
       String[] empleados = new String[20];
       double[] sueldos = new double[20];

       //variables donde guardar el nombre y sueldo del empleado que más gana
       String nombreMayor;
       double mayorSueldo;

       int i = 0;

       //se lee el primer empleado
       System.out.println("Lectura de nombres y sueldos de empleados: ");
       System.out.print("Empleado " + (i + 1) + ": ");
       empleados[i] = sc.nextLine();
       System.out.print("Sueldo: ");
       sueldos[i] = sc.nextDouble();

       //se toma el primero como mayor
       mayorSueldo = sueldos[i];
       nombreMayor = empleados[i];

       //se leen el resto de empleados
       for (i = 1; i < empleados.length; i++) {
           sc.nextLine(); //limpiar el buffer
           System.out.print("Empleado " + (i + 1) + ": ");
           empleados[i] = sc.nextLine();
           System.out.print("Sueldo: ");
           sueldos[i] = sc.nextDouble();
           //se compara el sueldo leído con el mayor
           if (sueldos[i] > mayorSueldo) {
               mayorSueldo = sueldos[i];
               nombreMayor = empleados[i];
           }
       }

       //mostrar resultados
       System.out.println("Empleado con mayor sueldo: " + nombreMayor );
       System.out.println("Sueldo: " + mayorSueldo);
       */
		
		/*Video 2
		 * short suma;
		 *suma=3+10;
		 *int resta=8-17;
		 *long residuo=9/2;
		 *float multiplo=2*(15*(-2));
		 *double division= 5 / 2;
		 *System.out.println("My Suma:" + suma);
		 *System.out.println("My Resta:" + resta);
		 *System.out.println("My Residuo:" + residuo);
		 *System.out.println("My Multip:" + multiplo);
		 *System.out.println("My Division:" + division);
		 *Ejercicio Propio
		 * double var1 = 10;
		 * var1 = var1 / 3;
		 * System.out.println("My Operacion:" + var1);
		*/
		/*Video 3 if
		 *String v1="hola";
		 *boolean v2;
		 *if(v1!="hola") {
		 *	v2=true;
		 *}else {
		 * 	v2=false;
		 *}
		 *System.out.println("My Resultado: " + v1 + " ==>"+ v2);
		*/
		
		/*Video 4 for
		 *for(int i = 0; i <= 10; i++) {
		 *	System.out.println("Mi For: "+ i);
		 *}
		 *for(int i = 10; i >= 0; i--) {
		 *	System.out.println("Mi For: "+ i);
		 *} 
		*/
		
		/*Video 5 while
		 *boolean var1=true;
		 *int i=0;
		 *while(i<=20) {
		 *while(var1==true) {
		 *	System.out.println("Mi While: "+ i);
		 *  i+=3;
		 *  if(i>16)
		 *		var1=false;			
		 *} 
		*/
		
		/* Video 6
			 for(int i = 0;i <= 15; i++) {
				//System.out.println("My for y Break: " + i);
				if(i==10) {
					//break; //Nos saca totalmente del ciclo
					continue; //Nos envia de nuevo a la cabecera del ciclo 
				}
				System.out.println("My for y Break: " + i);
			}
		*/
		/* Video 7
		 	for(int i = 0;i <= 100; i++) {
				if((i%2)!=0)
					System.out.println("Mis Numeros Impares: " + i);
			}
			//Fibonachi
			int a=1;
			int b=0;
			int c=0; //temporal
			while(true) {			
				System.out.println("Mi Serie Fibonachi: " + a);
				c=a;
				a+=b;
				b=c;
				if(a>35)
					break;
			}
		 */
		
		/*Video 8
			int i=2;
			switch(i) {
				case 0:
					System.out.println("My Swicth Case: "+ i); break;
				case 1:
					System.out.println("My Swicth Case: "+ i); break;
				default:
					System.out.println("My Swicth Default: "+ i); break;
			}
		*/
			
		/*Video 9 y Video 10
			String a[];
			a = new String[3];
			a[0]="0 - cero";
			a[1]="1 - uno";
			a[2]="2 - dos";
			//a[3]="3dos";
			String i[] = {"A","B","C"};
			//int fc[] = {1,2,3};
			for(int b = 0; b < a.length; b++) {
				//System.out.println(a[b]+" => "+ i[b]);
			}
			 //int[][]  matriz = new int[3][2];
			 int[][]  matriz;
			 matriz = new int[3][2];
			 matriz[0][0] = 1; matriz[0][1] = 2; 
			 matriz[1][0] = 3; matriz[1][1] = 4; 
			 matriz[2][0] = 5; matriz[2][1] = 6;
			 for(int x=0;x<matriz.length;x++) {
				 for(int n = 0;n < matriz[x].length; n++) {
					 System.out.println("["+ x +"]" + "[" + n +"] => "+ matriz[x][n]);
				 }
			 }
		*/
			
		
		Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
	}
	
}
