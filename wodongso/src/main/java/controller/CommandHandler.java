package controller;

import java.util.HashMap;


public class CommandHandler {
	HashMap<String, String> command = new HashMap<>();
	
	public CommandHandler() {
		command.put("login", "controller.LoginCommand");
		command.put("register", "controller.RegisterCommand");
		command.put("findPassword", "controller.FindPasswordCommand");
		command.put("societyAll", "controller.SocietyAllCommand");
	}
	
	Command getCommand(String cmd) {
		String strClass = command.get(cmd);
		Command cmdClass = null;
	
		try {
			cmdClass = (Command) Class.forName(strClass).getDeclaredConstructor().newInstance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return cmdClass;
	}
	
}
