INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@testeemail.com', '123');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id ) VALUES('Duvida1', 'Erro ao criar projeto', '2023-01-05 18:57', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id ) VALUES('Duvida2', 'Projeto não compila', '2023-01-05 18:57', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id ) VALUES('Duvida3', 'Tag HTML', '2023-01-05 18:57', 'NAO_RESPONDIDO', 1, 2);