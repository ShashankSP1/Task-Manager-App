package com.task.management.source;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {
    Long countById(Integer id);
}
