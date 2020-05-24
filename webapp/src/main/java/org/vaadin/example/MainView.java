package org.vaadin.example;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.component.html.Anchor;

//import com.vaadin.flow.component.*;

import com.vaadin.flow.component.icon.*;
import com.vaadin.flow.component.html.*;
//import com.vaadin.flow.component.grid.*;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@PWA(name = "Project Base for Vaadin", shortName = "Project Base", enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    public MainView() {
        // Use TextField for standard text input
        TextField textField = new TextField("Your name");

        // Button click listeners can be defined as lambda expressions
        GreetService greetService = new GreetService();

        Button button = new Button("Say hello",
                e -> Notification.show(greetService.greet(textField.getValue())));

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button is more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
//        addClassName("centered-content");


        add(textField, button);

        //---------------------------------------------------------------------------
        Div container = new Div();
        container.setText("The VAADIN_H icon was clicked!");
        add(container);

        Button button_2 = new Button("Say hello",
                e -> container.setText(greetService.greet(textField.getValue())));

        Icon edit = new Icon(VaadinIcon.EDIT);
        add(button_2, edit);

        Icon logo = new Icon(VaadinIcon.VAADIN_H);
        logo.setSize("100px");
        logo.setColor("orange");
        add(logo);

        Anchor toSub1 = new Anchor("vvv", "Blog");
        add(toSub1);

    }

    @Route("vvv")
    //@PWA(name = "Project Base for Vaadin", shortName = "Project Base", enableInstallPrompt = false)
    @CssImport("./styles/shared-styles.css")
    @CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")

//    public static class SubView extends VerticalLayout {
    public static class SubView extends VerticalLayout  {

        public SubView() {
            System.out.println("In vvv");
            Div cont = new Div();
            cont.setText("Its a Subpage1 page!");
            add(cont);
            SubPage1 vvv = new SubPage1();
            add(vvv.getInst());

        }
    }
}


//    public class MainView extends VerticalLayout {
//
//        private CustomerService service = CustomerService.getInstance();
//        private Grid<Customer> grid = new Grid<>(Customer.class);
//
//        public MainView() {
//            grid.setColumns("firstName", "lastName", "status");
//            add(grid);
//            setSizeFull();
//            updateList();
//        }
//
//        public void updateList() {
//            grid.setItems(service.findAll());
//        }
//    }
