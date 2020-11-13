package kcn.kea;

public class Symbiotic extends LifeDecorator
{
    public Symbiotic(ILive functionalItem)    {        super(functionalItem);    }

    @Override
    public void doAliveThing()
    {
        System.out.println();
        life.doAliveThing();
        System.out.println("... and this is how they.");
    }
}
