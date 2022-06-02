package bean;

public class Product implements java.io.Serializable{

	private String name;
	private String company;
	private String mail;
	private String review;
	private String genre;
	private String select;


	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getMail() {
		return mail;
	}

	public String getReview() {
		return review;
	}

	public String getGenre() {
		return genre;
	}

	public String getSelect() {
		return select;
	}

	public void setName(String name) {
		this.name=name;
	}


	public void setCompany(String company) {
		this.company = company;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setSelect(String select) {
		this.select = select;
	}




}





























