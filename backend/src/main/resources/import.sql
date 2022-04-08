INSERT INTO tb_collaborator(cpf, name) VALUES('000.000.000-00', 'Maria');
INSERT INTO tb_collaborator(cpf, name) VALUES('111.111.111-11', 'Pedro');
INSERT INTO tb_collaborator(cpf, name) VALUES('222.222.222-22', 'João');

INSERT INTO tb_option(breakfast_choice) VALUES('Bolo');
INSERT INTO tb_option(breakfast_choice) VALUES('Suco acerola');
INSERT INTO tb_option(breakfast_choice) VALUES('Misto quente');

INSERT INTO tb_collaborator_option (collaborator_id, option_id) VALUES (1, 2);
INSERT INTO tb_collaborator_option (collaborator_id, option_id) VALUES (2, 3);
INSERT INTO tb_collaborator_option (collaborator_id, option_id) VALUES (3, 1);