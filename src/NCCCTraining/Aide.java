package NCCCTraining;

public class Aide {
	private String bDay;
	private long hoursTrained;
	private String fName;
	private String lName;
	private char mInit;
	private String dateOfHire;
	private String hoursTrainedResetDate;
	
	
	public Aide(String bDay, long hoursTrained, String fName, String lName, char mInit, String dateOfHire, String hoursTrainedResetDate) {
		this.bDay = bDay; this.hoursTrained = hoursTrained; this.fName = fName; this.lName = lName; this.mInit = mInit;
		this.dateOfHire = dateOfHire; this.hoursTrainedResetDate = hoursTrainedResetDate;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public long getHoursTrained() {
		return hoursTrained;
	}

	public void setHoursTrained(long hoursTrained) {
		this.hoursTrained = hoursTrained;
	}

	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}


	public char getmInit() {
		return mInit;
	}
	
	public void setmInit(char mInit) {
		this.mInit = mInit;
	}

	public String getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public String getHoursTrainedResetDate() {
		return hoursTrainedResetDate;
	}

	public void setHoursTrainedResetDate(String hoursTrainedResetDate) {
		this.hoursTrainedResetDate = hoursTrainedResetDate;
	}
}
