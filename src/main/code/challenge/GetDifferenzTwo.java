package challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetDifferenzTwo {

	public static String getDifferenzWeather2(String file) throws FileNotFoundException {

		// CSVParser csvParser = new CSVParser( new
		// FileInputStream("./src/main/resources/de/exxcellent/challenge/weather.csv")
		// );
		BufferedReader File = new BufferedReader(
				new FileReader("./src/main/resources/de/exxcellent/challenge/" + file));
		String datei;
		String[] split1;
		String[] arrayResult = new String[3];
		String result = "";
		Integer max, min;
		int differenz = 1000;
		int differenz_new = 0;

		try {
//			for ( String t; (t = csvParser.nextValue()) != null; )
//			  System.out.println( csvParser.lastLineNumber() + " " + t );

			datei = File.readLine();
			datei = File.readLine();

			while (datei != null) {

				split1 = datei.split(",");

				for (int i = 0; i < 3; i++) {

					arrayResult[i] = split1[i];
				}

				max = Integer.parseInt(arrayResult[1]);
				min = Integer.parseInt(arrayResult[2]);

				differenz_new = max - min;

				if (differenz_new < differenz) {

					differenz = differenz_new;
					result = arrayResult[0];

				}

				datei = File.readLine();

			}

			File.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException i) {

			i.printStackTrace();

		}
		return result;

	}

	public static String getDifferenzFootball2(String file) throws FileNotFoundException {

		// CSVParser csvParser = new CSVParser( new
		// FileInputStream("./src/main/resources/de/exxcellent/challenge/weather.csv")
		// );
		BufferedReader File = new BufferedReader(
				new FileReader("./src/main/resources/de/exxcellent/challenge/" + file));
		String datei;
		String[] split1;
		String result = "";
		Integer max, min;
		int differenz = 1000;
		int differenz_new = 0;

		try {
//			for ( String t; (t = csvParser.nextValue()) != null; )
//			  System.out.println( csvParser.lastLineNumber() + " " + t );

			datei = File.readLine();
			datei = File.readLine();

			while (datei != null) {

				split1 = datei.split(",");

				max = Integer.parseInt(split1[5]);
				min = Integer.parseInt(split1[6]);

				differenz_new = Math.abs(max - min);

				if (differenz_new < differenz) {

					differenz = differenz_new;
					result = split1[0];

				}

				datei = File.readLine();

			}

			File.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException i) {

			i.printStackTrace();

		}
		return result;

	}

}
