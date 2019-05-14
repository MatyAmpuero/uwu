Class Asignatura 
{
	//Atributos
	private String nombre;
	private int sct;
	private float nota;
	private String profesor;

	//Metodos
	public Asignatura ()
	{
		this.nombre="";
		this.sct=0;
		this.nota=0,0;
		this.profesor="";

	}

	public void setnombre (String a){
		this.nombre=a;

	}
	public String getnombre (){
		return this.nombre;
	}

	public void setsct (int b){
		this.sct=b;
	}
	public int getsct (){
		return this.sct;
	}

	public void setnota (float c){
		this.nota=c;
	}
	public float getnota (){
		return this.nota;
	}

	public void setprofesor (String d){
		this.profesor=d;
	}
	public String getprofesor (){
		return this.profesor;
	}
	public void imprimir() {
		System.out.printl("el ramo es"+this.nombre+"y fue impartida por el profesor"+this.profesor+". Tiene"+this.sct+"creditos y fue calificado con nota"+this.nota);
	}
	//pene

}