package NCCCTraining;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class NCCCAideTraining {

	public static void main(String[] args) {
		ArrayList<String> fileLines = FileHandling.copyFileToArray(FileHandling.openInputFile("testFile.txt"));
		ArrayList<Aide> aides = createAideObjects(fileLines);
	}
	
	public static ArrayList<Aide> createAideObjects(ArrayList<String> fileLines) {
		ArrayList<Aide> aides = new ArrayList<Aide>();
		for (int i = 0; i < fileLines.size(); i++) {
			String[] temp = fileLines.get(i).toString().split(":");
			aides.add(new Aide(temp[0], Double.parseDouble(temp[1]), temp[2], temp[3], temp[4], temp[5]));
		}
		return aides;
	}
	
	public static String getInput(String phrase, Scanner kb) {
		System.out.print(phrase);
		return kb.nextLine();
	}
	
	public static double getDouble(String phrase, Scanner kb) {
		System.out.print(phrase);
		try {
			double dub = kb.nextDouble();
			kb.nextLine();
			return dub;
		}
		catch (Exception e) {
			System.out.println("Invalid Number! Set to 0");
			return 0D;
		}
	}
	
	public static Calendar getCal(String date) {
		String[] sDate = date.split("/");
		try {
			Calendar cal = Calendar.getInstance();
			cal.set(Integer.parseInt(sDate[2]), Integer.parseInt(sDate[0]) - 1, Integer.parseInt(sDate[1]));
			return cal;
		}
		catch (Exception e) {
			System.out.println("Invalid date! Set to January 1st 1970");
			Calendar cal = Calendar.getInstance();
			cal.set(1970, 0, 1);
			return cal;
		}
	}
	
	public static Calendar getReset(Calendar doh) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		if (doh.get(Calendar.MONTH) + 1 == month) {
			if (doh.get(Calendar.DAY_OF_MONTH) >= day) {
				Calendar cal = Calendar.getInstance();
				cal.set(year + 1, doh.get(Calendar.MONTH), doh.get(Calendar.DAY_OF_MONTH));
				return cal;
			}
		}
		else if (doh.get(Calendar.MONTH) + 1 < month) {
			Calendar cal = Calendar.getInstance();
			cal.set(year + 1, doh.get(Calendar.MONTH), doh.get(Calendar.DAY_OF_MONTH));
			return cal;
		}
		Calendar cal = Calendar.getInstance();
		cal.set(year, doh.get(Calendar.MONTH), doh.get(Calendar.DAY_OF_MONTH));
		return cal;
	}
	
	public static Aide createAide() {
		Scanner kb = new Scanner(System.in);
		String fName = getInput("Please enter the Employee's First Name: ", kb);
		String lName = getInput("Please enter the Employee's Last Name: ", kb);
		double hoursTrained = getDouble("Please enter the Employee's current hours trained (Defaults to 0): ", kb);
		String bDay = getInput("Please enter the Employee's Birth Date (mm/dd/yyyy): ", kb);
		String dateOfHire = getInput("Please enter the Employee's Date of Hire (mm/dd/yyyy): ", kb);
		Calendar doh = getCal(dateOfHire);
		Calendar resetDate = getReset(doh);
		String rDate = (resetDate.get(Calendar.MONTH) + 1) + "/" + resetDate.get(Calendar.DAY_OF_MONTH) + "/" + resetDate.get(Calendar.YEAR);
		return new Aide(bDay, hoursTrained, fName, lName, dateOfHire, rDate);
	}

}
