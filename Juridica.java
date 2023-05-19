/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade02.atividade03;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String incricaojudicial;

    public Juridica(String cnpj, String incricaojudicial, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.incricaojudicial = incricaojudicial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaojudicial() {
        return incricaojudicial;
    }

    public void setIncricaojudicial(String incricaojudicial) {
        this.incricaojudicial = incricaojudicial;
    }

    @Override
    public String toString() {
        return       "cnpj:" + cnpj 
               + "\n nome:" + super.nome
               + "\n telefone:" + super.telefone
               + "\n incricaojudicial=" + incricaojudicial;
    }
    
    
}
