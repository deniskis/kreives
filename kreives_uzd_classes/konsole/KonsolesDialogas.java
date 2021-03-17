
	package konsole;

	import java.io.BufferedReader; 
	import java.io.IOException; 
	import java.io.InputStreamReader;

import plokstuma.Kreive; 
import plokstuma.Taskas; 
	
	/**
	* Klasė dialogo su vartotoju konsolėje oranizavimui.
	*/
	public class KonsolesDialogas  {
		
		public BufferedReader reader;												// skaitymo iš failo tarpinis objektas.
		
		/**
		* konstruktorius be parametrų, sukuria skaitymo iš failo tarpinį objektą
		*/
		public KonsolesDialogas() {
			
			reader = new BufferedReader ( new InputStreamReader (System.in ) ); 			
		}
		
		/**
		* iš konsolės įvedama teksto eilutė, prieš tai išvedant priminimą ir reikšmę kuri bus gražinama pagal nultylėjimą, paspaudus tik Enter.
		*@param String priminimas
		*@param String nutylint
		*@return String
		*/
		public String ivestiReiksme ( String priminimas, String nutylint ) throws IOException {
		
			System.out.print ( priminimas + " [" + nutylint + "] ? " );	
		
			String reiksme = reader.readLine();
			
			if ( reiksme.length() == 0 ) {
			
				reiksme = nutylint;
			}			
			return reiksme;
		}
		public static Taskas ivestiXY() throws IOException{
			
			BufferedReader qq = new BufferedReader ( new InputStreamReader (System.in ) ); 	
			System.out.print ( "x: "  );
			String x_q = qq.readLine();
			System.out.print ( "y: "  );
			String y_q = qq.readLine();
			Taskas taskas= new Taskas(Double.parseDouble(x_q),Double.parseDouble(y_q));
			return taskas;	
		}
	}