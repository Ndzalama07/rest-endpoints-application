package com.enviro.assessment.grad001.ndzalamamokoena.service;

import java.util.List;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.RecyclingTip;

public interface RecyclingTipService {

	public RecyclingTip saveRecyclingTip(RecyclingTip recyclingTip);

	public List<RecyclingTip> fetchRecyclingTipList();

	public RecyclingTip fetchRecyclingTipById(Long recyclingTipId);

	public void deleteRecyclingTipById(Long recyclingTipId);

	public RecyclingTip updateRecyclingTip(Long recyclingTipId, RecyclingTip recyclingTip);

}
