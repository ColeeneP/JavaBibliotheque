CREATE DATABASE bibliotheque_java;

CREATE TABLE author (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    author_name VARCHAR(50),
    surname VARCHAR(50),
    birth_date DATE,
    death_date DATE
) ENGINE = INNODB DEFAULT CHARSET=latin1;

CREATE TABLE publisher (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(100) NOT NULL,
    city VARCHAR(25)
) ENGINE = INNODB DEFAULT CHARSET=latin1;

CREATE TABLE book (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    title VARCHAR(50) NOT NULL,
    author INT NOT NULL,
    FOREIGN KEY (author) references author(id),
    year DATE,
    publisher INT,
    FOREIGN KEY (publisher) references publisher(id),
    edition VARCHAR(25),
    cost DECIMAL,
    synopsys TEXT,
    isbn VARCHAR(100) NOT NULL,
    ean VARCHAR(100),
    illustrator VARCHAR(50),
    volume INT,
    image VARCHAR(255)
) ENGINE = INNODB DEFAULT CHARSET=latin1;