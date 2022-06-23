DROP SCHEMA IF EXISTS testdb;
CREATE SCHEMA testdb;
USE testdb;

CREATE TABLE IF NOT EXISTS user
(
  id           INT(10) NOT NULL AUTO_INCREMENT,
  name     VARCHAR(40)
);

INSERT INTO user (name) VALUES ("user1");
INSERT INTO user (name) VALUES ("user2");