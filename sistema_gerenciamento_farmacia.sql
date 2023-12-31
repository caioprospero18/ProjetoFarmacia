-- MySQL Script generated by MySQL Workbench
-- Wed Dec  6 23:52:55 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sistema_gerenciamento_farmacia
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sistema_gerenciamento_farmacia` ;

-- -----------------------------------------------------
-- Schema sistema_gerenciamento_farmacia
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistema_gerenciamento_farmacia` DEFAULT CHARACTER SET utf8 ;
USE `sistema_gerenciamento_farmacia` ;

-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`tipo_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`tipo_usuario` (
  `codigo_tipo` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `modulo_administrativo` VARCHAR(1) NULL,
  `modulo_venda` VARCHAR(1) NULL,
  `modulo_cadastro_receita` VARCHAR(1) NULL,
  PRIMARY KEY (`codigo_tipo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`usuarios` (
  `codigo_usuario` INT NOT NULL,
  `nome_completo` VARCHAR(45) NULL,
  `data_nascimento` DATE NULL,
  `cpf` VARCHAR(14) NULL,
  `endereco` VARCHAR(50) NULL,
  `numero` VARCHAR(15) NULL,
  `complemento` VARCHAR(30) NULL,
  `bairro` VARCHAR(40) NULL,
  `cidade` VARCHAR(40) NULL,
  `estado` VARCHAR(2) NULL,
  `telefone` VARCHAR(20) NULL,
  `celular` VARCHAR(20) NULL,
  `email` VARCHAR(45) NOT NULL,
  `senha_acesso` VARCHAR(64) NULL,
  `codigo_tipo` INT NOT NULL,
  PRIMARY KEY (`codigo_usuario`),
  INDEX `fk_usuarios_tipo_usuario1_idx` (`codigo_tipo` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  CONSTRAINT `fk_usuarios_tipo_usuario1`
    FOREIGN KEY (`codigo_tipo`)
    REFERENCES `sistema_gerenciamento_farmacia`.`tipo_usuario` (`codigo_tipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`categoria_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`categoria_produto` (
  `codigo_categoria` INT NOT NULL,
  `categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_categoria`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`produtos` (
  `codigo_produto` INT NOT NULL,
  `nome_produto` VARCHAR(45) NOT NULL,
  `valor_produto` FLOAT NOT NULL,
  `quantidade_estoque` INT NULL,
  `tarja` VARCHAR(12) NULL,
  `receita` VARCHAR(1) NULL,
  `codigo_categoria` INT NOT NULL,
  PRIMARY KEY (`codigo_produto`),
  INDEX `fk_produtos_categoria_produto_idx` (`codigo_categoria` ASC) VISIBLE,
  CONSTRAINT `fk_produtos_categoria_produto`
    FOREIGN KEY (`codigo_categoria`)
    REFERENCES `sistema_gerenciamento_farmacia`.`categoria_produto` (`codigo_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`receitas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`receitas` (
  `codigo_receita` INT NOT NULL,
  `nome_medico` VARCHAR(45) NULL,
  `crm` VARCHAR(20) NULL,
  `cor` VARCHAR(20) NULL,
  `codigo_cliente` INT NOT NULL,
  `codigo_produto` INT NOT NULL,
  PRIMARY KEY (`codigo_receita`),
  INDEX `fk_receitas_usuarios1_idx` (`codigo_cliente` ASC) VISIBLE,
  INDEX `fk_receitas_produtos1_idx` (`codigo_produto` ASC) VISIBLE,
  CONSTRAINT `fk_receitas_usuarios1`
    FOREIGN KEY (`codigo_cliente`)
    REFERENCES `sistema_gerenciamento_farmacia`.`usuarios` (`codigo_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_receitas_produtos1`
    FOREIGN KEY (`codigo_produto`)
    REFERENCES `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`vendas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`vendas` (
  `codigo_venda` INT NOT NULL,
  `data_hora_venda` VARCHAR(25) NULL,
  `valor_venda` FLOAT NULL,
  `codigo_cliente` INT NULL,
  `codigo_funcionario` INT NOT NULL,
  PRIMARY KEY (`codigo_venda`),
  INDEX `fk_vendas_usuarios1_idx` (`codigo_cliente` ASC) VISIBLE,
  INDEX `fk_vendas_usuarios2_idx` (`codigo_funcionario` ASC) VISIBLE,
  CONSTRAINT `fk_vendas_usuarios1`
    FOREIGN KEY (`codigo_cliente`)
    REFERENCES `sistema_gerenciamento_farmacia`.`usuarios` (`codigo_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vendas_usuarios2`
    FOREIGN KEY (`codigo_funcionario`)
    REFERENCES `sistema_gerenciamento_farmacia`.`usuarios` (`codigo_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_gerenciamento_farmacia`.`venda_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistema_gerenciamento_farmacia`.`venda_produto` (
  `codigo` INT NOT NULL,
  `codigo_produto` INT NOT NULL,
  `codigo_venda` INT NOT NULL,
  `quantidade` FLOAT NOT NULL,
  `codigo_receita` INT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_venda_produto_produtos1_idx` (`codigo_produto` ASC) VISIBLE,
  INDEX `fk_venda_produto_vendas1_idx` (`codigo_venda` ASC) VISIBLE,
  INDEX `fk_venda_produto_receitas1_idx` (`codigo_receita` ASC) VISIBLE,
  CONSTRAINT `fk_venda_produto_produtos1`
    FOREIGN KEY (`codigo_produto`)
    REFERENCES `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_produto_vendas1`
    FOREIGN KEY (`codigo_venda`)
    REFERENCES `sistema_gerenciamento_farmacia`.`vendas` (`codigo_venda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_produto_receitas1`
    FOREIGN KEY (`codigo_receita`)
    REFERENCES `sistema_gerenciamento_farmacia`.`receitas` (`codigo_receita`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `sistema_gerenciamento_farmacia`.`tipo_usuario`
-- -----------------------------------------------------
START TRANSACTION;
USE `sistema_gerenciamento_farmacia`;
INSERT INTO `sistema_gerenciamento_farmacia`.`tipo_usuario` (`codigo_tipo`, `nome`, `modulo_administrativo`, `modulo_venda`, `modulo_cadastro_receita`) VALUES (1, 'Administrador', 'S', 'S', 'S');
INSERT INTO `sistema_gerenciamento_farmacia`.`tipo_usuario` (`codigo_tipo`, `nome`, `modulo_administrativo`, `modulo_venda`, `modulo_cadastro_receita`) VALUES (2, 'Gerente', 'S', 'S', 'S');
INSERT INTO `sistema_gerenciamento_farmacia`.`tipo_usuario` (`codigo_tipo`, `nome`, `modulo_administrativo`, `modulo_venda`, `modulo_cadastro_receita`) VALUES (3, 'Caixa', 'S', 'S', 'N');
INSERT INTO `sistema_gerenciamento_farmacia`.`tipo_usuario` (`codigo_tipo`, `nome`, `modulo_administrativo`, `modulo_venda`, `modulo_cadastro_receita`) VALUES (4, 'Atendente', 'S', 'N', 'S');
INSERT INTO `sistema_gerenciamento_farmacia`.`tipo_usuario` (`codigo_tipo`, `nome`, `modulo_administrativo`, `modulo_venda`, `modulo_cadastro_receita`) VALUES (5, 'Cliente', NULL, NULL, NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `sistema_gerenciamento_farmacia`.`usuarios`
-- -----------------------------------------------------
START TRANSACTION;
USE `sistema_gerenciamento_farmacia`;
INSERT INTO `sistema_gerenciamento_farmacia`.`usuarios` (`codigo_usuario`, `nome_completo`, `data_nascimento`, `cpf`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`, `telefone`, `celular`, `email`, `senha_acesso`, `codigo_tipo`) VALUES (1, 'Admin', '2023-11-11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'admin@nacafarm.com', 'f6ff5adab5180a3d10ffb611f2caddd0a2b0922bde398ad186e946480bec3943', 1);
INSERT INTO `sistema_gerenciamento_farmacia`.`usuarios` (`codigo_usuario`, `nome_completo`, `data_nascimento`, `cpf`, `endereco`, `numero`, `complemento`, `bairro`, `cidade`, `estado`, `telefone`, `celular`, `email`, `senha_acesso`, `codigo_tipo`) VALUES (8, 'Jurandir', '1978-04-21', '74637527040', 'Rua Arthur Bernardes', '438', NULL, 'Serraria do Rocha', 'Paranaguá', 'SP', '(41)35696125', '(41)988531255', 'jurandirOtesco@bom.com.br', NULL, 5);

COMMIT;


-- -----------------------------------------------------
-- Data for table `sistema_gerenciamento_farmacia`.`categoria_produto`
-- -----------------------------------------------------
START TRANSACTION;
USE `sistema_gerenciamento_farmacia`;
INSERT INTO `sistema_gerenciamento_farmacia`.`categoria_produto` (`codigo_categoria`, `categoria`) VALUES (1, 'Produtos de Beleza');
INSERT INTO `sistema_gerenciamento_farmacia`.`categoria_produto` (`codigo_categoria`, `categoria`) VALUES (2, 'Remédios');
INSERT INTO `sistema_gerenciamento_farmacia`.`categoria_produto` (`codigo_categoria`, `categoria`) VALUES (3, 'Higiene Pessoal');

COMMIT;


-- -----------------------------------------------------
-- Data for table `sistema_gerenciamento_farmacia`.`produtos`
-- -----------------------------------------------------
START TRANSACTION;
USE `sistema_gerenciamento_farmacia`;
INSERT INTO `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`, `nome_produto`, `valor_produto`, `quantidade_estoque`, `tarja`, `receita`, `codigo_categoria`) VALUES (28, 'Gilette', 3.95, 37, NULL, NULL, 3);
INSERT INTO `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`, `nome_produto`, `valor_produto`, `quantidade_estoque`, `tarja`, `receita`, `codigo_categoria`) VALUES (5, 'Absorvente', 5.69, 19, NULL, NULL, 3);
INSERT INTO `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`, `nome_produto`, `valor_produto`, `quantidade_estoque`, `tarja`, `receita`, `codigo_categoria`) VALUES (34, 'Shampoo', 19.90, 25, NULL, NULL, 3);
INSERT INTO `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`, `nome_produto`, `valor_produto`, `quantidade_estoque`, `tarja`, `receita`, `codigo_categoria`) VALUES (22, 'Dipirona', 32.50, 120, NULL, NULL, 2);
INSERT INTO `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`, `nome_produto`, `valor_produto`, `quantidade_estoque`, `tarja`, `receita`, `codigo_categoria`) VALUES (58, 'Codeina', 57.80, 34, 'Preta', 'S', 2);
INSERT INTO `sistema_gerenciamento_farmacia`.`produtos` (`codigo_produto`, `nome_produto`, `valor_produto`, `quantidade_estoque`, `tarja`, `receita`, `codigo_categoria`) VALUES (97, 'Batom', 12.29, 41, NULL, NULL, 1);

COMMIT;

