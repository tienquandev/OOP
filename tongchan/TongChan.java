
package oop.chuong2.tongchan;


public class TongChan {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
