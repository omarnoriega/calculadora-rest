import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarnoriega
 */

@Path("calculator")
public class operations {

    /**
     *
     * @param operation
     * @param path
     * @return
     */

@GET
@Path("/{operation}/{subResources: [0-9_/]+}")
@Produces("application/json")
public String main(@PathParam("operation") String operation, @PathParam("subResources") String path) 
{
   return calc.main(path, operation);   
}

}