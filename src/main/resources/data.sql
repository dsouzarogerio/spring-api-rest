INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@testeemail.com', '$2a$10$wbTZnxN23ZdiNNfYDFIqc.aiHNPb3W9Ry4fZ3Rxg8uAfecF2r6Fue');
INSERT INTO USUARIO(nome, email, senha) VALUES('Moderador', 'moderador@testeemail.com', '$2a$10$wbTZnxN23ZdiNNfYDFIqc.aiHNPb3W9Ry4fZ3Rxg8uAfecF2r6Fue');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1,1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2,2);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id ) VALUES('Duvida1', 'Erro ao criar projeto', '2023-01-05 18:57', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id ) VALUES('Duvida2', 'Projeto não compila', '2023-01-05 18:57', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id ) VALUES('Duvida3', 'Tag HTML', '2023-01-05 18:57', 'NAO_RESPONDIDO', 1, 2);