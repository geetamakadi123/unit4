package question2;

public class Main {
	

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PlayList pl=new PlayList();
        pl.addSong(new Song("Dil apana aur prit paraya", "Ajeeb dasata hai ye"));
        pl.addSong(new Song("Wo kohun Thi", "Lag ja gale"));
        pl.addSong(new Song("jane tu Ya na", "Kabhi kabhi aditi"));
        pl.addSong(new Song("Hum", "Ek dusre se karte hai"));

        for(Song s:pl.songs){
            s.play();
        }

	
  }

}
