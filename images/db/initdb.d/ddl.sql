CREATE TABLE account(
  id SERIAL NOT NULL, 
  name VARCHAR(20) NOT NULL, 
  email VARCHAR(255) NOT NULL,
  PRIMARY KEY(id) 
)
;

INSERT INTO account (name, email) VALUES ('user1', 'user1@example.com');
INSERT INTO account (name, email) VALUES ('user2', 'user2@example.com');