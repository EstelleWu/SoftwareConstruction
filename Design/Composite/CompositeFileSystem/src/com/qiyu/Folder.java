package com.qiyu;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemResources{
	private List<FileSystemResources> file_system_resources;
	private static String TYPE = "Folder: ";
	
	public Folder(String name) {
		super(name);
		this.file_system_resources = new ArrayList<>();
	}
	
	public void addChild(FileSystemResources f) {
		this.file_system_resources.add(f);
	}
	

	@Override
	public void print(String ident) {
		String print_value = ident + getType() + this.name;
		System.out.println(print_value);
		for (int i = 0; i < this.file_system_resources.size(); i++) {
			this.file_system_resources.get(i).print(ident + ident);
		}
		
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
