


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarnoriega
 */
public class calc {

public static String main( String path, String operation )
{
    float n = 0;
    int n3 =1;
    float n4 =1;
    for (String retval: path.split("/")) {
    
        switch (operation) {
            case "add":
          
            n = n + Integer.valueOf(retval);
            break;
             case "subs":
                n = n - Integer.valueOf(retval);
                break;
            case "mult":
                 n3 = n3 * Integer.valueOf(retval);
                 n = n3;
                 break;
            case "div":
                n4 = n4 / Integer.valueOf(retval);
                n = n4;
                break;
            default: 
                operation = "Función "+operation+" no existe";
                n =0;
                        }
        } 
    
    return operation +" "+ String.valueOf(n);
}
}
