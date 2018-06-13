package Main;
//import Main.Pelota;
import Main.Avion;


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

class Main {

	public static void main(String[] args) {
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
			
		/*Video 11
			Pelota p,p1;
			p = new Pelota();
			float peso = p.obtienepeso();
			float radio = p.obtieneradio();
			System.out.println("Peso: " + peso + " Radio: "+ radio);
			p.pateapelota();		
			p1 = new Pelota(500,600);
			float peso1 = p1.obtienepeso();
			float radio1 = p1.obtieneradio();
			System.out.println("Peso: " + peso1 + " Radio: " + radio1);
			String pe = p.pateapelota1("Oscar Espitia : ");
			System.out.println(pe); 
		*/
		
		/*Video 12
			Avion a;
			a = new Avion();
			System.out.println(a.estado);
			a.prender();
			System.out.println(a.estado);
			a.apagar();
			System.out.println(a.estado);
		*/
		
		/*Video 13 
			AvionBMW av;
			av = new AvionBMW();
			av.prender();
			av.turbo();
			av.apagar();
			System.out.println(av.marca());
		*/
		
		/*Video 14 Polimorfismo
			Avion a,b;
			a = new Avion();
			a.info();
			b = new AvionBMW();
			b.info();		 
		*/
		
			
		
			
			
		
	}

}
