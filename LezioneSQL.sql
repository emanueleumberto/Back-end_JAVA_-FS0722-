/* DDL */

/* CREATE DATABASE dbtest; */
/* DROP DATABASE dbtest; */

DROP TABLE utente; /* Cancella una tabella */
DROP TABLE citta; 

CREATE TABLE IF NOT EXISTS utente (
	/* id INT8 NOT NULL, */
	id SERIAL,
	nome VARCHAR NOT NULL DEFAULT '---',
	cognome VARCHAR NOT NULL,
	citta INT8 NOT NULL,
	CONSTRAINT user_pk PRIMARY KEY (id),
	CONSTRAINT citta_fk FOREIGN KEY (citta) REFERENCES citta(id)
);

CREATE TABLE IF NOT EXISTS citta (
	id SERIAL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	provincia VARCHAR NOT NULL,
	regione VARCHAR NOT NULL
);

ALTER TABLE utente ADD cf VARCHAR NOT NULL UNIQUE;
/* ALTER TABLE utente DROP COLUMN cf; */
/* ALTER TABLE utente RENAME COLUMN citta TO city; */

TRUNCATE utente; /* Svuota il contentuto della tabella */
TRUNCATE citta cascade; /* Svuota il contentuto della tabella e delle tabelle referenziate*/

/* DML */
INSERT INTO utente( nome, cognome, citta, cf) VALUES ( 'Mario', 'Rossi', 1, 'ABC123QWE');
INSERT INTO utente( nome, cognome, citta, cf) VALUES ( 'Giuseppe', 'Verdi', 2, 'QWERTY123');
INSERT INTO utente( nome, cognome, citta, cf) VALUES ( 'Francesca', 'Neri', 1, 'POI987MNB');
INSERT INTO utente( nome, cognome, citta, cf) VALUES ( 'Antonio', 'Gialli', 3, 'POI987MNB');
INSERT INTO citta( nome, provincia, regione) VALUES ( 'Roma', 'Roma', 'Lazio');
INSERT INTO citta( nome, provincia, regione) VALUES ( 'Milano', 'Milano', 'Lombardia');
INSERT INTO citta( nome, provincia, regione) VALUES ( 'Napoli', 'Napoli', 'Campania');
INSERT INTO citta( nome, provincia, regione) VALUES ( 'Pomezia', 'Roma', 'Lazio');

UPDATE utente SET citta = 3, cf= 'FRN123SCA' WHERE id=3;

DELETE FROM utente WHERE id=2;

/* DQL */

SELECT * FROM utente;
SELECT * FROM citta;
SELECT nome, cognome FROM utente WHERE citta=1;
SELECT nome, cognome FROM utente  WHERE cf='ABC123QWE';
SELECT * FROM utente  WHERE cf LIKE '%123%';
SELECT * FROM utente  WHERE cf LIKE '%123';
SELECT * FROM utente  WHERE cf LIKE '123%';
SELECT * FROM utente  WHERE cf LIKE '_W%';
SELECT * FROM utente  WHERE cf LIKE '%W_';
SELECT nome, cognome FROM utente  WHERE citta>1;
SELECT * FROM utente INNER JOIN citta on utente.citta = citta.id;
SELECT * FROM utente LEFT JOIN citta on utente.citta = citta.id;
SELECT * FROM utente RIGHT JOIN citta on utente.citta = citta.id;
SELECT * FROM utente FULL JOIN citta on utente.citta = citta.id;
SELECT utente.id, utente.nome, cognome, cf, citta.nome, provincia, regione FROM utente INNER JOIN citta on utente.citta = citta.id;
SELECT u.id, u.nome AS nome_utente, u.cognome, u.cf, c.nome AS nome_citta, c.provincia, c.regione FROM utente AS u INNER JOIN citta AS c on u.citta = c.id;
SELECT * FROM citta ORDER BY nome DESC;
SELECT DISTINCT provincia FROM citta; 
SELECT MAX(id) FROM citta;
SELECT MIN(id) FROM citta;
SELECT AVG(id) FROM citta;
SELECT provincia, count(*) FROM citta GROUP BY provincia;
SELECT * FROM citta WHERE nome BETWEEN 'Ancona' and 'Otranto';
SELECT * FROM citta WHERE provincia IN ('Napoli', 'Roma', 'Torino');
SELECT * FROM citta WHERE provincia NOT IN ('Napoli', 'Roma', 'Torino');
SELECT * FROM utente AS u WHERE u.citta IN (SELECT id FROM citta WHERE regione = 'Lazio'); /* Roma|Pomezia */
SELECT * FROM utente AS u WHERE u.citta IN (1, 4);  