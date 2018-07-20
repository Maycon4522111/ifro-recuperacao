
package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
    //por que colocamos o @Entity?
    //Para informar ao java que é um mapeamento no banco de dados 
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;  // Id?  Indicar para hibernate que aquele campo id pertence a id da tabela 
    private String modelo;
    private Integer ano;
    private String cor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
   
}
