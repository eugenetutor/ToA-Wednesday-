public class HW0305 {
    public static void main(String[] args) {
        Song[] songs = new Song[]{
                new Song("пісня 1", 311),
                new Song("пісня 2", 214),
                new Song("пісня 3", 500),
                new Song("пісня 4", 1111)
        };

        quickSort(songs, 0, songs.length - 1);
        for(Song song : songs){
            System.out.println(song.name +": "+ song.duration+ " секунд");
        }
    }

    private static void quickSort(Song[] songs, int low, int high) {
        if(low<high){
            int pivot = partition(songs,low,high);
            quickSort(songs,low,pivot-1);
            quickSort(songs, pivot+1, high);
        }
    }

    private static int partition(Song[] songs, int low, int high) {
        int pivot = countOnes(songs[high].duration);
        int i  = low - 1;
        for (int j = low; j < high; j++) {
            if(countOnes(songs[j].duration) <=pivot){
                i++;
                Song temp = songs[i];
                songs[i] = songs[j];
                songs[j] = temp;
            }
        }
        Song temp = songs[i+1];
        songs[i+1] = songs[high];
        songs[high] = temp;
        return i+1;
    }

    private static int countOnes(int number) {
        int count = 0;
        while (number != 0){
            if(number % 10 == 1){
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

class Song{
    String name;
    int duration;

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}
