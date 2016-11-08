/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoerin;

import java.util.List;

/**
 *
 * @author Laboratorio
 */
public class NotaFiscal {
    private Integer numero;
    private Integer data;
    private String CNPJ;
    private List<Item> Item;

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the data
     */
    public Integer getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Integer data) {
        this.data = data;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    /**
     * @return the Item
     */
    public List<Item> getItem() {
        return Item;
    }

    /**
     * @param Item the Item to set
     */
    public void setItem(List<Item> Item) {
        this.Item = Item;
    }
    
     
    public Double getValorNota(){
        return 10.0;
    }
    
    public Double getFaturamento(){
        return 100.0;
    }

}
