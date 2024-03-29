package io.spring.gungnir.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

	/*
	 * 全件表示
	 */
	@Select("SELECT * FROM symphogear_players")
	List<User> searchList();
	
	/*ユーザー情報登録
	 * 
	 */
	
	@Insert("INSERT INTO symphogear_players(id,name,symphogear_name)"
			+ "VALUES (#{id},#{name},#{symphogear_name})")
	void create(UserSearchRequest userAdd);
	/*
	 * 追加情報表示
	 */
	@Select("SELECT * FROM symphogear_players WHERE id = #{id}")
	User createCheck(UserSearchRequest userAdd);
	/*
	 * レコード削除
	 */
	@Delete("DELETE FROM symphogear_players WHERE id = #{id}")
	void deleteOne(UserSearchRequest delete);
	
	@Select("SELECT * FROM symphogear_players WHERE id = #{id}")
	User editSelect(String id);

	@Update("UPDATE symphogear_players "
			+ "SET name = #{name}, symphogear_name = #{symphogear_name} "
			+ "WHERE id = #{id}")
	//void edit(UserSearchRequest edit);
	void edit(@Param("id")String id, @Param("name")String name, @Param("symphogear_name")String symphogear_name);
	
}
