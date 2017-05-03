/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author zippy
 */
public abstract class Context implements CommandContext{
    /**
     * Contiene el contexto actual en el cual los comandos
     * se estaran ejecutando.
     */
    private static Context currentContext;
    
    /**
     * Setea el contexto actual en el cual los comandos 
     * se estaran ejecutando.
     * 
     * @param context 
     */
    public static void setContext(Context context){
        currentContext = context;
    }
    
    /**
     * Regresa el contexto actual
     * @return 
     */
    public static Context getContext(){
        return currentContext;
    }
    
}
