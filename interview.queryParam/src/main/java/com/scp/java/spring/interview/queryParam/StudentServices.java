package com.scp.java.spring.interview.queryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
@Path("/restwb")
public class StudentServices {
	@GET
	@Path("/data")
	@Produces("application/json")
	public Student getStudentDetails(@QueryParam("name") String name,
			@QueryParam("collegeName") String collegeName) {
		Student student = new Student();
		student.setName(name);
		student.setCollegeName(collegeName);
		return student;
   }
}
