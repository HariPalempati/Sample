package service;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import org.codehaus.jackson.map.ObjectMapper;

@Path("get")
public class Test {
	//ObjectMapper mapper = new ObjectMapper();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	//@Path("person")
	public Response getIt() {
		return Response.status(200).entity("hii").build();
		}
}