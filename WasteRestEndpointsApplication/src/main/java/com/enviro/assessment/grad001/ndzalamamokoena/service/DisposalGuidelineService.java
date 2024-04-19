package com.enviro.assessment.grad001.ndzalamamokoena.service;

import java.util.List;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.DisposalGuideline;

public interface DisposalGuidelineService {

	public DisposalGuideline saveDisposalGuideline(DisposalGuideline disposalGuideline);

	public List<DisposalGuideline> fetchGuidelineList();

	public DisposalGuideline fetchGuidelineById(Long guidelineId);

	public void deleteGuidelineById(Long guidelineId);

	public DisposalGuideline updateGuideline(Long guidelineId, DisposalGuideline disposalGuideline);

}
