/* CodingNomads (C)2024 */
package com.codingnomads.springweb.springrestcontrollers.simpledemo.controller;

import com.codingnomads.springweb.springrestcontrollers.shortcutannotations.model.Task;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class HelloWorldController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello() {
        return "Hello Spring Developer!";
    }

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(@PathVariable(name = "name") String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String list() {
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();

        task1.setId(1L);
        task1.setName("labs");
        task1.setCompleted(true);

        task2.setId(2L);
        task2.setName("project");
        task2.setCompleted(true);

        task3.setId(3L);
        task3.setName("exam");
        task3.setCompleted(false);

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        return taskList.toString();
    }
}
