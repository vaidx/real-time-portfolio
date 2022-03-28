package com.example.restportfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
public class PortfolioRestController {

    @Autowired
    StocksRepository stRepo;
//    OptionsRepository oRepo;
//  StocksService spu;

    @RequestMapping("/stocks")
    @ResponseBody
    public Flux<Stocks> viewStocks() {
        return stRepo.findAll();
    }

    @RequestMapping("/options")
    @ResponseBody
    public Flux<Options> viewOptions() {
        return oRepo.findAll();
    }

//    @RequestMapping("/stock/transaction")
//    @GetMapping(produces = MediaType.APPLICATION_NDJSON_VALUE)
//    public Flux<StocksService> priceUpdationEvents() {
//        return spu.calculateUpdatedPrice();
//    }



}
