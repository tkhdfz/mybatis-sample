DROP TABLE IF EXISTS BOOK;
DROP TABLE IF EXISTS BOOKSHELF;

CREATE TABLE BOOK (
  isbn varchar(20) NOT NULL,
  title varchar(200) NOT NULL,
  author varchar(50),
  publisher varchar(50),
  PRIMARY KEY(isbn)
);

CREATE TABLE BOOKSHELF (
    shelf_id varchar(10),
    isbn varchar(20), 
    PRIMARY KEY(shelf_id, isbn)
);

INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000001', 'title1', 'author1','publisher1');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000002', 'title2', 'author2','publisher2');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000003', 'title3', 'author3','publisher3');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000004', 'title4', 'author4','publisher4');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000005', 'title5', 'author5','publisher5');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000006', 'title6', 'author6','publisher6');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000007', 'title7', 'author7','publisher7');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000008', 'title8', 'author8','publisher8');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000009', 'title9', 'author9','publisher9');
INSERT INTO BOOK  (isbn, title, author, publisher)
  VALUES ('isbn0000000010', 'title10', 'author10','publisher10');


INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000001', 'isbn0000000001');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000001', 'isbn0000000002');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000001', 'isbn0000000003');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000001', 'isbn0000000004');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000001', 'isbn0000000005');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000002', 'isbn0000000006');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000002', 'isbn0000000007');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000002', 'isbn0000000008');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000002', 'isbn0000000009');
INSERT INTO BOOKSHELF  (shelf_id, isbn)
  VALUES ('0000000002', 'isbn0000000010');

