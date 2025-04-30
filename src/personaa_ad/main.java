package personaa_ad;

public class main {
	public static void main(String[] args) {
	Persona_ad pers1 = new Persona_ad (1, "Papa", 85, 1.75, 22);
	Persona_ad pers2 = new Persona_ad (1, "Pepe", 75, 1.80, 25);
	
	AD_GravedadProyecto plan1 = new AD_GravedadProyecto (1,"Tierra", 9.81);
	AD_GravedadProyecto plan2 = new AD_GravedadProyecto (2,"Marte", 3.72);
	AD_GravedadProyecto plan3 = new AD_GravedadProyecto (3,"Jupiter", 24.79);
	
	//Calculo peso persona en tierra peso = masa por aceleracion
	double masaPersona = pers1.getMasa();
	double AD_GravedadProyecto = plan1.getGravedadplaneta();
	double pesoTierra = masaPersona*AD_GravedadProyecto;
	
	//Calculo peso persona en marte peso = masa por aceleracion
	double masaPersona2 = pers1.getMasa();
	double gravedadMarte = plan1.getGravedadplaneta();
	double pesoMarte = masaPersona*gravedadMarte;
	
	//Calculo peso persona en jupiter peso = masa por aceleracion
	double masaPersona3 = pers1.getMasa();
	double gravedadJupiter = plan1.getGravedadplaneta();
	double pesoJupiter = masaPersona*gravedadJupiter;
	
	//Imprimir informacion
		System.out.println(pers1);
		System.out.println("El IMC de la persona"+pers1.getNombre()+"es ...");
		System.out.println(pers2);
		System.out.println("El IMC de la persona"+pers2.getNombre()+"es ...");
		System.out.println(plan1);
		System.out.println(plan2);
		System.out.println(plan3);
		System.out.println("Peso"+pers1.getNombre()+"en tierra:"+pesoTierra);
		System.out.println("Peso"+pers1.getNombre()+"en marte:"+pesoMarte);
		System.out.println("Peso"+pers1.getNombre()+"en tierra:"+pesoJupiter);
	}	
		
}
