package Main;

class Pelota {

	float radio;
    float peso;
    
    public Pelota(){
    	radio = 100;
        peso = 250;
    }
    
    public Pelota(float peso,float radio) {
    	this.peso = peso;
    	this.radio = radio;
    }
    
    public float obtienepeso() {
    	return peso;
    }
    
    public float obtieneradio() {
    	return radio;
    }
    
    public void pateapelota() {
    	System.out.println("Pateo la Pelota");
    }
    
    public String pateapelota1(String quien) {
    	return quien + " Pateo la Pelota";
    }

}
