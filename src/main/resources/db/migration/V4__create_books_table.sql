ALTER TABLE books ADD COLUMN id_publisher BIGINT;
ALTER TABLE books ADD CONSTRAINT fk_books_publisher FOREIGN KEY (id_publisher) REFERENCES publishers(id);
