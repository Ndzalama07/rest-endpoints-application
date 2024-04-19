package com.enviro.assessment.grad001.ndzalamamokoena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.DisposalGuideline;
import com.enviro.assessment.grad001.ndzalamamokoena.service.DisposalGuidelineService;

import jakarta.validation.Valid;


@RestController
public class DisposalGuidelineController {
	@Autowired
	private DisposalGuidelineService disposalGuidelineService;
	@PostMapping("/guidelines")
	public DisposalGuideline saveDisposalGuideline(@Valid @RequestBody DisposalGuideline disposalGuideline) {
		return disposalGuidelineService.saveDisposalGuideline(disposalGuideline);
	}
	
	@GetMapping("/guidelines")
	public List<DisposalGuideline> fetchGuidelineList(){
		return disposalGuidelineService.fetchGuidelineList();
	}
	
	@GetMapping("/guidelines/{id}")
	public DisposalGuideline fetchGuidelineById(@PathVariable("id") Long guidelineId) {
		return disposalGuidelineService.fetchGuidelineById(guidelineId);
	}
	
	@DeleteMapping("/guidelines/{id}")
	public String deleteGuidelinetById(@PathVariable("id") Long guidelineId) {
		disposalGuidelineService.deleteGuidelineById(guidelineId);
		return "Deleted Successfully!";
	}
	
	@PutMapping("/guidelines/{id}")
	public DisposalGuideline updateDepartment(@PathVariable("id") Long guidelineId, @RequestBody DisposalGuideline disposalGuideline) {
	    return disposalGuidelineService.updateGuideline(guidelineId, disposalGuideline);
	}
}
