package songLibrary;

import javafx.scene.control.TextField;
import javafx.collections.ObservableList;


public class customize extends song {
	
	Textfield songName;
	TextField album;
	TextField artist;
	TextField release;
	
	public ObservableList<Song> songs;
	
	public void addSong(/* add buttton clicked*/) {
		String newName = songName.getText();
		String newAlbum = album.getText();
		String newArtist = artist.getText();
		int newRelease = release.getText();
		
		Song song = new song(newArtist,newAlbum,newName,newRelease);
		
	}
	public void editSong(/* edit buttton clicked*/) {
		
	}
	
}
