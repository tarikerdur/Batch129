package day24accessmodifiersinheritance_sule_hoca;

public class Honda extends Car { // Vehicle > Car > Honda

    public String renk;

    public Honda(){
        super("White",50000);
    }

    public Honda (String renk){
        this.renk = renk;
    }



}
