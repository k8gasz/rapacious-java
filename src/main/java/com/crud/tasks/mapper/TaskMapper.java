package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {

    public Task mapToTask(final TaskDto taskDto) {
        return new Task(
                taskDto.getTaskId(),
                taskDto.getTaskTitle(),
                taskDto.getTaskContent());
    }

    public TaskDto mapToTaskDto(final Task task) {
        return new TaskDto(
                task.getTaskId(),
                task.getTaskTitle(),
                task.getTaskContent());
    }

    public List<TaskDto> mapToTaskDtoList(final List<Task> taskList) {
        return taskList.stream()
                .map(t -> new TaskDto(t.getTaskId(), t.getTaskTitle(), t.getTaskContent()))
                .collect(Collectors.toList());
    }

}
