class Hospitalizado extends Paciente{
	private String fono;
	private int valorCama;
	private byte dias;
	
    public Hospitalizado() {
    }
    
    public Hospitalizado(String nom, String rut, byte edad, String sexo, String salud, String fono, int valorCama, byte dias){
    	super (nom, rut, edad, sexo, salud);
    	this.fono=fono;
    	this.valorCama=valorCama;
    	this.dias=dias;
    }
    public String getFono(){
    	return fono;
    }
    public int getValorCama(){
    	return valorCama;
    }
    public byte getDias(){
    	return dias;
    }
    
    public void setFono(String fono){
    	this.fono=fono;
    }
    public void setValorCama(int valorCama){
    	this.valorCama=valorCama;
    }
    public void setDias(byte dias){
    	this.dias=dias;
    }
    public String datosPacientes(){
    	return "Nom: " + getNom() + " RUT: " + getRut() + " Edad: " + getEdad() + " Sexo: " + getSexo() + " Salud: " + getSalud() + "  Fono: " + getFono() + " ValorCama: " + getValorCama() + " Dias: " + getDias();
    }
    //public int calcularVPagar(){
    //	return=0;
    //}
}