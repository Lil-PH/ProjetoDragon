CREATE DATABASE projetoDragon;

USE projetoDragon;

CREATE TABLE `projetoDragon`.`tabela_cliente` (
  `id_cliente` INT NOT NULL,
  `nome_cliente` VARCHAR(60) NOT NULL,
  `email_cliente` VARCHAR(60) NOT NULL,
  `senha_cliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cliente`));
 
  CREATE TABLE `projetoDragon`.`tabela_categorias` (
  `id_categorias` INT NOT NULL,
  `nome_categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_categorias`));
 
  CREATE TABLE `projetoDragon`.`tabela_jogos` (
  `id_jogo` INT NOT NULL,
  `nome_jogo` VARCHAR(45) NOT NULL,
  `fk_id_categoria` INT NOT NULL,
  `preco_jogo` FLOAT NOT NULL,
  PRIMARY KEY (`id_jogo`),
  INDEX `fk_id_categoria_idx` (`fk_id_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_id_categoria`
	FOREIGN KEY (`fk_id_categoria`)
	REFERENCES `projetoDragon`.`tabela_categorias` (`id_categorias`)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION);
    
   CREATE TABLE `projetoDragon`.`tabela_compra` (
  `id_compra` INT NOT NULL,
  `fk_id_cliente` INT NOT NULL,
  `fk_id_jogo` INT NOT NULL,
  `data_compra` DATE NOT NULL,
  `valor_compra` FLOAT NOT NULL,
  PRIMARY KEY (`id_compra`),
  INDEX `fk_id_cliente_idx` (`fk_id_cliente` ASC) VISIBLE,
  INDEX `fk_id_jogo_idx` (`fk_id_jogo` ASC) VISIBLE,
  CONSTRAINT `fk_id_cliente`
	FOREIGN KEY (`fk_id_cliente`)
	REFERENCES `projetoDragon`.`tabela_cliente` (`id_cliente`)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION,
  CONSTRAINT `fk_id_jogo`
	FOREIGN KEY (`fk_id_jogo`)
	REFERENCES `projetoDragon`.`tabela_jogos` (`id_jogo`)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION);
