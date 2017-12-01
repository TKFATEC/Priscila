/*  .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   .   */
package Beans;

import          java.io.Serializable;
import          javax.ejb.Stateful;
import          javax.faces.annotation.FacesConfig;
import  static  javax.faces.annotation.FacesConfig.Version.JSF_2_3;
import          javax.faces.view.ViewScoped;
import          javax.inject.Named;

@FacesConfig    (version = JSF_2_3)

@Named          ("paginaInicialBean")
@Stateful
@ViewScoped
public  class   PaginaInicialBean    implements  Serializable    {
    private static  final   long    serialVersionUID    = 0xEB0000L;
    private                 String  urlAtual;
    
    public  PaginaInicialBean   () {
        this.urlAtual   = "/PAGINAS/ator.xhtml";
    }
    
    public  String  getUrlAtual () {
        return  urlAtual;
    }
    
    public  void    setUrlAtual (String urlAtual) {
        this.urlAtual   = "/PAGINAS/" + urlAtual + ".xhtml";
    }
}