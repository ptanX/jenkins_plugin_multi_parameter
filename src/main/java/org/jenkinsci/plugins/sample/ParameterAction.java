package org.jenkinsci.plugins.sample;

import hudson.Extension;
import hudson.model.ParameterDefinition;
import hudson.model.ParameterValue;
import hudson.model.StringParameterDefinition;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;
import net.sf.json.*;
import javax.annotation.CheckForNull;

public class ParameterAction extends ParameterDefinition{
    private StringParameterDefinition StringParameter;

    @DataBoundConstructor
    public ParameterAction(String Name, String Description, StringParameterDefinition StringParameter) {
        super(Name, Description);
        this.StringParameter = StringParameter;
    }

    @CheckForNull
    @Override
    public ParameterValue createValue(StaplerRequest staplerRequest, JSONObject jsonObject) {
        ParameterActionValue value = staplerRequest.bindJSON(ParameterActionValue.class, jsonObject);
        return value;
    }

    @CheckForNull
    @Override
    public ParameterValue createValue(StaplerRequest staplerRequest) {
        return null;
    }

    @Extension
    public static final class ImplDescriptor extends ParameterDescriptor {
        @Override
        public String getDisplayName() {
            return "PTANX Parameter";
        }
    }


}
