package datos;

public class Alquiler {
	private int id=1;
	private String codigoCliente;
	private String placa;
	private String fechaalquiler;
	private int dias;
	private double precioxdia;
	private int estado;
	private int reservado;
	
	public Alquiler(int id, String codigoCliente, String placa, String fechaalquiler, int dias, double precioxdia, int estado, int reservado){
	this.id=id;
	this.codigoCliente=codigoCliente;
	this.placa=placa;
	this.fechaalquiler=fechaalquiler;
	this.dias=dias;
	this.precioxdia=precioxdia;
	this.estado=estado;
	this.reservado=reservado;
	}
	
	public void nuevoId(){
		id++;
	}
	
	public String estadoAlquiler(){
		if (estado==1){
			return ("No devuelto");
		}else if (estado==2){
			return ("Devuelto");
		}
		else return ("Valor incorrecto");
	}

	
	public String reservadoAlquiler(){
		if (reservado==1){
			return ("Si");
		}else if (reservado==2){
			return ("No");
		}else return ("Valor incorrecto");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFechaalquiler() {
		return fechaalquiler;
	}

	public void setFechaalquiler(String fechaalquiler) {
		this.fechaalquiler = fechaalquiler;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getPrecioxdia() {
		return precioxdia;
	}

	public void setPrecioxdia(double precioxdia) {
		this.precioxdia = precioxdia;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getReservado() {
		return reservado;
	}

	public void setReservado(int reservado) {
		this.reservado = reservado;
	}
	
	
}
