@Path("/forest")
@Produces({"application/xml", "application/json"})
public class ForestService {

    @GET
    public Forest getForest() {
        // some code here
    }

    @GET
    @Path("/tree/{id}")
    public Tree getTree(@PathParam("id") int id) {
        // some code here
    }

    @POST
    @Consumes("application/xml")
    public Response update(Forest forest) {
        // some code here
        return Response.ok().build();
    }
}
