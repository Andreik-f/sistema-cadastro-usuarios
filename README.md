# Sistema de Cadastro de Usuários

Projeto desenvolvido em Java com o objetivo de praticar conceitos de Programação Orientada a Objetos (POO), manipulação de coleções utilizando `ArrayList` e implementação das operações básicas de um CRUD.

## Funcionalidades

- ✅ Cadastrar usuários
- ✅ Listar usuários cadastrados
- ✅ Buscar usuário por e-mail
- ✅ Editar e-mail de um usuário
- ✅ Remover usuário
- ✅ Validação de e-mails duplicados
- ✅ Validação de idade

## Tecnologias Utilizadas

- Java
- ArrayList
- Programação Orientada a Objetos (POO)

## Estrutura do Projeto

```text
src/
└── org/example/
    ├── Main.java
    ├── ControleUsuarios.java
    └── Usuarios.java
```

### Main.java
Responsável pelo menu principal e interação com o usuário.

### ControleUsuarios.java
Contém toda a lógica do sistema:
- Cadastro
- Listagem
- Busca
- Edição
- Remoção

### Usuarios.java
Classe responsável por representar um usuário contendo:
- Nome
- E-mail
- Idade

## Conceitos Praticados

Durante o desenvolvimento deste projeto foram praticados os seguintes conceitos:

- Classes e Objetos
- Construtores
- Métodos
- ArrayList
- Laços de repetição (`for`, `for-each`, `while`, `do-while`)
- Estruturas condicionais (`if`, `else`)
- Manipulação de objetos em coleções
- Validação de dados
- CRUD (Create, Read, Update e Delete)

## Objetivo

Este projeto foi desenvolvido para consolidar conhecimentos fundamentais de Java e Programação Orientada a Objetos através da construção de um sistema simples de gerenciamento de usuários.

## Melhorias Futuras

- [ ] Persistência de dados em arquivo (TXT ou JSON)
- [ ] Encapsulamento com getters e setters
- [ ] Interface gráfica
- [ ] Integração com banco de dados

---

Desenvolvido como projeto de estudo em Java.
