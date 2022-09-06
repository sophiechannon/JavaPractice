package todolist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TodoTest {
    @Test public void testGetTasks() {
        TodoList list = new TodoList();
        list.addTask("Clean");
        list.addTask("Shop");
        String[] result = {"Clean", "Shop"};
        assertEquals("Should return list of tasks", result, list.getTasks();
    }
}
}
