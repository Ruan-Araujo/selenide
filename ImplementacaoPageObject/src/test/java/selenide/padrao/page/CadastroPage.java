package selenide.padrao.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class CadastroPage {

    private SelenideElement inputPrimeiroNome = $("#firstName"),
                            inputSegundoNome = $("#lastName"),
                            inputCpf = $("#identification"),
                            inputEmail = $("#email"),
                            inputSenha = $("#password"),
                            inputAceitoTermos = $("#tyc_checkbox"),
                            btnContinuar = $(byAttribute("type", "submit"));


    public void confirmarCompra(String primeiroNome, String segundoNome, String cpf,
                                String email, String senha) {

        inputPrimeiroNome.setValue(primeiroNome);
        inputSegundoNome.setValue(segundoNome);
        inputCpf.setValue(cpf);
        inputEmail.setValue(email);
        inputSenha.setValue(senha);
        inputAceitoTermos.click();
        btnContinuar.click();
    }
}
