package io.spring.gungnir.service;

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

}
