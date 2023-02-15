DROP TABLE Credenziali;
DROP TABLE Post;
DROP TABLE Appartiene;
DROP TABLE Gruppo;
DROP TABLE Utente;

CREATE TYPE permessi AS ENUM ('admin', 'user', 'editor');

CREATE TABLE IF NOT EXISTS Utente (
    id_utente serial NOT NULL PRIMARY KEY,
    nome_utente character varying NOT NULL,
    cognome_utente character varying NOT NULL,
    citta_utente character varying
);

-- Relazione uno a uno con tab utente
/*CREATE TABLE IF NOT EXISTS Credenziali (
    id_credenziali serial NOT NULL PRIMARY KEY,
    email character varying NOT NULL UNIQUE,
    password character varying NOT NULL,
	id_utente integer NOT NULL UNIQUE,
	CONSTRAINT credenziali_utente_FK 
	FOREIGN KEY (id_utente) REFERENCES Utente(id_utente)
);*/

CREATE TABLE IF NOT EXISTS Credenziali (
    id_credenziali serial NOT NULL PRIMARY KEY,
    email character varying NOT NULL UNIQUE,
    password character varying NOT NULL,
	CONSTRAINT credenziali_utente_FK 
	FOREIGN KEY (id_credenziali) REFERENCES Utente(id_utente)
);

-- Relazione molti a uno con tab utente
CREATE TABLE IF NOT EXISTS Post (
    id_post serial NOT NULL PRIMARY KEY,
    testo_post character varying NOT NULL,
    data_post timestamp with time zone NOT NULL DEFAULT 'NOW()',
    id_utente integer NOT NULL,
    CONSTRAINT post_utenti_FK 
	FOREIGN KEY (id_utente) REFERENCES Utente(id_utente)
);

-- Relazione molti a molti con tab utente tramite la tab appartiene
CREATE TABLE IF NOT EXISTS Gruppo (
    id_gruppo serial NOT NULL PRIMARY KEY,
    nome_gruppo character varying NOT NULL UNIQUE
);



-- Tabella di mezzo nella Relazione molti a molti con tab utente e tab gruppo
/*CREATE TABLE IF NOT EXISTS Appartiene (
    id_utente integer NOT NULL,
    id_gruppo integer NOT NULL,
	permesso permessi DEFAULT 'user',
	PRIMARY KEY (id_utente, id_gruppo),
    CONSTRAINT appartiene_utente_FK FOREIGN KEY (id_utente) REFERENCES Utente (id_utente),
    CONSTRAINT appartiene_gruppo_FK FOREIGN KEY (id_gruppo) REFERENCES Gruppo (id_gruppo) 
);*/

CREATE TABLE IF NOT EXISTS Appartiene (
    id_utente integer NOT NULL,
    id_gruppo integer NOT NULL,
    CONSTRAINT appartiene_utente_FK FOREIGN KEY (id_utente) REFERENCES Utente (id_utente),
    CONSTRAINT appartiene_gruppo_FK FOREIGN KEY (id_gruppo) REFERENCES Gruppo (id_gruppo) 
);



