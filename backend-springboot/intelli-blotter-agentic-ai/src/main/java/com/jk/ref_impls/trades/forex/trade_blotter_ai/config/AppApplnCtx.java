package com.jk.ref_impls.trades.forex.trade_blotter_ai.config;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
public class AppApplnCtx implements ApplicationContextAware {

    private static AppApplnCtx instance;
    private ApplicationContext appCtx;

    @Override
    public void setApplicationContext(ApplicationContext appCtx) throws BeansException {
        this.appCtx = appCtx;
    }

    @PostConstruct
    public void setup() {
        instance = this;
    }

    public static AppApplnCtx getInstance() {
        return instance;
    }


}
