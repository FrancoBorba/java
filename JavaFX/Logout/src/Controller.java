import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button logoutButton;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    @FXML
   public void logout(ActionEvent event) {
    
    Alert alert = new Alert(AlertType.CONFIRMATION);
    alert.setTitle("Logout"); // titulo da tela de alerta
    alert.setHeaderText("You are about to logout"); // cabeçalho da tela
    alert.setContentText("Do you want save before leaving? :"); // conteudo do alerta

    if(alert.showAndWait().get() == ButtonType.OK){ // mostra a tela de alerta e em conjunto com o if toma uma decisao
        stage = (Stage)scenePane.getScene().getWindow();
        System.out.println("Você se desconectou");
        stage.close();
    }

}
}
/*
Como funciona o Alert: primeiramente temos que criar o Alert e declara seu tipo, nesse caso foi
criado com o tipo Alert.Alerttype.CONFIRMATION, logo é uma janela que possui um botão para
confirmar ou cancelar, aqui estão alguns tipos de Alert:
• Information: ◦ Tipo: Alert.AlertType.INFORMATION ◦ Descrição: Uma caixa de diálogo informativa que exibe uma mensagem simples.
• Confirmation: ◦ Tipos: Alert.AlertType.CONFIRMATION ◦ Descrição: Uma caixa de diálogo de confirmação usada para obter a confirmação do
usuário.
• Warning: ◦ Tipo: Alert.AlertType.WARNING ◦ Descrição: Uma caixa de diálogo de aviso para alertar o usuário sobre uma situação
potencialmente problemática.
• Error: ◦ Tipo: Alert.AlertType.ERROR ◦ Descrição: Uma caixa de diálogo de erro para exibir mensagens de erro ao usuário.
• None: ◦ Tipo: Alert.AlertType.NONE ◦ Descrição: Um alerta personalizado que não exibe um ícone padrão.
• TextInputDialog: ◦ Descrição: Uma caixa de diálogo que permite ao usuário inserir um texto.
• ChoiceDialog: ◦ Descrição: Uma caixa de diálogo que permite ao usuário escolher uma opção a partir de uma
lista de opções.
 */
