package com.enviro.assessment.grad001.ndzalamamokoena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.RecyclingTip;
import com.enviro.assessment.grad001.ndzalamamokoena.service.RecyclingTipService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/recycling-tips")
public class RecyclingTipController {

    @Autowired
    private RecyclingTipService recyclingTipService;

    @PostMapping
    public RecyclingTip saveRecyclingTip(@Valid @RequestBody RecyclingTip recyclingTip) {
        return recyclingTipService.saveRecyclingTip(recyclingTip);
    }

    @GetMapping
    public List<RecyclingTip> fetchRecyclingTipList() {
        return recyclingTipService.fetchRecyclingTipList();
    }

    @GetMapping("/{id}")
    public RecyclingTip fetchRecyclingTipById(@PathVariable("id") Long recyclingTipId) {
        return recyclingTipService.fetchRecyclingTipById(recyclingTipId);
    }

    @DeleteMapping("/{id}")
    public String deleteRecyclingTipById(@PathVariable("id") Long recyclingTipId) {
        recyclingTipService.deleteRecyclingTipById(recyclingTipId);
        return "Deleted Successfully!";
    }

    @PutMapping("/{id}")
    public RecyclingTip updateRecyclingTip(@PathVariable("id") Long recyclingTipId, @RequestBody RecyclingTip recyclingTip) {
        return recyclingTipService.updateRecyclingTip(recyclingTipId, recyclingTip);
    }
}
