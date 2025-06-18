CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    id_author BIGINT NOT NULL,
    CONSTRAINT fk_books_author FOREIGN KEY (id_author) REFERENCES authors(id)
);