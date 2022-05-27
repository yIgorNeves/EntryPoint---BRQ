#criar DB		
create database bookelandia; 

#usar o banco de dados
use bookelandia;

#mostrar databases
show databases;

#apagar banco de dados

#mostrar tabelas do banco de dados
show tables;

#criação da atablea de clientes
create table `clientes`(
	cpf varchar(11) ,
    nome varchar(50) not null,
    telefone varchar(15),
    endereco varchar(100),
    dataDeCadastro date,
    
    primary key (`cpf`)
);

#mostra informaçoes da tabela
describe clientes;

#cria a tabela de categoria de produtos
create table `categoriasDeProdutos`(
	codigo int,
    nome varchar(20),
    descricao varchar(20),
    
    primary key(`codigo`)
);

#cria tabela de produtos
create table `produtos`(
	codigoDoProduto int,
    codigoDaCategoria int,
	nome varchar(20),
    descricao text,
    preco decimal(10, 2),
    
    primary key(`codigoDoProduto`)
);
#altera a tabela de produtos para marcar a chave estrangeira
alter table `produtos` 
add constraint fkProdutosCategoriaProdutos
foreign key (`codigoDaCategoria`)
references categoriasDeProdutos(`codigo`);

#insere dados na table clientes
insert into clientes (cpf, nome, telefone, endereco, dataDeCadastro) values
('12345678912', 'Joana', '32335555', 'Rua das Dores, 1001', '2022-03-12'),
('23456789123', 'Kayla', '40028922', 'Rua das Dores, 1002', '2022-04-12'),
('34567891234', 'Anna', '40028923', 'Rua das Dores, 1003', '2022-04-10'),
('45678912345', 'João', '45612345', 'Rua das Dores, 1004', '2022-04-12'),
('56789123456', 'Pedro', '45678945', 'Rua das Dores, 1005', '2022-04-12');

select * from `clientes`;

#cria tabela de log
create table `logins`(
	email varchar(50),
    senha varchar(20) not null,
    nivelDeAcesso varchar(11) check(nivelDeAcesso in ('admin','cliente','Funcionario')),
    `status` boolean
);

alter table `logins` add primary key (`email`);

#cria tabela de avaliação do produto
create table `avaliacaoDeProduto`(
	codigoDoProduto int,
    codigoDoCliente varchar(11),
    nota int check(nota >= 1 and nota <=5),
    descricao text,
    primary key(`codigoDoProduto`,`codigoDoCliente`),
    foreign key (codigoDoProduto) references produtos(codigoDoProduto),
    foreign key (codigoDoCliente) references clientes(cpf)
);

# Insere dados na tabela de categorias de produtos

insert into categoriasDeProdutos (codigo, nome, descricao) values
('002', 'Comédia', 'Livros'),
('003', 'Romance', 'Livros'),
('011', 'Terror', 'e-books'),
('012', 'Comédia', 'e-books'),
('013', 'Romance', 'e-books');

# Insere dados na tabela de produtos
insert into `produtos`
(codigoDoProduto, codigoDaCategoria, nome, descricao, preco)
values
('1', '1', 'Drácula', 'Drácula é um romance de terror gótico lançado em 1897, escrito pelo autor irlandês Bram Stoker, tendo como protagonista o vampiro Conde Drácula. Tornou-se a mais famosa história de vampiro da literatura.','75.80');

# Insere dados na tabela de pedidos
create table `pedidos`(
	numeroDoPedido int auto_increment,
    codigoDoCliente varchar(11),
    formaPagamento varchar(15) check (formaPagamento in ('boleto', 'pix', 'cartaoDeCredito')),
    `status` varchar(30),
    `data` date,
    cupom varchar(20),
    valorTotal double,
    primary key (`numeroDoPedido`),
    foreign key (codigoDoCliente) references clientes(cpf)
);

# Insere dados na tabela de funcionários
create table `funcionarios`(
	matricula  varchar(11),
    nome varchar(60) not null,
    dataDeAdmissao date not null,
    salario decimal(10, 2)  not null,
    cargo varchar(20) check(cargo in ('Finanças','TI','Diretoria','Vendas')),
    
    primary key(`matricula`)
);
insert into `funcionarios`
(matricula, nome, dataDeAdmissao, salario, cargo)
values
('12345678911', 'Jose Augusto', NOW(), '3500.00', 'Finanças'),
('12345678921', 'Maria das dores', NOW(), '4500.00', 'TI'),
('12345678931', 'Aparecida Sumida', NOW(), '4500.00', 'TI'),
('12345678941', 'Lucas Jackson', NOW(), '3000.00', 'Vendas'),
('12345678951', 'Camelia Fortes', NOW(), '3000.00', 'Vendas'),
('12345678961', 'Isabelle Alverenga', NOW(), '7500.00', 'Diretoria');

# Insere dados na tabela de chamados
create table `chamados`(
	ticket  int auto_increment,
    codigoDoCliente varchar(11),
    codigoDoFuncionario varchar(11),
    descricao text not null,
    codigoDoPedido int,
    `status` varchar(15) check( `status` in ('Recebido', 'Em Atendimento', 'Em Espera' ,'Finalizado')),
    
    primary key(`ticket`),
    foreign key(codigoDoCliente) references clientes(cpf),
    foreign key(codigoDoFuncionario) references funcionarios(matricula),
    foreign key(codigoDoPedido) references pedidos(numeroDoPedido)
);

insert into `chamados`
(ticket, codigoDoCliente, codigoDoFuncionario, descricao, `status`)
values
('1', '01987654321', '12345678901', 'Problema com o boleto', 'Recebido');

# Insere dados na tabela de avaliações de produtos

insert into `avaliacaoDeProduto`
(codigoDoProduto, codigoDoCliente, nota, descricao)
values
('1', '01987654321', '5', 'TOP');


create table `produtosDoPedido`(
	numeroDoPedido int,
	codigoDoProduto int,
	quantidade int,

    primary key(`numeroDoPedido`,`codigoDoProduto`),
    foreign key(numeroDoPedido) references pedidos(numeroDoPedido),
    foreign key(codigoDoProduto) references produtos(codigoDoProduto)
);


