package kcn.kea;

public abstract class LifeDecorator implements ILive
{
    protected ILive life;

    public LifeDecorator(ILive functionalItem){ this.life = functionalItem; }

    @Override
    public void doAliveThing(){ life.doAliveThing(); }
}
