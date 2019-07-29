class BeerSong {
    String sing(int begin, int len) {
        String song = "";
        for (int i = begin; i > begin - len; i--) {
            if (i > 2) {
                song += String.format("%d bottles of beer on the wall, %d bottles of beer.\n" +
                        "Take one down and pass it around, %d bottles of beer on the wall.\n\n",i,i,i-1);
            } else if (i == 2) {
                song += "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
            } else if (i == 1) {
                song += "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
            } else {
                song += "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
            }
        }
        return song;
    }
    String singSong(){
        return sing(99,100);
    }
   /* public static void main(String args[]){
        BeerSong b = new BeerSong();
        System.out.println(b.sing(99,1));
    }*/
}