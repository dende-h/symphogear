package io.spring.gungnir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.spring.gungnir.dto.UserSearchRequest;
import io.spring.gungnir.entity.User;
import io.spring.gungnir.service.UserService;

@Controller
public class UserController {
	
	
	/*ユーザー情報　Service
	 * 
	 */
	@Autowired
	UserService userService;
	
	/*ユーザー情報検索画面を表示
	 * 
	 */
	@GetMapping(value = "/user/search")
	public String displaySearch(Model model) {
		return"player_search";
	}
	
	
	/*ユーザー情報検索
	 * 
	 */
	@RequestMapping(value = "/user/id_search", method = RequestMethod.POST )
	public String search(@ModelAttribute UserSearchRequest userSearchRequest, Model model){
		User user = userService.search(userSearchRequest);
		model.addAttribute("userinfo",user);
		return"player_search";
	}
		
	
	
}
