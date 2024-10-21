
 class DVDPlayer {
    public void on() {
        System.out.println("DVD Player on");
    }

    public void play(String movie) {
        System.out.println("Playing '" + movie + "'");
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }

    public void off() {
        System.out.println("DVD Player off");
    }
}
  class Projector {
     public void on() {
         System.out.println("Projector on");
     }

     public void off() {
         System.out.println("Projector off");
     }


 }
 class Speakers {
     public void on(int val) {
         System.out.println("Speakers on with volume"+val);
     }

     public void off() {
         System.out.println("Projector off");
     }


 }
  class HomeTheaterFacade {
     private DVDPlayer dvdPlayer=new DVDPlayer();
     private Projector projector= new Projector();
      private Speakers speakers= new Speakers();




     public void watchMovie(String movie,int val) {
         System.out.println("Get ready to watch a movie...");
         projector.on();
         dvdPlayer.on();
         speakers.on(val);
         dvdPlayer.play(movie);

     }

     public void endMovie() {
         System.out.println("Shutting movie theater down...");
         dvdPlayer.stop();
         dvdPlayer.off();
         projector.off();

     }
 }
 class HomeTheaterTestDrive {
     public static void main(String[] args) {
         HomeTheaterFacade homeTheater = new HomeTheaterFacade();

         homeTheater.watchMovie("Inception",5);
         System.out.println();
         homeTheater.endMovie();
     }
 }



