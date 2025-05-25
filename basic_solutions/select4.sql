/*

Question : Query a count of the number of cities in CITY having a Population larger than 100,000.

Link : https://www.hackerrank.com/challenges/revising-aggregations-the-count-function/problem?isFullScreen=true

*/
/*
Answer 
*/
select count(name) FROM CITY WHERE population > 100000