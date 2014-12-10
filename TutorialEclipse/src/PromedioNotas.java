import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PromedioNotas {

	public static void main(String[] args) {
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			int numValores,i,suma;
			int[] notas=new int[10];
			double promedio;
			numValores=10;//Cambiando este valor
			
			for(i=0;i<numValores;i++){
				System.out.println("Intro la nota del alumno " + (i+1));
				notas[i]=Integer.parseInt(in.readLine());
			}
			suma=0;
			for(i=0;i<numValores;i++){
				suma=suma+notas[i];
			}
			promedio=suma/numValores;
			System.out.println("La media de las notas introducidas es " + promedio);
			System.out.println("Las notas mayores son:");
			for(i=0;i<=numValores;i++){
				if(notas[i]>promedio){
					System.out.println("La posicion" + i+1 + " Nota " + notas[i]);
				}
			}
		}catch(Exception e){
			
		}
		
		

	}

}
