INSERT INTO STOCKS (TICKER, TYPE, QTY, PRICE, POSITION, MU, SIGMA) VALUES
                                               ('AAPL', 'EQ', 10, 20.67, 1, 0.34 , 0.14),
                                               ('TSLA', 'EQ', 90, 200, 1, 0.14 , 0.64);

INSERT INTO "OPTIONS" (TICKER, TYPE, QTY, PRICE, POSITION, TTM, STRIKE_PRICE, SIGMA) VALUES
                                               ('AAPLCE202225', 'CE', '1000', '2.67', '1', '1', '1100', '0.55'),
                                               ('AAPLPE202225', 'PE', '5000', '1.67', '1', '0.8', '5100', '0.14');

