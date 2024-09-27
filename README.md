# BibliotecaTeste
Neste repositório trata sobre uso de conceitos e técnicas de Teste Unitário com programa criado na linguagem de Programação Java com a perspectiva de uso de Programação Orientada a Objetos com a temática de Biblioteca Virtual.

## 1°) Classes

### 1.1°) Book

A classe `Book` representa um livro na biblioteca.

#### Atributos

- **id** (int): Identificador único do livro.
- **name** (String): Nome do livro.
- **category** (String): Categoria do livro.
- **author** (String): Autor do livro.

#### Construtor

- `Book(int id, String name, String category, String author)`: Cria uma nova instância de `Book`.

#### Métodos

- `String getName()`: Retorna o nome do livro.
- `void setName(String name)`: Define o nome do livro.
- `int getId()`: Retorna o ID do livro.
- `void setId(int id)`: Define o ID do livro.
- `String getCategory()`: Retorna a categoria do livro.
- `void setCategory(String category)`: Define a categoria do livro.
- `String getAuthor()`: Retorna o autor do livro.
- `void setAuthor(String author)`: Define o autor do livro.

### 1.2°) Library

A classe `Library` gerencia uma coleção de livros.

#### Atributos

- **books** (List<Book>): Lista de livros na biblioteca.

#### Construtor

- `Library()`: Cria uma nova instância de `Library`.

#### Métodos

- `void addBook(Book book)`: Adiciona um livro à biblioteca.
- `void removeBook(int id)`: Remove um livro da biblioteca pelo ID.
- `void editBook(int id, String newName, String newAuthor, String newCategory)`: Edita as informações de um livro pelo ID.
- `void displayBooks()`: Exibe todos os livros na biblioteca.
- `Book searchBook(int id)`: Busca um livro pelo ID e retorna a instância do livro.
- `List<Book> getBooks()`: Retorna a lista de livros.

## 2°)Testes

Os testes implementados asseguram que as classes `Book` e `Library` funcionam conforme o esperado. A seguir, uma descrição dos métodos testados:

### 2.1°)Testes da Classe `Book`

- **getNameTest**: Verifica a precisão dos nomes dos livros.
- **setNameTest**: Testa a alteração do nome do livro.
- **getIdTest**: Confirma a precisão dos IDs dos livros.
- **setIdTest**: Testa a alteração do ID do livro.
- **getCategoryTest**: Valida a precisão das categorias.
- **setCategoryTest**: Testa a alteração da categoria.
- **getAuthorTest**: Confirma a precisão dos autores.
- **setAuthorTest**: Testa a alteração do autor.

### 2.2°) Testes da Classe `Library`

- **addBookTest**: Verifica a adição de um livro.
- **removeBookTest_ifExist**: Confirma a remoção de um livro existente.
- **removeBookTest_ifNotExist**: Testa a tentativa de remoção de um livro inexistente.
- **editBookTest_ifExist**: Valida a edição de um livro existente.
- **editBookTest_ifNotExist**: Testa a edição de um livro inexistente.
- **displayBooksTest_empty**: Testa a exibição quando a biblioteca está vazia.
- **displayBooksTest_withBook**: Verifica a exibição de livros existentes.
- **searchBookTest_ifExist**: Confirma a busca de um livro existente.
- **searchBookTest_ifNotExist**: Testa a busca de um livro inexistente.

### 2.3°) Execução dos Testes

Os testes podem ser executados usando JUnit. As dependências devem estar configuradas. Para executar, utilize:

```bash
mvn test
