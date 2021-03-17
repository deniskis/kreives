/**
* Programa skaičiuoja kreivės plokštumoje, kuri nusakoma taškais duomenų faile, ilgį.
* @author dėstytojas
* duomenu failo formatas artimas csv, skaičiai atskirti kableliais, .. 
* .. pirmoje eilutėje taškų x reikšmės, antroje taškų y reikšmės
*/
import java.io.IOException; 

import plokstuma.*;
import konsole.*;

public class KreivesIlgisz {
	
	public static void main(String[] args)  throws IOException  {
		
																							// programos pasisveikinimas							
		
		System.out.println( "Labas Java pasauli .." );
		System.out.println( "Skaiciuosim kreives ilgi:" );
																							//   organizuojamas konsolės dialogas, ..
																							// .. kuriuo įvedamas failo vardas, ..
		KonsolesDialogas konsoles_dialogas = new KonsolesDialogas();									// .. arba nustatomas vardas  kreives_taskai.csv, ..
																						// .. pagal nutylejima ir perduodamas priminimo,
		String vardas_failo = konsoles_dialogas.ivestiReiksme (" kreives tasku failas", "kreives_taskai.csv" );	      			//  .. ką įvesti - " kreivės taškų failas "
																						
		KreiveIsFailoXXYY kreive_is_failo_xx_yy = new KreiveIsFailoXXYY ( vardas_failo ); 						// kuriams kreivės skaitymo iš failo objektas ..
		Kreive kreive = kreive_is_failo_xx_yy.gautiKreive();											// .. ir pasiimamas Kreives objektas, kuriame yra ..
																											//  .. Taskai masyvas
		System.out.println ( kreive.toString() );																	// parodomi kreivės taškai
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );												// ir parašomas suskaičiuotas kreivės ilgis	
		Taskas taskas= KonsolesDialogas.ivestiXY();	
		Taskasx taskas_art = kreive.artimiausiaTaska(taskas);
		System.out.println ( "Artimiausia taska: " +  taskas_art.x + " " + taskas_art.y );
		System.out.println("taskas nutoles: " + taskas_art.atstumas);
		System.out.println("taskas numeris: " + taskas_art.numeris);
	}	
}