package com.enviro.assessment.grad001.ndzalamamokoena.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class DisposalGuideline {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "Please enter a waste category")
	private String wasteCategory;
	private String description;
	private String disposalLocations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWasteCategory() {
		return wasteCategory;
	}

	public void setWasteCategory(String wasteCategory) {
		this.wasteCategory = wasteCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisposalLocations() {
		return disposalLocations;
	}

	public void setDisposalLocations(String disposalLocations) {
		this.disposalLocations = disposalLocations;
	}

	public DisposalGuideline(Long id, String wasteCategory, String description, String disposalLocations) {
		super();
		this.id = id;
		this.wasteCategory = wasteCategory;
		this.description = description;
		this.disposalLocations = disposalLocations;
	}

	public DisposalGuideline() {
		super();
		
	}

	@Override
	public String toString() {
		return "DisposalGuideline [id=" + id + ", wasteCategory=" + wasteCategory + ", description=" + description
				+ ", disposalLocations=" + disposalLocations + "]";
	}
	
	
	
	

}
