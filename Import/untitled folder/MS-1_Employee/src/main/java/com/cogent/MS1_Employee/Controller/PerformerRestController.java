package com.cogent.MS1_Employee.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Performance-Service")
public interface PerformerRestController {
	
	@GetMapping("performance-api/helloperformer")
	public String Hello();

}
