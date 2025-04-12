# Segurança Web em Java – Estudos com OWASP

Este repositório foi criado como parte dos meus estudos em segurança de aplicações web, com foco em práticas defensivas contra ataques maliciosos. O projeto é baseado nos cursos da Alura:

- [Segurança web em Java: evitando SQL Injection, força bruta e outros ataques (Parte 1)](https://cursos.alura.com.br/course/seguranca-web-em-java-parte-1)
- [Segurança web em Java: autenticação, acesso e segurança na prática (Parte 2)](https://cursos.alura.com.br/course/seguranca-web-em-java-parte-2)

## 💡 Objetivo

Explorar e aplicar técnicas de segurança em aplicações Java web, utilizando o framework OWASP e abordando vulnerabilidades comuns como:

- SQL Injection
- Ataques de força bruta
- Validação de entrada de dados
- Controle de acesso e autenticação

## 📃 Conteúdo dos Cursos

### Parte 1:
- Validação de dados de entrada
- Escapando saídas para evitar XSS
- SQL Injection e prevenção com PreparedStatement
- Configurações seguras em ambientes de produção
- Autenticação básica e controle de sessão

### Parte 2:
- Implementação de roles e permissões de acesso
- Controle de autenticação via servlet filters
- CSRF: entendendo e prevenindo
- Ferramentas para testar vulnerabilidades (Burp Suite, Sqlmap)
- Análise de headers HTTP para reforçar a segurança

## 🛠️ Tecnologias Utilizadas

- **Java 1.8**
- **Apache Tomcat 8.0** como servidor de aplicação
- **MySQL 5.7** como banco de dados
- **Maven** para gerenciamento de dependências
- **VS Code** como ambiente de desenvolvimento

## 📁 Estrutura do Projeto

- `src/`: Código-fonte da aplicação
- `WebContent/`: Arquivos estáticos e páginas JSP
- `pom.xml`: Arquivo de configuração do Maven
- `.gitignore`: Arquivos e pastas ignorados pelo Git

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ArthurGabrielFreitas/Seguranca-Java-alura.git
   ```
2. Importe o projeto no VS Code ou em outro IDE compatível com Java.
3. Certifique-se de ter o **Java 1.8**, **Tomcat 8.0** e **MySQL 5.7** instalados.
4. Configure o Tomcat no seu ambiente e aponte para o projeto importado.
5. Inicie o Tomcat.
6. Acesse o site rodando no navegador:
   ```
   http://localhost:8080/loja-virtual
   ```

## 📚 Cursos Referenciados

- [Segurança web em Java: evitando SQL Injection, força bruta e outros ataques (Parte 1)](https://cursos.alura.com.br/course/seguranca-web-em-java-parte-1)
- [Segurança web em Java: autenticação, acesso e segurança na prática (Parte 2)](https://cursos.alura.com.br/course/seguranca-web-em-java-parte-2)

## 📝 Licença

Este projeto é de uso educacional, baseado em conteúdo da Alura. Consulte os termos de uso da plataforma para mais informações.

