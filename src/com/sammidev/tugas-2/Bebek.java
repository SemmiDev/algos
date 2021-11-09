import java.util.*;

/**
 Nama: Sammi Aldhi Yanto
 NIM: 2003113948
 Kelas: ASD-A
 */ 

public class Bebek {
    public static void main(String[] args) {

    int[] bebek = randomTinggiBebek(randomBanyakBebek());
    int k = Arrays.stream(bebek).max().getAsInt();

    System.out.print("Bebek sebelum diurutkan: ");
    System.out.println(Arrays.toString(bebek));

    countingSort(bebek, k);
    System.out.print("\n\nBebek sesudah diurutkan: ");
    System.out.println(Arrays.toString(bebek));

  }

  // membangkitkan banyaknya bebek
  public static int randomBanyakBebek() {
    Random r = new Random();
    return r.nextInt(1000);
  }

  // membangkitkan tinggi bebek
  public static int[] randomTinggiBebek(int n) {
    int[] arr = new int[n];
    Random rand = new Random();
    for (int i = 0; i < n; i++) {
      arr[i] = rand.nextInt(100000) + 1;
    }
    return arr;
  }

  public static void countingSort(int[] input, int k) {
    int counter[] = new int[k + 1];
    
    for (int i : input) {
      counter[i]++;
    }
    
    int ndx = 0;
    for (int i = 0; i < counter.length; i++) {
      while (0 < counter[i]) {
        input[ndx++] = i;
        counter[i]--;
      }
    }
  }
}
