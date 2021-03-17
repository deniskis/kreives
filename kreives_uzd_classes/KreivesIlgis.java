
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

import java.io.FileReader;
import java.util.ArrayList;

import java.lang.Math;

import plokstuma.*;

public class KreivesIlgis {
	
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
		
		int i = 0;
		
		Double atstumas = 0.0;
		
		while ( i < xs.length ) {
			
			Double x = Double.parseDouble ( xs [ i ] );
			Double y = Double.parseDouble ( ys [ i ] );

			if ( i < ( xs.length - 1 ) ) {
				
				Double x_diff =  ( x - Double.parseDouble ( xs [ i + 1 ] ) );
				Double y_diff =  ( y - Double.parseDouble ( ys [ i + 1 ] ) );
			
				atstumas += Math.sqrt ( x_diff  *  x_diff + y_diff * y_diff );
			}
			
			System.out.println ( "|" + String.format ( "%10.3f", x ) + "    |" + String.format ( "%10.3f", y ) + "    |" );
			
			i++;
		}
		
		System.out.println ( "-------------------------------" );
		System.out.println ( "Kreives ilgis: " + atstumas );
	}	
}