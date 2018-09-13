package xlsParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.List;

public class Main {

	static List<String> lines;
	static int n_registros;
	static int n_registros_guardados;
	static int n_registros_erroneos;
	static int n_lineas_vacias;

	public static void main(String[] args) throws IOException {

		// Starting the time counter and registers counters
		long start = System.nanoTime();
		n_registros_guardados = 0;
		n_registros_erroneos = 0;
		n_lineas_vacias = 0;

		FileWriter fileWriter = new FileWriter("errores.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);

		// Creating a File object that represents the disk file.
		PrintStream o = new PrintStream(new File("salida.txt"));

		// Store current System.out before assigning a new value
		PrintStream console = System.out;

		// Assign o to output stream
		System.setOut(o);

		// Read all the file and store it into a list of lines
		try {
			lines = Files.readAllLines(
					Paths.get("C:\\Users\\67644682\\Downloads\\Alarmas_OMi_2018-08-01-EXTENDIDO.xls"),
					StandardCharsets.UTF_8);
		} catch (IOException e) {

			// TODO Generating error logs
			e.printStackTrace();
		}

		// Removing the two first lines and the last one (the headers and row count)
		lines.remove(0);
		lines.remove(0);

		// Iterating through the lines
		for (String i : lines) {

			// Splitting lines into columns
			String[] column = i.split(" \\|");
			if (column.length == 22) {

				// Iterate through columns
				for (int j = 0; j < column.length; j++) {

					// Removing spaces at the beginning and the end of each column
					column[j] = column[j].trim();

				}
				// Create new Row object

				Fila fila = new Fila(column[0], column[1], column[2], column[3], column[4], column[5], column[6],
						column[7], column[8], column[9], convert(column[10]), convert(column[11]), column[12],
						column[13], convert(column[14]), column[15], column[16], convert(column[17]), column[18],
						column[19], Integer.parseInt(column[20]), column[21]);

				System.out.println(fila.toString());
				// Print separator for each line
				System.out.println("");
				n_registros_guardados++;
			} else {
				if (!(i.toString().equals("")||i.toString().equals("\n")||i.toString().equals(" "))) {
					if(!i.toString().contains("rows")){
						printWriter.print(i.toString());
						n_registros_erroneos++;
					}
					else {
						n_registros=Integer.parseInt(i.toString().replaceAll("\\D+",""));
					}
				} else {
					printWriter.print(i.toString());
					n_lineas_vacias++;
				}
			}
		}

		// Set original printStream (console)
		System.setOut(console);
		printWriter.close();
		// Finishing the time counter and printing it on the console
		long elapsedTime = System.nanoTime() - start;
		System.out.println("Tiempo: " + (elapsedTime / 1000000000.0) / 60);
		System.out.println("Numero de registros: " + n_registros);
		System.out.println("Registros guardados: " + n_registros_guardados);
		System.out.println("Registros erróneos: " + n_registros_erroneos);
		System.out.println("Lineas vacias: " + n_lineas_vacias);
	}

	public static Timestamp convert(String fecha) {
		return new Timestamp(0);
	}
}
