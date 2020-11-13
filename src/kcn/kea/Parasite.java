package kcn.kea;

public class Parasite extends LifeDecorator
{
    public Parasite(ILive functionalItem){ super(functionalItem); }

    @Override
    public void doAliveThing()
    {
        System.out.println("\nInside another organism...");
        life.doAliveThing();
    }
}
