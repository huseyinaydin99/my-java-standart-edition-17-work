/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
package tr.com.huseyinaydin;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	/*public static void main(String[] args) {
		File file = new File("C:\\Javacode-main");

		List<String> txtUzantiLitesi = new ArrayList<>();
		List<String> txtOlmayanUzantiLitesi = new ArrayList<>();

		if (file.isDirectory()) {
			File[] dosyaDizi = file.listFiles();
			for (int i = 0; i < dosyaDizi.length; i++) {
				File dosya = dosyaDizi[i];
				if (dosya.isFile()) {
					String tersUzanti = "";
					String dosyaIsmi = dosya.getName().toString();
					int count = dosyaIsmi.length();
					for (int j = count - 1; j >= 0; j--) {
						if (dosyaIsmi.charAt(j) != '.') {
							tersUzanti += String.valueOf(dosyaIsmi.charAt(j));
						} else if (dosyaIsmi.charAt(j) == '.') {
							break;
						}
					}
					String duzUzanti = "";
					for (int j = tersUzanti.length() - 1; j >= 0; j--) {
						duzUzanti += tersUzanti.charAt(j);
					}
					String dosyaAdi = "";
					byte noktaIndex = 0;
					if (duzUzanti.equals("java")) {
						for (int k = 0; k < dosya.getName().length(); k++) {
							if (Character.isDigit(dosya.getName().charAt(k))) {
								continue;
							}
							if (noktaIndex != 1)
								if (dosya.getName().charAt(k) == '.') {
									noktaIndex++;
								}
							dosyaAdi += dosya.getName().charAt(k);
						}
						//System.out.println(dosyaAdi.replace(dosyaAdi.substring(0, 1), "_"));
						String yeniDosyaAdi = dosyaAdi.substring(0,3);
						String yepYeniDosyaAdi = yeniDosyaAdi.replace(".", "_");
						yepYeniDosyaAdi += dosyaAdi.substring(3, dosyaAdi.length() - 5);
						System.out.println("-- " + yepYeniDosyaAdi);
						//System.out.println("C:\\Javacode-main\\" + yepYeniDosyaAdi);
						File renamedFile = new File("C:\\Javacode-main\\" + yepYeniDosyaAdi + ".java");
						dosya.renameTo(renamedFile);
						dosyaAdi = "";
					}
					Runtime.getRuntime().gc();
				}
			}
		}*/
		/*
		 * System.out.println("txt uzanti sayısı = " + txtUzantiLitesi.size());
		 * PrintStream printStream = new PrintStream(System.out); try {
		 * printStream.write("Selam\n".getBytes()); } catch (IOException ex) {
		 * Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); }
		 * 
		 * System.out.println("txt olmayan uzanti sayısı = " +
		 * txtOlmayanUzantiLitesi.size());
		 * 
		 * for (int i = 0; i < txtUzantiLitesi.size(); i++) {
		 * System.out.println(txtUzantiLitesi.get(i)); }
		 * 
		 * System.out.println(
		 * "--------------------------------------------------------------");
		 * 
		 * for (int i = 0; i < txtOlmayanUzantiLitesi.size(); i++) {
		 * System.out.println(txtOlmayanUzantiLitesi.get(i)); }
		 */

	//}

}
/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

