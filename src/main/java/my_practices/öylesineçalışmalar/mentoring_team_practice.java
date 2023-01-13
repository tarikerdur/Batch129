package my_practices.öylesineçalışmalar;

public class mentoring_team_practice {
    public static void main(String[] args) {

      /*
    Soru 1:Verilen bir array i buyukten kucuge siralayip yazdiran bir method olusturun
           int arr[]={3,5,6,1,9,45,25,4,9,0};
    Soru 2:Verilen array da istenen bir elelmentin var olup olamdıgını
           true false olarak yazdirarak gosteren bir method olusturun
    Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz
           int arr[][]={{3,1,7},{6,10,2}};
    Soru 4:Kullaniciya kac elementlik bir array olusturacagini sorun
           arrayi olusturup elementlei kullanicidan alip array atayin
    Soru 5:Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
    Soru 6:Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
           ekrana yazdiran java kodunu yaziniz. { {1,2,3}, {4,5}, {6} }
    Soru 7:Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
           int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3
    Soru 8:Verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir mehod olusturun
           orn: [1,3,5,3,5,6,1,7]
           output [1,3,5,6,7]
    Soru 9:Verilen bir listede istenen iki indexdeki elementlerin yerini kalici olarak degistiren bir method olusturun
    Soru10: Parametre olarak bir int ve istedigimiz kadar String alan en uzun kelimenin harf sayisi ile int parametre degerini
            carpip sonucu yazdiran bir method olusturun
    Soru11:Multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
           ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
           input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
    Soru12:Bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
           input : 1,2,-3,4,-5,-6
           output :-1,-2,3,-4,5,6
    Soru13:Verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
           yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
           int istenenToplam=9;
    Soru14:Write a java program that calculates the average value of array elements Print elements that are greater than avarage
          (dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
           input[]= {1,2,3,4,5,6,7}
           Output : 4
    Soru15: $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
           String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
    Soru16:given an int array and find the squares of the elements (Verilen bir int dizisi icin elemanlarin karelerini bulun )
           Example:{2,6,4,5,8,9}
           output:{4,36,16,25,64,81}
    Soru17:Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
           INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
           OUTPUT : [Veli,Omer]
     */

        // Soru 1:Verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun
        //           int arr[]={3,5,6,1,9,45,25,4,9,0};
//        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
//        int[] reversedArr = new int[arr.length];
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int idx = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            reversedArr[idx] = arr[i];
//            idx++;
//        }
//        System.out.println(Arrays.toString(reversedArr));

        //Soru 2:Verilen array da istenen bir elelmentin var olup olamdıgını
        //           true false olarak yazdirarak gosteren bir method olusturun


        //Soru 3:Verilen multidimensional array in tum elementlerin toplamini bulunuz
        //           int arr[][]={{3,1,7},{6,10,2}};
//        int[][] array = {{3, 1, 7}, {6, 10, 2}};
//        int sum = 0;
//        for (int[] w : array){
//            for (int k : w){
//                sum+=k;
//            }
//        }
//        System.out.println(sum);
//

        //Soru 4:Kullaniciya kac elementlik bir array olusturacagini sorun
        //           arrayi olusturup elementlei kullanicidan alip array atayin
//        Scanner input = new Scanner(System.in);
//        System.out.println("Kac elementlik array istersin");
//        int numOfElement = input.nextInt();
//        int[] arr4 = new int[numOfElement];
//        for (int i = 0; i < numOfElement; i++) {
//            System.out.println("Lutfen " + (i + 1) + ". elementi giriniz");
//            arr4[i] = input.nextInt();
//            if (i + 1 == numOfElement) {
//                input.close();
//            }
//        }
//        System.out.println(Arrays.toString(arr4));


        //Soru 6:Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        //           ekrana yazdiran java kodunu yaziniz. { {1,2,3}, {4,5}, {6} }
//        int[][] arr6 = {{1, 2, 3}, {4, 5}, {6}, {3, 1, 7, 4, 6}, {9, 6, 10, 2}};
//        int multiply = 1;
//        for (int i = 0; i < arr6.length; i++) {
//            for (int j = arr6[i].length - 1; j > arr6[i].length - 2; j--) {
//                multiply *= arr6[i][j];
//            }
//        }
//        System.out.println("multiply = " + multiply);


        //Soru 7:Verilen bir Arrayden istenen elemeneti silip kalanlari yeni bir array olarak yazdiran yeni bir method olusturun
        //           int arr[]={3,4,2,3,5,7,3,8,5,2,4}; silinecek element=3
//        int[] arrr = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
//
//        int counter = 0;
//        for (int w : arrr) {
//            if (w != 3) {
//                counter++;
//            }
//        }
//        int[] brr = new int[counter];
//
//        int idx = 0;
//        for (int w : arrr) {
//            if (w != 3) {
//                brr[idx] = w;
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(brr));


//        Soru 8:Verilen bir listede tekrar eden sayilari sadece bir kere yazdiran bir mehod olusturun
//        orn: [1,3,5,3,5,6,1,7]
//        output [1,3,5,6,7]
//        ArrayList <Integer> myList8 = new ArrayList<>();
//        Integer []arr = {1,3,5,3,5,6,1,7};
//        myList8.addAll(List.of(arr));
//        ArrayList <Integer> myList88 = new ArrayList<>();
//        for (Integer w : myList8 ) {
//            if (!myList88.contains(w)){
//                myList88.add(w);
//            }
//        }
//        System.out.println(myList8);
//        System.out.println(myList88);

        //Soru 9:Verilen bir listede istenen iki indexdeki elementlerin
        // yerini kalici olarak degistiren bir method olusturun
//        List<Integer> list = new ArrayList<>(List.of(5, 2, 8, 1, 9));
//        int index1 = 2, index2 = 4;
//        int temp = list.get(index1);
//        list.set(index1, list.get(index2));
//        list.set(index2, temp);
//        System.out.println(list);

        //Soru11:Multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        //           ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        //           input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}


//        int [][]arr11 = {{10,20,30},{4},{6,7,20}};
//        int sum = 0;
//        int [] arrNew11 = new int[arr11.length];
//
//        for (int i = 0; i < arr11.length; i++) {
//            for (int j = 0; j < arr11[i].length; j++) {
//                arrNew11[i] += arr11[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(arrNew11));

    }

}
