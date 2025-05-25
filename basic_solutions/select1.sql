/*

Problem name: - SELECT name from the given city table also check condition population is greater than 120000 and countrycode is equal to USA

LINK :- https://www.hackerrank.com/challenges/revising-the-select-query-2/problem?isFullScreen=true

*/
/*Answer*/
select name from CITY where population > 120000 AND countrycode = 'USA';
/*Test case 0*/
Test case 0
Compiler Message
Success
Input (stdin)
 
Expected Output
Scottsdale
Corona
Concord
Cedar Rapids