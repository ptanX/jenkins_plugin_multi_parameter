package org.jenkinsci.plugins.sample;

import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.BuildListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import hudson.Extension;
import org.kohsuke.stapler.DataBoundConstructor;

import javax.annotation.Nonnull;
import java.io.IOException;

public class BuilderAction extends Builder{
    String name;

    @DataBoundConstructor
    public BuilderAction(String name){
        this.name = name;
    }
    @Override
    public boolean perform(AbstractBuild<?, ?> build, Launcher launcher, BuildListener listener) throws InterruptedException, IOException {
        listener.getLogger().println("Wait for 20 seconds");
        Thread.sleep(20000);
        return true;
    }

    @Extension
    public static final class ImplDescriptor extends BuildStepDescriptor<Builder>{
        @Override
        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            return true;
        }

        @Override
        public String getDisplayName() {
            return "Test BuildStep";
        }
    }

}
