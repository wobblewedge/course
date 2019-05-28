package course.topic;

public class Topic {
	
	private String id;
	private String name;
	private String category;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String category, String description) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
