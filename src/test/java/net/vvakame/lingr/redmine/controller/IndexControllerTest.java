package net.vvakame.lingr.redmine.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.slim3.tester.ControllerTestCase;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

/**
 * @author vvakame
 */
public class IndexControllerTest extends ControllerTestCase {

	/**
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 * @throws IOException
	 * @throws ServletException
	 * @author vvakame
	 */
	@Test
	public void test() throws NullPointerException, IllegalArgumentException, IOException,
			ServletException {
		tester.start("/redmine");
		assertThat(tester.response.getStatus(), is(equalTo(HttpServletResponse.SC_OK)));
	}
}
