package com.github.jucies.example.dsl;

import hudson.Extension;
import org.jenkinsci.plugins.workflow.cps.CpsScript;
import org.jenkinsci.plugins.workflow.cps.GlobalVariable;

import javax.annotation.Nonnull;
import java.util.concurrent.Callable;

@Extension
public class HelloJuciesStep extends GlobalVariable {

  @Nonnull
  @Override
  public String getName() {
    return "helloJucies";
  }

  @Nonnull
  @Override
  public Object getValue(@Nonnull CpsScript script) throws Exception {
    return new Callable() {
      @Override
      public Void call() {
        script.println("Hello Jucies!");
        return null;
      }
    };
  }
}
