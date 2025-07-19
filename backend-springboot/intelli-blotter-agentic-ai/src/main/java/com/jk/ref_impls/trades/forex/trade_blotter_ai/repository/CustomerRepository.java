package com.jk.ref_impls.trades.forex.trade_blotter_ai.repository;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {
}
