package JThreadsHealthCareFile;

import java.util.Date;

public class Header {
	public Date dateTime;
	public String region; 
	public String clinicType ;
	public String numberofRecords ;
	public String fileSequence;
	
	
	public Header(Date dateTime, String region, String clinicType, String numberofRecords, String fileSequence) {
		super();
		this.dateTime = dateTime;
		this.region = region;
		this.clinicType = clinicType;
		this.numberofRecords = numberofRecords;
		this.fileSequence = fileSequence;
	}
	
	@Override
	public String toString() {
		return "Header [dateTime=" + dateTime + ", region=" + region + ", clinicType=" + clinicType
				+ ", numberofRecords=" + numberofRecords + ", fileSequence=" + fileSequence + "]";
	}

	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getClinicType() {
		return clinicType;
	}
	public void setClinicType(String clinicType) {
		this.clinicType = clinicType;
	}
	public String getNumberofRecords() {
		return numberofRecords;
	}
	public void setNumberofRecords(String numberofRecords) {
		this.numberofRecords = numberofRecords;
	}
	public String getFileSequence() {
		return fileSequence;
	}
	public void setFileSequence(String fileSequence) {
		this.fileSequence = fileSequence;
	}
	
}
