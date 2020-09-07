package org.hacker.rank.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

public class HttpGet {

	public static void main(String[] args) {
		
		func("spiderman");
	}

	static String[] func(String substr) {
		
		try {
			URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+substr);
			InputStream input = url.openStream();
			Reader reader = new InputStreamReader(input, "UTF-8");
			OuterObj outerObj = new Gson().fromJson(reader, OuterObj.class);
			System.out.println(outerObj);
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}



class Data{
	
	private String Title;
	private int Year;
	private String imdbID;
	
	public Data() {
		//empty constructor
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	
	@Override
	public String toString() {
		return "Title: "+Title+"     Year: "+Year+"     imdbID: "+imdbID;
	}
	
}

class OuterObj{
	
	private int page;
	private int per_page;
	private int total;
	private List<Data> data;
	
	public OuterObj() {
		//empty constructor
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "page: "+page+"     per_page: "+per_page+"     total: "+total+"     data: "+data;
	}
}