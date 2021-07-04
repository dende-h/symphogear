package io.spring.gungnir.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import io.spring.gungnir.dto.UserSearchRequest;
import io.spring.gungnir.entity.User;


@Mapper
public interface UserMapper {

	/*ユーザー情報検索
	 * @param id ID
	 * @return ユーザー情報
	 */
	@Select("SELECT * FROM symphogear_players WHERE id = #{id}")
	User search(UserSearchRequest user);
	
	

}
