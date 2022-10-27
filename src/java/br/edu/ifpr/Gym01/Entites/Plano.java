/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.Gym01.Entites;

/**
 *
 * @author lucas
 */
public class Plano {
    private int valor;
    private String descricao;
    private int id;
      
      
    public Plano(String descricao, int valor) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public Plano(int id, String descricao, int valor) {
        this.valor = valor;
        this.descricao = descricao;
        this.id = id;
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plano() {
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
