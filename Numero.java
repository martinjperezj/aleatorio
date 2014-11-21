import java.util.Random;//biblioteca
public class Numero {
	//atributo
	private int numero;
	//constructor
	public Numero(int n){
		this.numero=n;
		}
	//metodo que averigua el valor dedicho numero
	public int averiguaorrrr(){
		int numeroDescubrir=0;
		for (int i=0; i<10000; i++){
			System.out.println("Dentro del bucle "+i);//para ver donde para
			if(this.numero==i){
				numeroDescubrir=i;
				break;
				//evaluar dos sentencias debemos usar{}
				}
			}
			return numeroDescubrir;
		}
}
class TestNumeroAleatorio{
public static void main (String args[]) {
		//genero el numero de forma aleatoria
		Random r=new Random();
		int numero=r.nextInt(10000);
		System.out.println("Numero aleatorio "+numero);//comprobar funcionamiento
		//creamos el numero
		Numero n=new Numero(numero);
		System.out.println("Numero a descubrir "+n.averiguaorrrr());
	}
}

