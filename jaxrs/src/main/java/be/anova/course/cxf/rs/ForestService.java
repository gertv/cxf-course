package be.anova.course.cxf.rs;

import be.anova.course.cxf.Forest;
import be.anova.course.cxf.Tree;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * RESTful forest service implementation
 */
@Path("/forest")
@Produces({"application/xml", "application/json"})
public class ForestService {

    private Forest forest;

    @GET
    public Forest getForest() {
        return forest;
    }

    @GET
    @Path("/tree/{id}")
    public Tree getTree(@PathParam("id") int id) {
        return forest.getTrees().get(id);
    }

    @POST
    @Consumes("application/xml")
    public Response update(Forest forest) {
        this.forest = forest;
        return Response.ok().build();
    }

    public void setForest(Forest forest) {
        this.forest = forest;
    }


}
