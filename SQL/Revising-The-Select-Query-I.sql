/*
 * Desafio: Revising the Select Query I
 * Plataforma: HackerRank
 * Trilha: SQL - Basic Select (Easy)
 * SGBD: MySQL
 * https://www.hackerrank.com/challenges/revising-the-select-query/problem?isFullScreen=true
 *
 * Descrição:
 * Consultar todas as colunas de todas as cidades americanas (COUNTRYCODE = 'USA')
 * na tabela CITY que possuem população maior que 100.000 habitantes.
 */

SELECT *
FROM CITY
WHERE COUNTRYCODE = 'USA'
  AND POPULATION > 100000;
