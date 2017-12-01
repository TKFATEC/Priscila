/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package Entidades;

import  java.io.Serializable;
import  javax.persistence.Entity;
import  javax.persistence.Id;

@Entity
public  class   Acervo  implements  Serializable    {
    public  static  final   long    serialVersionUID    = 0xCC0001L;
    
    @Id
    private int idAcervo;
    private int idFilme;
    private int idProdutora;
    private int idAtor;

    public int getIdAcervo() {
        return  idAcervo;
    }

    public int getIdFilme() {
        return  idFilme;
    }

    public int getIdProdutora() {
        return  idProdutora;
    }

    public int getIdAtor() {
        return  idAtor;
    }

    public void setIdAcervo(int idAcervo) {
        this.idAcervo       = idAcervo;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme        = idFilme;
    }

    public void setIdProdutora(int idProdutora) {
        this.idProdutora   = idProdutora;
    }

    public void setIdAtor(int idAtor) {
        this.idAtor         = idAtor;
    }
}