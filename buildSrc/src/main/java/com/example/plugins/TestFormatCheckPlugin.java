package com.example.plugins;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TestFormatCheckPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("hello", t -> System.out.println("HUY"));
    }
}
