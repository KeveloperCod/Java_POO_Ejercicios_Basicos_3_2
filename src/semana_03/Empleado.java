package semana_03;

public class Empleado {
	
	private int codigo , categoria , celular ;
	private String nombre;
	
	
	//variables privadas de clase
	private static int cantEmpleado;
	private static double sNetos;
	public static final double descuento;
	
	/*UN BLOQUE DE INICIALIZACION STATIC PARA ASIGNARLE A LA CONSTANTE EL VALOR 0.15
	  E INICIALIZAR CON CERO LAS VARIABLES PRIVADAS DE CLASE */
	static {
		descuento = 0.15;
		cantEmpleado =0;
		sNetos = 0 ;
	}
	
	/*UN CONSTRUCTOR QUE INICIALICE A TODOS LOS ATRIBUTOS , CUENTE LA CANTIDAD DE OBEJTOS CREADOS
	 Y ACUMULE LOS SUELDOS NETOS. HAGA USO DE LA REFERENCIA this.*/
	public Empleado(int codigo, int categoria, int celular, String nombre) 
	{
		this.codigo = codigo;
		this.categoria = categoria;
		this.celular = celular;
		this.nombre = nombre;
		cantEmpleado++;
		sNetos+=suNeto();
	}
	
	public Empleado(int codigo, String nombre){
		this(codigo, 2, 999999999, nombre);
	}
	

	
	public Empleado(){
		this(4444, "Ninguno");
	}
	
	/* METODOS DE ACCESO PUBLICO SET PARA TODOS LOS ATRIBUTOS PRIVADOS. USE LA REFERENCIA this
	 * METODOS DE ACCESO PUBLICO GET PARA TODOS LOS ATRIBUTOS PRIVADOS
	   METODOS PUBLICOS DE CLASE SET/GET PARA LAS VARIABLES PRIVADAS DE CLASE*/

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getCantEmpleado() {
		return cantEmpleado;
	}

	public static void setCantEmpleado(int cantEmpleado) {
		Empleado.cantEmpleado = cantEmpleado;
	}

	public static double getsNetos() {
		return sNetos;
	}

	public static void setsNetos(double sNetos) {
		Empleado.sNetos = sNetos;
	};
	
	
	
	//UN METODO QUE RETORNE EL SUELDO BRUTO DEL EMPLEOADO SABIENDO QUE
	//(SE PUEDE UTILIZAR EN ESTE CASO UN SWITCH O UN IF ELSE , COMO LO VEMOS ABAJO, CUALQUIERA DE LOS 2 ES VALIDA)
	
	/* 
	  
	 public int sbruto(){
		switch (categoria) 
		{case 0:
			return 7200;
		case 1:
			return 6300;
		default:
			return 5100;
		}
	} 
	
	*/
	
	public double sBrutos(){
		if (categoria<=0){
			return 7200;
		}else if(categoria <=1){
			return 6300;
			
		}else 
			return 5100;
			
	}
	
	//UN METODO QUE RETORNE EL DESCUENTO (APLICADO EL SUELDO BRUTO).
	
	public double descuento(){
		return sBrutos() * descuento;
	}
	
	//UN METODO QUE RETORNE EL SUELDO NETO (SUELDO BRUTO - DESCUENTO).
	
	public double suNeto(){
		return sBrutos() - descuento();
	}
	
	}

