package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import com.vaadin.flow.component.Key;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.button.ButtonVariant;
//import com.vaadin.flow.component.dependency.CssImport;
//import com.vaadin.flow.component.notification.Notification;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.TextField;
//import com.vaadin.flow.router.Route;
//import com.vaadin.flow.server.PWA;

public class SubPage1 extends Div{
    Div ya;
    Div supl;
    int counter = 0;
    public SubPage1() {
        super();
        ya = this;
        System.out.println("In SubPage1");
        setText("Hello @Route!");

        supl = new Div();
        supl.setText("Its a suplement");
        supl.addClassName("elem1");
        add(supl);
        Anchor toMain = new Anchor("", "Go Home");
        add(toMain);

        Button button_3 = new Button("Say hello", e -> {
            String sss = supl.getText();
            counter++;
            supl.setText("Button hb Pressed! " + counter);
        });
        add(button_3);
        Button button_4 = new Button("Change cont3");
        add(button_4);


    }


    public Div getInst(){
        return this;
    }

//    private void buttonOnClick(ClickEvent event){
//
//        return;
//    }

}
