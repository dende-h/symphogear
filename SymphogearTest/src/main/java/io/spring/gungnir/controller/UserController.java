package io.spring.gungnir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("user_info",user);
		return"player_search";
	
	}
	/*
	 * 全件表示
	 */
	@RequestMapping(value = "/user/list", method = RequestMethod.POST)
	public String getUserList(Model model) {
		List<User> userList = userService.getList();
		model.addAttribute("users_info", userList);
		return "player_search";	
	}
	/*ユーザー情報登録画面を表示
	 * 画面遷移のみ
	 */
	@PostMapping(value = "/user/add")
	public String displayAdd(Model model) {
		return "add_player";
	}
	
	/*ユーザー情報登録
	 * 登録情報の表示
	 */
	@RequestMapping(value = "user/add_comp", method = RequestMethod.POST )
	public String create(@Validated @ModelAttribute UserSearchRequest userAdd, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add_player";
		}
		userService.create(userAdd);//追加処理の実行
		User user = userService.createCheck(userAdd);//追加した情報をセレクトしとってくる
		model.addAttribute("user_add", user);
		return "add_comp";		
	}
	/*削除
	 * 
	 */
	@PostMapping(value = "user/delete/id={id}")
	public String displayDelete(@PathVariable String id, @ModelAttribute UserSearchRequest delete) {
		userService.deleteOne(delete);
		return "delete";
	}
}