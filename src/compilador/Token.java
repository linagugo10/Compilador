/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

/**
 *
 * @author GUTIERREZ-PC
 */
public class Token {
    private String lexema;
    private String tipo;

    public Token() {
    }

    public Token(String lexema, String tipo) {
        this.lexema = lexema;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    @Override
    public String toString() {
        return "Token[" + "lexema=" + lexema + ", tipo=" + tipo + ']';
    }
    
    
    
    
}
