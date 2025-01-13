CREATE DATABASE cadastro_tarefas;

USE cadastro_tarefas;

CREATE TABLE `cadastro_tarefas`.`tarefa_academica` (
  `id`          INT              NOT NULL AUTO_INCREMENT COMMENT '',
  `nome_tarefa` VARCHAR(100)     NOT NULL                COMMENT '',
  `descricao`   VARCHAR(100)     NOT NULL                COMMENT '',
  `data`        VARCHAR(100)     NULL                    COMMENT '',
  `status`      INT              NULL                    COMMENT '',
  `materia`     VARCHAR(100)     NULL                    COMMENT '',
  `professor`   VARCHAR(100)     NULL                    COMMENT '',
  PRIMARY KEY (`id`)                                     COMMENT '');

CREATE TABLE `cadastro_tarefas`.`tarefa_profissional` (
  `id`          INT              NOT NULL AUTO_INCREMENT COMMENT '',
  `nome_tarefa` VARCHAR(100)     NOT NULL                COMMENT '',
  `descricao`   VARCHAR(100)     NOT NULL                COMMENT '',
  `data`        VARCHAR(100)     NULL                    COMMENT '',
  `status`      INT              NULL                    COMMENT '',
  `responsavel` VARCHAR(100)     NULL                    COMMENT '',
  `projeto`     VARCHAR(100)     NULL                    COMMENT '',
  PRIMARY KEY (`id`)                                     COMMENT '');

select * from tarefa_academica;
SELECT * FROM tarefa_academica WHERE id > 1