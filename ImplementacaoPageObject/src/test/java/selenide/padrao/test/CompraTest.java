package selenide.padrao.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenide.padrao.page.*;

public class CompraTest {

    private CadastroPage confirmarPedidoPage;
    private DetalheProdutoPage detalheProdutoPage;
    private ContaPage contaPage;
    private HomePage homePage;
    private ResultadoBuscaPage resultadoBuscaPage;

    @BeforeEach
    public void setUp() {
        // Instancias de Page Object
        confirmarPedidoPage = new CadastroPage();
        detalheProdutoPage = new DetalheProdutoPage();
        contaPage = new ContaPage();
        homePage = new HomePage();
        resultadoBuscaPage = new ResultadoBuscaPage();

        Configuration.timeout = 8000;

    }

    @Test
    public void testeCompra() {
        homePage.abrir();
        homePage.buscarProduto("Celular");
        resultadoBuscaPage.escolhaItem("Samsung");
        detalheProdutoPage.comprar();
        contaPage.continuarCompra();
        confirmarPedidoPage.confirmarCompra("Zeca", "Diabo",
                "432432", "zecadiabo@email.com", "123456");
    }

}
