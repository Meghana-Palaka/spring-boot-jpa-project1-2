package com.edubridge.app2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flower {
	@Id
	private Integer flowerId;
	private String flowerName;
	private String flowerColor;
	private String flowerCountry;
	private String flowerSymbolism;
	public Flower(Integer flowerId, String flowerName, String flowerColor, String flowerCountry,
			String flowerSymbolism) {
		super();
		this.flowerId = flowerId;
		this.flowerName = flowerName;
		this.flowerColor = flowerColor;
		this.flowerCountry = flowerCountry;
		this.flowerSymbolism = flowerSymbolism;
	}
	public Flower() {
		super();
	}
	public Integer getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(Integer flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	public String getFlowerCountry() {
		return flowerCountry;
	}
	public void setFlowerCountry(String flowerCountry) {
		this.flowerCountry = flowerCountry;
	}
	public String getFlowerSymbolism() {
		return flowerSymbolism;
	}
	public void setFlowerSymbolism(String flowerSymbolism) {
		this.flowerSymbolism = flowerSymbolism;
	}
	@Override
	public String toString() {
		return "Flower [flowerId=" + flowerId + ", flowerName=" + flowerName + ", flowerColor=" + flowerColor
				+ ", flowerCountry=" + flowerCountry + ", flowerSymbolism=" + flowerSymbolism + "]";
	}
	
	

}
