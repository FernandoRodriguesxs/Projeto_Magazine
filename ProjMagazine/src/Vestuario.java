/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonubc
 */
public class Vestuario extends Promocao{
    public String tamanho;
    public String sexo;
    
    public double CalcularPromocao(){
        double promocao = this.preco - this.preco*0.20;
        return promocao;
    }
}
