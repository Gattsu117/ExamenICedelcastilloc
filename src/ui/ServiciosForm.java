package ui;

import java.util.List;
import java.util.Scanner;

import bll.Servicios;
import dol.Vehiculos;

public class ServiciosForm {
	private Scanner scan;
	private Servicios servicio;
	private List<Servicios> servicios;
	
	public ServiciosForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public ServiciosForm(Servicios servicio) {
		super();
		this.servicio = servicio;
	}
	public ServiciosForm() {
		super();
	}
	public void showService() {
		int opt = 0;
		System.out.println("Automotora");
		
		System.out.println("1. Mantenmiento Preventivo");
		System.out.println("2. enderezado y pintura");
		System.out.println("3. diagnostico");
		System.out.println("4. Salir");
		opt = scan.nextInt();
		if(opt<=0||opt>=5) {
			System.out.println("Ninguna opcion es valida, favor ingresar la correcta");
			showService();
		}
		showOptSelected(opt);
	}
	
	public void showOptSelected(int option) {
		String Diagnostico = "";
		if(option == 1) {
			System.out.println("Se realizará un diagnostico ...");
			option = 3;
		}
		switch(option) {
		case 1:
			servicio.setDiagnostico(scan.next());
			break;
		case 2:
			System.out.println("falta...");
			break;
		case 3:
			///Diagnostico
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Opción no válida");
			break;
	}
	}
	
	
	
	public void showVehicle() {
		System.out.printf("Marca: %s\n", servicio.getMarca());
		System.out.printf("Modelo: %s\n", vehiculo.getModelo());


		}

		public void showVehicles() {
		for(int i=0; i<vehiculos.size(); i++) {
			System.out.println("Recorrio " + i);
			System.out.printf("%d | %s | %s\n", i+1, vehiculos.get(i).getMarca(), vehiculos.get(i).getModelo() );
		}
}
