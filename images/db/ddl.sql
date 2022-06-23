DROP SCHEMA IF EXISTS testdb;
CREATE SCHEMA testdb;
USE testdb;

CREATE TABLE IF NOT EXISTS account
(
  id           INT(10) NOT NULL AUTO_INCREMENT,
  name     VARCHAR(40)
  email     VARCHAR(40)
);

INSERT INTO account (name, email) VALUES ("user1", "user1@example.com");
INSERT INTO account (name, email) VALUES ("user2", "user2@example.com");