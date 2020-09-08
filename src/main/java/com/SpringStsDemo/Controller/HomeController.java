package com.SpringStsDemo.Controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.SpringStsDemo.model.CalculatorModel;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView showCalculator() 
	{

		return new ModelAndView("index","CalculatorModel",new CalculatorModel());
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)

	public ModelAndView calculate(@ModelAttribute("CalculatorModel") CalculatorModel cmodel, 
			BindingResult bresult, HttpServletResponse response) throws Exception {
		
		if (bresult.hasErrors()) {
			response.getWriter().write("error occured");
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		Double result = null;
		System.out.println("op: " + cmodel.operation);
		if (cmodel.num1 == 0.0 || cmodel.num2 == 0.0 || cmodel.operation.equals("")) {
			
			mv.addObject("errorMessage", "invalid input");

		}else if (cmodel.num2==0 && cmodel.operation.equals("/")){
			mv.addObject("errorMessage", "you can not divide by zero.");
		} else {
			switch (cmodel.operation) {
			case "+":
				result = cmodel.num1 + cmodel.num2;
				break;
			case "-":
				result = cmodel.num1 - cmodel.num2;
				break;
			case "*":
				result = cmodel.num1 * cmodel.num2;
				break;
			case "/":
				result = cmodel.num1 / cmodel.num2;
				break;
			default:
				break;
			}
			mv.setViewName("result");
			mv.addObject("calcResult", result);
		}
		return mv;
		
		}
}

