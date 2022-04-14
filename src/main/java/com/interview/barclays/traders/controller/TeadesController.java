package com.interview.barclays.traders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.barclays.traders.DTO.TradesDTO;
import com.interview.barclays.traders.service.TradesService;

@RestController
@RequestMapping("/trades")
public class TeadesController {

	@Autowired
	TradesService tradesService;

	@PostMapping
	@RequestMapping("/save")
	public TradesDTO createTrades(@RequestParam TradesDTO tradesDTO) {

		return tradesService.createTrades(tradesDTO);

	}

}
