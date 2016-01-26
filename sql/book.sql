DROP TABLE IF EXISTS BOOK;

CREATE TABLE BOOK (
  isbn varchar(20) NOT NULL,
  title varchar(200) NOT NULL,
  author varchar(50),
  publisher varchar(50),
  PRIMARY KEY(isbn)
);

--
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000001', 'title1', 'author1','publisher1');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000002', 'title2', 'author2','publisher2');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000003', 'title3', 'author3','publisher3');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000004', 'title4', 'author4','publisher4');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000005', 'title5', 'author5','publisher5');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000006', 'title6', 'author6','publisher6');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000007', 'title7', 'author7','publisher7');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000008', 'title8', 'author8','publisher8');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000009', 'title9', 'author9','publisher9');
--INSERT INTO BOOK  (isbn, title, author, publisher)
--  VALUES ('isbn0000000010', 'title10', 'author10','publisher10');

