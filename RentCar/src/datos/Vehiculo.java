package datos;

public class Vehiculo {
	private String placa;
	private String modelo;
	private String color;
	private int anio;
	private int estado;
	
	public Vehiculo(String placa, String modelo, String color, int anio, int estado){
	this.placa=placa;
	this.modelo=modelo;
	this.color=color;
	this.anio=anio;
	this.estado=estado;
		
	}
	
	public String estadoVehiculo(int ocupacionEstado){
		ocupacionEstado=estado;
		
		if (ocupacionEstado==0){
			return ("Libre");
		}		
		else if (ocupacionEstado==1){
			return ("Ocupada");
		}
	
		else {return ("Valor incorrecto");}
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}


