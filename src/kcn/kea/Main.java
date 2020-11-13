package kcn.kea;

public class Main {

    public static void main(String[] args) {

        ILive baseOrganism = new Organism();
        baseOrganism.doAliveThing();
        ILive parasite = new Parasite(baseOrganism);
        parasite.doAliveThing();
        ILive symbioticParasite = new Symbiotic(parasite);
        symbioticParasite.doAliveThing();

        /* Or, one might make a symbiotic parasite is a single stroke */
        ILive symParaLifeForm = new Symbiotic(new Parasite(new Organism()));
        symParaLifeForm.doAliveThing();
    }
}
