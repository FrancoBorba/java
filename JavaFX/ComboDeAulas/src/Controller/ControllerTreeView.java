package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


public class ControllerTreeView implements Initializable {

    @FXML
    private TreeView<String> treeView;

    @FXML
    void selectItem() {
    TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
    if(item != null){
         System.out.println(item.getValue());
    }
   
    }

  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      TreeItem<String> rootItem = new TreeItem<>("Files");

      TreeItem<String> branchItem = new TreeItem<>("Pictures");
      TreeItem<String> branchItem2 = new TreeItem<>("Games");
      TreeItem<String> branchItem3 = new TreeItem<>("Music");

      rootItem.getChildren().add(branchItem);
      rootItem.getChildren().add(branchItem2);
      rootItem.getChildren().add(branchItem3);

      TreeItem<String> leafItem1 = new TreeItem<>("Pictures Vacation");
      TreeItem<String> leafItem2 = new TreeItem<>("Pictures School");

      TreeItem<String> leafItem3 = new TreeItem<>("GTA V");
      TreeItem<String> leafItem4 = new TreeItem<>("League Of Legends");

      branchItem.getChildren().add(leafItem1);
      branchItem.getChildren().add(leafItem2);
      branchItem2.getChildren().addAll(leafItem3 , leafItem4);

      treeView.setRoot(rootItem);

      
    }

}