/*
Question : Query the sum of the populations for all Japanese cities in CITY. The COUNTRYCODE for Japan is JPN.
Link : https://www.hackerrank.com/challenges/japan-population/problem?isFullScreen=true
*/
/*
Answer
*/
select sum(population) FROM CITY WHERE countrycode ='JPN';