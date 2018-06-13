package Main;

public class Avion {

	float peso;
	double alto;
	float ancho;
	float largo;
	int numpuertas;
	String marca;
	boolean estado;
	
	public Avion() {
		this.peso=10000;
		this.alto=10.89;
		this.ancho=800;
		this.largo=1200;
		this.numpuertas=22;
		this.marca="Oespitia";
	}
	
	public String marca() {
		return this.marca;
	}
	
	public Avion(float peso, double alto, float ancho, float largo, int numpuertas, String marca) {
		this.peso = peso;
		this.alto = alto;
	}
	
	public void prender() {
		this.estado=true;
		System.out.println("Has Prendido el Avion");
	}
	
	public void apagar() {
		this.estado=false;
		System.out.println("Has apagado el Avion");
	}

	public void info() {
		System.out.println("Modelo del Carro Prueba Default");
	}
		
	
}

class AvionBMW extends Avion {
	
	public AvionBMW() {
		this.marca="BMW";
	}
	
	public void turbo() {
		System.out.println("Acabas de Volar a 100 km por hora; ["+ this.estado  +"] Avion de Marca: " + this.marca);
	}
	
	public void info() {
		System.out.println("Modelo del Carro Prueba Polimorfismo");
	}
	
}
