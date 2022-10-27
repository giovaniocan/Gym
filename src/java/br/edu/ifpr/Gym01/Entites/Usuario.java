/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.Gym01.Entites;


public class Usuario {
    
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Boolean isAdm;
    private int id_Plano;
    private byte[] img;
    private String imgtipo;

    public Usuario(String nome, String email, String senha, Boolean isAdm, byte[] img, String imgtipo) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdm = isAdm;
        this.img = img;
        this.imgtipo = imgtipo;
    }
    
    public Usuario(int id, String nome, String email, String senha, Boolean isAdm, byte[] img, String imgtipo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdm = isAdm;
        this.img = img;
        this.imgtipo = imgtipo;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public String getImgtipo() {
        return imgtipo;
    }

    public void setImgtipo(String imgtipo) {
        this.imgtipo = imgtipo;
    }

    public Usuario() {
    }
    
     public Usuario(int id, String nome,String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
       
    }
    public Usuario(String nome,String email, String senha, Boolean isAdm) {
           this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdm = isAdm;
    }
    
        public Usuario( String nome,String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
       
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Plano() {
        return id_Plano;
    }

    public void setId_Plano(int id_Plano) {
        this.id_Plano = id_Plano;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getIsAdm() {
        return isAdm;
    }

    public void setIsAdm(Boolean isAdm) {
        this.isAdm = isAdm;
    }
    
    
}
