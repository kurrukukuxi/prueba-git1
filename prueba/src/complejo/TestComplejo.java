package complejo;

// Esto es un test para la clase Complejo.
public class TestComplejo
{
	public static void main(String[] args)
	{
		Complejo com1 = new Complejo();
		Complejo com2 = new Complejo(1.4,2);
		
		System.out.println("Otra forma de escribirlo es "+com1.toString());
		com1.setMod(5.4);
		com1.setArg(-3);
		System.out.println("Tengo un numero complejo de modulo "+com1.getMod()+" y argumento "+com1.getArg());
		System.out.println("Otra forma de escribirlo es "+com1.toString());
		
		System.out.print("Tengo otro numero complejo "+com2.toString());
		System.out.print(" y al multiplicarlo por el primero tenemos otro complejo, que es ");
		System.out.println(com1.calculaProducto(com2));
		System.out.print("Si dividimos el primero entre el segundo, el resultado es ");
		System.out.println(com1.calculaDivision(com2));
		System.out.print("Si elevamos "+com1.toString()+" a 3, el resultado es ");
		System.out.println(com1.calculaPotencia(3));
	}
}
