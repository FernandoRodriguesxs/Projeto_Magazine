import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logonubc
 */
public class Eletroeletronico extends Promocao{
    public int voltagem;
    public int potencia;
   
    public double CalcularPromocao(){
        double promocao = this.preco - this.preco*0.10;
        return promocao;
    }
}
