public class Ortalama {
    public static void main(String[] args) {
        double sayilar[] = {1, 2, 3, 4, 5};
        double sum = 0;
        for (double i : sayilar){
            sum +=1/i;
        }
        double ortalama = sayilar.length / sum;
        System.out.println("Harmonik Ortalama : " + ortalama);
    }
}
