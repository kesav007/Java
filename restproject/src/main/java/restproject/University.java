package restproject;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/university")
public class University {

	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLUniversityInfo() {
		return "<html><body>Hello From HTML Test</body></html>";
	}

	@GET
	@Path("{first}/{second}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPaths(@PathParam("first") String first, @PathParam("second") String second) {
		return first + " " + second;
	}

	@GET
	@Path("/query")
	@Produces(MediaType.TEXT_PLAIN)
	public String getQuery(@QueryParam("first") String first, @QueryParam("second") String second) {
		return first + " " + second;
	}

	@GET
	@Path("/matrix")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMtx(@MatrixParam("first") String first, @MatrixParam("second") String second) {
		return first + " " + second;
	}

	@PUT
	@Path("/{studentRollNo}")
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInof(@PathParam("studentRollNo") String studentRollNo) {
		return "Updated Successfully";
	}

	@GET
	@Path("/emps")
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getEmployees() {
		return createDummy();
	}

	private List<Employee> createDummy() {
		List<Employee> emps = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Employee emp = new Employee();
			emp.setFname("First " + i);
			emp.setLname("Last " + i);
			emps.add(emp);
		}
		return emps;
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_XML)
	public String add(Employee emp) {
		System.out.println(emp);
		return "added";
	}
}
