package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	String execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
	
}
