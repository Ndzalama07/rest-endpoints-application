package com.enviro.assessment.grad001.ndzalamamokoena.service;

import java.util.List;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.WasteCategory;

public interface WasteCategoryService {

	public WasteCategory saveWasteCategory(WasteCategory wasteCategory);

	public List<WasteCategory> fetchWasteCategoryList();

	public WasteCategory fetchWasteCategoryById(Long wasteCategoryId);

	public void deleteWasteCategoryById(Long wasteCategoryId);

	public WasteCategory updateWasteCategory(Long wasteCategoryId, WasteCategory wasteCategory);

}
