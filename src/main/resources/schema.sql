DROP TABLE IF EXISTS personagem;

CREATE TABLE personagem (
   id INT AUTO_INCREMENT,
   nome VARCHAR(255) NOT NULL,
   nivel INT NOT NULL,
   raca VARCHAR(255),
   classe VARCHAR(255),
   CONSTRAINT pk_personagem PRIMARY KEY (id)
);
