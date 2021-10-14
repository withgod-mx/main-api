package kz.dar.summerintership.fiegn;

import kz.dar.summerintership.model.ProcessDefinition;
import kz.dar.summerintership.model.Variables;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "camunda-core")
public interface CamundaFiegn {


    @GetMapping("/engine-rest/process-definition")
    public List<ProcessDefinition> getProcessDefinition();

    @PostMapping("/engine-rest/process-definition/{id}/start")
    public Map<String, Object> processStart(@RequestBody Variables variables, @PathVariable String id);



}
