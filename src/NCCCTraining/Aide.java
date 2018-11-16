package NCCCTraining;

public class Aide implements Comparable {
	private String bDay;
	private double hoursTrained;
	private String fName;
	private String lName;
	private String mInit;
	private String dateOfHire;
	private String hoursTrainedResetDate;
	
	
	public Aide(String bDay, double hoursTrained, String fName, String lName, String mInit, String dateOfHire, String hoursTrainedResetDate) {
		this.bDay = bDay; this.hoursTrained = hoursTrained; this.fName = fName; this.lName = lName; this.mInit = mInit;
		this.dateOfHire = dateOfHire; this.hoursTrainedResetDate = hoursTrainedResetDate;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public double getHoursTrained() {
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


	public String getmInit() {
		return mInit;
	}
	
	public void setmInit(String mInit) {
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
	
	public String toString() {
		return this.bDay + ":" + this.hoursTrained + ":" + this.fName + ":" + this.lName + ":" + this.mInit + ":" + this.dateOfHire + ":" + this.hoursTrainedResetDate;
	}

	@Override
	public int compareTo(Object o) { 
		return 0;
	}
}
