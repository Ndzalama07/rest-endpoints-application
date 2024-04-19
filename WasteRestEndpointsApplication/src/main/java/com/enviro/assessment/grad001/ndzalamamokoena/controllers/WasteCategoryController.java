package com.enviro.assessment.grad001.ndzalamamokoena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.WasteCategory;
import com.enviro.assessment.grad001.ndzalamamokoena.service.WasteCategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/waste-categories")
public class WasteCategoryController {

    @Autowired
    private WasteCategoryService wasteCategoryService;

    @PostMapping
    public WasteCategory saveWasteCategory(@Valid @RequestBody WasteCategory wasteCategory) {
        return wasteCategoryService.saveWasteCategory(wasteCategory);
    }

    @GetMapping
    public List<WasteCategory> fetchWasteCategoryList() {
        return wasteCategoryService.fetchWasteCategoryList();
    }

    @GetMapping("/{id}")
    public WasteCategory fetchWasteCategoryById(@PathVariable("id") Long wasteCategoryId) {
        return wasteCategoryService.fetchWasteCategoryById(wasteCategoryId);
    }

    @DeleteMapping("/{id}")
    public String deleteWasteCategoryById(@PathVariable("id") Long wasteCategoryId) {
        wasteCategoryService.deleteWasteCategoryById(wasteCategoryId);
        return "Deleted Successfully!";
    }

    @PutMapping("/{id}")
    public WasteCategory updateWasteCategory(@PathVariable("id") Long wasteCategoryId, @RequestBody WasteCategory wasteCategory) {
        return wasteCategoryService.updateWasteCategory(wasteCategoryId, wasteCategory);
    }
}
