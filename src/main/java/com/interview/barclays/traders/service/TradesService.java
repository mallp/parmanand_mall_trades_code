package com.interview.barclays.traders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.barclays.traders.DTO.TradesDTO;
import com.interview.barclays.traders.entity.TradesEntity;
import com.interview.barclays.traders.repository.TradesRepository;
import com.interview.barclays.traders.util.DTOtoEntityConversion;

@Service
public class TradesService {

	@Autowired
	TradesRepository tradesRepository;

	@Autowired
	DTOtoEntityConversion dtotoEntityConversion;

	public TradesDTO createTrades(TradesDTO tradesDTO) {
		TradesEntity tradesEntity = tradesRepository.save(dtotoEntityConversion.getTradesEntity(tradesDTO));
		return dtotoEntityConversion.getTradesDTO(tradesEntity);
	}

}
