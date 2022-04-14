package com.interview.barclays.traders.util;

import org.springframework.stereotype.Component;

import com.interview.barclays.traders.DTO.TradesDTO;
import com.interview.barclays.traders.entity.TradesEntity;

import ma.glasnost.orika.MapperFacade;

@Component
public class DTOtoEntityConversion {

	MapperFacade mapper;

	public TradesEntity getTradesEntity(TradesDTO tradesDTO) {
		return mapper.map(tradesDTO, TradesEntity.class);

	}

	public TradesDTO getTradesDTO(TradesEntity tradesEntity) {
		return mapper.map(tradesEntity, TradesDTO.class);

	}

}
