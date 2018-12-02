package challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Weatherdata {

	@SuppressWarnings("resource")
	public static String weatherdata() throws FileNotFoundException {

		// Declare variables
		int day_small = 0, max, min, day;
		int differenz_new;
		int differenz = 1000;
		String result;

		// Load CSV File
		String csvFile = "./src/main/resources/de/exxcellent/challenge/weather.csv";

		// Assign a scanner to the file
		Scanner scannerLine = new Scanner(new File(csvFile));

		// Ignore header
		scannerLine.nextLine();

		// Scan of the rows
		while (scannerLine.hasNextLine()) {

			// Scan of the columns (first three columns)
			Scanner scanner = new Scanner(scannerLine.nextLine()).useDelimiter(",");

			day = scanner.nextInt();
			max = scanner.nextInt();
			min = scanner.nextInt();

			// Calculation of the minimum value
			differenz_new = max - min;

			// Comparison with value from previous row
			if (differenz_new < differenz) {

				differenz = differenz_new;
				day_small = day;

			}

		}

		// Transform int to string
		result = Integer.toString(day_small);

		// Return
		return result;

	}

}