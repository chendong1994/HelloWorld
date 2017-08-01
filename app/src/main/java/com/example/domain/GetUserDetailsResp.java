package com.example.domain;

import java.io.Serializable;
import java.util.List;

public class GetUserDetailsResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2267377976610827871L;
		//昵称
		private String name;
		//介绍
		private String introduce;
		//用户类型
		private Integer type;
		//头像
		private String userHeadImage;
		//相册
		private List<String> album;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getIntroduce() {
			return introduce;
		}
		public void setIntroduce(String introduce) {
			this.introduce = introduce;
		}
		public Integer getType() {
			return type;
		}
		public void setType(Integer type) {
			this.type = type;
		}
		public String getUserHeadImage() {
			return userHeadImage;
		}
		public void setUserHeadImage(String userHeadImage) {
			this.userHeadImage = userHeadImage;
		}
		public List<String> getAlbum() {
			return album;
		}
		public void setAlbum(List<String> album) {
			this.album = album;
		}

}
