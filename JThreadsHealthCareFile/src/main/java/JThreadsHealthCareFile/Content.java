package JThreadsHealthCareFile;

public class Content {
	public int id; 
	public String patientRefNumber ;
	public String lipidprofile ;
	public String lCDLevel;
	public String pCSLevel;
	public String oPDLevel ;
	public String sGTLevel ;
	public String cHLRatio ;
	public int age;
	
	public Content(int id, String patientRefNumber, String lipidprofile, String lCDLevel, String pCSLevel,
			String oPDLevel, String sGTLevel, String cHLRatio, int age) {
		super();
		this.id = id;
		this.patientRefNumber = patientRefNumber;
		this.lipidprofile = lipidprofile;
		this.lCDLevel = lCDLevel;
		this.pCSLevel = pCSLevel;
		this.oPDLevel = oPDLevel;
		this.sGTLevel = sGTLevel;
		this.cHLRatio = cHLRatio;
		this.age = age;
	} 
	
	@Override
	public String toString() {
		return "Content [id=" + id + ", patientRefNumber=" + patientRefNumber + ", lipidprofile=" + lipidprofile
				+ ", lCDLevel=" + lCDLevel + ", pCSLevel=" + pCSLevel + ", oPDLevel=" + oPDLevel + ", sGTLevel="
				+ sGTLevel + ", cHLRatio=" + cHLRatio + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientRefNumber() {
		return patientRefNumber;
	}
	public void setPatientRefNumber(String patientRefNumber) {
		this.patientRefNumber = patientRefNumber;
	}
	public String getLipidprofile() {
		return lipidprofile;
	}
	public void setLipidprofile(String lipidprofile) {
		this.lipidprofile = lipidprofile;
	}
	public String getlCDLevel() {
		return lCDLevel;
	}
	public void setlCDLevel(String lCDLevel) {
		this.lCDLevel = lCDLevel;
	}
	public String getpCSLevel() {
		return pCSLevel;
	}
	public void setpCSLevel(String pCSLevel) {
		this.pCSLevel = pCSLevel;
	}
	public String getoPDLevel() {
		return oPDLevel;
	}
	public void setoPDLevel(String oPDLevel) {
		this.oPDLevel = oPDLevel;
	}
	public String getsGTLevel() {
		return sGTLevel;
	}
	public void setsGTLevel(String sGTLevel) {
		this.sGTLevel = sGTLevel;
	}
	public String getcHLRatio() {
		return cHLRatio;
	}
	public void setcHLRatio(String cHLRatio) {
		this.cHLRatio = cHLRatio;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
