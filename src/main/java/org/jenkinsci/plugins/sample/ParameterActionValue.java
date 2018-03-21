package org.jenkinsci.plugins.sample;

import hudson.model.ParameterValue;
import hudson.model.StringParameterValue;
import org.kohsuke.stapler.DataBoundConstructor;

public class ParameterActionValue extends ParameterValue{
    StringParameterValue StringValue;
    @DataBoundConstructor
    public ParameterActionValue(String name, StringParameterValue StringValue) {
        super(name);
        this.StringValue = StringValue;
    }
}
