package kcn.kea;

public class Organism implements ILive
{
    @Override
    public void doAliveThing()
    {
        System.out.println("Organism is doing its thing.");
    }
}
