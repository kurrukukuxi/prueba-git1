/** Implemente la clase Complejo para manejar objetos en forma mÛdulo-argumental, y diseÒe
un programa para el c·lculo de operaciones sobre complejos: producto, divisiÛn y potencia
presentando un men˙ de opciones.

Tipo Complejo

Propiedades:
	MÛdulo: Tipo real, consultable, modificable. Requisito: es positivo
	Argumento: Tipo real, consultable, modificable

Funcionalidades:
	toString: Devuelve un String con el mÛdulo y el argumento del n˙mero complejo. 
	Producto: Devuelve un Complejo con el resultado de mulitplicar por un n˙mero complejo. 
	DivisiÛn: Devuelve un Complejo con el resultado de dividir por un n˙mero complejo. 
	Potencia: Devuelve un Complejo con el resultado de elevar a un n˙mero real. 
	* //aÒadir clone, equals, etc

Interfaz:
	//consultores
	double getMod();
	double getArg();

	//modificadores
	void setMod(double modulo); // modulo > 0
	void setArg(double argumento);

	//funcionalidades
	String toString();
	Complejo calcularProducto(Complejo numero);
	Complejo calcularDivision(Complejo numero);
	Complejo calcularPotencia(double numero);
 */
//Especificar unidad del argumento
package complejo;

import java.lang.Math;

public class Complejo
{
	//Atributos
	private double mod;
	private double arg;
	
	//Constructor
	public Complejo(double m1, double a1)
	{
		mod=m1;
		arg=a1;
	}
	
	//Constructor por defecto
	public Complejo()
	{
		mod=1;
		arg=0;
	}
	
	//Consultores
	public double getMod()
	{
		return mod;
	}
	
	public double getArg()
	{
		return arg;
	}
	
	//Modificadores
	public void setMod(double m1)
	{
		if (m1>0)
		{
			mod=m1;
		}
		else
		{
			mod=0;
			System.out.println("El modulo tiene que ser mayor que 0");
		}
	}
	
	public void setArg(double a1)
	{
		arg=a1;
	}
	
	//Funcionalidades
	/* Comentario: pasar a cadena
	 * Signatura: String toString()
	 * Precond.: no tiene
	 * Entradas: no tiene
	 * Salidas: una cadena
	 * Postcond.: asociado al nombre de la funci√≥n se devuelve una cadena
	 */
	public String toString()
	{
		String cadena = new String();
		
		cadena=mod+"*exp("+arg+"*i)";
		
		return cadena;
	}
	
	/* Comentario: calcula el producto de dos n√∫meros complejos
	 * Signatura: Complejo calculaProducto(Complejo z)
	 * Precond.: el Complejo tiene argumento mayor que 0
	 * Entradas: un Complejo
	 * Salidas: un Complejo
	 * Postcond.: asociado al nombre de la funci√≥n se devuelve el restulado obtenido
	 */
	public Complejo calculaProducto(Complejo z)
	{
		Complejo res = new Complejo(1,1);
		double resmod, resarg;
		
		resmod=z.getMod()*mod;
		resarg=z.getArg()+arg;
		
		res.setMod(resmod);
		res.setArg(resarg);
		
		return res;
	}
	
	/* Comentario: calcula la divisi√≥n de un Complejo entre otro
	 * Signatura: Complejo calculaDivision(Complejo z)
	 * Precond.: el Complejo tiene argumento mayor que 0
	 * Entradas: un Complejo
	 * Salidas: un Complejo
	 * Postcond.: asociado al nombre de la funci√≥n se devuelve el restulado obtenido
	 */
	public Complejo calculaDivision(Complejo z)
	{
		Complejo res = new Complejo(1,1);
		double resmod, resarg;
		
		resmod=z.getMod()/mod;
		resarg=z.getArg()-arg;
		
		res.setMod(resmod);
		res.setArg(resarg);
		
		return res;
	}
	
	/* Comentario: eleva un Complejo a un n√∫mero real
	 * Signatura: Complejo calculaPotencia(double pot)
	 * Precond.: el Complejo tiene argumento mayor que 0
	 * Entradas: un real
	 * Salidas: un Complejo
	 * Postcond.: asociado al nombre de la funci√≥n se devuelve el restulado obtenido
	 */
	public Complejo calculaPotencia(double pot)
	{
		Complejo res = new Complejo(1,1);
		double resmod, resarg;
		
		resmod=Math.pow(mod,pot);
		resarg=arg*pot;
		
		res.setMod(resmod);
		res.setArg(resarg);
		
		return res;
	}
}
