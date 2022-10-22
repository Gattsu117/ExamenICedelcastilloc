package bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dal.VehiculosDal;
import dol.Vehiculos;
import ui.VehiculosForm;

public class Application {
	private Scanner scan;
	private List<Vehiculos> vehiculos;
	

	private String rutaDelArchivo;
	private String nombreArchivo;
	
	public String getRutaAGuardar() {
		return rutaDelArchivo;
	}


	public void setRutaAGuardar(String rutaAGuardar) {
		this.rutaDelArchivo = rutaAGuardar;
	}





	
	
	public void save() {

		VehiculosDal bd = new VehiculosDal();
			
		bd.setRutaDelArchivo(rutaDelArchivo);
		
		while(nombreArchivo.length()==0) {			
			System.out.println(" nombre del archivo aca ");		
			nombreArchivo = scan.next();
		}
		
		bd.setNombreArchivo(nombreArchivo); 
		
		bd.setLstvehiculos(vehiculos); 
		
		bd.saveList();
	}
	
	
	public Application() {
		scan = new Scanner(System.in);
		nombreArchivo = "";
		vehiculos = new ArrayList<Vehiculos>();
	}
	
	public Application(Scanner scanner) {
		scan = scanner;
		nombreArchivo = "";
		vehiculos = new ArrayList<Vehiculos>();
	}
	
	
	
	
	private void addVehiculo() {
		VehiculosForm vf = new VehiculosForm(scan);
		
		System.out.println("Paso aqui" );
		vehiculos.add(vf.catchVehiculos());
		
		System.out.println("paso"  );
	
	}
	
	
	
	public void displayOptions() {
		System.out.println("Automotora");
		System.out.println("1. Agregar");
		System.out.println("2. Guardar");
		System.out.println("3. Abrir");
		System.out.println("4. Salir");
	}
	
	public void show() {
		short option =0;
		do {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch(option) {
				case 1:
					addVehiculo();
					break;
				case 2:
					save();
					break;
				case 3:
					open();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}while(option!=4);
	}
	
	
	
	
	
	public void open() {
		System.out.println("Por favor indica el nombre del archivo a abrir: ");
		nombreArchivo = scan.next();
		String filePath = rutaDelArchivo + "\\" + nombreArchivo;
		VehiculosDal bd = new VehiculosDal();
		bd.setRutaDelArchivo(filePath);
		
		vehiculos = bd.openList();
		
		VehiculosForm bf = new VehiculosForm(vehiculos);
		bf.showVehicles();
	}
	
	
	
	
}









































