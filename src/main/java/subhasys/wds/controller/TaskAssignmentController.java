/**
 * 
 */
package subhasys.wds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import subhasys.wds.domain.Task;
import subhasys.wds.services.TaskAssignmentService;
import subhasys.wds.services.WdsAuthenicationService;

/**
 * @author subhasis
 *
 */
@RestController
@RequestMapping("/workdistribution/v1")
public class TaskAssignmentController {
	
	@Autowired
	WdsAuthenicationService wdsAuthService;
	
	@Autowired
	TaskAssignmentService taskAssignmentService;
	
	@RequestMapping (value = "/tasks", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Task> createTask(@RequestBody Task requestedTask) {
		return null;
		
	}

}
