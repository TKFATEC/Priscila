/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package Entidades;

import  java.io.Serializable;
import  javax.persistence.Entity;
import  javax.persistence.Id;

@Entity
public  class   Acesso  implements  Serializable    {
    private static  final   long    serialVersionUID    =   0xCC0002L;
    
    @Id
    private int     idAcesso;
    private String  login_usuario;
    private String  senha;
    private String  cargo;
    private String  cpf;

    public  int     getIdAcesso     () {
        return  idAcesso;
    }

    public  String  getLogin_usuario() {
        return  login_usuario;
    }

    public  String  getSenha        () {
        return  senha;
    }

    public  String  getCargo        () {
        return  cargo;
    }

    public  String  getCpf          () {
        return  cpf;
    }

    public  void    setidAcesso     (int IDAcesso) {
        this.idAcesso       = IDAcesso;
    }

    public  void    setLogin_usuario(String login_usuario) {
        this.login_usuario  = login_usuario;
    }

    public  void    setSenha        (String senha) {
        this.senha          = senha;
    }

    public  void    setCargo        (String cargo) {
        this.cargo          = cargo;
    }

    public  void    setCpf          (String cpf) {
        this.cpf            = cpf;
    }
}