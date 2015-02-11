package controllers;

import models.Perola;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.crud;
import views.html.index;

public class Application extends Controller {
    static Form<Perola> taskForm = Form.form(Perola.class);

    public static Result index() {
        return ok(index.render("Pérolas"));
    }
    public static Result crud() {
        return ok(crud.render(Application.taskForm));
    }

    public static Result random() {
        return ok(Perola.getRandom());
    }

    public static Result newPerola() {
        System.out.println(taskForm.data());
        return TODO;
    }
}
