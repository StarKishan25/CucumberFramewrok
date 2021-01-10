package Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {

	 public static void generateJVMreport(String jsonFile) {
		
		File f = new File("C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/JVM");
		
		Configuration config = new Configuration(f, jsonFile);
		
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Sprint", "22");
		config.addClassifications("OS", "Windows10");
		
		List<String> js = new ArrayList<String>();
		js.add(jsonFile);
		
		ReportBuilder b = new ReportBuilder(js,config);
		b.generateReports();
		
	}
	
}
