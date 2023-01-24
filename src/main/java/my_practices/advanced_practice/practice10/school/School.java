package my_practices.advanced_practice.practice10.school;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String okulAd;
    private int maxOgrenciSayisi;
    private List<Student>studentList = new ArrayList<>();
    //Her class bir data type'idir ama her data type'i bir class degildir.
    //Ogrenci class'indan bir List olusturuldugundan data type'ina onu yazdik


    public School(String okulAd, int maxOgrenciSayisi, List<Student> studentList) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.studentList = studentList;
    }

    public School() {
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addOgrenciToList(Student student){
        studentList.add(student);
    }
    @Override
    public String toString() {
        return "School { " +
                "okulAd='" + okulAd + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", studentList=" + studentList +
                " }";
    }
}
