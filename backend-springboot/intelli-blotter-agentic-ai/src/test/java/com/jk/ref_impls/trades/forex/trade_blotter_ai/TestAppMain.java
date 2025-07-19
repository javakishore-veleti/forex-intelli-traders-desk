package com.jk.ref_impls.trades.forex.trade_blotter_ai;

import org.springframework.boot.SpringApplication;

public class TestAppMain {

    public static void main(String[] args) {
        SpringApplication.from(AppMain::main).with(TestcontainersConfiguration.class).run(args);
    }

}
