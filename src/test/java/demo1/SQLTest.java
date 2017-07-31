package demo1;

import java.io.File;
import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SQLTest {
	@Test
	public void test(){
		ApplicationContext context =  new 
				ClassPathXmlApplicationContext(
						new String[]{"classpath:/spring/applicationContext-activiti.xml",
												"classpath:/spring/applicationContext-mybatis.xml"}); 
		ProcessEngine processEngine = (ProcessEngine)context.getBean("processEngine");
		int number = processEngine.getIdentityService().createUserQuery().memberOfGroup("程序员").list().size();
		User user = processEngine.getIdentityService().createUserQuery().userId("zj").singleResult();
		//用户当前组
		Group group = processEngine.getIdentityService().createGroupQuery().groupMember("zj").singleResult();
		System.out.println(number);
		System.out.println(user);
		System.out.println(group.toString());
	}
	
	@Test
	public void test1(){
		ApplicationContext context =  new 
				ClassPathXmlApplicationContext(
						new String[]{"classpath:/spring/applicationContext-activiti.xml",
												"classpath:/spring/applicationContext-mybatis.xml"}); 
		ProcessEngine processEngine = (ProcessEngine)context.getBean("processEngine");
		RuntimeService runtimeService = processEngine.getRuntimeService();
//		taskService.getVariables(taskId);
		User user = processEngine.getIdentityService().createUserQuery().userId("zj").singleResult();
		//用户当前组
		Group group = processEngine.getIdentityService().createGroupQuery().groupMember("zj").singleResult();
//		System.out.println(number);
		System.out.println(user);
		System.out.println(group.toString());
	}
	
	@Test
	public void viewImage() throws Exception {
		ApplicationContext context =  new 
				ClassPathXmlApplicationContext(
						new String[]{"classpath:/spring/applicationContext-activiti.xml",
												"classpath:/spring/applicationContext-mybatis.xml"}); 
		ProcessEngine processEngine = (ProcessEngine)context.getBean("processEngine");
		 // 创建仓库服务对对象
		 RepositoryService repositoryService = processEngine.getRepositoryService();
		 // 从仓库中找需要展示的文件
		 String deploymentId = "2501";
		 List<String> names = repositoryService.getDeploymentResourceNames(deploymentId);
		 String imageName = null;
		 for (String name : names) {
		  if(name.indexOf(".png")>=0){
		  imageName = name;
		  System.out.println(imageName);
		  }
		 }
//		 if(imageName!=null){
//		  File f = new File("e:/"+ imageName);
//		  // 通过部署ID和文件名称得到文件的输入流
//		  InputStream in = repositoryService.getResourceAsStream(deploymentId, imageName);
//		  FileUtils.copyInputStreamToFile(in, f);
//		 }
	}

}
