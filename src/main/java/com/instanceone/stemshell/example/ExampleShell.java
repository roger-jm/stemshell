// Copyright (c) 2012 P. Taylor Goetz (ptgoetz@gmail.com)

package com.instanceone.stemshell.example;

import com.instanceone.stemshell.AbstractShell;
import com.instanceone.stemshell.Environment;
import com.instanceone.stemshell.commands.Browse;
import com.instanceone.stemshell.commands.Env;
import com.instanceone.stemshell.commands.Exit;
import com.instanceone.stemshell.commands.Help;
import com.instanceone.stemshell.commands.HistoryCmd;

public class ExampleShell extends AbstractShell {
    
    
    public static void main(String[] args) throws Exception{
        System.out.println("StemShell example. Press [TAB] to list available commands.");
        new ExampleShell().run(args);
    }
    

    @Override
    public void initialize(Environment env) throws Exception {
        env.addCommand(new Exit("exit"));
        env.addCommand(new Env("env"));
        env.addCommand(new Help("help", env));
        env.addCommand(new HistoryCmd("history"));
        env.addCommand(new Browse("browse"));
        //env.setPrompt("stemshell%");
    }


    @Override
    public String getName() {
        return "stemshell-example";
    }

}
