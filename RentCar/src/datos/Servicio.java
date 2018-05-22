package datos;

public class Servicio {
	private int id=1001;
	private int idconductor;
	private double precioxhora;
	private double horasdeServicio;
	private int codigocliente;
	private String placa;
	
	public Servicio(int id, int idconductor, double precioxhora, double horasdeServicio, int codigocliente, String placa){
		this.id=id;
		this.idconductor=idconductor;
		this.precioxhora=precioxhora;
		this.horasdeServicio=horasdeServicio;
		this.codigocliente=codigocliente;
		this.placa=placa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdconductor() {
		return idconductor;
	}

	public void setIdconductor(int idconductor) {
		this.idconductor = idconductor;
	}

	public double getPrecioxhora() {
		return precioxhora;
	}

	public void setPrecioxhora(double precioxhora) {
		this.precioxhora = precioxhora;
	}

	public double getHorasdeServicio() {
		return horasdeServicio;
	}

	public void setHorasdeServicio(double horasdeServicio) {
		this.horasdeServicio = horasdeServicio;
	}

	public int getCodigocliente() {
		return codigocliente;
	}

	public void setCodigocliente(int codigocliente) {
		this.codigocliente = codigocliente;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
public void nuevoID(){
id++;	
}

}
