import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Aspirante{
	private int folio=0;
	private String nombre;
	private byte edad;
	private String []redesSociales;
	public Aspirante(String nombre, byte edad, String[] redesSociales) {
		this.nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
		this.folio++;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public String[] getRedesSociales() {
		return redesSociales;
	}
	public void setRedesSociales(String[] redesSociales) {
		this.redesSociales = redesSociales;
	}
	public int getfolio() {
		return this.folio;
	}
	
	@Override
	public String toString() {
		return "Aspirante [nombre=" + nombre + ", edad=" + edad + ", redesSociales=" + Arrays.toString(redesSociales)
				+ "folio= "+folio+"]";
	}
}


class RegistroAspirantes{
	ArrayList<Aspirante> listaApirantes;
	
	public RegistroAspirantes() {
		listaApirantes = new ArrayList();
	}
	public boolean agregarAspirantes(Aspirante a) {
		listaApirantes.add(a);
		for (Aspirante aspirante : listaApirantes) {
			System.out.println(aspirante);
		}
		return true;
	}
	public Object eliminarAspirante(int folio) {
		//Elimincion ultimo aspirante
		for (Aspirante aspirante : listaApirantes) {
			
		}
		
		return listaApirantes.remove(listaApirantes.size()-1);
	}
	public void mostrarAspirantes() {
		//Recorrido de un array list
		
		System.out.println("Forma 1 Con un objeto Iterrator...");
		Iterator i=listaApirantes.iterator();
		while(i.hasNext()) {
			Aspirante a=(Aspirante) i.next();	//Retorna a lo que esta apuntando	
			System.out.println(a);
		}
		System.out.println("Forma 2 Con un ciclo");
		for (int j = 0; j < listaApirantes.size(); j++) {
			System.out.println((Aspirante)listaApirantes.get(j));
			
		}
		System.out.println("Forma 3 con un ciclo forMejorado (FOREACH)");
		for (Object x: listaApirantes) {
			System.out.println(x);
		}
	}
	public void buscarAspirant() {
		
	}
	
	
	
}

public class pruebaMemoriaDinamica {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String op="";
		RegistroAspirantes ra= new RegistroAspirantes();
		String redes[]= {"Facebook","twiter","Instagram"};
		System.out.println("Elige la opcion que desees:");
		System.out.println("A) Agregar aspirante");
		System.out.println("B) Eliminar aspirante");
		System.out.println("C) Buscar aspirante");
		op=entrada.nextLine().toUpperCase().replace(" ","");
		switch (op) {
		case "A":
			System.out.println("Registro aspirantes:");
			System.out.println("¿Cúal es el nimbre del espirante?");
			String nombre=entrada.nextLine();
			System.out.println("Cual es la edad del aspirante?");
			byte edad=entrada.nextByte();
			Aspirante a1=new Aspirante(nombre, edad, redes);
			ra.agregarAspirantes(a1);
			break;
		case "B":
			if(ra.listaApirantes.isEmpty()==false) {
				System.out.println("¿Cual es le folio del aspirante que vas a aliminar?");
				int folio=entrada.nextInt();
				ra.eliminarAspirante(folio);
				}else {
					System.out.println("No se an ingresado ningun aspirante por el momento");
				}
			break;
		default:
			break;
		}
		
		
		
		ra.agregarAspirantes(new Aspirante("dos",(byte) 18,redes));
		
		System.out.println("Tamaño arraylist: "+ra.listaApirantes.size());

	}

}





