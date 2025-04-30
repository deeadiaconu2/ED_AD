package personaa_ad;

public class AD_GravedadProyecto {

	//Atributos 
	private int id;
	private String nombre;
	private double gravedadplaneta;
	
	//Constructor por defecto
	
	public AD_GravedadProyecto() {
		super();
	}
	
	//Constructor con todos los argumentos
	
	public AD_GravedadProyecto(int id, String nombre, double gravedadplaneta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.gravedadplaneta = gravedadplaneta;
	}
	
	//Metodos getters y setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGravedadplaneta() {
		return gravedadplaneta;
	}

	public void setGravedadplaneta(double gravedadplaneta) {
		this.gravedadplaneta = gravedadplaneta;
	}
	
	//Metodo ToString
	
	@Override
	public String toString() {
		return "AD_GravedadProyecto [id=" + id + ", nombre=" + nombre + ", gravedadplaneta=" + gravedadplaneta + "]";
	}
}
