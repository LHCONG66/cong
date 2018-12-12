package cn.jt.pojo;

public class User extends BasePojo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6379958869439897352L;
	private Long id;
	private String name;
	private String birthday;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
}
