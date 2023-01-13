package day24accessmodifiersinheritance_sule_hoca;
// inharitiance == miras
// extends == uzanir

public class Animal { // bu class parent classimiz olacak
    // Java'da cocuklar parentlari secer. Insanlarin tam tersi.
    // cocuklarin classindan extends yapilacak.


    protected void eat() {
        System.out.println("Animals eat");
    }

    public void drink() {
        System.out.println("Animals drink");
    }

    void breath() {
        System.out.println("Animals breath");
    }


}
