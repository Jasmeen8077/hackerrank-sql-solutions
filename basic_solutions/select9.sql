/*
Question : Query the difference between the maximum and minimum populations in CITY.
Link: https://www.hackerrank.com/challenges/population-density-difference/problem?isFullScreen=true
*/
/*
Answer
*/
select max(population) - min(population) from CITY;