import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi, index = 1, kucukYakin = Integer.MIN_VALUE, buyukYakin = Integer.MAX_VALUE;
        boolean kucukYakinBulundu = false , buyukYakinBulundu = false;
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);

        System.out.print("girilen sayı : ");
        sayi = input.nextInt();

        for(int i = 0; i< dizi.length; i++){
            if(sayi>dizi[i])
                if(kucukYakin<dizi[i]){
                    kucukYakin = dizi[i];
                    kucukYakinBulundu = true;
                }
            if(sayi<dizi[i])
                if(buyukYakin>dizi[i]){
                    buyukYakin = dizi[i];
                    buyukYakinBulundu = true;
                }
        }

        if(kucukYakinBulundu){
            System.out.println("Girilen sayıdan küçük en yakın sayı : "+ kucukYakin);
        }else{
            System.out.println("girilen sayıdan daha küçük bir değer yok.");
        }

        if(buyukYakinBulundu){
            System.out.println("girilen sayıdan büyük en yakın sayı : "+buyukYakin);
        }else{
            System.out.println("girilen sayıdan daha büyük bir değer yok.");
        }
    }
}
