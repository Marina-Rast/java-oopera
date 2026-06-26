import java.util.ArrayList;
public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Сергей", "Завьялов", "мужской", 186);
        Actor actor2 = new Actor("Наталья", "Оглезнева", "женский", 167);
        Actor actor3 = new Actor("Себастьян", "Вавилов", "мужской", 192);

        Director director1 = new Director("Михаил", "Комлев", "мужской", 200);
        Director director2 = new Director("Даниил", "Петров", "мужской", 40);

        Show show = new Show("Белые ночи", 120,director2, new ArrayList<>());
        show.addActors(actor2);
        show.addActors(actor3);
        System.out.println("Актёры обычного спектакля: ");
        show.informationAboutActors();
        System.out.println();

        Ballet ballet = new Ballet("Лебединое озеро", 80,director1,new ArrayList<>(),
                "Дмитрий Лужин", "Сад перед замком владетельной принцессы. На лужайке " +
                "веселится молодежь. Забавные пляски шута сменяются танцами девушек и их кавалеров.\n" +
                "Владетельная принцесса сообщает своему сыну принцу Зигфриду, что завтра на балу ему предстоит" +
                " выбрать невесту среди девушек, приглашенных на праздник....","Валерия Курносова");
        ballet.addActors(actor1);
        ballet.addActors(actor2);
        System.out.println("Актёры балета: ");
        ballet.informationAboutActors();
        System.out.println();

        Opera opera = new Opera("Кармен", 90, director1, new ArrayList<>(),
                "Ксения Ушкина", "\"Действие происходит в Испании, в Севилье. Цыганка " +
                "Кармен соблазняет солдата дона Хозе. Он нарушает присягу и присоединяется к контрабандистам." +
                " Но Кармен влюбляется в тореро Эскамильо." +
                " На арене, во время корриды, дон Хозе убивает Кармен.\"", 9);
        opera.addActors(actor1);
        opera.addActors(actor2);
        opera.addActors(actor3);
        System.out.println("Актёры оперы: ");
        opera.informationAboutActors();
        System.out.println();

        show.replaceActor("Вавилов", actor1);
        System.out.println("Новая информация про актёров балета: ");
        show.informationAboutActors();
        System.out.println();

        System.out.println("Можно ли заменить актёра на несуществующего человека в труппе?");
        ballet.replaceActor("Пушкин",actor1);
        System.out.println();

        System.out.println("Либретто для оперы: ");
        opera.printToLibretto();
        System.out.println();
        System.out.println("Либретто для балета: ");
        ballet.printToLibretto();
    }
}
