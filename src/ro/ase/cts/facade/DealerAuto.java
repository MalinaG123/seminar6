package ro.ase.cts.facade;

//se fol ca sa nu se instantieze de fiecare date cate o instanta masinaelectrica, masinaclasica, etc.
public class DealerAuto {
    private MasinaElectrica masinaElectrica = new MasinaElectrica("BMW","S12432J3","rosu",12);
    private MasinaClasica masinaClasica = new MasinaClasica("Audi","34J93N","albastru","adittiv1");
    private MasinaHibrid masinaHibrid = new MasinaHibrid("Honda","438H94J","negru",false);

    public String getDetailsMasinaElectrica(){
        return masinaElectrica.getDetails();
    }

    public String getDetailsMasinaClasica(){
        return masinaClasica.getDetails();
    }

    public String getDetailsMasinaHibrid(){
        return masinaHibrid.getDetails();
    }
}
