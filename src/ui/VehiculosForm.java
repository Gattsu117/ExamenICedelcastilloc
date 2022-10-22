package ui;

import java.util.List;
import java.util.Scanner;

import dol.Vehiculos;

public class VehiculosForm {
	private Scanner scan;
	private Vehiculos vehiculo;
	private List<Vehiculos> vehiculos;
	
	public VehiculosForm(Scanner scan) {
		super();
		this.scan = scan;
	}
	public VehiculosForm(Vehiculos vehiculo) {
		super();
		this.vehiculo = vehiculo;
	}
	
	public VehiculosForm(List<Vehiculos> vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}
	

	
	public Vehiculos catchVehiculos() {
		Vehiculos b = new Vehiculos();
		ServiciosForm s = new ServiciosForm();
		System.out.println("Marca: ");
		scan.nextLine();
		b.setMarca(scan.nextLine());  
		
		System.out.println("Modelo: ");
		b.setModelo(scan.nextLine());
		
		
		System.out.println("año: ");
		b.setYear(scan.nextLine());
		
		System.out.println("chasis: ");
		b.setChasis(scan.nextLine());
		
		
		System.out.println("placa: ");
		b.setPlaca(scan.nextLine());
		
		
		
		s.showService();
		return b;
	}
	
	
	public void showVehicle() {
		System.out.printf("Marca: %s\n", vehiculo.getMarca());
		System.out.printf("Modelo: %s\n", vehiculo.getModelo());


		}

		public void showVehicles() {
		for(int i=0; i<vehiculos.size(); i++) {
			System.out.println("Recorrio " + i);
			System.out.printf("%d | %s | %s\n", i+1, vehiculos.get(i).getMarca(), vehiculos.get(i).getModelo() );
		}
	
}
}











































