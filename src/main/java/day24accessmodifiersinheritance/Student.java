package day24accessmodifiersinheritance;

public class Student {
    // Java'da gruptan kasit package'dir.
    // default == "package private" da denilebilir.
    public String name = "Tom Hanks"; // her yerden ulasilabilir.
    // name herkes tarafindan bilinebilir o yuzden "public" yaptim.


    protected int accountNumber = 76512345; // protected ayni package ve cocuklari tarafindan gorulur.
    // acc number ben esim ve cocuklarim tarafindan bilinebilir. o yuzden "protected" yaptim.


    String stdId = "TH2023HU12001"; // defaultlara sadece ayni packageden ulasilabilir.
    // student Id okul yonetimindeki insanlar tarafindan bilinebilir o yuzden "default" yaptim.


    private int balance = 123000; // bulundugu classta ulasilabilir.
    // hesabimdaki para miktari sadece benim tarafimdan bilinmelidir o yuzden "private" yaptim.


        /*
    Access modifierlar genisten dara dogru;
            public > protected > default > private
    Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

    Access Modifier'lar ne ise yarar?
        -Variablelara methodlara classlara ulasmayi duzenler.
    Kac tane access modifier var ? 4. public > protected > default > private

    publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
    protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
    default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
    private sadece aynı class içinden ulaşabiliyoruz

    protected ile defaultun farki nedir ?
    Package disina ciktigimizda childlardan protectedlara ulasabiliriz. Defaultlarda ulasamayiz.


    */
}
