/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 00594939259
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtSenha;
    
    
    
    public void entrar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Calculadora");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("select senha_user from Usuario where nick_user = :nick");
        query.setParameter("nick", txtUsername.getText());
        
        
        try{
                if (query.getSingleResult().equals(txtSenha.getText())){
                    System.out.println("Autenticação de usuário realizada com sucesso!");
                    chamarcalc();
                }
                else{
                    System.out.println("Autenticação de usuário malsucedida!");
                    txtSenha.setText("");
                    txtUsername.setText("");
                }
            }catch(NoResultException nre){
                System.out.println("Autenticação de usuário malsucedida!");
                txtSenha.setText("");
                txtUsername.setText("");
        }
        
        
        
    }
    
    public void chamarcalc(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/edu/ifro/view/Calculadora.fxml"));
            Scene scene = new Scene(root, 480, 480);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Calculadora");
            stage.show();
            stage.setResizable(false);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
