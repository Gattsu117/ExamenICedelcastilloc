package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import dol.Vehiculos;

public class VehiculosDal {
	private Vehiculos vehiculos;
	private List<Vehiculos> lstvehiculos;

	private String rutaDelArchivo;
	private String nombreArchivo;
	
	

	
	
	
	public Vehiculos getVehiculos() {
		return vehiculos;
	}



	public void setVehiculos(Vehiculos vehiculos) {
		this.vehiculos = vehiculos;
	}

	
	
	public List<Vehiculos> getLstvehiculos() {
		return lstvehiculos;
	}



	public void setLstvehiculos(List<Vehiculos> lstvehiculos) {
		this.lstvehiculos = lstvehiculos;
	}



	public String getRutaDelArchivo() {
		return rutaDelArchivo;
	}


	public void setRutaDelArchivo(String rutaDelArchivo) {
		this.rutaDelArchivo = rutaDelArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}


	
	
	
public void saveList() {
		
		File file = new File(rutaDelArchivo + "\\" + nombreArchivo);
		try {
			
			ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream(file));
			os.writeObject(getLstvehiculos());
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
public List<Vehiculos> openList() {
	try {
		File file = new File(rutaDelArchivo);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		List<Vehiculos> v = (List<Vehiculos>)ois.readObject();
		ois.close();
		return v;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}







