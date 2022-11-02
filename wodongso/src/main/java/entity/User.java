package entity;

public class User {
	String id; 
	String name;
	String nickname;
	String password;
	int type;
	String contact;
	String profile_url;
	String region;
	String university;
	String major;
	String classOf;
	
	public User() {};
	
	public User(String id, String name, String nickname, String password, int type, String contact, String profile_url,
			String region, String university, String major, String classOf) {
		super();
		this.id = id;
		this.name = name;
		this.nickname = nickname;
		this.password = password;
		this.type = type;
		this.contact = contact;
		this.profile_url = profile_url;
		this.region = region;
		this.university = university;
		this.major = major;
		this.classOf = classOf;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getProfile_url() {
		return profile_url;
	}
	public void setProfile_url(String profile_url) {
		this.profile_url = profile_url;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClassOf() {
		return classOf;
	}
	public void setClassOf(String classOf) {
		this.classOf = classOf;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", nickname=" + nickname + ", password=" + password + ", type="
				+ type + ", contact=" + contact + ", profile_url=" + profile_url + ", region=" + region
				+ ", university=" + university + ", major=" + major + ", classOf=" + classOf + "]";
	}
}
