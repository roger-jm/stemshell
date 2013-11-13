package com.instanceone.stemshell.commands;

import java.io.File;

import jline.console.ConsoleReader;
import jline.console.completer.ArgumentCompleter;
import jline.console.completer.Completer;
import jline.console.completer.StringsCompleter;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;

import com.instanceone.stemshell.Environment;
import com.instanceone.stemshell.command.AbstractCommand;

public class Browse extends AbstractCommand {

	public Browse(String name) {
		super(name);
		
	}

	@Override
	public void execute(Environment env, CommandLine cmd, ConsoleReader reader) {
		File[] disks = getDisks();
		for(File f : disks){
			String partion = f.getAbsolutePath();
			String need = partion.substring(0,1);
			if(cmd.hasOption(need.toLowerCase())){
				File[] list = f.listFiles();
		        for(File file: list){
		        	System.out.println(file.getName());
		        }
			}
		}
	}

	@Override
	public Completer getCompleter() {
		StringsCompleter str = new StringsCompleter("-c", "-d" ,"-e");
		ArgumentCompleter argu = new ArgumentCompleter(str);
		return argu;
	}

	@Override
	public Options getOptions() {
		Options options = super.getOptions();
		File[] disks = getDisks();
		for(File f : disks){
			String partion = f.getAbsolutePath();
			String need = partion.substring(0,1);
			options.addOption(need.toLowerCase(), partion ,false,"list all the fils of " + partion);
		}
		return options;
	}
	
	File[] getDisks(){
		File[] disks = File.listRoots();
		return disks;
	}

}
