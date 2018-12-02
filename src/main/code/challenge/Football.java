package challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Football {

	@SuppressWarnings("resource")
	public static String footballteam() throws FileNotFoundException {

		// Declare variables
		String team = "";
		String team_new;
		int max, min;
		int differenz_new;
		int differenz = 1000;

		// Load CSV File
		String csvFile = "./src/main/resources/de/exxcellent/challenge/football.csv";

		// Assign a scanner to the file
		Scanner scannerLine = new Scanner(new File(csvFile));

		// Ignore header
		scannerLine.nextLine();

		// Scan of the rows
		while (scannerLine.hasNextLine()) {

			// Scan of the columns (first three columns)
			Scanner scanner = new Scanner(scannerLine.nextLine()).useDelimiter(",");

			team_new = scanner.next();
			scanner.nextInt();
			scanner.nextInt();
			scanner.nextInt();
			scanner.nextInt();
			max = scanner.nextInt();
			min = scanner.nextInt();

			// Calculation of the absolute value (min)
			differenz_new = Math.abs(max - min);

			// Comparison with value from previous row
			if (differenz_new < differenz) {

				differenz = differenz_new;
				team = team_new;

			}

		}

		// Return
		return team;

	}

}
