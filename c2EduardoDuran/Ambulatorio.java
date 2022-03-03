class Ambulatorio extends Paciente {
	private String especialidad;
	private int precio;
	private String nivel;
	
    public Ambulatorio() {
    }
    public Ambulatorio(String nom, String rut, byte edad, String sexo, String salud, String especialidad, int precio, String nivel){
    	super (nom, rut, edad, sexo, salud);
    	this.especialidad=especialidad;
    	this.precio=precio;
    	this.nivel=nivel;
    }
    
    public String getEspecialidad(){
    	return especialidad;
    }
    public int getPrecio(){
    	return precio;
    }
    public String getNivel(){
    	return nivel;
    }
    public void setEspecialidad(String especialidad){
    	this.especialidad=especialidad;
    }
    public void setPrecio(int precio){
    	this.precio=precio;
    }
    public void setNivel(String nivel){
    	this.nivel=nivel;
    }
    public String datosPacientes(){
    	return "Nom: " + getNom() + " RUT: " + getRut() + " Edad: " + getEdad() + " Sexo: " + getSexo() + " Salud: " + getSalud() + " Especialidad: " + getEspecialidad() + " Precio: " + getPrecio() + " Nivel: " + getNivel();
    }
    //public int calcularVPagar(){
    //	return=0;
    //}
}