package com.potulad.learning.designpatterns.iterator;

import lombok.NonNull;

import java.util.Iterator;

/**
 * Scheduler to process task items.
 */
public abstract class Scheduler {

    /**
     *  Process all the taskItems in the Scheduler.
     */
    public void processAll() {
        final Iterator<TaskItem> itemIterator = getIterator();
        while(itemIterator.hasNext()) {
            final TaskItem taskItemToProcess = itemIterator.next();
            process(taskItemToProcess);
        }
    }

    /**
     * Process one taskItem and remove from the list.
     */
    public abstract void process(TaskItem taskItem);

    /**
     * Add a taskItem to this scheduler
     */
    public abstract void addTaskItem(@NonNull TaskItem taskItem);

    /**
     * Get the iterator for this scheduler.
     */
    @NonNull
    public abstract Iterator<TaskItem> getIterator();
}
