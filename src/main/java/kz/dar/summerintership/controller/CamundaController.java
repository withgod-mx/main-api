package kz.dar.summerintership.controller;

import kz.dar.summerintership.fiegn.CamundaFiegn;
import kz.dar.summerintership.model.ProcessDefinition;
import kz.dar.summerintership.model.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/camunda")
@RestController
public class CamundaController {

    @Autowired
    CamundaFiegn camundaFiegn;

    @GetMapping("/process-definition")
    public List<ProcessDefinition> getProcessDefinition() {
        return camundaFiegn.getProcessDefinition();
    }

    @PostMapping("/{id}/start")
    public Object startProcess(@RequestBody Variables variables,
                               @PathVariable String id) {
        return camundaFiegn.processStart(variables, id);
    }

}
