import java.util.ArrayList;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try
		{
		return a/b;
		}catch (ArithmeticException e) 
		{
			System.out.println(" El valor A o B no puede ser cero ");
		}
		return 0;
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{ 
		try 
		{
		return arreglo[pos];
		}catch (Exception e) 
		{
			System.out.println("La posicion no debe salirse de los limites ");
		}
		return 0;
		}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try
		{
		return mi_clase.x;
		}catch (Exception e) //Error null
		{
			System.out.println("Error null");
		}
		return 0;
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		int promedio=0;
		int cantidad =0;
		
		
		for(Integer numero: mi_lista)
		{
			cantidad=numero+cantidad;
		}
		promedio=cantidad/mi_lista.size();
		return promedio;
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		int menor= Integer.MAX_VALUE;
		
		for(int i=0;i<mi_lista.size();i++)
		{
			if(menor>mi_lista.get(i))
				menor=mi_lista.get(i);
		}
		return menor;
	}
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
	int cont =0;	
	int l = mi_lista.size();
	
	//
	for(int i = 0; i < l; i++)
	{
	
		if(str==mi_lista.get(i)) 
			cont = cont + 1;
	}
	
	return cont;
}
	
	 }

