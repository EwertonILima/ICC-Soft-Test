INSERT INTO tb_stock (id) VALUES ('PETR3');
INSERT INTO tb_stock (id) VALUES ('PETR4');

INSERT INTO tb_quote (date, value, stock_id) VALUES (CURDATE(), 33.15,'PETR3');
INSERT INTO tb_quote (date, value, stock_id)  VALUES (CURDATE(), 22.08, 'PETR3');
