
CREATE DATABASE college;

USE college;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(50)
);

INSERT INTO students (id, name, course)
VALUES
(1, 'Rahul', 'BCA'),
(2, 'Priya', 'BSc IT');

SELECT * FROM students;
