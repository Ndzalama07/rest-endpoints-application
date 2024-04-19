package com.enviro.assessment.grad001.ndzalamamokoena.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.DisposalGuideline;
import com.enviro.assessment.grad001.ndzalamamokoena.repository.DisposalGuidelineRepository;

@Service
public class DisposalGuidelineServiceImpl implements DisposalGuidelineService {
	@Autowired
	private DisposalGuidelineRepository disposalRepository;

	@Override
	public DisposalGuideline saveDisposalGuideline(DisposalGuideline disposalGuideline) {
		return disposalRepository.save(disposalGuideline);
	}

	@Override
	public List<DisposalGuideline> fetchGuidelineList() {
		return disposalRepository.findAll();
	}

	@Override
	public DisposalGuideline fetchGuidelineById(Long guidelineId) {
		return disposalRepository.findById(guidelineId).get();
	}

	@Override
	public void deleteGuidelineById(Long guidelineId) {
		disposalRepository.deleteById(guidelineId);

	}

	@Override
	public DisposalGuideline updateGuideline(Long guidelineId, DisposalGuideline disposalGuideline) {
		// we check if that particular record exists in the databse using its id
		// we check if its not null or blank, set the value otherwise skip it
		// if its null or blank we skip coz we cannot update something that does not
		// exist
		DisposalGuideline depDB = disposalRepository.findById(guidelineId).get();
		if (Objects.nonNull(disposalGuideline.getWasteCategory())
				&& !"".equalsIgnoreCase(disposalGuideline.getWasteCategory())) {
			depDB.setWasteCategory(disposalGuideline.getWasteCategory());
		}

		if (Objects.nonNull(disposalGuideline.getDescription())
				&& !"".equalsIgnoreCase(disposalGuideline.getDescription())) {
			depDB.setDescription(disposalGuideline.getDescription());
		}

		if (Objects.nonNull(disposalGuideline.getDisposalLocations())
				&& !"".equalsIgnoreCase(disposalGuideline.getDisposalLocations())) {
			depDB.setDisposalLocations(disposalGuideline.getDisposalLocations());
		}
		return disposalRepository.save(depDB);

	}

}
