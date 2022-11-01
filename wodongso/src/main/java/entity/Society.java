package entity;

public class Society {
	private int number;
	private String name;
	private String type;
	private String category;
	private String position;
	private String profile_url;
	private String background_url;
	private String simple_desc;
	private String detail_desc;
	
	public Society() {}
	
	public Society(int number, String name, String type, String category, String position, String profile_url,
			String background_url, String simple_desc, String detail_desc) {
		super();
		this.number = number;
		this.name = name;
		this.type = type;
		this.category = category;
		this.position = position;
		this.profile_url = profile_url;
		this.background_url = background_url;
		this.simple_desc = simple_desc;
		this.detail_desc = detail_desc;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getProfile_url() {
		return profile_url;
	}

	public void setProfile_url(String profile_url) {
		this.profile_url = profile_url;
	}

	public String getBackground_url() {
		return background_url;
	}

	public void setBackground_url(String background_url) {
		this.background_url = background_url;
	}

	public String getSimple_desc() {
		return simple_desc;
	}

	public void setSimple_desc(String simple_desc) {
		this.simple_desc = simple_desc;
	}

	public String getDetail_desc() {
		return detail_desc;
	}

	public void setDetail_desc(String detail_desc) {
		this.detail_desc = detail_desc;
	}

	@Override
	public String toString() {
		return "Society [number=" + number + ", name=" + name + ", type=" + type + ", category=" + category
				+ ", position=" + position + ", profile_url=" + profile_url + ", background_url=" + background_url
				+ ", simple_desc=" + simple_desc + ", detail_desc=" + detail_desc + "]";
	}
	
	
	
}
