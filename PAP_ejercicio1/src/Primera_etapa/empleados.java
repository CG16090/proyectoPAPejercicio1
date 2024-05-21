package Primera_etapa;

public class empleados {
// atributos
		protected double sueldo;
	    private String nombre;
	    private String direccion;
	    private String fechaNacimiento;
	    private String sexo;
// constructores
	    public empleados(String nombre, String direccion, String fechaNacimiento, String sexo) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.fechaNacimiento = fechaNacimiento;
	        this.sexo = sexo;
	    }
	    
	    public String getNombre() {
	    	return nombre;
	    }
	    public String getDireccion() {
	    	return direccion;
	    }
	    public String getFechaNacimiento() {
	    	return fechaNacimiento;
	    }
	    public String getSexo() {
	    	return sexo;
	    }
// métodos
	    public double getSueldo() {
	    	return sueldo;
	    }
	    public double calcularSalarioNeto() {
	    	double isss = sueldo * 0.075;
	    	double afp = sueldo * 0.0775;
	        return sueldo - isss - afp - calcularRenta();
	    }
	    private double calcularRenta() {
	    	 if (sueldo > 472.01 && sueldo < 895.24) {
	    		 return sueldo * 0.1 + 17.67;
	    	 } else if (sueldo > 895.25 && sueldo < 2038.10) {
	    		 return sueldo * 0.2 + 60;
	    	 } else if (sueldo > 2038.11) {
	    		 return sueldo * 0.3 + 288.57;
	    	 }
	    	 
	    	 return 0;
	    }
}
