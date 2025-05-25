/*

Question : Query the total population of all cities in CITY where District is California.

Link : https://www.hackerrank.com/challenges/revising-aggregations-sum/problem?isFullScreen=true

*/
/*
Answer
*/
select sum(population) from CITY where District ='California';