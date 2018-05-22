package datos;

public class Conductor {
	private int idConductor=1;
	private String Nrobrevete;
	private String Nombre; //Nota: en el pdf dice int pero ponerle int a NOMBRE no tiene sentido alguno
	private String Apellido;
	private String Categoria;

public Conductor(int idConductor, String Nrobrevete, String Nombre, String Apellido, String Categoria){
	this.idConductor=idConductor;
	this.Nrobrevete=Nrobrevete;
	this.Nombre=Nombre;
	this.Apellido=Apellido;
	this.Categoria=Categoria;
}
	public void idConductorNuevo(){
		idConductor++;
	}
	
	public boolean CategoriaConductor(){
		if (Categoria=="A1" || Categoria=="A2"){
			return true;
		}
		else return false;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public String getNrobrevete() {
		return Nrobrevete;
	}
	public void setNrobrevete(String nrobrevete) {
		Nrobrevete = nrobrevete;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
}
