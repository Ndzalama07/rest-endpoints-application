package com.enviro.assessment.grad001.ndzalamamokoena.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enviro.assessment.grad001.ndzalamamokoena.entity.RecyclingTip;
import com.enviro.assessment.grad001.ndzalamamokoena.repository.RecyclingTipRepository;

@Service
public class RecyclingTipServiceImpl implements RecyclingTipService {
    @Autowired
    private RecyclingTipRepository recyclingTipRepository;

    @Override
    public RecyclingTip saveRecyclingTip(RecyclingTip recyclingTip) {
        return recyclingTipRepository.save(recyclingTip);
    }

    @Override
    public List<RecyclingTip> fetchRecyclingTipList() {
        return recyclingTipRepository.findAll();
    }

    @Override
    public RecyclingTip fetchRecyclingTipById(Long recyclingTipId) {
        return recyclingTipRepository.findById(recyclingTipId).orElse(null);
    }

    @Override
    public void deleteRecyclingTipById(Long recyclingTipId) {
        recyclingTipRepository.deleteById(recyclingTipId);
    }

    @Override
    public RecyclingTip updateRecyclingTip(Long recyclingTipId, RecyclingTip recyclingTip) {
        RecyclingTip recyclingTipDB = recyclingTipRepository.findById(recyclingTipId).orElse(null);
        if (Objects.nonNull(recyclingTipDB)) {
            if (Objects.nonNull(recyclingTip.getDescription())) {
                recyclingTipDB.setDescription(recyclingTip.getDescription());
            }
            // Similarly, update other attributes as needed
            return recyclingTipRepository.save(recyclingTipDB);
        }
        return null; // RecyclingTip not found
    }
}
