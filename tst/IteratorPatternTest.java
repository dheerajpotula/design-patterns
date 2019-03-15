import com.potulad.learning.designpatterns.iterator.ArrayBasedScheduler;
import com.potulad.learning.designpatterns.iterator.ArrayListBasedScheduler;
import com.potulad.learning.designpatterns.iterator.HashMapBasedScheduler;
import com.potulad.learning.designpatterns.iterator.Scheduler;
import com.potulad.learning.designpatterns.iterator.TaskItem;

import java.util.Iterator;

public class IteratorPatternTest {
    public static void main(String args[]) {
        System.out.println("Hash Map : ");
        Scheduler scheduler = new HashMapBasedScheduler();
        scheduler.addTaskItem(createTaskItem(1, "HashMap", 123));
        scheduler.addTaskItem(createTaskItem(2, "HashMap", 234));
        scheduler.addTaskItem(createTaskItem(3, "HashMap", 345));
        scheduler.addTaskItem(createTaskItem(4, "HashMap", 456));
        testScheduler(scheduler);
        System.out.println();

        System.out.println("Array List : ");
        scheduler = new ArrayListBasedScheduler();
        scheduler.addTaskItem(createTaskItem(5, "ArrayList", 123));
        scheduler.addTaskItem(createTaskItem(6, "ArrayList", 234));
        scheduler.addTaskItem(createTaskItem(7, "ArrayList", 345));
        scheduler.addTaskItem(createTaskItem(8, "ArrayList", 456));
        testScheduler(scheduler);
        System.out.println();

        System.out.println("Arrays : ");
        scheduler = new ArrayBasedScheduler();
        scheduler.addTaskItem(createTaskItem(9, "Array", 123));
        scheduler.addTaskItem(createTaskItem(10, "Array", 234));
        testScheduler(scheduler);

        scheduler.addTaskItem(createTaskItem(11, "Array", 345));
        scheduler.addTaskItem(createTaskItem(12, "Array", 456));
        scheduler.addTaskItem(createTaskItem(13, "Array", 345));
        scheduler.addTaskItem(createTaskItem(14, "Array", 456));
        testScheduler(scheduler);
        System.out.println();
    }

    public static TaskItem createTaskItem(long taskId, String taskName, long taskStartTimeInMillis) {
        return new TaskItem(taskId, taskName, taskStartTimeInMillis);
    }

    public static void testScheduler(Scheduler scheduler) {
        final Iterator<TaskItem> itemIterator = scheduler.getIterator();
        while(itemIterator.hasNext()) {
            System.out.println(itemIterator.next());
        }
        scheduler.processAll();
    }
}
