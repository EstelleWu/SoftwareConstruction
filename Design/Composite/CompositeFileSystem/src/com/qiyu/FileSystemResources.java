package com.qiyu;

public abstract class FileSystemResources {
	protected String name;
	public FileSystemResources(String name) {
		this.name = name;
	}


	public void print(String indent) {
		System.out.println(indent + getType() + this.name);
	}
	
	public abstract String getType();

}
