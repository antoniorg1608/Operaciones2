package es.studium.Operacion2;

import java.util.Scanner;

public class Operacion2
{

	public static void main(String[] args)
	{
		int num1, num2;
		float cociente;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero:");
		num2 = teclado.nextInt();
		System.out.println("La suma de los numeros es: " + suma(num1, num2));
		System.out.println("El numero1 menos el numero2 es: " + resta(num1, num2));
		System.out.println("La multiplicacion de los numeros es: " + producto(num1, num2));
		if (num2 != 0)
		{
			System.out.println("El cociente de division del numero1 entre el numero2 es: " + cociente(num1, num2));

		} else
		{
			System.out.println("La division por 0 no es posible");
		}
		teclado.close();
	}

	public static int suma(int a, int b)
	{
		return (a + b);
	}

	public static int resta(int a, int b)
	{
		return (a - b);
	}

	public static int producto(int a, int b)
	{
		return (a * b);
	}

	public static float cociente(int a, int b)
	{
		return ((float) a / (float) b);
	}

}
