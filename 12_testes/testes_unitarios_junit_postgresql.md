Teste unitário que se conecta diretamente a um **banco PostgreSQL real instalado localmente**, utilizando apenas **JDBC** e **JUnit 5**.

---

## 📦 Pré-requisitos no seu ambiente

1. PostgreSQL **instalado e rodando localmente**
2. Banco de dados criado, por exemplo:

   * Nome: `testdb`
   * Usuário: `usuario`
   * Senha: `senha`
3. Tabela `usuario` criada:

```sql
CREATE TABLE usuario (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100)
);
```

---

## 📁 Estrutura do código

```
src/
├── main/
│   └── java/
│       └── com/exemplo/
│           ├── Usuario.java
│           └── UsuarioRepository.java
└── test/
    └── java/
        └── com/exemplo/
            └── UsuarioRepositoryTest.java
```

---

## 🧩 1. `Usuario.java`

```java
package com.exemplo;

public class Usuario {
    private Long id;
    private String nome;

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
}
```

---

## 🧩 2. `UsuarioRepository.java` (JDBC)

```java
package com.exemplo;

import java.sql.*;

public class UsuarioRepository {

    private final Connection conn;

    public UsuarioRepository(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (id, nome) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, usuario.getId());
            stmt.setString(2, usuario.getNome());
            stmt.executeUpdate();
        }
    }

    public Usuario buscarPorId(Long id) throws SQLException {
        String sql = "SELECT id, nome FROM usuario WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getLong("id"), rs.getString("nome"));
            }
        }
        return null;
    }
}
```

---

## 🧪 3. `UsuarioRepositoryTest.java`

```java
package com.exemplo;

import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioRepositoryTest {

    private static Connection conn;
    private static UsuarioRepository repo;

    @BeforeAll
    static void conectarBanco() throws SQLException {
        conn = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/testdb", "usuario", "senha"
        );
        repo = new UsuarioRepository(conn);

        try (Statement stmt = conn.createStatement()) {
            stmt.execute("DELETE FROM usuario"); // limpa antes de testar
        }
    }

    @AfterAll
    static void fecharConexao() throws SQLException {
        conn.close();
    }

    @Test
    void deveSalvarEBuscarUsuario() throws SQLException {
        Usuario usuario = new Usuario(1L, "Maria");
        repo.salvar(usuario);

        Usuario resultado = repo.buscarPorId(1L);

        assertNotNull(resultado);
        assertEquals("Maria", resultado.getNome());
    }
}
```

---

## ⚙️ `pom.xml` (dependências mínimas)

```xml
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Driver JDBC PostgreSQL -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.3</version>
    </dependency>
</dependencies>
```

---

## ✅ Resultado

Esse teste:

* **Conecta diretamente ao banco PostgreSQL local**.
* **Insere e busca** dados com JDBC puro.
* **Não usa nenhum framework** (como Spring, Hibernate, Testcontainers).
* Funciona como **teste de integração leve**, ideal para projetos simples ou didáticos.

---

## ❗ Dica extra

Evite rodar esse teste em produção: ele **modifica o banco real**. Use um banco separado só para testes (`testdb`) e limpe os dados no `@BeforeAll`.

---
