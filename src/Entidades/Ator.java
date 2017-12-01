/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package Entidades;

import  java.io.Serializable;
import  javax.persistence.Entity;
import  javax.persistence.Id;

@Entity
public  class   Ator    implements  Serializable    {
    private static  final   long    serialVersionUID    = 0xCC0003L;
    @Id
    private                 int     idAtor;
    private                 String  nome;
    private                 String  descricao;
    
    public  Ator    () {
        this.nome       = "";
        this.descricao  = "";
    }

    public  int     getIdAtor   () {
        return  idAtor;
    }

    public  String  getNome     () {
        return  nome;
    }

    public  String  getDescricao() {
        return  descricao;
    }

    public  void    setNome     (String nome) {
        this.nome       = nome;
    }

    public  void    setDescricao(String descricao) {
        this.descricao  = descricao;
    }
}