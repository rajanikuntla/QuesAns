DROP TABLE IF EXISTS questions;
 
CREATE TABLE questions (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  question VARCHAR(500),
  answer VARCHAR(500) 
);

-- INSERT INTO questions (question, answer) VALUES
--   ('What is your name', 'Rajani'),
--   ('where did you study', 'Hyderabad'),
--   ('What is your school name', 'St.anthony'),
--   ('Have you done your graduation', 'yes'),
--   ('Have you done your masters', 'no'),
--   ('Are you married', 'yes'),
--   ('Are you working', 'yes'),
--   ('what is your last organization', 'BeautifulCode LLp'),
--   ('Are you interested in studying further', 'yes'),
--   ('Where have you born', 'Hyderabad');
--  