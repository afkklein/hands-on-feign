CREATE TABLE autor (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

INSERT INTO autor (name) values
('Fernando Pessoa'),
('William Shakespeare'),
('Augusto Cury'),
('Platão');