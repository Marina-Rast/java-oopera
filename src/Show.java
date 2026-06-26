import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void informationAboutActors() {
        for (Actor actor : listOfActors) {
            System.out.println("Информация об актёре: " + actor.getName() + " " + actor.getSurname() +
                    " (" + actor.getHeight() + ")");
        }
    }

    public void addActors(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Такой актёр уже есть в списке!");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + surname + " заменён на актёра " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Актёр с такой фамилией не найден!");
    }

}
