import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Aspirante{
	private String nombre;
	private byte edad;
	private String []redesSociales;
	public Aspirante(String nombre, byte edad, String[] redesSociales) {
		this.nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
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

	@Override
	public String toString() {
		return "Aspirante [nombre=" + nombre + ", edad=" + edad + ", redesSociales=" + Arrays.toString(redesSociales)
				+ "]";
	}
}


class RegistroAspirantes{
	ArrayList listaApirantes;

	public RegistroAspirantes() {
		listaApirantes = new ArrayList();
	}
	public boolean agregarAspirantes(Aspirante a) {
		listaApirantes.add(a);
		return true;
	}
	public Object eliminarAspirante(int folio) {
		//Elimincion ultimo aspirante
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
	public void buscarAspirantw() {
		
	}
	
	
	
}

public class pruebaMemoriaDinamica {

	public static void main(String[] args) {
		RegistroAspirantes ra= new RegistroAspirantes();
		String redes[]= {"Facebook","twiter","Instagram"};
		ra.agregarAspirantes(new Aspirante("Rafael Eulalio",(byte) 18,redes));
		ra.agregarAspirantes(new Aspirante("2",(byte) 18,redes));
		ra.agregarAspirantes(new Aspirante("3",(byte) 18,redes));
		ra.agregarAspirantes(new Aspirante("4",(byte) 18,redes));
		ra.agregarAspirantes(new Aspirante("5",(byte) 18,redes));
		ra.mostrarAspirantes();
		System.out.println("Tamaño arraylist: "+ra.listaApirantes.size());

	}

}





