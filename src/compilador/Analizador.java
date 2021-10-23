/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;

/**
 *
 * @author GUTIERREZ-PC
 */
public class Analizador {
    
    ArrayList<Token> lista_token = new ArrayList();

    public Analizador(ArrayList<Token> lista_token) {
        this.lista_token = lista_token;
    }
    
    public void analizar(String cadena){
        
        System.out.println("Analizar");
        
        int estado = 0;
        int decimal = 0;
        int numero_token = 0;
        String lexema = "";
        String tipo = "";
        String [] lineas = separador(cadena, '\n');
        
        for (int i = 0; i < lineas.length; i++){ //RECORRE CADA VEZ QUE ENCUENTRA UNA NUEVA LINEA
            for (int j = 0; j < lineas[i].length(); j++){ // RECORRE CADA VEZ QUE ENCUENTRA UN NUEVO CARACTER             
                  lexema = lexema + lineas[i].charAt(j);
                            if (lexema == "public" || lexema == "void" ){
                                estado = 1;
                            }else{
                                numero_token = 1;
                                tipo = "reservada";
                                estado = 0;
                            } 
                                       
                 }if (estado == 0){
                    lista_token.add(new Token(lexema, tipo));
                    lexema = "";
                    tipo = "";
                }
                if(estado == -2){
                    estado = 0;
                }
            }
        }        

    
    
    public int estado_transicion (String n){
        System.out.println("Entro al metodo");
            if ( (n == "public") ){
               System.out.println("Entro Transicion");
            }  System.out.println("Retorna 1"); return 2 ;
            
                
        }
  
        
    /*
        public int estado_transicion (int n){
            if ( (n > 96 && n < 123) || (n > 64 && n < 91) ){
                return 1;
                
            }else if(n > 47 && n < 58){
                return 2;
            }
            else if (n==32||n==13||n==9){
                return 100;
            }else{
                return 999;
            }
        }

    */
    
    public String[] separador(String texto, char separar){ // METODO PARA SEPARAR LA CADENA POR SALTOS DE LINEA
        String linea    =""; 
        int contador = 0;
        for (int i = 0; i< texto.length(); i++){ // RECORRER EL TEXTO QUE ESTAMOS RECIBIENDO
          
            if (texto.charAt(i) == separar){ // CONTADOR DE CANTIDAD DE LINEAS EN NUESTRA CADENA
                contador++;
                System.out.println("Entro al metodo separar " + texto);
            }
        }
      
        String [] cadenas = new String[contador]; // TOMAR EL TAMAÑO EL CONTADOR
        contador = 0;
        for (int i = 0; i  < texto.length(); i++){ // RECORRER DE NUEVO EL TEXTO
            System.out.println("Entro al metodo separar " + texto);
            if(texto.charAt(i) != separar){
                linea = linea + String.valueOf(texto.charAt(i)); //CONCATENAR
            }else{
                cadenas[contador] = linea;
                System.out.println(texto);
                contador++;
                linea = "";
            }
        }
        return cadenas;
    }
    
    
    
    
    
}
