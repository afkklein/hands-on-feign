CREATE TABLE livro (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    id_autor BIGINT(20) NOT NULL,
    FOREIGN KEY (id_autor) REFERENCES autor(id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

INSERT INTO livro (title, id_autor) values
('Mensagem', 1), ('Ficções de interlúdio', 1),
('Hamlet', 2), ('Romeu e Julieta', 2),
('O Vendedor de Sonhos', 3), ('Pais Brilhantes, Professores Fascinantes', 3),
('A República', 4), ('As Leis', 4);