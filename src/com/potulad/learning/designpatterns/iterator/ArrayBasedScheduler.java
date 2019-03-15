package com.potulad.learning.designpatterns.iterator;

import lombok.NonNull;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * A Scheduler that uses an Array based implementation of taskItems
 */
public class ArrayBasedScheduler extends Scheduler {

    /**
     * Original size of the Array to store taskItems.
     */
    private static final int ORIGINAL_ARRAY_SIZE = 2;

    /**
     * Array to store the taskItems.
     */
    private TaskItem[] taskItems = new TaskItem[ORIGINAL_ARRAY_SIZE];

    /**
     * Current size of the taskItems array.
     */
    private int taskItemsSize = 0;

    /**
     * Max size of the taskItems.
     */
    private int maxTaskItemsSize = ORIGINAL_ARRAY_SIZE;

    @Override
    public void process(@NonNull TaskItem taskItem) {
        System.out.println("Processing Array taskItem - " + taskItem);
    }

    /**
     * Add taskItem to array if within the array size limits. If it exceeds the size limit, double the size of the
     * array and copy the elements.
     */
    @Override
    public void addTaskItem(@NonNull TaskItem taskItem) {
        if(taskItemsSize + 1 <= maxTaskItemsSize) {
            taskItems[taskItemsSize] = taskItem;
            taskItemsSize++;
        } else {
            final TaskItem[] newTaskItems = new TaskItem[maxTaskItemsSize * 2];

            for(int i = 0 ; i < maxTaskItemsSize; i++) {
                newTaskItems[i] = taskItems[i];
            }
            newTaskItems[maxTaskItemsSize] = taskItem;

            taskItemsSize++;
            maxTaskItemsSize = maxTaskItemsSize * 2;
            taskItems = newTaskItems;
        }
    }

    @Override
    public Iterator<TaskItem> getIterator() {
        return new ArrayBasedIterator(this.taskItems);
    }

    /**
     * Create an Iterator to iterate over the given array.
     */
    private class ArrayBasedIterator implements Iterator<TaskItem> {

        private final TaskItem[] taskItems;

        private int index;

        public ArrayBasedIterator(TaskItem[] taskItems) {
            this.taskItems = taskItems;
            index = 0;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Removals not permitted in the Array based implementation");
        }

        @Override
        public boolean hasNext() {
            if(index >= taskItems.length || taskItems[index] == null) {
                return false;
            }
            return true;
        }

        @Override
        public TaskItem next() {
            if(index >= taskItems.length) {
                throw new NoSuchElementException("No more elements in Array");
            }
            return taskItems[index++];
        }
    }
}
