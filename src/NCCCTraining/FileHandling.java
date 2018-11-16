package NCCCTraining;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
	public static PrintWriter openOutputFile(String fileName) {
		try {
			return new PrintWriter(fileName);
		} catch (FileNotFoundException e) {
			return null;
		}
	}
	
	public static Scanner openInputFile(String fileName) {
		try {
			return new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			return null;
		}
	}
	
	public static int getFileSize(Scanner fin) {
		if (fin.equals(null)) {
			return -1;
		}
		int size = 0;
		while (fin.hasNextLine()) {
			size++;
			fin.nextLine();
		}
		return size;
	}

	public static ArrayList<String> copyFileToArray(Scanner fin) {
		ArrayList<String> objects = new ArrayList<String>();
		while (fin.hasNextLine()) {
			objects.add(fin.nextLine());
		}
		return objects;
	}
	
	public static void writeToFile(String fileName, ArrayList<String> objects) {
		PrintWriter fout = openOutputFile(fileName);
		if (fout.equals(null)) {
			System.out.println("Writing Failed!");
		}
		
		for (int i = 0; i < objects.size(); i++) {
			 fout.println(objects.get(i));
		}
		fout.flush();
	}
}
