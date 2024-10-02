package com.application.StranglerApiGateway.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.StranglerApiGateway.task.Task;

@Controller
public class PageController {
  private List<Task> taskList = new ArrayList<>();

  public PageController() {
    taskList.add(new Task("Hacer el documento",true));
    taskList.add(new Task("Hacer presentación",false));
    taskList.add(new Task("Terminar ejemplo",false));
  }

  @GetMapping("/microservice-task")
	public String showPage(Model model) {
    model.addAttribute("taskList", taskList);
		return "index";
	}

  @PostMapping("/changeStateTask")
    public String changeStateTask(int listTaskIndex) {
      Task task = taskList.get(listTaskIndex);
      task.setState(!task.isCompleted());
      return "redirect:/microservice-task";

  }


}
