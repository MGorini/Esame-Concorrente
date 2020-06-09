// Java program to read and download 
// webpage in html file 
import java.io.*; 
import java.net.URL; 
import java.net.MalformedURLException; 

public class download { 

	public static void ScaricaPagina(String webpage) 
	{ 
		try { 

			// Crea l'oggetto URL
			URL url = new URL(webpage); 
			BufferedReader readr = 
			new BufferedReader(new InputStreamReader(url.openStream())); 

			// nome del file pagina scaricato
			BufferedWriter writer = 
			new BufferedWriter(new FileWriter("Pagina.html")); 
			
			// legge ogni riga della pagina fino alla fine e lo scrive
			String line; 
			while ((line = readr.readLine()) != null) { 
				writer.write(line); 
			} 

			readr.close(); 
			writer.close(); 
			System.out.println("Pagina scaricata con successo"); 
		} 

		// Exceptions 
		catch (MalformedURLException mue) { 
			System.out.println("Malformed URL Exception raised"); 
		} 
		catch (IOException ie) { 
			System.out.println("IOException raised"); 
		} 
	} 
	public static void main(String args[]) 
		throws IOException 
	{ 
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("incolla l'URL della pagina da scaricare");
            String url = reader.readLine();
            ScaricaPagina(url); 
	} 
} 
