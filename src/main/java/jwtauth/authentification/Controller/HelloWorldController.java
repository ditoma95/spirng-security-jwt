/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jwtauth.authentification.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dimitri
 */
@RestController
public class HelloWorldController {
    @RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
}
