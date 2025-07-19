-- 00001-init-setup.sql
CREATE TABLE customer (
                          id VARCHAR(255) PRIMARY KEY,           -- from BaseEntity
                          customer_type VARCHAR(255) NOT NULL,   -- from CustomerEntity
                          status VARCHAR(255),                   -- from CustomerEntity
                          created_dt TIMESTAMP,                  -- from BaseEntity
                          updated_dt TIMESTAMP,                  -- from BaseEntity
                          created_by VARCHAR(255),               -- from BaseEntity
                          updated_by VARCHAR(255)                -- from BaseEntity
);

CREATE TABLE trade (
                       id VARCHAR(255) PRIMARY KEY,            -- inherited from BaseEntity
                       customer_id VARCHAR(100),               -- explicitly mapped with @Column
                       trading_book VARCHAR(100),              -- explicitly mapped with @Column
                       status VARCHAR(50),                     -- explicitly mapped with @Column
                       trade_date TIMESTAMP,                   -- implicitly mapped by JPA
                       cancel_date TIMESTAMP,                  -- implicitly mapped by JPA
                       created_dt TIMESTAMP,                   -- inherited from BaseEntity
                       updated_dt TIMESTAMP,                   -- inherited from BaseEntity
                       created_by VARCHAR(255),                -- inherited from BaseEntity
                       updated_by VARCHAR(255)                 -- inherited from BaseEntity
);


CREATE TABLE trade_line (
                            id VARCHAR(255) PRIMARY KEY,             -- inherited from BaseEntity
                            customer_id VARCHAR(100),
                            from_currency VARCHAR(10),
                            to_currency VARCHAR(10),
                            trade_dt TIMESTAMP,
                            trade_line_dt TIMESTAMP,
                            cancel_date TIMESTAMP,
                            status VARCHAR(50),
                            created_dt TIMESTAMP,                    -- inherited from BaseEntity
                            updated_dt TIMESTAMP,                    -- inherited from BaseEntity
                            created_by VARCHAR(255),                 -- inherited from BaseEntity
                            updated_by VARCHAR(255)                  -- inherited from BaseEntity
);


