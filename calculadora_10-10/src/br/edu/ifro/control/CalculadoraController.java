/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 96486805234
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnLimparTudo;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btnSomar;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnResultado;
    @FXML
    private Button btn0;
    @FXML
    private Button btnPonto;
    @FXML
    private Button btnUsuario;
    @FXML
    private Button Historico;
    
    private String num1;
    private String num2;
    private String sinal;
    private Integer result;

    private void button0 (){
        if (num1==null && sinal==null){
            num1 = "0";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"0";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "0"; 
            }else{
                num1 = "0";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "0"; 
            }else{
                num1 = "0";
            }
        }
    }
    
    private void button1 (){
        if (num1==null && sinal==null){
            num1 = "1";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"1";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "1"; 
            }else{
                num1 = "1";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "1"; 
            }else{
                num1 = "1";
            }
        }
    }
    
    private void button2 (){
        if (num1==null && sinal==null){
            num1 = "2";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"2";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "2"; 
            }else{
                num1 = "2";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "2"; 
            }else{
                num1 = "2";
            }
        }
    }
    
    private void button3 (){
        if (num1==null && sinal==null){
            num1 = "3";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"3";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "3"; 
            }else{
                num1 = "3";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "3"; 
            }else{
                num1 = "3";
            }
        }
    }
    
    private void button4 (){
        if (num1==null && sinal==null){
            num1 = "4";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"4";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "4"; 
            }else{
                num1 = "4";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "4"; 
            }else{
                num1 = "4";
            }
        }
    }
    
    private void button5 (){
        if (num1==null && sinal==null){
            num1 = "5";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"5";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "5"; 
            }else{
                num1 = "5";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "5"; 
            }else{
                num1 = "5";
            }
        }
    }
    
    private void button6 (){
        if (num1==null && sinal==null){
            num1 = "6";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"6";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "6"; 
            }else{
                num1 = "6";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "6"; 
            }else{
                num1 = "6";
            }
        }
    }
    
    private void button7 (){
        if (num1==null && sinal==null){
            num1 = "7";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"7";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "7"; 
            }else{
                num1 = "7";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "7"; 
            }else{
                num1 = "7";
            }
        }
    }
    
    private void button8 (){
        if (num1==null && sinal==null){
            num1 = "8";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"8";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "8"; 
            }else{
                num1 = "8";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "8"; 
            }else{
                num1 = "8";
            }
        }
    }
    
    private void button9 (){
        if (num1==null && sinal==null){
            num1 = "9";
        }
        else if(num1=="" && sinal==null){
            num1 = num1+"9";
        }
        else if (num2==null && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "9"; 
            }else{
                num1 = "9";
            }
        }
        else if (num2=="" && sinal!=null){
            if (num1!=null && num1!=""){
               num2 = "9"; 
            }else{
                num1 = "9";
            }
        }
    }
    
    public void limpar(){
        txtResultado.setText("");
        num1=null;
        num2=null;
        sinal=null;
    }
    
    public void buttonMais(){
        sinal="+";
    }
    
    public void buttonVezes(){
        sinal="*";
    }
    
    public void buttonMenos(){
        sinal="-";
    }
    
    public void buttonDivide(){
        sinal="/";
    }
    
    public void buttonIgual(){
        Integer n1 = Integer.parseInt(num1);
        Integer n2 = Integer.parseInt(num2);
        
        if (sinal=="+"){
            result=n1+n2;
            txtResultado.setText(Integer.toString(result));
        }
        else if (sinal=="-"){
            result=n1-n2;
            txtResultado.setText(Integer.toString(result));
        }
        else if (sinal=="/"){
            result=n1/n2;
            txtResultado.setText(Integer.toString(result));
        }
        else if (sinal=="*"){
            result=n1*n2;
            txtResultado.setText(Integer.toString(result));
        }
        else if (sinal==""){
            txtResultado.setText("Operação inálida!");
        }
        else if (sinal==null){
            txtResultado.setText("Operação inálida!");
        }
    }
    
    public void buttonUser(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/edu/ifro/view/CadastrarUsuario.fxml"));
            Scene scene = new Scene(root, 480, 480);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Calculadora - cadastrar usuário");
            stage.show();
            stage.setResizable(false);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void buttonHist(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/edu/ifro/view/Historico.fxml"));
            Scene scene = new Scene(root, 480, 480);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Calculadora - histórico");
            stage.show();
            stage.setResizable(false);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}
