import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Aspirante{
	private int folio;
	private String nombre;
	private byte edad;
	private String []redesSociales;
	public Aspirante(String nombre, byte edad, String[] redesSociales,int folio) {
		this.nombre = nombre;
		this.edad = edad;
		this.redesSociales = redesSociales;
		this.folio=folio;
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
		return true;
	}
	public Aspirante eliminarAspirante(int folio) {
		//Elimincion aspirante
		Aspirante aElimiado = null;
		String redes[]= {""};
		for (Aspirante aspirante : listaApirantes) {
			if(aspirante.getfolio()==folio) {
				aElimiado=listaApirantes.remove(folio-1);
				//listaApirantes.add(folio,new Aspirante("N/A",(byte) 0,redes, folio));
				return aElimiado;
			}
		}
		if(aElimiado==null) {
			System.out.println("Aspirante no encontrado");
		}
		return aElimiado;
	}
	public void mostrarAspirantes() {
		/*
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
		*/
		System.out.println("Forma 3 con un ciclo forMejorado (FOREACH)");
		for (Aspirante aspirante : listaApirantes) {
			System.out.println(aspirante);
		}
	}
	public void buscarAspirante(int referencia) {
		for (Aspirante poci : listaApirantes) {
			if(poci.getfolio()==referencia) {
				System.out.println("Nombre: "+poci.getNombre());
				System.out.println("Edad: "+poci.getEdad());
			}
		}
	}
	
	
	
}

public class pruebaMemoriaDinamica {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String op="";
		int numFolio=1;
		RegistroAspirantes ra= new RegistroAspirantes();
		do {
			entrada.nextLine();
			op="";
			String redes[]= {"Facebook","twiter","Instagram"};
			System.out.println("Elige la opcion que desees:");
			System.out.println("A) Agregar aspirante");
			System.out.println("B) Eliminar aspirante");
			System.out.println("C) Buscar aspirante");
			System.out.println("D) Mostrar aspirantes");
			System.out.println("E) Salir");
			op=entrada.nextLine().toUpperCase().replace(" ","");
			switch (op) {
			case "A":
				System.out.println("Registro aspirantes:");
				System.out.println("¿Cúal es el nimbre del espirante?");
				String nombre=entrada.nextLine();
				System.out.println("Cual es la edad del aspirante?");
				byte edad=entrada.nextByte();
				Aspirante a1=new Aspirante(nombre, edad, redes,numFolio);
				numFolio++;
				ra.agregarAspirantes(a1);
				break;
			case "B":
				if(ra.listaApirantes.isEmpty()==false) {
					System.out.println("Hay: "+ra.listaApirantes.size()+" aspirantes");
					System.out.println("¿Cual es le folio del aspirante que vas a aliminar?");
					int folio=entrada.nextInt();
					System.out.println("El aspirante eliminado fue: "+ra.eliminarAspirante(folio));
					}else {
						System.out.println("No se an ingresado ningun aspirante por el momento");
					}
				break;
			case "C":
				int referencia;
				System.out.print("Ingresa el solio del aspirante: ");
				referencia=entrada.nextInt();
				System.out.println();
				ra.buscarAspirante(referencia);
				break;
			case "D":
				ra.mostrarAspirantes();
				break;
			case "E":
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Elige una opcion disponible");
				break;
			}
			System.out.println(op);
		}while(!op.equalsIgnoreCase("E"));
	

	}

}





