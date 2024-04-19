package com.enviro.assessment.grad001.ndzalamamokoena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.enviro.assessment.grad001.ndzalamamokoena.entity.RecyclingTip;


@Repository
public interface RecyclingTipRepository extends JpaRepository<RecyclingTip, Long> {

}
