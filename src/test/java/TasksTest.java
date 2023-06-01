import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.*;

public class TasksTest {

    @Test
    public void shouldMatchSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean expected = false;
        boolean actual = simpleTask.matches("12312");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchEpicTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchEpicFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Масло");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMatchMeetingFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean expected = false;
        boolean actual = meeting.matches("Сбербанк");
        Assertions.assertEquals(expected, actual);
    }
}
