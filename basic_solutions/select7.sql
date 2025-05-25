/*

Question : Query the average population for all cities in CITY, rounded down to the nearest integer.
Link: https://www.hackerrank.com/challenges/average-population/problem?isFullScreen=true

*/
/*
Answer
*/
select FLOOR(avg(population)) FROM City;