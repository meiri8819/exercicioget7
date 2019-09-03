public class TestaPorta {
    public static void main(String[] args) 
{
    Porta porta = new Porta();
	
	porta.fecha();
	porta.abre();	
	double dimensaoX = 5.20;
	double dimensaoY = 4.00;
	porta.estaAberta("Aberta");
	porta.estaAberta("Fecha");
	
	System.out.println("A porta está "+porta);
}
}