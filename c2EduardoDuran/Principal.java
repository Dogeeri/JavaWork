import java.util.Scanner;

class Principal{

    public static void main(String []arg)  {
    	Scanner keyboard = new Scanner(System.in);
    	boolean Continuar = true;
		while(Continuar){
   		System.out.println("Desea ingresar nuevo paciente? (si=s,no=n");
			String resp = keyboard.nextLine();
		if(resp.equalsIgnoreCase("s")){
			
			System.out.println("Paciente es Ambulatorio o Hospitalizado?");
			String resp2 = keyboard.nextLine();
			if(resp2.equalsIgnoreCase("ambulatorio")){ 
				Ambulatorio amb = new Ambulatorio();
				System.out.println("Ingresar Nombre del Paciente");
				amb.setNom(keyboard.nextLine());   
				System.out.println("Ingresar RUT del Paciente");
				amb.setRut(keyboard.nextLine());   
				System.out.println("Ingresar Sexo del Paciente");
				amb.setSexo(keyboard.nextLine());   
				System.out.println("Ingresar Salud del Paciente (D,C,B,A)");	
				amb.setSalud(keyboard.nextLine());   
				System.out.println("Ingresar Especialidad");
				amb.setEspecialidad(keyboard.nextLine());   
				System.out.println("Ingresar precio");
				amb.setPrecio(keyboard.nextInt());   
				System.out.println("Ingresar nivel");
				amb.setNivel(keyboard.nextLine());   
				System.out.println(amb.datosPacientes());
				
				//System.out.println(amb.calcularVPagar());
				    }else{
				    	System.out.println("//ingreso hospitalizado");
				    		Hospitalizado hos = new Hospitalizado();
							System.out.println("Ingresar Nombre del Paciente");
							hos.setNom(keyboard.nextLine());   
							System.out.println("Ingresar RUT del Paciente");
							hos.setRut(keyboard.nextLine());   
							System.out.println("Ingresar Sexo del Paciente");
							hos.setSexo(keyboard.nextLine());   
							System.out.println("Ingresar Salud del Paciente (D,C,B,A)");	
							hos.setSalud(keyboard.nextLine());
							System.out.println("Ingresar Fono");
							hos.setFono(keyboard.nextLine());
							System.out.println("Ingresar Valor cama");
							hos.setValorCama(keyboard.nextInt());
							System.out.println("Ingresar dias");
							hos.setDias(keyboard.nextByte());
							System.out.println(hos.datosPacientes());
				    	
				    	//falto calcularVPagar() sorry
				    	
				    
				    }
				}else{
					System.out.println("salir");
					break;	//salir
			}
		}
    }
}