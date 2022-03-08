package files.directory;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class Directory {
	public static final String name = "C:\\Users\\mm\\Documents\\";
	 private ArrayList<File> files = new ArrayList<File>();
	    Path path = FileSystems.getDefault().getPath(name).toAbsolutePath();
	    File Dfiles = path.toFile();
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void print() {
	    	System.out.println("Existing Files: ");
	    	files.forEach(f -> System.out.println(f));
	    }
	    
	    public ArrayList<File> fillFiles() {
	    	
	        File[] directoryFiles = Dfiles.listFiles();
	        
	        
	        
	    	files.clear();
	    	try {
	    	
	    	for (int i = 0; i < directoryFiles.length; i++) {
	    		if (directoryFiles[i].isFile()) {
	    			files.add(directoryFiles[i]);
	    		}
	    
	    	
	    	Collections.sort(files);
	    	}
	    	}
	    	catch(Exception e) {
	    		System.out.println("there is no file");
	    		
	    	}
			return files;
			
	    }
	    
	    public ArrayList<File> getFiles() {
	    	
	    	fillFiles();
	    	return files;
	    }


}