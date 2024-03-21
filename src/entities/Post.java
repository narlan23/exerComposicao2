package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date momment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();

	public Post() {
		
	}
	
	public Post(Date momment, String title, String content, int likes) {
		this.momment = momment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComment() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		return "Post [momment=" + momment + ", title=" + title + ", content=" + content + ", likes=" + likes
				+ ", comments=" + comments + "]";
	}


	
	
	

}
