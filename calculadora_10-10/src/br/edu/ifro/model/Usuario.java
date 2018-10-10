package br.edu.ifro.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usu;
    private String username_usu;
    private String senha_usu;

    // GETTERS E SETTERS
        public Integer getId_usu() {
            return id_usu;
        }

        public void setId_usu(Integer id_usu) {
            this.id_usu = id_usu;
        }

        public String getSenha_usu() {
            return senha_usu;
        }

        public void setSenha_usu(String senha_usu) {
            this.senha_usu = senha_usu;
        }

        public String getUsername_usu() {
            return username_usu;
        }

        public void setUsername_usu(String username_usu) {
            this.username_usu = username_usu;
        }
}
