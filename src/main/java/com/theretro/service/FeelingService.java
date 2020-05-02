package com.theretro.service;

import com.theretro.repository.IFeelingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FeelingService implements IFeelingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeelingService.class);
    private IFeelingRepository feelingRepository;

    @Autowired
    public FeelingService(IFeelingRepository feelingRepository){
        this.feelingRepository = feelingRepository;
    }
}
