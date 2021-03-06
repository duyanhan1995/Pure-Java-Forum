package com.duyanhan.forum.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String avatar;

    private String nickname;

    private String email;

    private String sex;

    private String personalDescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPersonalDescription() {
        return personalDescription;
    }

    public void setPersonalDescription(String personalDescription) {
        this.personalDescription = personalDescription == null ? null : personalDescription.trim();
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", avatar=" + avatar
				+ ", nickname=" + nickname + ", email=" + email + ", sex=" + sex + ", personalDescription="
				+ personalDescription + "]";
	}
    
}