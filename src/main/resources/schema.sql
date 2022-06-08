


CREATE TABLE students (
    id INT PRIMARY KEY,
    studentId INT NOT NULL UNIQUE,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    address VARCHAR(255),
    contactNumber VARCHAR(20),
);

CREATE TABLE courses (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    description VARCHAR(255),
    textbook VARCHAR(255),
    dept INT,
    professor VARCHAR(50),
    location INT
);