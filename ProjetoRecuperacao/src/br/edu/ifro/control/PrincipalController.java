/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Carro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author 04079893230
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField resultado;
    @FXML
    private TextField txtNumero2;
    @FXML
    private Button btnSOMA;
    @FXML
    private Button btnSOMA1;
    @FXML
    private Button btnSOMA11;
    @FXML
    private Button btnSOMA111;
    @FXML
    private TextField txtCor;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtAno;
    
    @FXML
    private void soma(ActionEvent event) {
       Double n1, n2 , res;
       //Para que serve o Double.parseDouble? converter pois pois n1 é Double e o getText() retorna String
       n1= Double.parseDouble(txtNumero1.getText());
       n2= Double.parseDouble(txtNumero1.getText());
       res= n1+n2;
       
       //toString converte de Double para String 
       
       resultado.setText(res.toString());
    }
    
    @FXML
    private void sobtrair(ActionEvent event) {
       Double n1, n2 , res;
       //Para que serve o Double.parseDouble? converter pois pois n1 é Double e o getText() retorna String
       n1= Double.parseDouble(txtNumero1.getText());
       n2= Double.parseDouble(txtNumero1.getText());
       res= n1- n2;
       
       //toString converte de Double para String 
       
       resultado.setText(res.toString());
    }
    
    @FXML
    private void multiplicar(ActionEvent event) {
       Double n1, n2 , res;
       //Para que serve o Double.parseDouble? converter pois pois n1 é Double e o getText() retorna String
       n1= Double.parseDouble(txtNumero1.getText());
       n2= Double.parseDouble(txtNumero1.getText());
       res= n1*n2;
       
       //toString converte de Double para String 
       
       resultado.setText(res.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dividir(ActionEvent event) {
         Double n1, n2 , res;
       //Para que serve o Double.parseDouble? converter pois pois n1 é Double e o getText() retorna String
       n1= Double.parseDouble(txtNumero1.getText());
       n2= Double.parseDouble(txtNumero1.getText());
       res= n1/n2;
       
       //toString converte de Double para String 
       
       resultado.setText(res.toString());
    }
    @FXML
    private void gravar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");// Para fazer comunicação com o banco de dado ele traduz a interação em sql 

        EntityManager em = emf.createEntityManager();
        Carro carro = new Carro();
        
        
        carro.setAno(Integer.parseInt(txtAno.getText()));
        carro.setCor(txtCor.getText());
        carro.setModelo(txtModelo.getText());
        
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction() .commit();
    }

    
  
    
}
