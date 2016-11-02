package my.vaadin.app;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import javax.servlet.annotation.WebServlet;
import java.util.List;

/**
 * This UI is the application entry point. A UI may either represent a browser window
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUiSecond extends UI {


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final TextField name = new TextField("Name");
        final Button greetButton = new Button("Greet");

        greetButton.addClickListener(
                e -> Notification.show("Hi " + name.getValue())
        );
        setContent(new VerticalLayout(name, greetButton));
    }

    @WebServlet(urlPatterns = "/testing2/*", name = "MyUiSecondServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUiSecond.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
