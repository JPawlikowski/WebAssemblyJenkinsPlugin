package io.jenkins.plugins.sample;

import hudson.model.Action;
import hudson.model.Run;

public class HelloWorldAction implements Action {

    private String name;

    public HelloWorldAction(String name) {
        this.name = name;
    }

    public String getName() {
	return name;
    }

    @Override
    public String getIconFileName() {
        return "document.png";
    }

    @Override
    public String getDisplayName() {
        return "Greeting";
    }

    @Override
    public String getUrlName() {
        return "greeting";
    }
}
