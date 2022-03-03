class Paciente{
	private String nom;
	private String rut;
	private byte edad;
	private String sexo;
	private String salud;
	
    public Paciente(){
    }
    public Paciente(String nom, String rut, byte edad, String sexo, String salud){
    	this.nom=nom;
    	this.rut=rut;
    	this.edad=edad;
    	this.sexo=sexo;
    	this.salud=salud;
    }
    public String getRut(){
    	return rut;
    }
    public String getNom(){
    	return nom;
    }
    public byte getEdad(){
    	return edad;
    }
    public String getSexo(){
    	return sexo;
    }
    public String getSalud(){
    	return salud;
    }
    public void setRut(String rut){
    	this.rut=rut;
    }
    public void setNom(String nom){
    	this.nom=nom;
    }
    public void setEdad(byte edad){
    	this.edad=edad;
    }
    public void setSexo(String sexo){
    	this.sexo=sexo;
    }
    public void setSalud(String salud){
    	this.salud=salud;
    }
    public String datosPacientes(){
    	return "Nom: " + getNom() + " RUT: " + getRut() + " Edad: " + getEdad() + " Sexo: " + getSexo() + " Salud: " + getSalud();
    }
    //public int calcularVPagar(){
    //	return=0;
    //}
}