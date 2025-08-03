package com.railse.hiring.workforcemgmt.service;

import com.railse.hiring.workforcemgmt.model.Comment;
import com.railse.hiring.workforcemgmt.dto.*;
import com.railse.hiring.workforcemgmt.model.enums.Priority;

import java.util.List;


public interface TaskManagementService {
    List<TaskManagementDto> createTasks(TaskCreateRequest request);
    List<TaskManagementDto> updateTasks(UpdateTaskRequest request);
    String assignByReference(AssignByReferenceRequest request);
    List<TaskManagementDto> fetchTasksByDate(TaskFetchByDateRequest request);
    TaskManagementDto findTaskById(Long id);
    TaskManagementDto updatePriority(Long id, Priority priority);
    List<TaskManagementDto> getTasksByPriority(Priority priority);
    TaskManagementDto addComment(Long taskId, Comment comment);
}
