package net.revature.models;

import java.util.List;

public class StoryPitch implements List<StoryPitch> {
	private int pitchId;
	private int authorId;
	private int genreId;
	private int statusId;
	private String tentativeTitle;
	private String lengthType;
	private String blurb;
	private String description;
	
	public StoryPitch() {
		pitchId = 0;
		authorId = 0;
		genreId = 0;
		statusId = 0;
		tentativeTitle = "";
		lengthType = "";
		blurb = "";
		description = "";
	}
	
	public int getPitchId() {
		return pitchId;
	}
	
	public int getAuthorId() {
		return authorId;
	}
	
	public int getGenreId() {
		return genreId;
	}
	
	public int getStatusId() {
		return statusId;
	}
	
	public String getTentativeTitle() {
		return tentativeTitle;
	}
	
	public String getLengthType() {
		return lengthType;
	}
	
	public String getBlurb() {
		return blurb;
	}
	
	public String getDescription() {
		return description;
	}

	public void setTentativeTitle(String String) {
		// TODO Auto-generated method stub
		
	}


	public void setLengthType(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setBlurb(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String string) {
		// TODO Auto-generated method stub
		
	}}
