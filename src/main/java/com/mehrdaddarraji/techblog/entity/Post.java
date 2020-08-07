package com.mehrdaddarraji.techblog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "POST")
public class Post {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "CATEGORY")
	private long category;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "META_TITLE")
	private String metaTitle;
	@Column(name = "SLUG")
	private String slug;
	@Column(name = "POST_IMAGE")
	private byte[] postImage;
	@Column(name = "SUMMARY")
	private String summary;
	@Column(name = "PUBLISHED")
	private boolean published;
	@Column(name = "CREATED_AT")
	private Timestamp createdAt;
	@Column(name = "UPDATED_AT")
	private Timestamp updatedAt;
	@Column(name = "PUBLISHED_AT")
	private Timestamp publishedAt;
	@Column(name = "CONTENT")
	private String content;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCategory() {
		return category;
	}
	
	public void setCategory(long category) {
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMetaTitle() {
		return metaTitle;
	}
	
	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}
	
	public String getSlug() {
		return slug;
	}
	
	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	public byte[] getPostImage() {
		return postImage;
	}
	
	public void setPostImage(byte[] postImage) {
		this.postImage = postImage;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public boolean isPublished() {
		return published;
	}
	
	public void setPublished(boolean published) {
		this.published = published;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Timestamp getPublishedAt() {
		return publishedAt;
	}
	
	public void setPublishedAt(Timestamp publishedAt) {
		this.publishedAt = publishedAt;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
}
