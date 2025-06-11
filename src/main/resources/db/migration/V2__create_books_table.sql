ALTER TABLE books ADD COLUMN id_author BIGINT;

ALTER TABLE books
ADD CONSTRAINT fk_books_author
FOREIGN KEY (id_author)
REFERENCES author(id);
