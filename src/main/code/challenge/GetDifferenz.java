package challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GetDifferenz {

	@SuppressWarnings({ "resource", "unused" })
	public static String getDifferenz(String file, String fname) throws FileNotFoundException {

		String filename = fname;
		String result;
		String result_new = "";
		int max, min;
		int differenz = 1000;
		int differenz_new;

		// Load CSV File
		String csvFile = "./src/main/resources/de/exxcellent/challenge/" + file;

		// Assign a scanner to the file
		Scanner scannerLine = new Scanner(new File(csvFile));

		// Ignore header
		scannerLine.nextLine();

		try {

			// Scan of the rows
			while (scannerLine.hasNextLine()) {

				// Scan of the columns (first three columns)
				Scanner scanner = new Scanner(scannerLine.nextLine()).useDelimiter(",");

				if (fname == "Footballteams") {

					result = scanner.next();
					scanner.nextInt();
					scanner.nextInt();
					scanner.nextInt();
					scanner.nextInt();
					max = scanner.nextInt();
					min = scanner.nextInt();

					// Calculation of the absolute value (min)
					differenz_new = Math.abs(max - min);

				} else {
					result = Integer.toString(scanner.nextInt());
					max = scanner.nextInt();
					min = scanner.nextInt();

					// Calculation of the minimum value
					differenz_new = max - min;
				}

				// Comparison with value from previous row
				if (differenz_new < differenz) {

					differenz = differenz_new;
					result_new = result;

				}

			}
		} catch (InputMismatchException e) {

			System.err.printf("Dateiformat flasch", e);
			e.getStackTrace();

		}

		return result_new;

	}

}