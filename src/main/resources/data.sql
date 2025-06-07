TRUNCATE TABLE PRODUCT RESTART IDENTITY CASCADE;

INSERT INTO PRODUCT (id, name, status) VALUES
                                           (1, 'TV', true),
                                           (2, 'CELULAR', false),
                                           (3, 'TECLADO', true),
                                           (4, 'MOUSE', false),
                                           (5, 'ZAPATO', true);