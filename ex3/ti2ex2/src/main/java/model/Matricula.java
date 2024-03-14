import static spark.Spark.*;

public class Matriculoa {
    public static void main(String[] args) {
        // Configuração do Spark
        port(4567); // Define a porta para o servidor Spark
        
        // Rota para página inicial
        get("/", (req, res) -> "Bem-vindo ao meu aplicativo!");

        // Exemplo de rota para processar dados do formulário
        post("/cadastrarProduto", (req, res) -> {
            // Aqui você pode processar os dados do formulário e interagir com o banco de dados
            return "Produto cadastrado com sucesso!";
        });
    }
}
