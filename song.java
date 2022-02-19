package songLibrary;

public class song {
	public String artist;
	public String album;
	public String songName;
	public int release;
	
	public song(String artist, String album, String songName,int release) {
		this.artist = artist;
		this.album = album;
		this.songName = songName;
		this.release = release;
	}
	public String getArtist(){
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum(){
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getSongName(){
		return songName;
	}
	
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	public int getRelease(){
		return release;
	}
	
	public void setRelease(int release) {
		this.release = release;
	}
	

}
