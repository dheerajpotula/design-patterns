package com.potulad.learning.designpatterns.iterator;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A scheduler that uses a ArrayList based implementation for storing taskitems.
 */
public class ArrayListBasedScheduler extends Scheduler {

    private final List<TaskItem> taskItemList = new ArrayList<>();

    @Override
    public void process(@NonNull TaskItem taskItem) {
        System.out.println("Processing ArrayList taskItem - " + taskItem);
    }

    @Override
    public void addTaskItem(@NonNull TaskItem taskItem) {
        taskItemList.add(taskItem);
    }

    @Override
    public Iterator getIterator() {
        return taskItemList.iterator();
    }
}
