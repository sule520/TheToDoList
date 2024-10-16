import java.time.LocalDateTime;

public class ToDoList {
    String aufgabe;
    LocalDateTime ldt = LocalDateTime.now();
    boolean erledigt;
    int prio;
    public ToDoList(String aufgabe, boolean erledigt, int prio) {
        this.aufgabe = aufgabe;
        this.erledigt = erledigt;
        this.prio = prio;
    }
}
