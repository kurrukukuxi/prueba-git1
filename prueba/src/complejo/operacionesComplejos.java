/*
 * Análisis:
 * Se presenta un menú con 3 opciones con operaciones con números complejos
 * (multiplicar, dividir, potencia) además de otra opción para salir, tras el
 * que el usuario tendrá que elegir una de las opciones.
 * Cada opción del menú tendrá un subprograma que haga el cálculo correspondiente.
 * Al terminar cada operación se preguntará si se quiere volver al inicio del programa.
 * 
 * Entradas: opcion, complejo1, complejo2, exponente, respuesta
 * Salidas: no tiene
 * 
 * Pseudocódigo generalizado
 * INICIO
 * 		repetir
 * 			repetir
 * 				mostrarMenu //es un subprograma y se detallará su interfaz más adelante
 * 				leerOpcion
 * 			mientras (opcion mayor que 4 o menor que 1)
 * 			Si (opcion no es 4)
 * 				pedirLeerComplejo1
 * 				Si (opcion es 1 o 2)
 * 					pedirLeerComplejo2
 * 				Si no
 * 					pedirLeerExponente
 * 				Fin Si
 * 				según (opcion)
 * 					para 1:
 * 						calcularMostrarMultiplicacion
 * 					para 2:
 * 						calcularMostrarDivision
 * 					para 3:
 * 						calcularMostrarPotencia
 * 				Fin según
 * 				preguntarVolverAlInicioLeerRespuesta
 * 			Fin Si
 * 		mientras (respuesta sea 's')
 * FIN
 */

// he usado un package y quiero comprobar si se actualiza el archivo
package complejo;

import java.util.Scanner;

public class operacionesComplejos
{
	/* Interfaz del programa mostrarMenu
	 * 
	 * Comentario: muestra un menú en pantalla con 4 opciones
	 * Signatura: void mostrarMenu()
	 * Precondiciones: no tiene
	 * Entradas: no tiene
	 * Salidas: no tiene
	 * Postcondiciones: no tiene
	 */
	 
	public static void mostrarMenu()
	{
		System.out.print("1. Multiplicar numeros complejos\n");
		System.out.print("2. Dividir numeros complejos\n");
		System.out.print("3. Elevar un numero complejo a un numero real\n");
		System.out.print("4. Salir\n");
		System.out.print("Elige una de las opciones: ");
	}
	
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		Complejo complejo1 = new Complejo(0,1);
		Complejo complejo2 = new Complejo(0,1);
		
		char respuesta=' ';
		int opcion=4;
		double exponente=1;
		
		do
		{
			do
			{
				//mostrarMenu
				mostrarMenu();
				//leerOpcion
				opcion=teclado.nextInt();
			} while (opcion<1 || opcion>4);
			
			if (opcion!=4)
			{
				//pedirLeerComplejo1
				System.out.print("Introduzca el modulo y el argumento de un numero complejo.\n");
				do
				{
					System.out.print("Modulo: ");
					complejo1.setMod(teclado.nextDouble());
				} while (complejo1.getMod()<=0);
				System.out.print("Argumento: ");
				complejo1.setArg(teclado.nextDouble());
				
				if (opcion==1 || opcion==2)
				{
					//pedirLeerComplejo2
					System.out.print("Introduzca el modulo y el argumento del segundo numero complejo.\n");
					do
					{
						System.out.print("Modulo: ");
						complejo2.setMod(teclado.nextDouble());
					} while (complejo2.getMod()<=0);
					System.out.print("Argumento: ");
					complejo2.setArg(teclado.nextDouble());
				}
				else //opcion = 3
				{
					System.out.print("Introduzca el exponente al que quiere elevar el numero complejo.\n");
					System.out.print("Exponente: ");
					exponente=teclado.nextDouble();
				}
				
				switch (opcion)
				{
					case 1:
						//calcularMostrarMultiplicacion
						System.out.print("El resultado de multiplicar "+complejo1.toString()+" por "+complejo2.toString());
						System.out.println(" es "+complejo1.calculaProducto(complejo2));
					break;
					
					case 2:
						//calcularMostrarDivision
						System.out.print("El resultado de dividir "+complejo1.toString()+" entre "+complejo2.toString());
						System.out.println(" es "+complejo1.calculaDivision(complejo2));
					break;
					
					case 3:
						//calcularMostrarPotencia
						System.out.print("El resultado de elevar "+complejo1.toString()+" a "+exponente);
						System.out.println(" es "+complejo1.calculaPotencia(exponente));
					break;
				}
				
				//preguntarVolverAlInicioLeerRespuesta
				do
				{
					System.out.print("Quiere volver a iniciar el programa? (s/n) ");
					respuesta=Character.toLowerCase(teclado.next().charAt(0));
				} while (respuesta!='s' && respuesta!='n');
			}
		} while (respuesta=='s');
	}
}
