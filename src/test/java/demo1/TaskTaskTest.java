package demo1;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskTaskTest {
	@Test
	public void test(){
		ApplicationContext context =  new 
				ClassPathXmlApplicationContext(
						new String[]{"classpath:/spring/applicationContext-activiti.xml",
												"classpath:/spring/applicationContext-mybatis.xml"}); 
		ProcessEngine processEngine = (ProcessEngine)context.getBean("processEngine");
		TaskService taskService = processEngine.getTaskService();
		List<Task> list = taskService.createTaskQuery().list();
		for (Task task : list) {
			System.out.println(task.toString());
		}
	}
	@Test
	public void complete(){
		ApplicationContext context =  new 
				ClassPathXmlApplicationContext(
						new String[]{"classpath:/spring/applicationContext-activiti.xml",
												"classpath:/spring/applicationContext-mybatis.xml"}); 
		ProcessEngine processEngine = (ProcessEngine)context.getBean("processEngine");
		TaskService taskService = processEngine.getTaskService();
		taskService.complete("5005");
	}
	@Test
	public void selectByName(){
		ApplicationContext context =  new 
				ClassPathXmlApplicationContext(
						new String[]{"classpath:/spring/applicationContext-activiti.xml",
												"classpath:/spring/applicationContext-mybatis.xml"}); 
		ProcessEngine processEngine = (ProcessEngine)context.getBean("processEngine");
		TaskService taskService = processEngine.getTaskService();
		List<Task> list = taskService.createTaskQuery().taskName("经理审批").list();
		for (Task task : list) {
			System.out.println(task.toString());
			System.out.println(task.getProcessInstanceId());
		}
	}
}
