
	package plokstuma;
	
	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

import konsole.KonsolesDialogas;	

	public class Kreive {
	
		public static Taskas[] taskai;
		public static int kiek_tasku;
		
		public Kreive ( int max_tasku ) {
			
			taskai = new Taskas [ max_tasku ];
			kiek_tasku = 0;
		}
		
		public void pridetiTaska ( Taskas taskas ) {
			
			taskai [ kiek_tasku ] = taskas;
			kiek_tasku++;
		}
		
		public double ilgis() {
			
			int i = 0;
			double atstumas = 0;
			
			while ( i < ( kiek_tasku - 1 ) ) {
			
				double x_diff =  taskai [ i ].x  - taskai [ i + 1 ].x;
				double y_diff =  taskai [ i ].y -  taskai [ i + 1 ].y;			
				
				atstumas += Math.sqrt ( x_diff  *  x_diff + y_diff * y_diff );
				i++;
			}
			return atstumas;
		}
		
		public String toString() {
			
			String lentele = 
			
				    "-------------------------------\n" 
				+ "|      x       |       y      |\n"
				+ "-------------------------------\n";
			
			int i = 0;
			
			while ( i < kiek_tasku ) {

				lentele +=	 "|" + String.format ( "%10.3f", taskai [ i ].x ) + "    |" + String.format ( "%10.3f", taskai [ i ].y ) + "    |\n"; 
				i++;
			}
			lentele +=  "-------------------------------\n";
			
			return lentele;
		}
		
		public Taskasx artimiausiaTaska(Taskas taskas) throws IOException{
			
			double x_diff =  taskas.x  - taskai [ 0 ].x;
			double y_diff =  taskas.y -  taskai [ 0 ].y;		
			
			double min_atstumas = Math.sqrt ( x_diff * x_diff + y_diff * y_diff );
			
			int artimiausio_kreives_tasko_nr = 0;
			int i = 1;
			
			while ( i < kiek_tasku ) {
				x_diff = ( taskas.x  - taskai [ i ].x );
				y_diff = ( taskas.y -  taskai [ i ].y );
				double atstumasx = Math.sqrt ( x_diff * x_diff + y_diff * y_diff );
				if ( min_atstumas > atstumasx ) {

					min_atstumas = atstumasx;
					artimiausio_kreives_tasko_nr = i;
				}
				i++;
			}
			Taskas taskas_art = taskai[artimiausio_kreives_tasko_nr];
			Taskasx taskasx = new Taskasx(min_atstumas, artimiausio_kreives_tasko_nr, taskas_art.x, taskas_art.y);
			return taskasx;
		}
	}