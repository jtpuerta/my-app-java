package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger LOGGER = LogManager.getLogger(App.class);
    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // On produit un log de niveau informatif.
        LOGGER.log( Level.INFO, "Hello World with Log4J 2" );

        // On produit un log de niveau erreur.
        LOGGER.log( Level.ERROR, "Houston, we have a problem" );
	    
	    
	    
    }
}
