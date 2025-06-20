CREATE TABLE publishers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    cnpj VARCHAR(20) NOT NULL,
    CONSTRAINT fk_books_publishers FOREIGN KEY (id) REFERENCES publishers(id)
);