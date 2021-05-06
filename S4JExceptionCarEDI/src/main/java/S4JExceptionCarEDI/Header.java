package S4JExceptionCarEDI;

import java.util.Date;

public class Header {
	public Date dateTime ;
	public String manufacturerName;	
	public int numberofRecords;	
	public String fileSequence;	
	public int 	total ;
	
	public Header(Date dateTime, String manufacturerName, int numberofRecords, String fileSequence, int total) {
		super();
		this.dateTime = dateTime;
		this.manufacturerName = manufacturerName;
		this.numberofRecords = numberofRecords;
		this.fileSequence = fileSequence;
		this.total = total;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public int getNumberofRecords() {
		return numberofRecords;
	}
	public void setNumberofRecords(int numberofRecords) {
		this.numberofRecords = numberofRecords;
	}
	public String getFileSequence() {
		return fileSequence;
	}
	public void setFileSequence(String fileSequence) {
		this.fileSequence = fileSequence;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Header [dateTime=" + dateTime + ", manufacturerName=" + manufacturerName + ", numberofRecords="
				+ numberofRecords + ", fileSequence=" + fileSequence + ", total=" + total + "]";
	}
	
	
	
	
}
