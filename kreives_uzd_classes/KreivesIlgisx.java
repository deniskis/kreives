
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

import java.io.FileReader;
import java.util.ArrayList;

import java.lang.Math;

import plokstuma.*;

public class KreivesIlgisx {
	
	public static void main(String[] args)  throws IOException  {
		
		System.out.println( "Labas Java pasauli .." );
		System.out.println( "Skaiciuosim kreives ilgi:" );		

		System.out.print ( " kreives tasku failas [kreives_taskai.csv] ? " );	
		BufferedReader reader = new BufferedReader ( new InputStreamReader (System.in ) ); 		
		String vardas_failo = reader.readLine();
		
		if ( vardas_failo.length() == 0 ) {
		
			vardas_failo = "kreives_taskai.csv";
		}

		BufferedReader br = new BufferedReader( new FileReader( vardas_failo ) );
		String x_ai = br.readLine();
		String y_ai = br.readLine();
		
		String[] xs = x_ai.split ( "," ); 
		String[] ys = y_ai.split ( "," ); 
		
		Kreive kreive = new Kreive ( xs.length );	
		
		int i = 0;
		
		while ( i < xs.length ) {
			
			kreive.pridetiTaska ( new Taskas ( Double.parseDouble ( xs [ i ] ), Double.parseDouble ( ys [ i ] ) ) );
			i++;
		}
		System.out.println ( kreive.toString() );
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );
	}	
}