package io.spring.gungnir.dto;

import java.io.Serializable;

import lombok.Data;


/*ユーザー情報　検索用リクエストデータ
 * 
 */
	@Data
	public class UserSearchRequest implements Serializable{
		/*
		 * ユーザーID
		 */
		private int id;
		private String name;
		private String symphogear_name;
	}
