package org.jenkinsci.plugins.sample;

import hudson.model.StringParameterValue;
import org.kohsuke.stapler.DataBoundConstructor;

public class ParameterActionValue extends StringParameterValue {
    @DataBoundConstructor
    public ParameterActionValue(String name, String value) {
        super(name, value);
    }
}
