public class Ruben{
	static int years_old = 19;
	static String name = "Ruben";
	
	public static void main(String [] args){	
		//Cumpleaños feliz
		for(int i=0; i<4; i++){
		    switch(i){
		      case 2: System.out.println("Te deseamos todos, " + name); break;
		      default: System.out.println("Cumpleaños Feliz");
		    }
		}
		System.out.println();
		
		//Porque es un muchacho excelente
		for(int i=0; i<3; i++){
		    System.out.println("Porque es un muchacho excelente");
		}
		for(int i=0; i<2; i++){
		    System.out.println("Y siempre lo sera");
		}
		System.out.println();
		
		//Que no cumple X
		int i = 0;
		boolean finded = false;	
		while(i< 100 && !finded){
			if(i == years_old){
				finded = true;
				System.out.println("Que SI cumple " + years_old);
			}
			else
				System.out.println("Que no cumple " + i);
		    i++;
		}
	}
}








