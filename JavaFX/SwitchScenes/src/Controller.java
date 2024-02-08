import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene2(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
// Este medoto está sendo usado quando as telas tem o mesmo controller , logo pelo controller eu faço as trocas de tela

/*
e.getSource(): e é um parâmetro do tipo ActionEvent, que é comumente usado para eventos de
interface do usuário, como cliques em botões. getSource() retorna o objeto que acionou o
evento, que no seu caso seria um nó da interface gráfica (por exemplo, um botão).

• ((Node)e.getSource()): Este trecho converte o objeto obtido em um tipo Node, que é uma classe
base para todos os elementos de interface gráfica no JavaFX.

• .getScene(): Obtém a cena à qual o nó pertence. A cena é basicamente um contêiner para o
conteúdo gráfico em JavaFX.

• .getWindow(): Obtém a janela (window) à qual a cena está associada. Uma janela é uma área
retangular na tela onde a interface gráfica é exibida.

• (Stage)((Node)e.getSource()).getScene().getWindow(): Finalmente, converte a janela obtida para
o tipo Stage. Um Stage é uma janela JavaFX principal que geralmente contém uma ou mais
cenas. 
*/
