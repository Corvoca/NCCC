package NCCCTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class NCCCAideTraining {

	public static void main(String[] args) {
		ArrayList<String> fileLines = FileHandling.copyFileToArray(FileHandling.openInputFile("testFile.txt"));
		ArrayList<Aide> aides = createAideObjects(fileLines);
		String name = "testFile.txt";
		FileHandling.writeToFile(name, aides);
	}
	
	public static ArrayList<Aide> createAideObjects(ArrayList<String> fileLines) {
		ArrayList<Aide> aides = new ArrayList<Aide>();
		for (int i = 0; i < fileLines.size(); i++) {
			String[] temp = fileLines.get(i).toString().split(":");
			aides.add(new Aide(temp[0], Double.parseDouble(temp[1]), temp[2], temp[3], temp[4], temp[5], temp[6]));
		}
		return aides;
	}
	
	public static String getInput(String phrase, Scanner kb) {
		System.out.println(phrase);
		return kb.nextLine();
	}
	
	public static Aide createAide() {
		Scanner kb = new Scanner(System.in);
		String fName = getInput("Please enter the Aides First Name: ", kb);
	}
}
