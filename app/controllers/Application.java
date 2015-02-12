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
        Perola perola = Perola.getRandom();
        return ok(index.render(perola));
    }
    public static Result crud() {
        return ok(crud.render(Application.taskForm, Perola.find.all()));
    }

    public static Result random() {
        Perola perola = Perola.getRandom();
        return ok(perola.texto + "\n-- " + perola.autor);
    }

    public static Result delete(Long id) {
        Perola.find.byId(id).delete();
        if (request().method().toUpperCase() == "GET") {
            return redirect("/edit");
        }
        return ok();
    }

    public static Result newPerola() {
        System.out.println(request().body());

        Perola newPerola = new Perola();
        newPerola.autor = request().body().asFormUrlEncoded().get("autor")[0];
        newPerola.texto = request().body().asFormUrlEncoded().get("texto")[0];
        newPerola.save();

        return redirect("/edit");
    }
}
