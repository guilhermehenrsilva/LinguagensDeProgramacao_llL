
public class At extends User{
	private String siape;
	private String level;
	private String area;
	private String role;
	
	public At(int id , String siape) {
		super(id);
		this.siape = siape;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSiape() {
		return siape;
	}

	
	
	@Override
	public String formatPersonalData() {
		
		String userData = super.formatPersonalData();
		String  taData = String.format("\nSiape: %S\nNível: %s\nArea: %S\n",
		siape , level , area);
		return taData + taData;
}
	
}
