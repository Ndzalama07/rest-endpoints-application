package com.enviro.assessment.grad001.ndzalamamokoena.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.WasteCategory;
import com.enviro.assessment.grad001.ndzalamamokoena.repository.WasteCategoryRepository;

@Service
public class WasteCategoryServiceImpl implements WasteCategoryService {
    @Autowired
    private WasteCategoryRepository wasteCategoryRepository;

    @Override
    public WasteCategory saveWasteCategory(WasteCategory wasteCategory) {
        return wasteCategoryRepository.save(wasteCategory);
    }

    @Override
    public List<WasteCategory> fetchWasteCategoryList() {
        return wasteCategoryRepository.findAll();
    }

    @Override
    public WasteCategory fetchWasteCategoryById(Long wasteCategoryId) {
        return wasteCategoryRepository.findById(wasteCategoryId).orElse(null);
    }

    @Override
    public void deleteWasteCategoryById(Long wasteCategoryId) {
        wasteCategoryRepository.deleteById(wasteCategoryId);
    }

    @Override
    public WasteCategory updateWasteCategory(Long wasteCategoryId, WasteCategory wasteCategory) {
        WasteCategory wasteCategoryDB = wasteCategoryRepository.findById(wasteCategoryId).orElse(null);
        if (Objects.nonNull(wasteCategoryDB)) {
            if (Objects.nonNull(wasteCategory.getName())) {
                wasteCategoryDB.setName(wasteCategory.getName());
            }
            // Similarly, update other attributes as needed
            return wasteCategoryRepository.save(wasteCategoryDB);
        }
        return null; // WasteCategory not found
    }
}
