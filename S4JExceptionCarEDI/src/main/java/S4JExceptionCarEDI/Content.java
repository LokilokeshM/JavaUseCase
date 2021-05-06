package S4JExceptionCarEDI;

import java.util.Date;

public class Content {
	public String Category ;	
	public String SKU ;
	public Date DateofManufacturer;
	public String ISFragile ;	
	public String ModelNumber;
	public String Color;
	public Float CostStep;

	public Content( String category, String sKU, Date dateofManufacturer, String iSFragile, String modelNumber,
			String color, Float costStep) {
		super();
		
		Category = category;
		SKU = sKU;
		DateofManufacturer = dateofManufacturer;
		ISFragile = iSFragile;
		ModelNumber = modelNumber;
		Color = color;
		CostStep = costStep;
	}
	
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public Date getDateofManufacturer() {
		return DateofManufacturer;
	}
	public void setDateofManufacturer(Date dateofManufacturer) {
		DateofManufacturer = dateofManufacturer;
	}
	public String getISFragile() {
		return ISFragile;
	}
	public void setISFragile(String iSFragile) {
		ISFragile = iSFragile;
	}
	public String getModelNumber() {
		return ModelNumber;
	}
	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Float getCostStep() {
		return CostStep;
	}
	public void setCostStep(Float costStep) {
		CostStep = costStep;
	}
	@Override
	public String toString() {
		return "Header [ Category=" + Category + ", SKU=" + SKU + ", DateofManufacturer="
				+ DateofManufacturer + ", ISFragile=" + ISFragile + ", ModelNumber=" + ModelNumber + ", Color=" + Color
				+ ", CostStep=" + CostStep + "]";
	}
	

}
