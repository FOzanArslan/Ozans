UPDATE employee
SET name = 'Ozan'
Where id = 41;

UPDATE employee
SET name = 'Evrim'
Where name = 'Ivan';

UPDATE employee
SET email = 'arslan.ozan@metu.edu.tr'
Where birthday = '2022-03-23';

UPDATE employee
SET name = 'Batu'
Where birthday = '2022-03-23';

UPDATE employee
SET birthday = '2011-03-23'
Where name = 'Evrim';

DELETE FROM employee
WHERE name = 'Ari';

DELETE FROM employee
WHERE id = 46;

DELETE FROM employee
WHERE birthday = '2021-10-10';

DELETE FROM employee
WHERE id = '13';