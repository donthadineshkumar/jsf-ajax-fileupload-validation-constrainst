package com.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

@Named
@RequestScoped
public class FileuploadBean {

	private Part file;
	private String text;

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		System.out.println("Got the file");

		this.file = file;

		if (file != null) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						file.getInputStream()));

				String line = br.readLine();
				StringBuilder sb = new StringBuilder();

				while (line != null) {
					sb.append(line);
					line = br.readLine();
				}
				text = sb.toString();
				System.out.println("--completed reading file");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println(".. but its null");
		}

	}

	public String getText() {
		return text;
	}

}
