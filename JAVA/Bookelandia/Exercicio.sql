#ORDER BY 
select nome, cpf from clientes order by nome;

#WHERE
SELECT nome, salario from funcionarios WHERE salario >=5.00;

# WHERE COM BETWEEN ALIAS
select p.nome, p.preco
from produtos as p 
where preco between 200 and 500;

#MIN E MAX

SELECT MIN(preco)
FROM produtos
WHERE preco = 500;

SELECT max(preco)
FROM produtos;

#COUNT 

SELECT COUNT(matricula)
FROM funcionarios;

select * from funcionarios;

#INNER JOIN
select p.nome, p.preco, c.nome, c.descricao
from produtos as p inner join categoria_produtos as c on p.codigoCategoria = c.codigo
where p.preco >=50;

#LOWER
SELECT LOWER(nome) AS Lowercaseprodutos
FROM produtos;

#UPPER
SELECT UPPER(nome) AS Uppercaseprodutos
FROM clientes;

#LENGTH
SELECT LENGTH(nome) AS Lengthofnome
FROM clientes;

#MID FUNÇÃO SQL
SELECT MID(nome, 2, 5) AS ExtractString
FROM clientes;

#LEFT JOIN SQL

SELECT p.numeroDoPedido, p.dataPedido
FROM pedidos as p
LEFT JOIN clientes as c
ON p.codigoDoCliente = c.cpf;

#QUERIES USANDO DATA

select * from pedidos
where dataPedido < '2022-05-23';

#Funções usando GROUPBY
SELECT nome,salario
FROM funcionarios
where salario >= 15000.00
GROUP BY matricula;

#HAVING FUNÇÃO
SELECT SUM(valor) as S, p.formaPagamento, c.nome
FROM pedidos as p
INNER JOIN clientes as c on p.codigoDoCliente = c.cpf
group by p.codigoDoCliente
HAVING SUM(valor) >=200;


select * from produtos_pedidos;
select * from pedidos
