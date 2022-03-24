package com.cars.app.service;

import java.util.List;

import com.cars.app.service.dto.DealerDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("dealerapp")
public interface DealerService {
    @RequestMapping(method = RequestMethod.GET, value = "/api/dealers")
    ResponseEntity<List<DealerDTO>> getDealers();
}