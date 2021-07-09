package io.spring.gungnir.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.gungnir.dto.UserSearchRequest;
import io.spring.gungnir.entity.User;
import io.spring.gungnir.repository.UserMapper;

@Service
public class UserService {
	
	/*ユーザー情報　Mapper
	 * 
	 */
	@Autowired
	private UserMapper userMapper;
	
	/*ユーザ情報検索
	 * @param userSearchRequest リクエストデータ
	 *@return 検索結果
	 */
	

	public User search(UserSearchRequest userSearchRequest) {
		return userMapper.search(userSearchRequest);
	}
	/*
	 * 全件表示
	 */
	public List<User> getList() {
		return userMapper.searchList();
	}
	
	/*
	 * 新規追加処理
	 */
	public void create(UserSearchRequest userAdd) {
		userMapper.create(userAdd);
	}
	/*
	 * 追加情報を画面表示
	 */
	
	public User createCheck(UserSearchRequest userAdd) {
		
		return userMapper.createCheck(userAdd);
	}
	
}
