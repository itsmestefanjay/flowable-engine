package org.activiti.engine.impl.event.logger.handler;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.impl.persistence.entity.TaskEntity;

/**
 * @author Joram Barrez
 */
public abstract class AbstractTaskEventHandler extends AbstractDatabaseEventLoggerEventHandler {

	protected Map<String, Object> handleCommonTaskFields(TaskEntity task) {
		Map<String, Object> data = new HashMap<String, Object>();
		putInMapIfNotNull(data, Fields.ID, task.getId());
		putInMapIfNotNull(data, Fields.NAME, task.getName());
		putInMapIfNotNull(data, Fields.DESCRIPTION, task.getDescription());
		putInMapIfNotNull(data, Fields.ASSIGNEE, task.getAssignee());
		putInMapIfNotNull(data, Fields.OWNER, task.getOwner());
		putInMapIfNotNull(data, Fields.CATEGORY, task.getCategory());
		putInMapIfNotNull(data, Fields.CREATE_TIME, task.getCreateTime());
		putInMapIfNotNull(data, Fields.DUE_DATE, task.getDueDate());
		putInMapIfNotNull(data, Fields.FORM_KEY, task.getFormKey());
		putInMapIfNotNull(data, Fields.PRIORITY, task.getPriority());
		putInMapIfNotNull(data, Fields.PROCESS_DEFINITION_ID, task.getProcessDefinitionId());
		putInMapIfNotNull(data, Fields.PROCESS_INSTANCE_ID, task.getProcessInstanceId());
		putInMapIfNotNull(data, Fields.EXECUTION_ID, task.getExecutionId());
		putInMapIfNotNull(data, Fields.TENANT_ID, task.getTenantId());
		return data;
  }
	
}
