package com.qiyu;

public class File extends FileSystemResources{
    private static String TYPE = "File:";
    
	public File(String name) {
		super(name);
	}

	@Override
	public String getType() {
		return TYPE;
	}
	

}
