
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

import plokstuma.*;

public class KreivesIlgisy {
	
	public static void main(String[] args)  throws IOException  {
		
		System.out.println( "Labas Java pasauli .." );
		System.out.println( "Skaiciuosim kreives ilgi:" );		

		System.out.print ( " kreives tasku failas [kreives_taskai.csv] ? " );	
		BufferedReader reader = new BufferedReader ( new InputStreamReader (System.in ) ); 		
		String vardas_failo = reader.readLine();
		
		if ( vardas_failo.length() == 0 ) {
		
			vardas_failo = "kreives_taskai.csv";
		}
		
		KreiveIsFailoXXYY kreive_is_failo_xx_yy = new KreiveIsFailoXXYY ( vardas_failo ); 
		Kreive kreive = kreive_is_failo_xx_yy.gautiKreive();

		System.out.println ( kreive.toString() );
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );
	}	
}