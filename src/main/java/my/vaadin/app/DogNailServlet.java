package my.vaadin.app;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/VAADIN/*", name = "MyVaadinServlet", asyncSupported = true)
public class DogNailServlet extends VaadinServlet {

}
