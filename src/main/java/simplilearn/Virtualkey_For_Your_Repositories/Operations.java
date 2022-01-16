package simplilearn.Virtualkey_For_Your_Repositories;

import java.io.File;
import java.io.IOException;

public class Operations implements BusinessLevelOperations{

	public void addAFile(String filename, File filepath) throws IOException {
		// TODO Auto-generated method stub
		String[] lst = App.folderName.list();
        for (String file: lst) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " already exists at " + App.folderName);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+" added to "+ App.folderName);

	}
	
	public void deleteAFile(String filename, File filepath) {
		// TODO Auto-generated method stub
	        String[] lst = App.folderName.list();
	        for (String file: lst) {
	            if (filename.equals(file) && filepath.delete()) {
	                System.out.println("File " + filename + " deleted from " + App.folderName);
	                return;
	            }
	        }
	        System.out.println("Delete Operation failed. FILE NOT FOUND");

		}
	public void searchAFile(String filename) {
		// TODO Auto-generated method stub
		String[] lst = App.folderName.list();
        for (String file: lst) {
            if (filename.equals(file)) {
                System.out.println("FOUND : File " + filename + " exists at " + App.folderName);
                return;
            }
        }
        System.out.println("Search Operation failed. File NOT found");
	}	
}

