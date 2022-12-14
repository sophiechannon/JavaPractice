package todolist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoListTest {
    @Test public void testGetTasksNoItems() {
        TodoList list = new TodoList();
        List<String> res = new ArrayList<String>();
        assertEquals("should return array of tasks", res, list.getTasks());
    }
    @Test public void testGetTasksWithItemsAdded() {
        TodoList list = new TodoList();
        list.addTask("clean");
        list.addTask("cook");
        List<String> res = Arrays.asList("clean", "cook");
        assertEquals("should return array of tasks", res, list.getTasks());
    }
}
