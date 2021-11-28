package ifrs.pw2.paulo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/curso")
public class Curso {

  @ConfigProperty(name = "IFRS.pw2") 
  String message;
  
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String curso() {

      return "Nome do curso: "+message;

    }
}