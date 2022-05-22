SELECT DISTINCT replacement_cost FROM film;

SELECT COUNT (DISTINCT replacement_cost) FROM film;

SELECT title,rating FROM film 
WHERE title LIKE 'T%' AND rating = 'G';

SELECT * FROM country
WHERE country LIKE '_____';

SELECT COUNT (city) FROM city
WHERE city ILIKE '%R';
