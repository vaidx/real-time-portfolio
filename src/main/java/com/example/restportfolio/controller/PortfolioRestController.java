package com.example.restportfolio.controller;

import com.example.restportfolio.model.Options;
import com.example.restportfolio.model.Stocks;
import com.example.restportfolio.repository.OptionsRepository;
import com.example.restportfolio.repository.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
public class PortfolioRestController {

    @Autowired
    StocksRepository stRepo;
    @Autowired
    OptionsRepository osRepo;

    @RequestMapping("/stocks")
    @ResponseBody
    public Flux<Stocks> viewStocks() {
        return stRepo.findAll();
    }

    @RequestMapping("/options")
    @ResponseBody
    public Flux<Options> viewOptions() {
        return osRepo.findAll();
    }

//    // See https://zetcode.com/springboot/text/
//    @RequestMapping("/portfolio")
//    @ResponseBody
//    public Flux<Options> portfolioDisplay() {
//        return oRepo.findAll();
//    }

//    @RequestMapping("/stock/transaction")
//    @GetMapping(produces = MediaType.APPLICATION_NDJSON_VALUE)
//    public Flux<StocksService> priceUpdationEvents() {
//        return spu.calculateUpdatedPrice();
//    }

//    Random r = new Random();
//    private int rangeMin = 500;
//    private int rangeMax = 2000;
//    long interval = r.nextInt(rangeMax - rangeMin) + rangeMin;
//    @GetMapping(value = "/stocks", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<ServerSentEvent<Collection<Stock>>> liveStockChanges() {
//        return Flux.interval(Duration.ofMillis(interval))
//                .map(sec -> sec == 0 ? stocksDatabase.values() : getUpdatedStocks())
//                .map(stocks -> ServerSentEvent.<Collection<Stock>> builder()
//                        .event("stock-changed")
//                        .data(stocks)
//                        .build());
//    }
//
//    private List<Stock> getUpdatedStocks() {
//        LinkedList<Stock> updatedStocks = new LinkedList<>();
//        stocksDatabase.values()
//                .stream()
//                .filter(stock -> stock.getLastUpdated() > System.currentTimeMillis() - 1000)
//                .forEach(stock -> updatedStocks.add(stock));
//        return updatedStocks;
//    }
//
//    @PutMapping("/stocks")
//    public void updateStocks(@RequestBody List<Stock> stocks) {
//        stocks.forEach(stock -> {
//            stocksDatabase.put(stock.getSymbol(), stock);
//            stock.setLastUpdated(System.currentTimeMillis());
//        });
//        logger.info("Stocks updated.");
//    }




}
