package com.jk.ref_impls.trades.intelliblotteragenticai;

import org.springframework.boot.SpringApplication;

public class TestIntelliBlotterAgenticAiApplication {

    public static void main(String[] args) {
        SpringApplication.from(IntelliBlotterAgenticAiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
