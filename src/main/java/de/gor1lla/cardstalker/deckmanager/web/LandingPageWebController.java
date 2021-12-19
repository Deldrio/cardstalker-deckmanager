package de.gor1lla.cardstalker.deckmanager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LandingPageWebController {
	
	@GetMapping("/")
	public String getLandingPage() {
		return "index";
	}

}
