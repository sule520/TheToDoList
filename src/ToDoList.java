import javax.management.ConstructorParameters;
import java.time.LocalDateTime;

public class ToDoList {
    String aufgabe;
    LocalDateTime ldt = LocalDateTime.now();
    boolean erledigt;
    int prio;

    @Override
    public String toString() {
        return "ToDoList{" +
                "aufgabe='" + aufgabe + '\'' +
                ", ldt=" + ldt +
                ", erledigt=" + erledigt +
                ", prio=" + prio +
                '}';
    }

    public ToDoList(String aufgabe, boolean erledigt, int prio) {
        this.aufgabe = aufgabe;
        this.erledigt = erledigt;
        this.prio = prio;

    }
    }

