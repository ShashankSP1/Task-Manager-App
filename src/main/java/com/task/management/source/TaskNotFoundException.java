package com.task.management.source;

public class TaskNotFoundException extends Throwable{
    public TaskNotFoundException(String message){

        super(message);
    }
}