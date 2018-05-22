package datos;

public class Oferta {
	private int id=1;
	private String placa;
	private double precioxDia;
	private String Descripcion;
	private String fechaSalida;
	
	public Oferta(int id, String placa, double precioxDia, String Descripcion, String fechaSalida){
		this.id=id;
		this.placa=placa;
		this.precioxDia=precioxDia;
		this.Descripcion=Descripcion;
		this.fechaSalida=fechaSalida;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPrecioxDia() {
		return precioxDia;
	}

	public void setPrecioxDia(double precioxDia) {
		this.precioxDia = precioxDia;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	

}
